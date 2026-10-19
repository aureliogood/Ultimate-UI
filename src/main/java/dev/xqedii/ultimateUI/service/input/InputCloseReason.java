package dev.xqedii.ultimateUI.service.input;

import dev.xqedii.ultimateUI.Xqedii_18nv4sf;

public enum InputCloseReason {
   ESCAPE(Xqedii_18nv4sf.Xqedii_kjfkxv5cjo7m(-752378327, 30) != 0),
   CLICK(Xqedii_18nv4sf.Xqedii_3crngvx6gr0e9(-518634822, 30) != 0),
   MAX_LENGTH(Xqedii_18nv4sf.Xqedii_3crngvx6gr0e9(-1159653822, 22) != 0),
   TIMEOUT(Xqedii_18nv4sf.Xqedii_1m73irwhx8s9a(1332349489, 29) != 0),
   PROGRAMMATIC(Xqedii_18nv4sf.Xqedii_17rziljlzm2rb(609437506, 10) != 0),
   DISCONNECT(Xqedii_18nv4sf.Xqedii_17rziljlzm2rb(609437506, 8) != 0);

   public final boolean commit;

   InputCloseReason(boolean var3) {
      this.commit = var3;
   }

   public boolean isCommit() {
      if ((1848758068 * 1848758068 + 1848758068 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.commit;
      }
   }
}
