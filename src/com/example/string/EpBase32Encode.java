package com.example.string;


import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class EpBase32Encode {
    /*private static final BaseEncoding BASE_32 = BaseEncoding.base32().lowerCase().omitPadding();

    public static void main(String args[]){
       String result = encode("CRO-1-YEAR-SUB");
    }

    public static String encode(String original) {
        return encodeBytes(original.getBytes(StandardCharsets.UTF_8));
    }
    public static String encodeBytes(byte[] data) {
        String encoded = BASE_32.encode(data);
        return encoded.isEmpty() ? "" : encoded.concat("=");
    }

    private static class BaseEncoding {

        private static final BaseEncoding BASE32 = new BaseEncoding.StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

        public static BaseEncoding base32() {
            return BASE32;
        }
    }


    static final class StandardBaseEncoding extends BaseEncoding {
        private final BaseEncoding.Alphabet alphabet;
        @Nullable
        private final Character paddingChar;
        private transient BaseEncoding upperCase;
        private transient BaseEncoding lowerCase;

        StandardBaseEncoding(String name, String alphabetChars, @Nullable Character paddingChar) {
            this(new BaseEncoding.Alphabet(name, alphabetChars.toCharArray()), paddingChar);
        }

        StandardBaseEncoding(BaseEncoding.Alphabet alphabet, @Nullable Character paddingChar) {
            this.alphabet = (BaseEncoding.Alphabet)Preconditions.checkNotNull(alphabet);
            Preconditions.checkArgument(paddingChar == null || !alphabet.matches(paddingChar), "Padding character %s was already in alphabet", new Object[]{paddingChar});
            this.paddingChar = paddingChar;
        }

        CharMatcher padding() {
            return this.paddingChar == null ? CharMatcher.NONE : CharMatcher.is(this.paddingChar);
        }

        int maxEncodedSize(int bytes) {
            return this.alphabet.charsPerChunk * IntMath.divide(bytes, this.alphabet.bytesPerChunk, RoundingMode.CEILING);
        }

        ByteOutput encodingStream(final CharOutput out) {
            Preconditions.checkNotNull(out);
            return new ByteOutput() {
                int bitBuffer = 0;
                int bitBufferLength = 0;
                int writtenChars = 0;

                public void write(byte b) throws IOException {
                    this.bitBuffer <<= 8;
                    this.bitBuffer |= b & 255;

                    for(this.bitBufferLength += 8; this.bitBufferLength >= StandardBaseEncoding.this.alphabet.bitsPerChar; this.bitBufferLength -= StandardBaseEncoding.this.alphabet.bitsPerChar) {
                        int charIndex = this.bitBuffer >> this.bitBufferLength - StandardBaseEncoding.this.alphabet.bitsPerChar & StandardBaseEncoding.this.alphabet.mask;
                        out.write(StandardBaseEncoding.this.alphabet.encode(charIndex));
                        ++this.writtenChars;
                    }

                }

                public void flush() throws IOException {
                    out.flush();
                }

                public void close() throws IOException {
                    if (this.bitBufferLength > 0) {
                        int charIndex = this.bitBuffer << StandardBaseEncoding.this.alphabet.bitsPerChar - this.bitBufferLength & StandardBaseEncoding.this.alphabet.mask;
                        out.write(StandardBaseEncoding.this.alphabet.encode(charIndex));
                        ++this.writtenChars;
                        if (StandardBaseEncoding.this.paddingChar != null) {
                            while(this.writtenChars % StandardBaseEncoding.this.alphabet.charsPerChunk != 0) {
                                out.write(StandardBaseEncoding.this.paddingChar);
                                ++this.writtenChars;
                            }
                        }
                    }

                    out.close();
                }
            };
        }

        int maxDecodedSize(int chars) {
            return (int)(((long)this.alphabet.bitsPerChar * (long)chars + 7L) / 8L);
        }

        ByteInput decodingStream(final CharInput reader) {
            Preconditions.checkNotNull(reader);
            return new ByteInput() {
                int bitBuffer = 0;
                int bitBufferLength = 0;
                int readChars = 0;
                boolean hitPadding = false;
                final CharMatcher paddingMatcher = StandardBaseEncoding.this.padding();

                public int read() throws IOException {
                    while(true) {
                        int readChar = reader.read();
                        if (readChar == -1) {
                            if (!this.hitPadding && !StandardBaseEncoding.this.alphabet.isValidPaddingStartPosition(this.readChars)) {
                                int var5 = this.readChars;
                                throw new BaseEncoding.DecodingException((new StringBuilder(32)).append("Invalid input length ").append(var5).toString());
                            }

                            return -1;
                        }

                        ++this.readChars;
                        char ch = (char)readChar;
                        if (!this.paddingMatcher.matches(ch)) {
                            if (this.hitPadding) {
                                int var4 = this.readChars;
                                throw new BaseEncoding.DecodingException((new StringBuilder(61)).append("Expected padding character but found '").append(ch).append("' at index ").append(var4).toString());
                            }

                            this.bitBuffer <<= StandardBaseEncoding.this.alphabet.bitsPerChar;
                            this.bitBuffer |= StandardBaseEncoding.this.alphabet.decode(ch);
                            this.bitBufferLength += StandardBaseEncoding.this.alphabet.bitsPerChar;
                            if (this.bitBufferLength >= 8) {
                                this.bitBufferLength -= 8;
                                return this.bitBuffer >> this.bitBufferLength & 255;
                            }
                        } else {
                            if (!this.hitPadding && (this.readChars == 1 || !StandardBaseEncoding.this.alphabet.isValidPaddingStartPosition(this.readChars - 1))) {
                                int var3 = this.readChars;
                                throw new BaseEncoding.DecodingException((new StringBuilder(41)).append("Padding cannot start at index ").append(var3).toString());
                            }

                            this.hitPadding = true;
                        }
                    }
                }

                public void close() throws IOException {
                    reader.close();
                }
            };
        }

        public BaseEncoding omitPadding() {
            return this.paddingChar == null ? this : new BaseEncoding.StandardBaseEncoding(this.alphabet, (Character)null);
        }

        public BaseEncoding withPadChar(char padChar) {
            return 8 % this.alphabet.bitsPerChar != 0 && (this.paddingChar == null || this.paddingChar != padChar) ? new BaseEncoding.StandardBaseEncoding(this.alphabet, padChar) : this;
        }

        public BaseEncoding withSeparator(String separator, int afterEveryChars) {
            Preconditions.checkNotNull(separator);
            Preconditions.checkArgument(this.padding().or(this.alphabet).matchesNoneOf(separator), "Separator cannot contain alphabet or padding characters");
            return new BaseEncoding.SeparatedBaseEncoding(this, separator, afterEveryChars);
        }

        public BaseEncoding upperCase() {
            BaseEncoding result = this.upperCase;
            if (result == null) {
                BaseEncoding.Alphabet upper = this.alphabet.upperCase();
                result = this.upperCase = upper == this.alphabet ? this : new BaseEncoding.StandardBaseEncoding(upper, this.paddingChar);
            }

            return result;
        }

        public BaseEncoding lowerCase() {
            BaseEncoding result = this.lowerCase;
            if (result == null) {
                BaseEncoding.Alphabet lower = this.alphabet.lowerCase();
                result = this.lowerCase = lower == this.alphabet ? this : new BaseEncoding.StandardBaseEncoding(lower, this.paddingChar);
            }

            return result;
        }

        public String toString() {
            StringBuilder builder = new StringBuilder("BaseEncoding.");
            builder.append(this.alphabet.toString());
            if (8 % this.alphabet.bitsPerChar != 0) {
                if (this.paddingChar == null) {
                    builder.append(".omitPadding()");
                } else {
                    builder.append(".withPadChar(").append(this.paddingChar).append(')');
                }
            }

            return builder.toString();
        }
    }

    private static final class Alphabet extends CharMatcher {
        private final String name;
        private final char[] chars;
        final int mask;
        final int bitsPerChar;
        final int charsPerChunk;
        final int bytesPerChunk;
        private final byte[] decodabet;
        private final boolean[] validPadding;

        Alphabet(String name, char[] chars) {
            this.name = (String)Preconditions.checkNotNull(name);
            this.chars = (char[])Preconditions.checkNotNull(chars);

            try {
                this.bitsPerChar = IntMath.log2(chars.length, RoundingMode.UNNECESSARY);
            } catch (ArithmeticException var7) {
                int var4 = chars.length;
                throw new IllegalArgumentException((new StringBuilder(35)).append("Illegal alphabet length ").append(var4).toString(), var7);
            }

            int gcd = Math.min(8, Integer.lowestOneBit(this.bitsPerChar));
            this.charsPerChunk = 8 / gcd;
            this.bytesPerChunk = this.bitsPerChar / gcd;
            this.mask = chars.length - 1;
            byte[] decodabet = new byte[128];
            Arrays.fill(decodabet, (byte)-1);

            for(int i = 0; i < chars.length; ++i) {
                char c = chars[i];
                Preconditions.checkArgument(CharMatcher.ASCII.matches(c), "Non-ASCII character: %s", new Object[]{c});
                Preconditions.checkArgument(decodabet[c] == -1, "Duplicate character: %s", new Object[]{c});
                decodabet[c] = (byte)i;
            }

            this.decodabet = decodabet;
            boolean[] validPadding = new boolean[this.charsPerChunk];

            for(int i = 0; i < this.bytesPerChunk; ++i) {
                validPadding[IntMath.divide(i * 8, this.bitsPerChar, RoundingMode.CEILING)] = true;
            }

            this.validPadding = validPadding;
        }

        char encode(int bits) {
            return this.chars[bits];
        }

        boolean isValidPaddingStartPosition(int index) {
            return this.validPadding[index % this.charsPerChunk];
        }

        int decode(char ch) throws IOException {
            if (ch <= 127 && this.decodabet[ch] != -1) {
                return this.decodabet[ch];
            } else {
                throw new BaseEncoding.DecodingException((new StringBuilder(25)).append("Unrecognized character: ").append(ch).toString());
            }
        }

        private boolean hasLowerCase() {
            char[] arr$ = this.chars;
            int len$ = arr$.length;

            for(int i$ = 0; i$ < len$; ++i$) {
                char c = arr$[i$];
                if (Ascii.isLowerCase(c)) {
                    return true;
                }
            }

            return false;
        }

        private boolean hasUpperCase() {
            char[] arr$ = this.chars;
            int len$ = arr$.length;

            for(int i$ = 0; i$ < len$; ++i$) {
                char c = arr$[i$];
                if (Ascii.isUpperCase(c)) {
                    return true;
                }
            }

            return false;
        }

        BaseEncoding.Alphabet upperCase() {
            if (!this.hasLowerCase()) {
                return this;
            } else {
                Preconditions.checkState(!this.hasUpperCase(), "Cannot call upperCase() on a mixed-case alphabet");
                char[] upperCased = new char[this.chars.length];

                for(int i = 0; i < this.chars.length; ++i) {
                    upperCased[i] = Ascii.toUpperCase(this.chars[i]);
                }

                return new BaseEncoding.Alphabet(String.valueOf(this.name).concat(".upperCase()"), upperCased);
            }
        }

        BaseEncoding.Alphabet lowerCase() {
            if (!this.hasUpperCase()) {
                return this;
            } else {
                Preconditions.checkState(!this.hasLowerCase(), "Cannot call lowerCase() on a mixed-case alphabet");
                char[] lowerCased = new char[this.chars.length];

                for(int i = 0; i < this.chars.length; ++i) {
                    lowerCased[i] = Ascii.toLowerCase(this.chars[i]);
                }

                return new BaseEncoding.Alphabet(String.valueOf(this.name).concat(".lowerCase()"), lowerCased);
            }
        }

        public boolean matches(char c) {
            return CharMatcher.ASCII.matches(c) && this.decodabet[c] != -1;
        }

        public String toString() {
            return this.name;
        }
    }*/
}
