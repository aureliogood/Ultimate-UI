package dev.xqedii.ultimateUI;

import java.lang.runtime.ObjectMethods;

public record Xqedii_25ri1e7(Xqedii_1p9lu7f type, String text, int line, int column) {
   public static final String Xqedii_2nsuaw2blmu4j = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public boolean is(Xqedii_1p9lu7f var1) {
      if (((-2109516426 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((this.type == var1 ? Xqedii_1w2spuy.Xqedii_3eku49ayz96bv(-1790377882, 21) : Xqedii_1w2spuy.Xqedii_1q355lr7pwogd(-901311185, 14)) != 0);
      }
   }

   public boolean isSymbol(String var1) {
      if ((-1791583811 * -1791583811 - -1791583811 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((this.type == Xqedii_1p9lu7f.SYMBOL && this.text.equals(var1)
            ? Xqedii_1w2spuy.Xqedii_g5w54i1tymkv(-1977710307, 14)
            : Xqedii_1w2spuy.Xqedii_g5w54i1tymkv(254054085, 21)) != 0);
      }
   }

   public boolean isWord(String var1) {
      if ((1050493187 * (1050493187 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((this.type == Xqedii_1p9lu7f.NAME && this.text.equalsIgnoreCase(var1)
            ? Xqedii_1w2spuy.Xqedii_g5w54i1tymkv(-1977710307, 14)
            : Xqedii_1w2spuy.Xqedii_g5w54i1tymkv(254054085, 21)) != 0);
      }
   }

   public String describe() {
      if (((130410755 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return switch (this.type) {
            case STRING -> Xqedii_11gok8wevvvrw(this.text);
            default -> Xqedii_3i4zk8wh0va64(this.text);
            case NEWLINE -> Xqedii_1w2spuy.Xqedii_x2kddcpny5mn("T467gQxZ4Tzkw9tyQ2oy3dWFyPxkjJkcfRI/q5Gxp2wDsMVv9zTFae0OGuxAbiurKw8=");
            case INDENT -> Xqedii_1w2spuy.Xqedii_x2kddcpny5mn("vqmr+KJMzOYqG2RleKh+sB7Wb2pn810eMMCVkI/6oW+pkAXMstwohHEvZzA33GiFYbs=");
            case DEDENT -> Xqedii_1w2spuy.Xqedii_x2kddcpny5mn("DjZjn+z8XW7APdagIOPctV2NvsAzzPH5e4BTmBwJ9CkCw+mJviT2QxefjXra0zXwBoMPFg==");
            case EOF -> Xqedii_1w2spuy.Xqedii_x2kddcpny5mn("0GYmBwW2cVoxBJ/RugYFOBjFM8FM9mnFQxxI/O1JSwGf300NL7aXcCAFYZH1sf3NKgc=");
         };
      }
   }

   @Override

   public String text() {
      if ((-1394503442 ^ -1394503442) != 0) {
         throw new IllegalStateException();
      } else {
         return this.text;
      }
   }

   public int line() {
      if ((-492461147 ^ -492461147) != 0) {
         throw new IllegalStateException();
      } else {
         return this.line;
      }
   }

   public int column() {
      if ((-588641022 * (-588641022 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.column;
      }
   }

   private static /* synthetic */ String Xqedii_11gok8wevvvrw(String string) {
        return Xqedii_1w2spuy.Xqedii_x2kddcpny5mn("8Dw6G5peGj/cU3hqZ1IeSpNFyoMFHkEgdpbUBLoW") + string + Xqedii_1w2spuy.Xqedii_x2kddcpny5mn("8Dw6G5peGj/cU3hqZ1IeSpNFyoMFHkEgdpbUBLoW");
    }

    private static /* synthetic */ String Xqedii_3i4zk8wh0va64(String string) {
        return Xqedii_1w2spuy.Xqedii_x2kddcpny5mn("25sMQRcCoOBr9QZ9dpFL/yVVircby8viDjeTsQvm") + string + Xqedii_1w2spuy.Xqedii_x2kddcpny5mn("25sMQRcCoOBr9QZ9dpFL/yVVircby8viDjeTsQvm");
    }
}
