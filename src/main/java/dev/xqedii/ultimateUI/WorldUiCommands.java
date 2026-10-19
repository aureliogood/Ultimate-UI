package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateUI.service.gui.WorldUiPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class WorldUiCommands extends CommandArguments {
   public static final String Xqedii_1b4wb0609j6v0 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final List<String> Xqedii_1rrce4w;
   public static final List<String> Xqedii_3uuzz0v;
   public static final int Xqedii_2gk10es = -2;
   public static final int Xqedii_iwoenvc = -1;
   public static final int Xqedii_16fahzo = 0;
   public static final int Xqedii_aje2tsv = 1;

   public boolean handleUuiWorldCommand(CommandSender var1, String[] var2) {
      if (((-475935992 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!this.hasCommandPermission(
         var1,
         Xqedii_1vexecq.Xqedii_2ow587hjypp0y("1KWzSuwOJ0PvZ8XrkjJqhd/ef4fhRttS6J68jA2rR9XUWk5vy4ZKjXpWBN/LmSYvYPDxYNhBwMyOVl1cMrLxngZ5p2fYHpfvtbplsA=="),
         Xqedii_1vexecq.Xqedii_2ow587hjypp0y("8lSqTwnzy/jHSRE8wvyUDmw6t+MBBcLcdhLf1U0rl4s8Abq62zs210I0vUqJHc5s")
      )) {
         return (Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1272824655, 27) != 0);
      } else if (this.Xqedii_2k1vujp == null) {
         this.sendUuiServicesError(var1);
         return (Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606943, 4) != 0);
      } else {
         String var10000;
         if (var2.length >= Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1675477839, 28)) {
            String[] var10001 = new String[Xqedii_1vexecq.Xqedii_1ladjox5782r3(729154190, 2)];
            var10001[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 5)] = var2[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 20)];
            var10000 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
         } else {
            var10000 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("9BZC3u9sJFc45VY0ckHcCq0Hnz6RvnjrmUSOW3npPP28Zgw1");
         }

         String var3 = var10000;
         int var5 = Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-1945234916, 28);
         switch (var3.hashCode()) {
            case -1360201941:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("jjQMRPn7jwfsXyW7a60rH5DZZZlqdR3zHwEHxDaj0K3/kEbByiYvd3cIsYE="))) {
                  var5 = Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1965195078, 0);
               }
               break;
            case -1352294148:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("rbV+dpWWiHH1HewHtfA8FF4QOm2vgVSH35uneLEjHYzZ1FuX50Fgkg=="))) {
                  var5 = Xqedii_1vexecq.Xqedii_1ladjox5782r3(364577101, 1);
               }
               break;
            case -1335458389:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("X2M0gU7giqIzjZ6+MrRybk8FpeLuuB080XZjuL1H/oujH8J1Ldr6dw=="))) {
                  var5 = Xqedii_1vexecq.Xqedii_1ladjox5782r3(347167664, 21);
               }
               break;
            case -1289860719:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("LVyscukbxAhHoNTFLDFJwJ/tISwkLFkjU9LHdOmigKJW6gNJ587PzhNChFWGM4kh"))) {
                  var5 = Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708671, 7);
               }
               break;
            case -1097095406:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("yB/jXmP3tMIqe/R62ZjxYSKcBhXapWIeoy2W0pc/lOtSeR5uD1GzTw=="))) {
                  var5 = Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1137034063, 17);
               }
               break;
            case -934641255:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("0JlKYyEMkYCM+hAlhcPU+mKwnfkI/7IHtSYNGTYSoUEMNJT8QI54QQ=="))) {
                  var5 = Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(303967246, 12);
               }
               break;
            case -934610812:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("cKsyVx/b3ghP3TDlF43AzYuzNgjdZjPwd2unVcRxXQAMajDtSeMIXQ=="))) {
                  var5 = Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(-2082618545, 29);
               }
               break;
            case -925180581:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("v+jVkhYMvuBT80kwomyHtdi6mkSJUBVabTbvqDOW2aSnKMbSxBaKBA=="))) {
                  var5 = Xqedii_1vexecq.Xqedii_1ladjox5782r3(1656184874, 30);
               }
               break;
            case -868304044:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("xTRyx493t9WJUY1CBKp36zjtnfmLW3nLVM2fJm3Rt7uZLdERzchlSw=="))) {
                  var5 = Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-603057635, 28);
               }
               break;
            case -103826623:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("TaWNoP+X4UlbEY0H5ScSboeXAN9lQJvE4VIQevknbFTm4V2sKgtvdat8y/c="))) {
                  var5 = Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(470684189, 28);
               }
               break;
            case 63:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("eh8F8yhPAXI7ctOcEyigaWK1fyofvFsnKOzlWzmf"))) {
                  var5 = Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 28);
               }
               break;
            case 3708:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("mwZUAAho1QYX/KSBitgimQkWH9zrO0krygagCdLJcAU="))) {
                  var5 = Xqedii_1vexecq.Xqedii_1ladjox5782r3(-701794814, 26);
               }
               break;
            case 96417:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("8+WIwbG87Gm8ZxBm+ZOQ/NStK8dzfYGZiNXNULQ5dGVEvQ=="))) {
                  var5 = Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(1888544608, 7);
               }
               break;
            case 3198785:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("9BZC3u9sJFc45VY0ckHcCq0Hnz6RvnjrmUSOW3npPP28Zgw1"))) {
                  var5 = Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 9);
               }
               break;
            case 3198960:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("qLdFXQtm9jvXSHkX9tBXKOcF9/K2xH5b/t4TdaTuMzh7f8z6"))) {
                  var5 = Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708535, 0);
               }
               break;
            case 3202370:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("If85ZZvyIoeHhGEK9Dc+XLuUuH6Y7lKo3NPxKd6aWJLYhHrc"))) {
                  var5 = Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393707903, 5);
               }
               break;
            case 3322014:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("ZHumnSePkPb0TF5bbDge2Yu2yIIDnd+kJvE3S9w4YzLM/0mx"))) {
                  var5 = Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-1139928548, 28);
               }
               break;
            case 3357091:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("0YKg9/TUuHqv6QtVK19Wr6PhJ1JfYI06CS0Wzj5HjUyvSgPu"))) {
                  var5 = Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138610255, 8);
               }
               break;
            case 3357649:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("ryfzMPBvKtjji1s+XQi+jS/eQjV4wZ3N72YCxTFxmQiFmSmU"))) {
                  var5 = Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1340796581, 13);
               }
               break;
            case 3529469:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("IbOBHzfQbpiO3UffoNC55SodY+QnG6LXdQk7gmKk9aNAG27l"))) {
                  var5 = Xqedii_1vexecq.Xqedii_1ladjox5782r3(-2135651619, 16);
               }
               break;
            case 3530753:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("zjqvxqsslxA+9FHX8Yo5z6yYqjtTjTZClJOiebgXoUBC55AW"))) {
                  var5 = Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138607887, 6);
               }
               break;
            case 106748167:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("jgUHgsHdbtBjy54bGTcFmitzDHIt1TkV/K0PkuDjJNUoP2/CLh0="))) {
                  var5 = Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(1617989862, 31);
               }
               break;
            case 113126854:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("GmJ6BpoztFFxKv0/eRRxeZ3NfTaRH2OpzcFnvhnow+LSBnge5IM="))) {
                  var5 = Xqedii_1vexecq.Xqedii_1ladjox5782r3(23139771, 17);
               }
               break;
            case 349730337:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("m1AbJQyr0xVFX7ZBI9u0po1a1urCg7iR2RxTqEdhJziW/V16ogXHFSNy"))) {
                  var5 = Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1340739237, 13);
               }
               break;
            case 764166718:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("Ycf1g+wZkkKQ+bn7kABheJ0ZaTQD5QjEulxM3S0vi1kX363eFoBkvqcheqWvAw=="))) {
                  var5 = Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(236068236, 4);
               }
               break;
            case 1844104930:
               if (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("gwX12goz0ZEO8ZRPM+EL1cgNYNUzu6CqVvvhm3HTmolvS0CPqvDLbhJjm2gQaYKxe18="))) {
                  var5 = Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1305774590, 26);
               }
         }

         switch (var5) {
            case 0:
            case 1:
               this.sendUuiWorldHelp(var1);
               break;
            case 2:
               this.sendWorldUiList(var1);
               break;
            case 3:
            case 4:
            case 5:
               this.handleWorldUiPlace(var1, var2);
               break;
            case 6:
            case 7:
               this.handleWorldUiRemove(var1, var2);
               break;
            case 8:
            case 9:
               this.handleWorldUiMoveHere(var1, var2);
               break;
            case 10:
               this.handleWorldUiMove(var1, var2);
               break;
            case 11:
               this.handleWorldUiRotate(var1, var2);
               break;
            case 12:
            case 13:
               this.handleWorldUiLookAt(var1, var2);
               break;
            case 14:
               this.handleWorldUiInteractive(var1, var2);
               break;
            case 15:
            case 16:
               this.handleWorldUiPerPlayer(var1, var2);
               break;
            case 17:
            case 18:
               this.handleWorldUiSize(var1, var2);
               break;
            case 19:
               this.handleWorldUiMode(var1, var2);
               break;
            case 20:
            case 21:
            case 22:
               this.handleWorldUiToggle(var1, var2, var3);
               break;
            case 23:
            case 24:
               this.handleWorldUiTeleport(var1, var2);
               break;
            case 25:
               int var6 = this.Xqedii_2k1vujp.reloadWorldUis();
               String var7 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                  "tIMYmTNtDmjPU2cU6C85R24PUKeaBTv2z8xXLdMv1MtDFqDpUlgTTHK6I/WityJiJdYoxHOlTfZHW8KOCoPrSTPK/B/3Wag8gkY="
               );
               Object[] var8 = new Object[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1137558351, 20)];
               var8[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-335211434, 11)] = var6;
               Xqedii_3ul4hqj.Xqedii_2pfjv2g(var1, var7, var8);
               break;
            default:
               String var10002 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                  "lbbYkxKDZLyp7lDsjnDdV+pxeaW2eY7mPjRNeQa4uSwWrfJJwXonf9vgMJZQsxiUTeCwD4cdj0lRbysqbbOkXtj1NBzvy0VjreW4kmOqQKNhDY/ILY0l3uU+yeFjNfeLavUe/iyS5r2u5s/FnLRdzRDytqHIdnukj3Q="
               );
               Object[] var10003 = new Object[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606959, 4)];
               var10003[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 3)] = var2[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 5)];
               var10003[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-2027224188, 18)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                  "5Qo+d1bbudLcsI8b5OaCyfTkEgtdnY9nm3b0i8cOsgsF8TSmLV2rSwsapI48DHkElGoJM85zGo62oQ=="
               );
               this.sendUuiCommandError(var1, var10002, var10003);
         }

         return (Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-1338488718, 30) != 0);
      }
   }

   public void sendUuiWorldHelp(CommandSender var1) {
      if (((549949577 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Component[] var10001 = new Component[Xqedii_1vexecq.Xqedii_1ladjox5782r3(1506111168, 23)];
         var10001[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606927, 27)] = Xqedii_1df0pdx.deserialize(
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "84ooH+FD6nMp8bYbCmgtAmZ1L9ugxS4aW0CjLC5OMv5AEVb3vs8gUsv1u8QKvRPbDeMYX+MxGELdzxEY/J0gQKFoKeVoT1mSc+p1dGRhHUrjnZlp+mHHMAAzHg98xzPKpc/qshCMD1XMSz11ND4thDCfxb6vtplWi0ERaYKRfcNnf5Q70xSYvVdiXwugHi9Pdq7vVc73FP1psTVQREDkSh9Ejo6MjxY4kBi+iXgOd+s="
            )
         );
         var10001[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-2136765731, 16)] = Xqedii_1df0pdx.deserialize(
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "pO6JLj0CwoMxgoteVyKCDoqCS/3S8IAqb5rKTWziH0qqFNeNAo3CfXqjE035PRSZEGwAg3yF/oA0ZBs19XM+QCW6htgurSqBuaijoOU1acvlEaVFx87BRxGmNsYPn1pJKU6/Td68cQCOS6pxnZizXxFfrE1G9nMiNF3yNBTtGVWqYQ=="
            )
         );
         var10001[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(391611391, 21)] = Xqedii_1df0pdx.deserialize(
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "HshQQ/+BFMuIccftY/hhEYST+p7zAz6vG6Gj6v7Nemxbzmbr2zTftGS4DNcO9+5QSFeIvKWow0e62Pibr2VwZ/BBhs1l5PTEqr8bE2tj1mt4kGdC8jmS164VDSNGf3WI4uqrGQY1uLNmjkks/jFpIP4v2tOAnnAjm7iO23EsRjeoasOJAFJ8JlKyeRJbXYZz1DMFFN7OFbWSaQovmF8Bpg=="
            )
         );
         var10001[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(125273087, 27)] = Xqedii_1df0pdx.deserialize(
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "/mdi62Yfhia5oXEQmAJbWgcSPboOYDn6943dsNHUrg7hR8zJezx227jIPNMxS4/FsfYfEkldoaP5RBTz/LqaRoLVaFyO31JgcJPd+lzyTLTtYHLhAB6KF4u/lenQwlbJIaY5IC7pqOdeZCZotS+pECxOTh3PPr5hvlUYFK3sWbJEuChanZM15tmYDz3+ygNFtQV7bYkdeRvvCC5ioVHbeg7/KmyAtyvtJR7+h5hc4E+B3n0gbiugZro8gFS47yQYC4zaBQ=="
            )
         );
         var10001[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(303881230, 12)] = Xqedii_1df0pdx.deserialize(
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "cuA7fyqkUmdU0buK7brkRruwe1u5P0pdArDTgu5NUDefnbBgEr3YBBtrfXly0jENLAdPWNiYEqwPneltGs/iF55f31MQkHLmw09BvqjLvW2lQ6ocfcfUb/moEd8ANwNOiEvVdaWTwNd6n3tBa+ZgzyYpzSUSdS6SJ9kunRR3kGLfVOby1ZA7VExu/VFH+OAt9Zjv7GhZWbyGjYPSLBojzt+mr0vhICF1sIE="
            )
         );
         var10001[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(1467450367, 28)] = Xqedii_1df0pdx.deserialize(
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "ySwej0qwvatSamGL/aYUJvECbF/c+PmgMwu0JmKF8Kj+8bCj4JwcMK3amsYmbPhP/IgAUKrmb0YHgQ6TKeza5ar6jWh7jGOp3CTkVijqCBFkCKu8wCExoAXWMdBJAZXS7qqFMOclnvEV6U51b1qX4AFtCErYvws7Frmv/29Kdw2dId5SCAFFt6ZOptzqvm+EmwR7JVNniMTadGaKo2Pcxgy5Qz9s21n4fOPgptI2Hv6dY37/qqZQdLexRa/qGyjf1BYZRMvZld9JD9rIaL0So2ewq+7v7+kYmWF8ZQ=="
            )
         );
         var10001[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(601736015, 28)] = Xqedii_1df0pdx.deserialize(
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "LC73ojeXy3ahFNOeiRIC3Dhnsv2mPb3qpVf7/he2cBli6UzonBZBhAvGY9bhpiG0SbB7l0iu2CfhQTM75mSL5uyKztQ3ZmHbuR3ChwUzaScRKuHjYYyKp4TKLCl9qlbwoa5ETUnzY8MsJIw2DQ1glnO719oLLdcc7v2ZLxsfj6wZCYfLwSsJguTxsRk6G8ddoBrMDWWcbO9KV+/uvBcHnZnHh8u+KQ/wTiaj7oO8wqGQrSTBGCLQj1CQsgRar7aElZKzYuz1NHsxU5o0Bic="
            )
         );
         var10001[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(293045247, 24)] = Xqedii_1df0pdx.deserialize(
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "J2jtZyXf9pjxNWoCn1DTkZl1hLZCRaZOJQb/cdQg9ROQ2I8rrc8xBgNvDnJ1rz2A1ugM7TIijsWBE8qscwy8a70kOGtGl9DYRLddnxWokZ2XoUJPusKKEyBZFu1xo9crI8S5A25fT8vS2N73t8Ug9KPAPz6sknGNfN0MeYVP1TrFV5AYKddzy+Dqq+FrJfJjn12ozFfjCjJZm5S5K/TVvLUiREQWAxz3Omt2ZxDR97qcm/uBRyOB9gWdt38RYg=="
            )
         );
         var10001[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606919, 0)] = Xqedii_1df0pdx.deserialize(
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "SQk+qQfiQPd489ys1QXNcfrmY7W6WXP7WXkGQbmZx2W0JkuzRqkTVDQHJNNQXO42cEcwWJfBbAD5sx2QdXgn0cCtgW0zg49GVL2wvrRcrry8bVXAglmErYE2z9WSRvxWTGQYGQM1F30rPL91wk4TY0Zu+BQVjp7KF96G1Gf7U7ZXLhZ2k8Wla0ov46oWBtdIgQqmO8OSbEzWq6J0SxPAm02HiqcsWVV7CcGDdBAjr49UBnH2HPo="
            )
         );
         var10001[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138721615, 14)] = Xqedii_1df0pdx.deserialize(
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "nVzip8PU0MqElohhRe03XHMe7SScqLqiMbweuJyOOl2mV2Mpm28b9w1NtVMqjERviXbP/xpRSAAOnay3o3KiNoNVlPZ6h7kskETacW7qHjzcepYZ/X/NykkUIc55VEC4m6utnKnk5j+GSkEO77luzd8BOZh3TQTGggz/5IiwRIL9dXWpaYhW50/X434gVAIa2QAQ18L0LyxjyKLhWpmQ1fRv8cyMAKo7WAwKXPrYUwz7xO2gXQEUlPzhg8acGR89GNyjpg=="
            )
         );
         var10001[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(1135051202, 17)] = Xqedii_1df0pdx.deserialize(
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "ul1hBgtRBVJLursyCWBH5u7KP4tdfvoMoVBF6vAPPbmAMxADoXIDPY+C8nbUYCmvqOYrJo939UdMwQKP/AQZcrKn1mTyQmgoA8Ji12aIBgGEM5yn72T3e45p/jxM1KBLawXQihEGnp5X7XzMwjzbD8iRSHuhvo9LRSwITyww19Tp15ExQDx9hcqJFA+qMpXSd52SpJJw+hBfSRzQE79Obk9fjSo96nbuLi/WP6Hyhj6bWvzI"
            )
         );
         var10001[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(118034086, 3)] = Xqedii_1df0pdx.deserialize(
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "UplLr3V5ChHnlzJcpE2bGyLx4WgejigmVDEScbKJGa0hl0zJ0PZxlqF+/+fWIz3/oAQISavltR7QxbvQerbz6TQdXH89TGMGcxZr3pxIVoeWhTSlVBZCuHUR0KDeMr4+kb1AmRQxd8JShkYdD4zn6YCnohEY5b170u5+ixRmrFFwBIz00CJ6BfggwFpYrFHXeDtkcb/4YN8Q6nbk2ko="
            )
         );
         var10001[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393719807, 10)] = Xqedii_1df0pdx.deserialize(
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "SP/2VbGVvHArloovUcc0iojNQ3VU6t0cbwDuED+WLUH8JN3+/45/uLXsCAw2/MaLapLJfIMvbitzLDmyruT+0t0Gfv5JbEz8BVnb8xCHZkfIHBYTb5aMlU5gTCvUS3lX1bClmlT/FZgSZe881h+KF5Df1iwWd5FHsWd5Pn+V3vdaCe4ONa0FKZGTONQC5YrgHvwUb2lYYnk9hIVrqt71EAIT"
            )
         );
         var10001[Xqedii_1vexecq.Xqedii_1ladjox5782r3(184069592, 20)] = Xqedii_1df0pdx.deserialize(
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "AgaGDZTRKuvqjxuvYjD6aBzLvlwytx0KSsam8UdK0uP/SBcRaneBKTa9ktRQaPDivJ3iic9s9qs5GInAH9I2aeuW9t8bsEIkU0AM7NLRulQbJRtrc2bClGi/ZwXrr2240IRWVlfhcntsNfvNF0rhXTAzFRI2grxIqTOk3Fu4PlZxth6+LUI="
            )
         );
         var10001[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1400185472, 24)] = Component.empty();
         var10001[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(151963143, 11)] = Xqedii_1df0pdx.deserialize(
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "xTQI4HgLdx24G/oRV4LrRnS+pWT6Ntu3Jbyb40x/CM8hzZMOPWyzS5wo3sdb95EI8fRxbX0ukWzo3M0NA43UlmvmX47xuBvcAvI87evg5g9rbvYEP32v5Lb+lRzLcM1Gzh2/l0h0MALUNE3F8Lk8nbdtzqjNFj+dgvY="
            )
         );
         var10001[Xqedii_1vexecq.Xqedii_1ladjox5782r3(1979894315, 10)] = Xqedii_1df0pdx.deserialize(
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "lefd16Wx4AZhuF+6UjEJJawczp0+lD4aZkj57mHxz5w6nZsS9eb8K0YQaJmnH6hGwS0SKSgYgGpuKvNfOM5w/lZyEt0sfets5uYTtj9z250/oSQnahGqb3BFfBiRGkam+9TgbfocPj8LOTRmhJQucFRNd3sbtFFkkWgTjiea1UpFOprFnoOKZZpAXm4L/3czxj779JhHPdV1x+EyuhZhmZZt+JemiVJAAdBsjU8+isEzkzowmqyCSFjJWloFRch1gHGyJ4nNFz/ymULgqB9h1YLYFd4HhPyf8rB/ce6k1n4/9wD1vXqim7tlTpDs7RYmxYDTUkXg9jp1/V78FcMGJTdBEq5tHvI01xtv74wQtOn/iZz3DTHUCUXeBz0ecfk28zuA57eijcCUdwgz2TVRp938+9L4UuL4dD/Nqe9vz1m0+zfjWeuDYykCM36TnUvDSetD/DK1NYjKglhZyJEevZAjygbZ7W6H4jZPAQ=="
            )
         );
         Xqedii_3ul4hqj.send(var1, List.of(var10001));
      }
   }

   public void sendWorldUiList(CommandSender var1) {
      if ((261324986 * (261324986 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         List var2 = this.Xqedii_2k1vujp.listWorldUis();
         if (var2.isEmpty()) {
            String var10001 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "S4V0m52JxRtBEslPq1EYE2Ayk8+Vy3b7LrJ8p14koCljBU0sHCi+Q51Pf+xG8tkM2aMxTqzeymQLrlGy5OtQuLbsr/ZBqvO+RGeegOA8/spnsF8+KJN2jdOJIpkpNTUonn03DaybTNk+XGhg5MoirfN0ACxlF4NM/MUNdaeNehQ+KXVqlYtRr59OIVUnww=="
            );
            Object[] var10002 = new Object[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 2)];
            var10002[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606927, 16)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "L2GIaTFcsU10mLLDk2Of+TWqUJ+PBbJuPudY0cZMneJKx2kiU9klwpJqFvF8Dx44SB0MOyxcHldSMWL4b7OFpS6VrzxiKgtH3dI="
            );
            Xqedii_3ul4hqj.Xqedii_2dtmver(var1, var10001, var10002);
         } else {
            ArrayList var3 = new ArrayList();

            for (WorldUiPart.WorldUiInfo var5 : (Iterable<WorldUiPart.WorldUiInfo>) (var2)) {

               String var6 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("miner10CXzJe27OaaiLbLDXmoY6WWW05YvXjiUtp6hWbXF+JibhIxw==").equals(var5.mode())
                  ? Xqedii_3ul4hqj.Xqedii_1u4gly2(var5.location())
                  : Xqedii_1vexecq.Xqedii_2ow587hjypp0y("aldk7APs05/j0OA6lv0OXUxCjxAcC8SUcBvPQbRvpNulmJ3ahN6k+sQbTGWhahSloRVv8W4ltI8j0A==");
               var3.add(
                  Xqedii_38nv8jyc47ufz(
                     Xqedii_3ul4hqj.Xqedii_1u4gly2(var5.name()),
                     Xqedii_3ul4hqj.Xqedii_1u4gly2(var5.page()),
                     var5.enabled()
                        ? Xqedii_1vexecq.Xqedii_2ow587hjypp0y("s5R9a5JwodKnpShqMrrd4lLYdN6/BcudzXmzKKozfCJv4bVpN3s=")
                        : Xqedii_1vexecq.Xqedii_2ow587hjypp0y("AhEkI/UVE1fkD3+nNvTW3+Rto8pS18sdOMaEO2d6qiCDMZhwlB+YBw=="),
                     var5.interactive()
                        ? (
                           var5.perPlayer()
                              ? Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                                 "n5n3ad3Au4rCUCH8p1MVHnMuHF8Jdfsu4fqmXu+nM65oVUsjrHtwixBE79hVai5W16lDryfVjTP7DAgWrS+3OQ6ujss6neT8"
                              )
                              : Xqedii_1vexecq.Xqedii_2ow587hjypp0y("/4RW8EDR9RVY5ZWCDtuNmG1W5zsctywtHXVktFZA38OefaYgkWrZD52B/fZX1qYGG3ojPmeo+iyts9bnXkPsuA==")
                        )
                        : Xqedii_1vexecq.Xqedii_2ow587hjypp0y("WanqX8LPL1OnLJ22JBro6hBgMGzwrZ/svAIjgA20PkdJMQ6Hw8xEYtJh9wlcsT442K+pcw=="),
                     Xqedii_3ul4hqj.Xqedii_1u4gly2(var5.lookAt()),
                     var6
                  )
               );
            }

            Xqedii_3ul4hqj.Xqedii_3crurrx(var1, Xqedii_1vexecq.Xqedii_2ow587hjypp0y("F0oWdMBZ2mV43WAxoHswPCxcX1ARAupsjxQY6BhGUHtlqkXYAk7XOfnPLcDUgw=="), var3);
         }
      }
   }

   public void handleWorldUiPlace(CommandSender var1, String[] var2) {
      if (((484047598 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!(var1 instanceof Player var3)) {
         this.sendUuiCommandError(
            var1,
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "MDu6+MnLH3LRlNEKuCi2dD7cvS9AE5ze4sXJhlDxdmniFWe6/rVgF1C4sRwvMjrnarwQikUkPUv0ijjK87TlXiYtNcttIeXtx9mbdgvZbNoqRV9qbi+hZGQ7dBfjlw=="
            ),
            new Object[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(1888543968, 7)]
         );
      } else {
         if (var2.length >= Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(394232831, 18)) {
            String[] var10001 = new String[Xqedii_1vexecq.Xqedii_1ladjox5782r3(475458565, 27)];
            var10001[Xqedii_1vexecq.Xqedii_1ladjox5782r3(1979877931, 10)] = var2[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(236068028, 4)];
            if (!this.firstNonBlank(var10001).isBlank()) {
               String var4 = var2[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708541, 1)].trim();
               String var5 = var4.toLowerCase(Locale.ROOT);
               String var6 = !var5.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("gkyEiZHlJOFbCLDgvB+tamn99BkRcWVUfIdHlwet2o4QnZsDc8YQ+w=="))
                     && !var5.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("wYuL9yr/4MigVY2stA4kkRY6ehwvZpT6lZCR9GlOtR2JPpgmEM9/tSN+FVqViRer4/M="))
                  ? this.resolveExistingUiName(var4)
                  : Xqedii_1vexecq.Xqedii_2ow587hjypp0y("VuOhWO28zJPTPkxaxP5XaPgmG/APncdetnflnA==");
               if (var6.isBlank()) {
                  String var14 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "+EA9lzHBZOxx77FJEJ+R/Po3Lfw+jHWMjw3l/RQkeLy6TF5u7j9Ut1JlGitGfy+yNX7xUZ0E3lTNgbiGbCtEST2qqrqsqGsc"
                  );
                  Object[] var19 = new Object[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 23)];
                  var19[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 4)] = var4;
                  this.sendUuiCommandError(var1, var14, var19);
                  return;
               }

               String var7;
               if (var2.length >= Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1137558351, 18)) {
                  var7 = var2[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-2071514365, 10)].trim().toLowerCase(Locale.ROOT);
                  if (!WorldUiPart.isValidWorldUiId(var7)) {
                     String var10 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "ZN7IHqAsRzM2Qd05VvD/28nQgdj067IgWs6dCtzlPuzg8nAlv47ge/mi+PrJymjYaVw9xw0IpNdAYSSHZlyroVOBcNL/EjvDcRDyuR92RZC3b8CEDmmj/SOdJoIk8B6WzMtGvN0ApZdtfBHEPMjMg/vYhUhuF75kVNVfqw=="
                     );
                     Object[] var15 = new Object[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(64865103, 30)];
                     var15[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 8)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "QDcz/g8S2oIetyoG9Zri38tKYi7SLu0r7wOjJrvG/kxVnPpJkCkgVHAnwKepxU4Ti0o="
                     );
                     this.sendUuiCommandError(var1, var10, var15);
                     return;
                  }

                  if (this.Xqedii_2k1vujp.hasWorldUi(var7)) {
                     String var10002 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "u1hjfk14tKnt06Q7gQiFCQKaPMnfsRa6bR6PN12lij8ZA8R/eO8/NsmWN8knEYMi6nFdfZnSYu/rr8z2HxHycvn1WCfV8Ob3dsfTutwTaKy7K1Ew"
                     );
                     Object[] var10003 = new Object[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138541391, 16)];
                     var10003[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-455053168, 23)] = var7;
                     this.sendUuiCommandError(var1, var10002, var10003);
                     return;
                  }
               } else {
                  var7 = this.Xqedii_2k1vujp.nextWorldUiId();
               }

               String var8 = this.Xqedii_2k1vujp.placeWorldUi(var3, var6, var7);
               if (var8 == null) {
                  String var13 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "o6TADAV1t9vNm+4X7+Zw6jT8skZGQWrwpKPXQou1gtfNbzV9sR9fIey7+E0qINR4rrVyEqrNZPDV6n62XHYa45TZOTlIyUi4cHggKNWSOQ2MOEsny3D7QveMDcngr38a8+iLgxREnNoI8nnYXpO6RHdTQ2cjetF+UGhmVWkkWrZrfQ=="
                  );
                  Object[] var18 = new Object[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 7)];
                  var18[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 31)] = var6;
                  this.sendUuiCommandError(var1, var13, var18);
                  return;
               }

               int var9 = Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138344783, 18);
               String var11 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                  "e1W8cZwG5iLlhBQiRugymT1hselX2PyaOdppKK494FZwgbE3bv8gfi6bnN2tPJN9skuNSf876jBs354gg36wQqezkKpbq35s58ZwpQ=="
               );
               Object[] var16 = new Object[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606415, 9)];
               var16[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606927, 19)] = var6;
               var11 = Xqedii_3ul4hqj.Xqedii_2d5sc5r(var11, var16);
               String var17 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("aTAHMNcBkOSaXlnoE+LMiRaawZBHOzlMoYhBp4u/l87syTptu9o1zpcJryCetzBVkjZ/Uk/u6X8CRA==");
               Object[] var10004 = new Object[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(944272048, 6)];
               var10004[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(1888543968, 7)] = var8;
               Xqedii_3ul4hqj.Xqedii_2g7xq9b(
                  var1,
                  (var9 != 0),
                  var11,
                  List.of(
                     Xqedii_3ul4hqj.Xqedii_2d5sc5r(var17, var10004),
                     Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "K22HsHDFwl+BNW1v9wRxxkVlTaCjHgE/ilxImVeYlvf6wnGFnnk7w7itI74Vfs+ZUeH/XvfeBD8JRrikLl3xX+TiQ3yzWvE1sEZj8UOLOzogOpzDPIWxD3LEnAwUEKseOmdzfOBsGfg7EQ=="
                     )
                  )
               );
               return;
            }
         }

         this.sendUuiUsage(
            var1,
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y("TZWkG9v/ZvIWVB4CAVG6JfsdM4qgHcyMCbB8cLmHM1M6r5tCE+3CVB/p2Egm2cxHrOFz4c1MYPrkItlz"),
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y("pR4VuguRom0c9Am+jLuqlK5B9zSrGlzfMe5KZG0oyqlN25vkSJd8WDtb/tk80ntUxWQ=")
         );
      }
   }

   public void handleWorldUiRemove(CommandSender var1, String[] var2) {
      if (((1878182380 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var3 = this.requireWorldUiId(
            var1, var2, Xqedii_1vexecq.Xqedii_2ow587hjypp0y("XzTm0ek6Oc/Hwr88DmvawA32HvCydsHpFPb8EKkr6Tfi0/MdaDLUyrJzvm0x/C1LvFLwN/7GE1wIHtUm3mwJ3bHnctxIdU8D")
         );
         if (var3 != null) {
            if (!this.Xqedii_2k1vujp.removeWorldUi(var3)) {
               String var4 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                  "9VHsMh2LZimwHb28RzsCTeO3WR9Nch6ISauvkjmGkpaP5QhZjx1DD6BKolbUQxszXIePMQOYXDMprae2dpK66iOTG7O9zNSrfTGJmKp1xaJDZc1o7TngJEABVVtTkw=="
               );
               Object[] var10003 = new Object[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-1864015760, 15)];
               var10003[Xqedii_1vexecq.Xqedii_1ladjox5782r3(1613275831, 14)] = var3;
               this.sendUuiCommandError(var1, var4, var10003);
            } else {
               String var10001 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                  "8PhbYJSukq7dP2ZkMm7rQHb+kGhXAB8BNWmS0wXTCwAEe/0ob0CR4I8iPo4XTiu8co1R/b4j4XPGYd6OPzyPl0s7ILMG8Yx5xDPath6PHp/MiQe923j3Fw=="
               );
               Object[] var10002 = new Object[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-893329119, 24)];
               var10002[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 23)] = var3;
               Xqedii_3ul4hqj.Xqedii_3458djb(var1, var10001, var10002);
            }
         }
      }
   }

   public void handleWorldUiMoveHere(CommandSender var1, String[] var2) {
      if (((-671049432 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof Player var3) {
         String var4 = this.requireWorldUiId(
            var1,
            var2,
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y("ZdptRPkqM7E88ekV3hWDvIMSZNLO15yeMISY6C9woKi27t0COKYwxVOIIPACYdU3XRNd2EnbKuvpr00zlbN43I47ktkMLxfYEPgN2A==")
         );
         if (var4 != null) {
            if (!this.Xqedii_2k1vujp.moveWorldUiHere(var3, var4)) {
               String var6 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("XscpHbI7eBr+28XBiyTNqltq/ukxULX5dHziFwf2gA9yL4KlIKP9mI4c6MXd6bMS8F0xyMPHOYFoqkYnZKVqsl1d");
               Object[] var7 = new Object[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 15)];
               var7[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606927, 24)] = var4;
               this.sendUuiCommandError(var1, var6, var7);
            } else {
               String var10001 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                  "4ppzLOfXqvZy8kW60tLv5XELJhoZW0xJ5KM4zImzK7frV2T4kKoRIUSdgVIOxfP2InQCJiLjZC8XL3ZzPF5QTgWqlCxieu8mvp06LdB2wVIywBY/1MKjxGKg3XyUPmdx+Z8m7Fn5O2Nvshxxltep8hjNxAY="
               );
               Object[] var5 = new Object[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1965195101, 0)];
               var5[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(1133740482, 17)] = var4;
               Xqedii_3ul4hqj.Xqedii_2pfjv2g(var1, var10001, var5);
            }
         }
      } else {
         String var10002 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "G5KgB18wuFWfU/16zh87sMDjsG8aKdOJVA12MOGCKyVDagaR1E4VDLYpTak30Kf3o9tmNHfvtW5zS3ikNeMZG0jWOUTZr3vRL0IP8VIU499OIIUP1MHvRNS51D10MzAm6YQVj669gcbYtTvo7OXdcLznjogxeIip5KWCX8mfxAo="
         );
         Object[] var10003 = new Object[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-1408364004, 28)];
         var10003[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(151932423, 11)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "h41SxtorQSoCqWt1HCIabk3yZheeVqI26gskujtxj8/MFBxghtKFTaCrlyizFxvme/Q+9vY0yjRWQg=="
         );
         this.sendUuiCommandError(var1, var10002, var10003);
      }
   }

   public void handleWorldUiMove(CommandSender var1, String[] var2) {
      if ((-1087188709 ^ -1087188709) != 0) {
         throw new IllegalStateException();
      } else {
         String var3 = this.requireWorldUiId(
            var1,
            var2,
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "g2pTBubx9SAE0qfA4lNUnj2XdjAZNxenlgHZl/3u+aK1d/P/cvhVMrvdYQ0K5j91JynFPReAZfCXSOIvblSLqWoyKYsUklLIffKb28wHnblUH40hR7d5xRFlk9Q="
            )
         );
         if (var3 != null) {
            if (var2.length != Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1137820495, 17)) {
               this.sendUuiUsage(
                  var1, Xqedii_ix16dvmxyaik(var3), Xqedii_1vexecq.Xqedii_2ow587hjypp0y("1XWDdjDiCdsYpw3dEl5tCKioIlhTVZk+907NTk/yuxHiQwxNv4rcm1bK5rrwY+vm/AU=")
               );
            } else {
               Location var4 = this.Xqedii_2k1vujp.getWorldUiLocation(var3);
               World var5 = var4 == null ? null : var4.getWorld();
               if (var5 == null && var1 instanceof Player var6) {
                  var4 = var6.getLocation();
                  var5 = var6.getWorld();
               }

               if (var5 == null) {
                  String var15 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "yHolxHhne0oYiBeTdSTBJBP/7tmyeoOrOt/raNmnrPqhCWF7GiRl+NoBSI+CTAPj23H4jReornqZBPEz0uq7du/BooK5+2uxpoKGZzb9e/Ny0PRMfnxpVoCGnXvodNxlCZgx7BLTjxjPqnJiBikt2edfBthbgnVrdWtCYQ=="
                  );
                  Object[] var17 = new Object[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(125273087, 28)];
                  var17[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(566870241, 16)] = var3;
                  var17[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 3)] = Xqedii_28xquck5gx92v(var3);
                  this.sendUuiCommandError(var1, var15, var17);
               } else {
                  double var12 = Xqedii_27rdo84(var2[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-578772598, 8)], var4.getX());
                  double var8 = Xqedii_27rdo84(var2[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138611023, 10)], var4.getY());
                  double var10 = Xqedii_27rdo84(var2[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708539, 0)], var4.getZ());
                  if (!Double.isFinite(var12) || !Double.isFinite(var8) || !Double.isFinite(var10)) {
                     String var14 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "8zMwGQDCZdnkBIrwBsf//P0iCl5v8kxycSzHzq5n1itDtd0Kz1wNu6heTWQ8KWNK6L6x5lscJZRT12p9Umcv60D70RI5kmSLtcffZe70FCAkon5S8cfVM+s31rd9o33XmoaLPX5aDtSE7wdFVJ2/8A=="
                     );
                     Object[] var16 = new Object[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(607737884, 13)];
                     var16[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1218434910, 6)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "RWI0kJ5fJjb1I2Fq4QSfj1RAcFzRwAG/ulh9lIn2"
                     );
                     this.sendUuiCommandError(var1, var14, var16);
                  } else if (!this.Xqedii_2k1vujp.moveWorldUi(var3, var5, var12, var8, var10)) {
                     String var13 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "XscpHbI7eBr+28XBiyTNqltq/ukxULX5dHziFwf2gA9yL4KlIKP9mI4c6MXd6bMS8F0xyMPHOYFoqkYnZKVqsl1d"
                     );
                     Object[] var10003 = new Object[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606863, 6)];
                     var10003[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606927, 31)] = var3;
                     this.sendUuiCommandError(var1, var13, var10003);
                  } else {
                     String var10001 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "oBGCYIO8ZY6twDozwC7pzv77Vz0bANr3DFK2l6hpSdCwMY3WhU+YSRjtn42wIcFfrPjSH6mbotwMI7dXM0OnUATEkEMzEPfUKt1CRysQlmKlqJOTZOVmFPUdwxujDxsgMx4="
                     );
                     Object[] var10002 = new Object[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-1753775105, 31)];
                     var10002[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606927, 9)] = var3;
                     var10002[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138574159, 15)] = Xqedii_101gcmngr2rmr(
                        Xqedii_v420beu(var12), Xqedii_v420beu(var8), Xqedii_v420beu(var10)
                     );
                     Xqedii_3ul4hqj.Xqedii_2pfjv2g(var1, var10001, var10002);
                  }
               }
            }
         }
      }
   }

   public void handleWorldUiRotate(CommandSender var1, String[] var2) {
      if (((-1341911335 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var3 = this.requireWorldUiId(
            var1,
            var2,
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "H+gdB+FUZ3gVkA0c/jf9Nh3U+IrvaFiannnkVduH065PDrpbO7pEaelQeWd0ja2hAmcRo1slWyaHWG8fi1eRf+tk2u6YVAqiywFtstV/JWUcZWsO"
            )
         );
         if (var3 != null) {
            if (var2.length != Xqedii_1vexecq.Xqedii_1ladjox5782r3(349264816, 21)) {
               this.sendUuiUsage(var1, Xqedii_2jpyit8m8ri64(var3), Xqedii_1vexecq.Xqedii_2ow587hjypp0y("kGoNHY24UxNPfubapPuLM38MNv2Z9sGpDVeDELyjWWm/s8AuXNU="));
            } else {
               Location var4 = this.Xqedii_2k1vujp.getWorldUiLocation(var3);
               double var5 = Xqedii_27rdo84(
                  var2[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1126024015, 22)],
                  var4 == null ? Double.longBitsToDouble(Xqedii_1vexecq.Xqedii_27pvak85fi5zs(-7537139471911702155L, 32)) : var4.getYaw()
               );
               if (!Double.isFinite(var5)) {
                  String var13 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "mQlf+/SL1GyYKONT++0Y98K6HU+t8v2RsDjhGg5LNoZ8JTa8s8xnwQ8oX8GOjD+g1ZiJID3kOvviUSa4HPoyWm4q08mMZ3PYQxbiiRQhpqEF0ggiNzU6/XBdWjVoLexF8d7NpdMCg2YoJINy"
                  );
                  Object[] var15 = new Object[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-2136765731, 16)];
                  var15[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1965195102, 0)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("RWI0kJ5fJjb1I2Fq4QSfj1RAcFzRwAG/ulh9lIn2");
                  this.sendUuiCommandError(var1, var13, var15);
               } else if (!this.Xqedii_2k1vujp.rotateWorldUi(var3, var5)) {
                  String var12 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "vwuYgSef9v1W3nhavXxbdm7tm6WZw2zJQaAAvA1QhSoxmf4yFF6AFtNck/kYjoLuTvSj2x5WRt+X/ybV5ggtyxC7SNOfXQ=="
                  );
                  Object[] var14 = new Object[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-1035758207, 9)];
                  var14[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 9)] = var3;
                  this.sendUuiCommandError(var1, var12, var14);
               } else {
                  Location var7 = this.Xqedii_2k1vujp.getWorldUiLocation(var3);
                  double var8 = var7 == null ? var5 : var7.getYaw();
                  if (this.Xqedii_2k1vujp.getWorldUiLookAt(var3) == 0) {
                     String var10001 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "RuCa68mM1QkPoqxpQQUN4XeLJd6VwPXQTzj9OmSXBWAturA3HZsXh6ORJO3tZ8Fq8/nwio6yzqgPmVGw36Qq1/69BtHyb9Jjb79xvGaSiJO6cvRdMu5Olg9c"
                     );
                     Object[] var10002 = new Object[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-2111080958, 26)];
                     var10002[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-2071517437, 10)] = var3;
                     var10002[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-2071516413, 10)] = Xqedii_v420beu(var8);
                     Xqedii_3ul4hqj.Xqedii_2pfjv2g(var1, var10001, var10002);
                  } else {
                     int var10 = Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 21);
                     String var11 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "RuCa68mM1QkPoqxpQQUN4XeLJd6VwPXQTzj9OmSXBWAturA3HZsXh6ORJO3tZ8Fq8/nwio6yzqgPmVGw36Qq1/69BtHyb9Jjb79xvGaSiJO6cvRdMu5Olg9c"
                     );
                     Object[] var10003 = new Object[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708539, 2)];
                     var10003[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 19)] = var3;
                     var10003[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1272824655, 27)] = Xqedii_v420beu(var8);
                     Xqedii_3ul4hqj.Xqedii_2g7xq9b(
                        var1,
                        (var10 != 0),
                        Xqedii_3ul4hqj.Xqedii_2d5sc5r(var11, var10003),
                        List.of(
                           Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                              "FTgW8EzP860WmF+cBaia9Fakb5NE9wRE/odXQqUx7IUccMGFMV0m0y6GvQHZ1pWJn/VJgo3Fxi+GslM5TiJ2Y6v/EL8CGfb+5dt9TFXBvrhuy+R8uJ18Z/vb44GZM96zTd2g/flD3go8O04AS0fpGLEhC4VanVcR"
                           )
                        )
                     );
                  }
               }
            }
         }
      }
   }

   public void handleWorldUiLookAt(CommandSender var1, String[] var2) {
      if (((-1784769158 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var3 = this.requireWorldUiId(
            var1,
            var2,
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "xfBDuzanXCHiArIBGJ6WIvZeuZyiN/l9r23a/HxvOEksy3aM2B0Wncu4IhzUcrB3LTIrgwodEtilTV/V0W/mMk/4UtlOZhZwXad1uz+u1Xz0ozF70S/Sm31pqptByzbPwWhPc+xt84/VPHMI"
            )
         );
         if (var3 != null) {
            int var4 = this.Xqedii_2k1vujp.getWorldUiLookAt(var3);
            int var5;
            if (var2.length >= Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(944272240, 6)) {
               String[] var10001 = new String[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1134412623, 22)];
               var10001[Xqedii_1vexecq.Xqedii_1ladjox5782r3(1364963348, 29)] = var2[Xqedii_1vexecq.Xqedii_1ladjox5782r3(207023109, 27)];
               String var6 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
               if (var6.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("xTRyx493t9WJUY1CBKp36zjtnfmLW3nLVM2fJm3Rt7uZLdERzchlSw=="))) {
                  var5 = var4 == 0 ? Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(-2082618545, 30) : Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606927, 14);
               } else {
                  if (!var6.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("UcDbN+d6x0flj4CVVFa+DysFejae7Il/mIpUab0KZGw="))
                     && !var6.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("E2yIsh2z4EgJ6DvIONOPDGbyxJlrsgZmEkFr7aOX5xJkcQ=="))
                     && !var6.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("M1TCdH8Kux+uuvM9RKq+Qyq+4vMJHNO6L+WWYC9+Zv2H6jYKNoCR0tM456Q="))
                     && !var6.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("uRP76qZEZrqnIqN1f0tzmN9lQDR5hjyYfyrIzoPKfvAkmA3z"))
                     && !var6.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("Zj8NfUMqsVtSutxzrLg+49dgvSB3baz8sIqbH6iiSll7XmiPKgc="))) {
                     String var10002 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "JbyOkPYnj/5JdrWGdFfDGCzRLDXnMv89QB7SLMxeMHZcRxpDez69KaniWhk+rET3ubqA3mNC9JRtTTlcQSZBObdTRKldjnSdr6eyHbnx6EFhAEQ4gYP9yPfJT7eh/HJQ2kleE31cQAGkuvJdbukeTvsY"
                     );
                     Object[] var10003 = new Object[Xqedii_1vexecq.Xqedii_1ladjox5782r3(171486680, 20)];
                     var10003[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-670422867, 12)] = var2[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138607439, 9)];
                     this.sendUuiCommandError(var1, var10002, var10003);
                     return;
                  }

                  var5 = WorldUiPart.parseWorldUiLookAt(var6);
               }
            } else {
               var5 = var4 == 0 ? Xqedii_1vexecq.Xqedii_1ladjox5782r3(-335213482, 11) : Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(59016999, 2);
            }

            if (!this.Xqedii_2k1vujp.setWorldUiLookAt(var3, var5)) {
               String var13 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                  "8q3pNsax4BSpHBXuueQ1yHC0kLBoUw37VFWkr77OuO7xqf0kiKd7PMnLmbtcfev8ZNlVsZnju79r2oR5S5YI8/SLIiWJDg=="
               );
               Object[] var14 = new Object[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(64865103, 30)];
               var14[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 30)] = var3;
               this.sendUuiCommandError(var1, var13, var14);
            } else {
               if (var5 == Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-1863950224, 15)) {
                  String var7 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "fzpwvMsw3uZ0bA7ePqi3aOS+guGiHUMawgleBBFPJZruzB7/Vkc/dT5XcgykDGY+pg300gUbqSPxIlUoqejO4YuR9KIiVEFNJiNZ8u+pjBnCs2J75JF6e0UTODzuzSpoe0rVDjwJJuhLGxpfLFzSXA=="
                  );
                  Object[] var10 = new Object[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(566935777, 16)];
                  var10[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-2027486332, 18)] = var3;
                  Xqedii_3ul4hqj.Xqedii_2pfjv2g(var1, var7, var10);
               } else if (var5 == Xqedii_1vexecq.Xqedii_1ladjox5782r3(685946720, 22)) {
                  String var8 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "z+8Wa2qTfSjaXMaMTWIUA876kvqPwDsxEZWoc8H1UKnmKvZ28jPUr/ZQWaM4Hx7DX8V10L5+ZKnJamcNb8DT8Mvxm0Ecd6Yp6zwnyQpKEqbJ+mj75FdTWc3Rp1lxVitH/va7wyO99BwDl5bVbnHcajhqGM23xv92sQYmjjxSWfma30VY"
                  );
                  Object[] var11 = new Object[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-517879104, 8)];
                  var11[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 26)] = var3;
                  Xqedii_3ul4hqj.Xqedii_2pfjv2g(var1, var8, var11);
               } else {
                  String var9 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "hBvjD3wLKmp0ey7qb57N8T2epYcpj2evFQK1vFJ0ziKXLqZAWKDEB74a2MRD16ttxvxFC2jzgByFXQOARyHP6Kyq5auDUABLqtwLJYCqwVE0KwssCTvuaE3QU71tE4aOhTmBO7iTgfVUfPLn1yZpjWwb"
                  );
                  Object[] var12 = new Object[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1137558351, 20)];
                  var12[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 11)] = var3;
                  Xqedii_3ul4hqj.Xqedii_3458djb(var1, var9, var12);
               }
            }
         }
      }
   }

   public void handleWorldUiInteractive(CommandSender var1, String[] var2) {
      if (((1821108758 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var3 = this.requireWorldUiId(
            var1,
            var2,
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "D7g3gZIFU4NG7JxCj68qhZPDdGpd5dCbOD6Uu/1sx62ivBNANqTcv3qM3lbqjEv5LnVLQTDp0dZlEB/EqiZ4g7CCUN5HvteGYbJmYtiIqEgkOZCGu6bQ+D2IuG88i560s4LmFg=="
            )
         );
         if (var3 != null) {
            int var4 = var2.length >= Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138608975, 9)
               ? Xqedii_35wdwsa(var2[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606895, 5)])
               : Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708512, 5);
            if (var4 == Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(-1138082640, 19)) {
               String var9 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                  "VhbdpDfL/RDnAuog/HXkg3v5kEPEgMirwGKBwZRlkIY289lvFlVLgJDb3swwJ7jep7jvWV7BwX2M+uNYwlRZrn7fVvQTKChTQG/zACKcw4/r81pM0CtpHDQLkBfmMw=="
               );
               Object[] var11 = new Object[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(1443301646, 27)];
               var11[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 24)] = var2[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1584734848, 24)];
               this.sendUuiCommandError(var1, var9, var11);
            } else {
               Boolean var5 = this.Xqedii_2k1vujp
                  .setWorldUiInteractive(
                     var3,
                     var4 == Xqedii_1vexecq.Xqedii_1ladjox5782r3(-341240838, 27)
                        ? null
                        : Boolean.valueOf(
                           ((var4 == Xqedii_1vexecq.Xqedii_1ladjox5782r3(1901834260, 29)
                              ? Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1378350536, 4)
                              : Xqedii_1vexecq.Xqedii_1ladjox5782r3(-670422867, 12)) != 0)
                        )
                  );
               if (var5 == null) {
                  String var8 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "8q3pNsax4BSpHBXuueQ1yHC0kLBoUw37VFWkr77OuO7xqf0kiKd7PMnLmbtcfev8ZNlVsZnju79r2oR5S5YI8/SLIiWJDg=="
                  );
                  Object[] var10 = new Object[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 31)];
                  var10[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-2136831267, 16)] = var3;
                  this.sendUuiCommandError(var1, var8, var10);
               } else {
                  if (var5) {
                     int var10001 = Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(607737884, 13);
                     String var10002 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "Yj8z01d0nb3gZbUp1wfhNllKj0WDX19Mhb5BCyJJ6BEoycCaYeYniBWXnw1cNjPWk1TTZqc3YEWipClujJVBi1rKCPQBwv63TrS+Mk31IeSZ9uqnKIaSX0b19VE="
                     );
                     Object[] var10003 = new Object[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 10)];
                     var10003[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1068415634, 15)] = var3;
                     Xqedii_3ul4hqj.Xqedii_2g7xq9b(
                        var1,
                        (var10001 != 0),
                        Xqedii_3ul4hqj.Xqedii_2d5sc5r(var10002, var10003),
                        List.of(
                           Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                              "8qfpKWcrLPhdBaeo0ZbRtxDdY0ZP2p8UOKKoKWfZ2O4L7iyz5l6B1Xot29JwwHc1KFA2i8RKLOfChUVg2C4lrV0kWfuR68w5gdRocnnOiFK6yXjQTqtmBPAWzV0QOX6dreEDm3dq8h9RW9q+iky0HOyHILHRnlJFWxYGMrNVYlrgAgwwxqto2d8LIGyoQjAZqvo="
                           )
                        )
                     );
                  } else {
                     String var6 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "qOkH0Chlxnb6EvEama3IMY2xj6k285btaRDJHoOVbIjMULONj7reCgfy6YIuFj1hQgNArsJnLWwvYlNmE9FKi3w1UymNEeKc0jDkE1iHOK9W4jf31sEJEULt4Jora0OGPEjwfJpFV2U="
                     );
                     Object[] var7 = new Object[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1675477839, 29)];
                     var7[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-2027486332, 18)] = var3;
                     Xqedii_3ul4hqj.Xqedii_3458djb(var1, var6, var7);
                  }
               }
            }
         }
      }
   }

   public void handleWorldUiPerPlayer(CommandSender var1, String[] var2) {
      if ((-712870931 * -712870931 + -712870931 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var3 = this.requireWorldUiId(
            var1,
            var2,
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "KVLWHRsnj37FMrXUf4u9J+o5eDapeHmLw6L3US56wuJGZ9kPlw0S+PiYRxbUIb3RGl9jd2FcoA6HRfxMoupnd7PBmgyJ3/96nNWtqIxpGsTfLS5JbxdrcO5okMYcoYwm"
            )
         );
         if (var3 != null) {
            int var4 = var2.length >= Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1500848768, 24)
               ? Xqedii_35wdwsa(var2[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-2136896803, 16)])
               : Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-1864081296, 15);
            if (var4 == Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(303856654, 12)) {
               String var9 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                  "VhbdpDfL/RDnAuog/HXkg3v5kEPEgMirwGKBwZRlkIY289lvFlVLgJDb3swwJ7jep7jvWV7BwX2M+uNYwlRZrn7fVvQTKChTQG/zACKcw4/r81pM0CtpHDQLkBfmMw=="
               );
               Object[] var12 = new Object[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606959, 5)];
               var12[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-1035758719, 9)] = var2[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708539, 1)];
               this.sendUuiCommandError(var1, var9, var12);
            } else {
               Boolean var5 = this.Xqedii_2k1vujp
                  .setWorldUiPerPlayer(
                     var3,
                     var4 == Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-926883551, 24)
                        ? null
                        : Boolean.valueOf(
                           ((var4 == Xqedii_1vexecq.Xqedii_1ladjox5782r3(-335209386, 11)
                              ? Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138607951, 10)
                              : Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(941368377, 29)) != 0)
                        )
                  );
               if (var5 == null) {
                  String var8 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "8q3pNsax4BSpHBXuueQ1yHC0kLBoUw37VFWkr77OuO7xqf0kiKd7PMnLmbtcfev8ZNlVsZnju79r2oR5S5YI8/SLIiWJDg=="
                  );
                  Object[] var11 = new Object[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-1408364004, 28)];
                  var11[Xqedii_1vexecq.Xqedii_1ladjox5782r3(729154186, 2)] = var3;
                  this.sendUuiCommandError(var1, var8, var11);
               } else {
                  if (var5) {
                     int var10001 = Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(64865103, 30);
                     String var10002 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "lxX0Xjktx9xw/Wxz6/73qVlgeZd94I0q2gTzrpmZAua/df5u8YB7vi4pEMv9kUX3YROADQi0qgouvU7ZXPIHXIlWpt3WIRfmJ2V8LaTdjouS4JlPPdVwtFTB"
                     );
                     Object[] var10003 = new Object[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 23)];
                     var10003[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(236067996, 4)] = var3;
                     Xqedii_3ul4hqj.Xqedii_2g7xq9b(
                        var1,
                        (var10001 != 0),
                        Xqedii_3ul4hqj.Xqedii_2d5sc5r(var10002, var10003),
                        List.of(
                           Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                              "+vTKTGgWgapfszVzzstkCtDhEXe2feUjEPQIw3pa8jc1qC8sKFz0VumPQn5bQZunHZHnq3g200Xyj2KJy33BqeAyLTvIzxb2ERQYKurhblzOrFUVLtjb12M04XMhveDZLw9vRVSVXMEpMN4Xm/zD42TQe0sU2M8UJS2BsA=="
                           )
                        )
                     );
                  } else {
                     int var6 = Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(-1008876721, 31);
                     String var7 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "JX8tjEFdouD+/p7iNpzKHlwf3huC5UZpvVTseo+kYj2yJHQZkYSQZ7hUV38AwiBbBigc6DcpAjDD+nPzbPfQEoXa+li3eKPktMnLSpuxmkqtCA=="
                     );
                     Object[] var10 = new Object[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1140704079, 21)];
                     var10[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606927, 0)] = var3;
                     Xqedii_3ul4hqj.Xqedii_2g7xq9b(
                        var1,
                        (var6 != 0),
                        Xqedii_3ul4hqj.Xqedii_2d5sc5r(var7, var10),
                        List.of(
                           Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                              "nH993nouZ5oFCpNr8qkISXRHUPCHF6QR+EBXspDS3k78i4a8x9YnNyBXkjeQZqdW5r0nKEcdkI3L9WIqbvX8+/NndA2crpfMzC0h8THD4+FexmK9NzRQmENU55eieiDEwYBa+hUmvtUoWK9AIaYHojj8tG7nEar0H+iM//sL"
                           )
                        )
                     );
                  }
               }
            }
         }
      }
   }

   public static int Xqedii_35wdwsa(String var0) {
      if (((-1007946798 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var1 = var0 == null ? Xqedii_1vexecq.Xqedii_2ow587hjypp0y("VuOhWO28zJPTPkxaxP5XaPgmG/APncdetnflnA==") : var0.trim().toLowerCase(Locale.ROOT);
         int var3 = Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-1864081296, 15);
         switch (var1.hashCode()) {
            case -1609594047:
               if (var1.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("19o3vm6Q3YKZ1DFX351utbr4aVBz6LAQ9lvzJ9FWDomS1AOjABfM0zhT"))) {
                  var3 = Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1675477839, 27);
               }
               break;
            case -1298848381:
               if (var1.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("vXU9PvEMJEruz4ECQku+536ztUtWA/+4Ne/lOpypb5f1woZjXuRTMA=="))) {
                  var3 = Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606159, 8);
               }
               break;
            case -889473228:
               if (var1.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("DM6a2xNuzcqN8AJp/nHXfzUPPE/1SnAmSU1nqxPGI8UUZqM704LpMQ=="))) {
                  var3 = Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(372737023, 21);
               }
               break;
            case -868304044:
               if (var1.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("xTRyx493t9WJUY1CBKp36zjtnfmLW3nLVM2fJm3Rt7uZLdERzchlSw=="))) {
                  var3 = Xqedii_1vexecq.Xqedii_1ladjox5782r3(22091195, 17);
               }
               break;
            case 3521:
               if (var1.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("g92tMfeN91uzgpqE1+14e9Wx7pzi/1yjovyVoos3onE="))) {
                  var3 = Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1517625984, 24);
               }
               break;
            case 3551:
               if (var1.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("UcDbN+d6x0flj4CVVFa+DysFejae7Il/mIpUab0KZGw="))) {
                  var3 = Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1567957632, 24);
               }
               break;
            case 109935:
               if (var1.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("E2yIsh2z4EgJ6DvIONOPDGbyxJlrsgZmEkFr7aOX5xJkcQ=="))) {
                  var3 = Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-1652440509, 25);
               }
               break;
            case 119527:
               if (var1.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("o5QUwTLr/8WP0LQSqwUOX7auZztWPfASemvIZHSvFfDRVQ=="))) {
                  var3 = Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1105052495, 24);
               }
               break;
            case 3569038:
               if (var1.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("uRP76qZEZrqnIqN1f0tzmN9lQDR5hjyYfyrIzoPKfvAkmA3z"))) {
                  var3 = Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606943, 4);
               }
               break;
            case 97196323:
               if (var1.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("Zj8NfUMqsVtSutxzrLg+49dgvSB3baz8sIqbH6iiSll7XmiPKgc="))) {
                  var3 = Xqedii_1vexecq.Xqedii_1ladjox5782r3(690141024, 22);
               }
               break;
            case 270940796:
               if (var1.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("lMR/XWE9Btq+9KaeCqvjjIjXZ2FpJA23C1mmnW9RB2GggUpYx1UyAI07Tlo="))) {
                  var3 = Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(489426450, 20);
               }
               break;
            case 1671308008:
               if (var1.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("kD0cFq2smvG5fNkEjj6xMmyDRsrknzJ07rrqvuXAHAt5o8IcaTXUDNHt"))) {
                  var3 = Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138607055, 4);
               }
         }
         return switch (var3) {
            case 0, 1, 2, 3, 4 -> Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138082639, 19);
            case 5, 6, 7, 8, 9 -> Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606927, 3);
            case 10, 11 -> Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-376931328, 24);
            default -> Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-517879872, 8);
         };
      }
   }

   public void handleWorldUiSize(CommandSender var1, String[] var2) {
      if (((-1727780560 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var3 = this.requireWorldUiId(
            var1,
            var2,
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "DOqWEqC7QobcMeA7Yya/KciG7ojB5dmPSgTbqdL2J/5JxSGK3CdFBzAHdaxlRfC6rX6UFhjagO6XYzlOVDy48k15gNa/bq7juMVoRPslPW6vEOjBQmE="
            )
         );
         if (var3 != null) {
            if (var2.length != Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1130218319, 21)) {
               this.sendUuiUsage(
                  var1, Xqedii_1bbmhgl38amgn(var3), Xqedii_1vexecq.Xqedii_2ow587hjypp0y("nGWfJdHwKA6bBrlcNTlyUBILYay5WzhqzqlCPEO/qa9AsyeN0nGdClkkI2Q=")
               );
            } else {
               double var4 = Xqedii_27rdo84(var2[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1541260111, 27)], this.Xqedii_2k1vujp.getWorldUiWidth(var3));
               if (!Double.isFinite(var4)
                  || var4 < Double.longBitsToDouble(Xqedii_1vexecq.Xqedii_1ilnvus8pee1f(6090312923198053791L, 43))
                  || var4 > Double.longBitsToDouble(Xqedii_1vexecq.Xqedii_1ilnvus8pee1f(1795232730841878867L, 1))) {
                  String var7 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "13Sefzl2itZg9EAdX27v10mgfHyiOpTyXlBRZ7nTAKwzQCgpCT+q8UssY05Lt4TO9uWN0evOAWT/obPBCqi072kxC1E/pMTZargyvs5Mva4Fes5VtWlnxYUUbfJCxr7FrDBqzKgIkZCr+WFBspfWXVHhpKxd0A=="
                  );
                  Object[] var8 = new Object[Xqedii_1vexecq.Xqedii_1ladjox5782r3(291221524, 29)];
                  var8[Xqedii_1vexecq.Xqedii_1ladjox5782r3(1458308372, 3)] = Xqedii_v420beu(
                     Double.longBitsToDouble(Xqedii_1vexecq.Xqedii_1h446ynobcybk(6647976395665283277L, 38))
                  );
                  var8[Xqedii_1vexecq.Xqedii_1ladjox5782r3(171486680, 20)] = Xqedii_v420beu(
                     Double.longBitsToDouble(Xqedii_1vexecq.Xqedii_27pvak85fi5zs(7726298062885706102L, 44))
                  );
                  this.sendUuiCommandError(var1, var7, var8);
               } else if (!this.Xqedii_2k1vujp.setWorldUiWidth(var3, var4)) {
                  String var6 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "ZM9+pqbr+AFnxonvhTCpKGo1G/ipNcs7qBDol7TU0qu1w6YlKEWRIS2tW6Pc+4/WeeESDM98jYqyzcdvgfi4ErcNT4O51A=="
                  );
                  Object[] var10003 = new Object[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(118034006, 3)];
                  var10003[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 16)] = var3;
                  this.sendUuiCommandError(var1, var6, var10003);
               } else {
                  String var10001 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "7wKNXX6WokVwATMhrFK9GJrU7yDtJd2/lx+91WAii4TGt1dkkXse1XvXMAjsnGQYF4xiQ+45epsOZMG1aJBKJo4Wlpfa+qPao8oD5TC+zi1z8Txo44maYMkH5wpR1MaCHc84UQ=="
                  );
                  Object[] var10002 = new Object[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138608975, 10)];
                  var10002[Xqedii_1vexecq.Xqedii_1ladjox5782r3(1364963348, 29)] = var3;
                  var10002[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 30)] = Xqedii_v420beu(var4);
                  Xqedii_3ul4hqj.Xqedii_2pfjv2g(var1, var10001, var10002);
               }
            }
         }
      }
   }

   public void handleWorldUiMode(CommandSender var1, String[] var2) {
      if (((2015384125 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var3 = this.requireWorldUiId(
            var1,
            var2,
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "mnC686de89jBnzZeCQ8swn+VfKy9uBDqUZCoQEOR+EQCgW68LsMyxEC8SjTNZt6nO/bVO6V2DKtsFssN6fAsvV9mlmTTfYKoajaUUdNo637zoqskre3HgXK0z2GnJYFAafjxRw=="
            )
         );
         if (var3 != null) {
            String var10000;
            if (var2.length >= Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1675477839, 27)) {
               String[] var10001 = new String[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 11)];
               var10001[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 20)] = var2[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(392659967, 19)];
               var10000 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
            } else {
               var10000 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("VuOhWO28zJPTPkxaxP5XaPgmG/APncdetnflnA==");
            }

            String var4 = var10000;
            if (!var4.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("miner10CXzJe27OaaiLbLDXmoY6WWW05YvXjiUtp6hWbXF+JibhIxw=="))
               && !var4.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("Z/dewEQZBKWjKIupa+o2hwMzYMsragaZuh3hxhEx+mJN977eVgq8nQ=="))) {
               this.sendUuiUsage(
                  var1,
                  Xqedii_xajp865masqy(var3),
                  Xqedii_1vexecq.Xqedii_2ow587hjypp0y("K/8DqzBL3PD12FKuRGzJew2sjbkrNlMSaWGhUQasijuvUq2fCzAkw/euuKzMxHl7nQZc0nak1peXmw==")
               );
            } else {
               boolean var5 = var4.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("Z/dewEQZBKWjKIupa+o2hwMzYMsragaZuh3hxhEx+mJN977eVgq8nQ=="));
               if (!var5 && !this.Xqedii_2k1vujp.hasWorldUiLocation(var3)) {
                  String var8 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "yHolxHhne0oYiBeTdSTBJBP/7tmyeoOrOt/raNmnrPqhCWF7GiRl+NoBSI+CTAPj23H4jReornqZBPEz0uq7du/BooK5+2uxpoKGZzb9e/Ny0PRMfnxpVoCGnXvodNxlCZgx7BLTjxjPqnJiBikt2edfBthbgnVrdWtCYQ=="
                  );
                  Object[] var9 = new Object[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-670431059, 12)];
                  var9[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(959978532, 21)] = var3;
                  var9[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 30)] = Xqedii_r0zd7zk3xa25(var3);
                  this.sendUuiCommandError(var1, var8, var9);
               } else if (!this.Xqedii_2k1vujp.setWorldUiMode(var3, var5)) {
                  String var7 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "8q3pNsax4BSpHBXuueQ1yHC0kLBoUw37VFWkr77OuO7xqf0kiKd7PMnLmbtcfev8ZNlVsZnju79r2oR5S5YI8/SLIiWJDg=="
                  );
                  Object[] var10003 = new Object[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 0)];
                  var10003[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606927, 14)] = var3;
                  this.sendUuiCommandError(var1, var7, var10003);
               } else {
                  String var6 = var5
                     ? Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "xMd2It6pX8vUBSLjug4H1erkd2MRgyWF0JyjQWOFDHRG1aCSL0W8UEn0vagcJYxnfKDRGYEWQLvLi3jccPvrzncwt82jXldfDtr6ev9jpbI9zQCX3gbFNpe+FtsgQJu0BlBcMQqIYmWiHEXXEQjMGEbbQADErYWZmIAMFosJ"
                     )
                     : Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "P0RW8WeQeAZCjWwITJLwPTIwJLTfFq2orZetOIBhpbJnTKZY93tEjdY9mcZlwws5UTETL3/5pt+RA0dIt9zKD2LNtkg1tWcUQQ/joOcJqCoOTTyR9PyjdHqAMgfpDSR4sSunzqwM"
                     );
                  Object[] var10002 = new Object[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1340837541, 13)];
                  var10002[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-335211434, 11)] = var3;
                  Xqedii_3ul4hqj.Xqedii_2pfjv2g(var1, var6, var10002);
               }
            }
         }
      }
   }

   public void handleWorldUiToggle(CommandSender var1, String[] var2, String var3) {
      if ((-1133456998 * (-1133456998 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var4 = this.requireWorldUiId(
            var1, var2, Xqedii_1vexecq.Xqedii_2ow587hjypp0y("sJetEABpkAGM216xCL9iuzWU8wqJmIg45Yv47IKRLcFQnv+nZWT3qoVPW04cG9WvhvJohkVi9QsJ8J72amqVKHswC/foICI7")
         );
         if (var4 != null) {
            Boolean var5 = var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("If85ZZvyIoeHhGEK9Dc+XLuUuH6Y7lKo3NPxKd6aWJLYhHrc"))
               ? Boolean.FALSE
               : (var3.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("IbOBHzfQbpiO3UffoNC55SodY+QnG6LXdQk7gmKk9aNAG27l")) ? Boolean.TRUE : null);
            boolean var6 = var5 == null ? !this.Xqedii_2k1vujp.isWorldUiEnabled(var4) : var5.booleanValue();
            if (var6 && this.Xqedii_2k1vujp.isWorldUiStatic(var4) && !this.Xqedii_2k1vujp.hasWorldUiLocation(var4)) {
               String var11 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                  "yHolxHhne0oYiBeTdSTBJBP/7tmyeoOrOt/raNmnrPqhCWF7GiRl+NoBSI+CTAPj23H4jReornqZBPEz0uq7du/BooK5+2uxpoKGZzb9e/Ny0PRMfnxpVoCGnXvodNxlCZgx7BLTjxjPqnJiBikt2edfBthbgnVrdWtCYQ=="
               );
               Object[] var12 = new Object[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1137558351, 19)];
               var12[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606927, 12)] = var4;
               var12[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-1058987574, 0)] = Xqedii_16wh7oanplfsi(var4);
               this.sendUuiCommandError(var1, var11, var12);
            } else {
               Boolean var7 = this.Xqedii_2k1vujp.setWorldUiEnabled(var4, var5);
               if (var7 == null) {
                  String var10 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "8q3pNsax4BSpHBXuueQ1yHC0kLBoUw37VFWkr77OuO7xqf0kiKd7PMnLmbtcfev8ZNlVsZnju79r2oR5S5YI8/SLIiWJDg=="
                  );
                  Object[] var10003 = new Object[Xqedii_1vexecq.Xqedii_1ladjox5782r3(1371893440, 23)];
                  var10003[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-670422867, 12)] = var4;
                  this.sendUuiCommandError(var1, var10, var10003);
               } else {
                  if (var7) {
                     String var10001 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "gQHgFlk0j2VErKMvraK9LAOBroDZadYUVoBCZBEyq4v2tmlJJBBZNrIpCCcAp6qoIzv3g4kJNpKbs0YD99JrBKKl4YuUkpC2lwZAvzYcL7c="
                     );
                     Object[] var10002 = new Object[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(1924151368, 22)];
                     var10002[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606927, 2)] = var4;
                     Xqedii_3ul4hqj.Xqedii_2pfjv2g(var1, var10001, var10002);
                  } else {
                     String var8 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                        "fSX1BBCS78TE4TgMSzjqt1CW38s8m2c/v0pCBwgmq8489yY6bDqAprrhKwBz9fAVnuOvt1zxsyKcgH1DhW9ut5d7MhYBz0QUUQ4n3UtwYHwrsw=="
                     );
                     Object[] var9 = new Object[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 2)];
                     var9[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 31)] = var4;
                     Xqedii_3ul4hqj.Xqedii_3458djb(var1, var8, var9);
                  }
               }
            }
         }
      }
   }

   public void handleWorldUiTeleport(CommandSender var1, String[] var2) {
      if (((-1249380717 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof Player var3) {
         String var4 = this.requireWorldUiId(
            var1, var2, Xqedii_1vexecq.Xqedii_2ow587hjypp0y("oJvlBtIIY57wFIvWvdX+UdJr9vYApVIeJSwkiNQdz4hm/NEWGwKngFqbalWVOma1/+1kmdTMA1l7/xOASUP6zw==")
         );
         if (var4 != null) {
            if (!this.Xqedii_2k1vujp.hasWorldUiLocation(var4)) {
               String var5 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                  "nxJFKQ+8ebUm2BRgTTEv+uTcXo9ASiv0K8mGQFEW8RNMs7mXoLkPfE9ebrr6QVB+/gAk2w4OEumm3u1yPjqSxW+KA77oQhc7SCM7AewMtiB6g+dxELrIZ9C+G0ZeSDqGgVMgIvHovGsQjcHjdSEM5vwmNJ0="
               );
               Object[] var6 = new Object[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-1058987574, 0)];
               var6[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606927, 16)] = var4;
               this.sendUuiCommandError(var1, var5, var6);
            } else {
               if (!this.Xqedii_2k1vujp.teleportToWorldUi(var3, var4)) {
                  String var10002 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "e2X3hh3eYBMFxxXx5+dHfrEnAYjc0adYHa7ddpCA8bTVcN/StRfskIw5wefEl6LT23Wg//rvb3xFPEfPKJ9WpCjkxl6BqVcF5LN6FQIGesw="
                  );
                  Object[] var10003 = new Object[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1140704079, 21)];
                  var10003[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 17)] = var4;
                  this.sendUuiCommandError(var1, var10002, var10003);
               }
            }
         }
      } else {
         this.sendUuiCommandError(
            var1,
            Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
               "MDu6+MnLH3LRlNEKuCi2dD7cvS9AE5ze4sXJhlDxdmniFWe6/rVgF1C4sRwvMjrnarwQikUkPUv0ijjK87TlXiYtNcttIeXtx9mbdgvZbNoqRV9qbi+hZGQ7dBfjlw=="
            ),
            new Object[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 10)]
         );
      }
   }

   public String requireWorldUiId(CommandSender var1, String[] var2, String var3) {
      if ((-879670913 * -879670913 - -879670913 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (var2.length >= Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-429887344, 23)) {
            String[] var10001 = new String[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-2071516413, 10)];
            var10001[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1378350552, 4)] = var2[Xqedii_1vexecq.Xqedii_1ladjox5782r3(145610762, 28)];
            if (!this.firstNonBlank(var10001).isBlank()) {
               String var5 = var2[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-876551903, 24)].trim().toLowerCase(Locale.ROOT);
               if (!this.Xqedii_2k1vujp.hasWorldUi(var5)) {
                  String var10002 = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
                     "qzvW2AAJr41OLJPT8lLDfbaVhh40b6/J8NACZlUqsZfFKD250TJO84iY5tcLnXmJ5TbxZP62WgGCPhrClRRIqSJTOXN1AyPuQ4xceN4yD4zdus8f"
                  );
                  Object[] var10003 = new Object[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138541391, 16)];
                  var10003[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(1919957064, 22)] = var2[Xqedii_1vexecq.Xqedii_1ladjox5782r3(1979875883, 10)];
                  this.sendUuiCommandError(var1, var10002, var10003);
                  return null;
               }

               return var5;
            }
         }

         int var4 = var3.indexOf(Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(944277808, 6));
         this.sendUuiUsage(
            var1,
            var4 > 0 ? var3.substring(Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-2071517437, 10), var4).trim() : var3,
            var4 > 0 ? var3.substring(var4) : Xqedii_1vexecq.Xqedii_2ow587hjypp0y("VuOhWO28zJPTPkxaxP5XaPgmG/APncdetnflnA==")
         );
         return null;
      }
   }

   public static double Xqedii_27rdo84(String var0, double var1) {
      if (((1457915093 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var3 = var0 == null ? Xqedii_1vexecq.Xqedii_2ow587hjypp0y("VuOhWO28zJPTPkxaxP5XaPgmG/APncdetnflnA==") : var0.trim();
         boolean var4 = var3.startsWith(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("RWI0kJ5fJjb1I2Fq4QSfj1RAcFzRwAG/ulh9lIn2"));
         String var5 = var4 ? var3.substring(Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138541391, 16)) : var3;
         if (var4 && var5.isEmpty()) {
            return var1;
         } else {
            try {
               double var6 = Double.parseDouble(
                  var5.replace((char)Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-1206115266, 29), (char)Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(2112895048, 22))
               );
               if (!Double.isFinite(var6)) {
                  return Double.longBitsToDouble(Xqedii_1vexecq.Xqedii_3uav6xocqpksa(-5143495027759308514L, 15));
               } else {
                  return var4 ? var1 + var6 : var6;
               }
            } catch (NumberFormatException var8) {
               return Double.longBitsToDouble(Xqedii_1vexecq.Xqedii_1ilnvus8pee1f(-7473175302294476461L, 24));
            }
         }
      }
   }

   public static String Xqedii_v420beu(double var0) {
      if ((-1888961218 * -1888961218 - -1888961218 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var2 = Math.round(var0 * Double.longBitsToDouble(Xqedii_1vexecq.Xqedii_3uav6xocqpksa(-5143495027761837862L, 22)))
            / Double.longBitsToDouble(Xqedii_1vexecq.Xqedii_3uav6xocqpksa(-5143495027907817190L, 28));
         return var2 == Math.rint(var2) ? String.valueOf((long)var2) : String.valueOf(var2);
      }
   }

   public List<String> completeUuiWorldCommand(String[] var1) {
      if ((-2022074623 * (-2022074623 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1.length <= Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1140704079, 20)) {
         return this.filterByPrefix(
            Xqedii_1rrce4w,
            var1.length == Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708479, 6)
               ? var1[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(303868942, 12)]
               : Xqedii_1vexecq.Xqedii_2ow587hjypp0y("VuOhWO28zJPTPkxaxP5XaPgmG/APncdetnflnA==")
         );
      } else if (this.Xqedii_2k1vujp == null) {
         return List.of();
      } else {
         String[] var10001 = new String[Xqedii_1vexecq.Xqedii_1ladjox5782r3(729154190, 2)];
         var10001[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1965195102, 0)] = var1[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(236068012, 4)];
         String var2 = this.firstNonBlank(var10001).trim().toLowerCase(Locale.ROOT);
         if (var1.length == Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393724927, 13)) {
            if (!var2.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("jgUHgsHdbtBjy54bGTcFmitzDHIt1TkV/K0PkuDjJNUoP2/CLh0="))
               && !var2.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("rbV+dpWWiHH1HewHtfA8FF4QOm2vgVSH35uneLEjHYzZ1FuX50Fgkg=="))
               && !var2.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("8+WIwbG87Gm8ZxBm+ZOQ/NStK8dzfYGZiNXNULQ5dGVEvQ=="))) {
               return Xqedii_3uuzz0v.contains(var2)
                  ? this.filterByPrefix(this.Xqedii_2k1vujp.getWorldUiNames(), var1[Xqedii_1vexecq.Xqedii_1ladjox5782r3(1538266129, 5)])
                  : List.of();
            } else {
               ArrayList var7 = new ArrayList();

               for (String var8 : this.Xqedii_2k1vujp.getGuiNames()) {
                  var10001 = new String[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138574159, 15)];
                  var10001[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(1888543968, 7)] = var8;
                  String var6 = this.firstNonBlank(var10001).toLowerCase(Locale.ROOT);
                  if (!var6.isBlank()
                     && !var6.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("gkyEiZHlJOFbCLDgvB+tamn99BkRcWVUfIdHlwet2o4QnZsDc8YQ+w=="))
                     && !var6.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("wYuL9yr/4MigVY2stA4kkRY6ehwvZpT6lZCR9GlOtR2JPpgmEM9/tSN+FVqViRer4/M="))) {
                     var7.add(var8);
                  }
               }

               return this.filterByPrefix(var7, var1[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-1863982992, 15)]);
            }
         } else {
            String var3 = var1[var1.length - Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-2117975147, 1)];
            int var5 = Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393712640, 12);
            switch (var2.hashCode()) {
               case -1289860719:
                  if (var2.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("LVyscukbxAhHoNTFLDFJwJ/tISwkLFkjU9LHdOmigKJW6gNJ587PzhNChFWGM4kh"))) {
                     var5 = Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(64865103, 28);
                  }
                  break;
               case -1097095406:
                  if (var2.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("yB/jXmP3tMIqe/R62ZjxYSKcBhXapWIeoy2W0pc/lOtSeR5uD1GzTw=="))) {
                     var5 = Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(941368377, 29);
                  }
                  break;
               case -925180581:
                  if (var2.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("v+jVkhYMvuBT80kwomyHtdi6mkSJUBVabTbvqDOW2aSnKMbSxBaKBA=="))) {
                     var5 = Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393707775, 7);
                  }
                  break;
               case 3357091:
                  if (var2.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("0YKg9/TUuHqv6QtVK19Wr6PhJ1JfYI06CS0Wzj5HjUyvSgPu"))) {
                     var5 = Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1378350472, 4);
                  }
                  break;
               case 3357649:
                  if (var2.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("ryfzMPBvKtjji1s+XQi+jS/eQjV4wZ3N72YCxTFxmQiFmSmU"))) {
                     var5 = Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1068350098, 15);
                  }
                  break;
               case 3530753:
                  if (var2.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("zjqvxqsslxA+9FHX8Yo5z6yYqjtTjTZClJOiebgXoUBC55AW"))) {
                     var5 = Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(303897614, 12);
                  }
                  break;
               case 113126854:
                  if (var2.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("GmJ6BpoztFFxKv0/eRRxeZ3NfTaRH2OpzcFnvhnow+LSBnge5IM="))) {
                     var5 = Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(376931327, 21);
                  }
                  break;
               case 349730337:
                  if (var2.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("m1AbJQyr0xVFX7ZBI9u0po1a1urCg7iR2RxTqEdhJziW/V16ogXHFSNy"))) {
                     var5 = Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 1);
                  }
                  break;
               case 764166718:
                  if (var2.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("Ycf1g+wZkkKQ+bn7kABheJ0ZaTQD5QjEulxM3S0vi1kX363eFoBkvqcheqWvAw=="))) {
                     var5 = Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(394232831, 18);
                  }
                  break;
               case 1844104930:
                  if (var2.equals(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("gwX12goz0ZEO8ZRPM+EL1cgNYNUzu6CqVvvhm3HTmolvS0CPqvDLbhJjm2gQaYKxe18="))) {
                     var5 = Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(2015110201, 29);
                  }
            }
            return switch (var5) {
               case 0, 1 -> var1.length == Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606863, 4)
                  ? this.filterByPrefix(
                     List.of(
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("UcDbN+d6x0flj4CVVFa+DysFejae7Il/mIpUab0KZGw="),
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("E2yIsh2z4EgJ6DvIONOPDGbyxJlrsgZmEkFr7aOX5xJkcQ=="),
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("M1TCdH8Kux+uuvM9RKq+Qyq+4vMJHNO6L+WWYC9+Zv2H6jYKNoCR0tM456Q=")
                     ),
                     var3
                  )
                  : List.of();
               case 2, 3, 4 -> var1.length == Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(118034030, 3)
                  ? this.filterByPrefix(
                     List.of(
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("UcDbN+d6x0flj4CVVFa+DysFejae7Il/mIpUab0KZGw="),
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("E2yIsh2z4EgJ6DvIONOPDGbyxJlrsgZmEkFr7aOX5xJkcQ==")
                     ),
                     var3
                  )
                  : List.of();
               case 5 -> var1.length == Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606943, 2)
                  ? this.filterByPrefix(
                     List.of(
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("miner10CXzJe27OaaiLbLDXmoY6WWW05YvXjiUtp6hWbXF+JibhIxw=="),
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("Z/dewEQZBKWjKIupa+o2hwMzYMsragaZuh3hxhEx+mJN977eVgq8nQ==")
                     ),
                     var3
                  )
                  : List.of();
               case 6 -> var1.length <= Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708223, 6)
                  ? this.filterByPrefix(List.of(Xqedii_1vexecq.Xqedii_2ow587hjypp0y("RWI0kJ5fJjb1I2Fq4QSfj1RAcFzRwAG/ulh9lIn2")), var3)
                  : List.of();
               case 7 -> var1.length == Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(567132385, 16)
                  ? this.filterByPrefix(
                     List.of(
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("RWI0kJ5fJjb1I2Fq4QSfj1RAcFzRwAG/ulh9lIn2"),
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("kr5jRagZmq7Sx13shHqNBjlzsZGl2wH++qlRR46e"),
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("YQmGZbuupzxRKidNKpwKBCyyhcRGVmgTdN0tEGX8r3w="),
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("3wJajJzL+u1/0DNO29NUsYp0++5Oyy86ij6BrV4mJ5824Q=="),
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("Tk8zCSJf1lD2jM8qVj6ILf0pmsSmFg+AhUL7GZ9PNyAc4Q=="),
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("jbEAwA9oJiF+DD9dKhKsq9iOK2OOk2+FoGQNBeUIUXJleQ=="),
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("0Ie+ZMzkPKV3wuJlerlt3hQqHOF+mE/XTEuGSjBAWYn40Lec")
                     ),
                     var3
                  )
                  : List.of();
               case 8, 9 -> var1.length == Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(1888544480, 7)
                  ? this.filterByPrefix(
                     List.of(
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("o2Tb9B1v4S0ORImvr93UYn38bhJk6gXEfCxpMeWX"),
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("p4IVA9oIFjxsafRMO6O5mCFoHcjzKCjqir1mcwrw"),
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("MZDUf2d0zXs/tIWRbMOkg+7l+VpaI6mrENYV4XHH"),
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("rz7VusCS3mC/j9z9XBJwwS06gVp53mkZ+xLrRFem"),
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("G7hB8XKnyRQ2YjM3KBsfiScvDE71Ke0xRC5AIEJ/"),
                        Xqedii_1vexecq.Xqedii_2ow587hjypp0y("y2zp1RT5tUU8nfompngSLMB2xySlqCyMnTTuJ3ps")
                     ),
                     var3
                  )
                  : List.of();
               default -> List.of();
            };
         }
      }
   }

   static {
      if ((488885793 * 488885793 + 488885793 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10000 = new String[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(-1008876728, 31)];
         var10000[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138606927, 21)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("9BZC3u9sJFc45VY0ckHcCq0Hnz6RvnjrmUSOW3npPP28Zgw1");
         var10000[Xqedii_1vexecq.Xqedii_1ladjox5782r3(1192606465, 25)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "jgUHgsHdbtBjy54bGTcFmitzDHIt1TkV/K0PkuDjJNUoP2/CLh0="
         );
         var10000[Xqedii_1vexecq.Xqedii_1ladjox5782r3(84170476, 19)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("ZHumnSePkPb0TF5bbDge2Yu2yIIDnd+kJvE3S9w4YzLM/0mx");
         var10000[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708479, 5)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "cKsyVx/b3ghP3TDlF43AzYuzNgjdZjPwd2unVcRxXQAMajDtSeMIXQ=="
         );
         var10000[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(2004321279, 29)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "TaWNoP+X4UlbEY0H5ScSboeXAN9lQJvE4VIQevknbFTm4V2sKgtvdat8y/c="
         );
         var10000[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(930579455, 27)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("ryfzMPBvKtjji1s+XQi+jS/eQjV4wZ3N72YCxTFxmQiFmSmU");
         var10000[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393659391, 14)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "v+jVkhYMvuBT80kwomyHtdi6mkSJUBVabTbvqDOW2aSnKMbSxBaKBA=="
         );
         var10000[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(259490815, 26)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "yB/jXmP3tMIqe/R62ZjxYSKcBhXapWIeoy2W0pc/lOtSeR5uD1GzTw=="
         );
         var10000[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138615119, 10)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "gwX12goz0ZEO8ZRPM+EL1cgNYNUzu6CqVvvhm3HTmolvS0CPqvDLbhJjm2gQaYKxe18="
         );
         var10000[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(-740441265, 28)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "Ycf1g+wZkkKQ+bn7kABheJ0ZaTQD5QjEulxM3S0vi1kX363eFoBkvqcheqWvAw=="
         );
         var10000[Xqedii_1vexecq.Xqedii_1ladjox5782r3(729154210, 2)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("zjqvxqsslxA+9FHX8Yo5z6yYqjtTjTZClJOiebgXoUBC55AW");
         var10000[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(1064797183, 26)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("0YKg9/TUuHqv6QtVK19Wr6PhJ1JfYI06CS0Wzj5HjUyvSgPu");
         var10000[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(394036223, 16)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "xTRyx493t9WJUY1CBKp36zjtnfmLW3nLVM2fJm3Rt7uZLdERzchlSw=="
         );
         var10000[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-1378350344, 4)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("mwZUAAho1QYX/KSBitgimQkWH9zrO0krygagCdLJcAU=");
         var10000[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1128121167, 20)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "0JlKYyEMkYCM+hAlhcPU+mKwnfkI/7IHtSYNGTYSoUEMNJT8QI54QQ=="
         );
         Xqedii_1rrce4w = List.of(var10000);
         var10000 = new String[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1709032271, 25)];
         var10000[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(-393708544, 15)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "cKsyVx/b3ghP3TDlF43AzYuzNgjdZjPwd2unVcRxXQAMajDtSeMIXQ=="
         );
         var10000[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708543, 13)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "X2M0gU7giqIzjZ6+MrRybk8FpeLuuB080XZjuL1H/oujH8J1Ldr6dw=="
         );
         var10000[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(391611391, 21)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "TaWNoP+X4UlbEY0H5ScSboeXAN9lQJvE4VIQevknbFTm4V2sKgtvdat8y/c="
         );
         var10000[Xqedii_1vexecq.Xqedii_1ladjox5782r3(1355116224, 23)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("qLdFXQtm9jvXSHkX9tBXKOcF9/K2xH5b/t4TdaTuMzh7f8z6");
         var10000[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393315327, 17)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("ryfzMPBvKtjji1s+XQi+jS/eQjV4wZ3N72YCxTFxmQiFmSmU");
         var10000[Xqedii_1vexecq.Xqedii_1ladjox5782r3(-335201194, 11)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "v+jVkhYMvuBT80kwomyHtdi6mkSJUBVabTbvqDOW2aSnKMbSxBaKBA=="
         );
         var10000[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(-809443039, 24)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "yB/jXmP3tMIqe/R62ZjxYSKcBhXapWIeoy2W0pc/lOtSeR5uD1GzTw=="
         );
         var10000[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393708519, 2)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "m1AbJQyr0xVFX7ZBI9u0po1a1urCg7iR2RxTqEdhJziW/V16ogXHFSNy"
         );
         var10000[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1140704079, 18)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "gwX12goz0ZEO8ZRPM+EL1cgNYNUzu6CqVvvhm3HTmolvS0CPqvDLbhJjm2gQaYKxe18="
         );
         var10000[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(391611391, 18)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "Ycf1g+wZkkKQ+bn7kABheJ0ZaTQD5QjEulxM3S0vi1kX363eFoBkvqcheqWvAw=="
         );
         var10000[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(1601668095, 27)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "LVyscukbxAhHoNTFLDFJwJ/tISwkLFkjU9LHdOmigKJW6gNJ587PzhNChFWGM4kh"
         );
         var10000[Xqedii_1vexecq.Xqedii_2slqwjpv0hm0f(393380863, 15)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("zjqvxqsslxA+9FHX8Yo5z6yYqjtTjTZClJOiebgXoUBC55AW");
         var10000[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138508623, 13)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "GmJ6BpoztFFxKv0/eRRxeZ3NfTaRH2OpzcFnvhnow+LSBnge5IM="
         );
         var10000[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138561871, 12)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("0YKg9/TUuHqv6QtVK19Wr6PhJ1JfYI06CS0Wzj5HjUyvSgPu");
         var10000[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138607183, 7)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "xTRyx493t9WJUY1CBKp36zjtnfmLW3nLVM2fJm3Rt7uZLdERzchlSw=="
         );
         var10000[Xqedii_1vexecq.Xqedii_kik1j7ap7ja0(404497467, 29)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("If85ZZvyIoeHhGEK9Dc+XLuUuH6Y7lKo3NPxKd6aWJLYhHrc");
         var10000[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138344783, 14)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("IbOBHzfQbpiO3UffoNC55SodY+QnG6LXdQk7gmKk9aNAG27l");
         var10000[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1201521487, 22)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y("mwZUAAho1QYX/KSBitgimQkWH9zrO0krygagCdLJcAU=");
         var10000[Xqedii_1vexecq.Xqedii_3tiyj0hqugkzq(1138721615, 13)] = Xqedii_1vexecq.Xqedii_2ow587hjypp0y(
            "jjQMRPn7jwfsXyW7a60rH5DZZZlqdR3zHwEHxDaj0K3/kEbByiYvd3cIsYE="
         );
         Xqedii_3uuzz0v = List.of(var10000);
      }
   }

   private static /* synthetic */ String Xqedii_38nv8jyc47ufz(String string, String string2, String string3, String string4, String string5, String string6) {
        return Xqedii_1vexecq.Xqedii_2ow587hjypp0y("d2OXl95CkaxFeMCUiVJZ5LGa3iIkMJeul0UrG0Q9aD56tO3Y9tdi9Q6HUesNHPwA") + string + Xqedii_1vexecq.Xqedii_2ow587hjypp0y("2p4x7BpfU2maRSn+YgQvIdivHtBLeykSpBtZJaKh3X7b1YbElwlBHlRSfcU/sXgk") + string2 + Xqedii_1vexecq.Xqedii_2ow587hjypp0y("UhOOzV+wHw+MArSoXV6C5h5wPWILuVneskjShp3ZQI8G2t3zY9pvXer3z9rQY1H/l/Xt1uwrYO/0HbyZ4VuDPfvxGXI=") + string3 + Xqedii_1vexecq.Xqedii_2ow587hjypp0y("Uf6vscx/37Gz4bIVvmfXGtfOpSPjAabmKjMLSgsleTE=") + string4 + Xqedii_1vexecq.Xqedii_2ow587hjypp0y("Wq7ryMO4r3LkkK/tL9MwRtO30uo+6rKOmXaIZwNoJdvoqhnC4CaUSW2UZD0N1UdA") + string5 + Xqedii_1vexecq.Xqedii_2ow587hjypp0y("Uf6vscx/37Gz4bIVvmfXGtfOpSPjAabmKjMLSgsleTE=") + string6;
    }

    private static /* synthetic */ String Xqedii_ix16dvmxyaik(String string) {
        return Xqedii_1vexecq.Xqedii_2ow587hjypp0y("NaDsZ9BloQAy/1M0kXnHMmUELRrfkB2cIJRtweynoP3vAjACX7Yf+iLysPJqpJT8DF7BqaVjLhRjVIZy") + string;
    }

    private static /* synthetic */ String Xqedii_28xquck5gx92v(String string) {
        return Xqedii_1vexecq.Xqedii_2ow587hjypp0y("MuqlonSydsUt5GkmZnF9od/ughKB24U5aNel+VG2ujdL/sfPdDLfInHztOBTKADPn+1peA4l//iRCj0uU1uJ80r9gb0=") + string;
    }

    private static /* synthetic */ String Xqedii_101gcmngr2rmr(String string, String string2, String string3) {
        return string + Xqedii_1vexecq.Xqedii_2ow587hjypp0y("QzVFvXhDQVqHEcmSeka74qgKDuD4V/SjvNx0Yq/D") + string2 + Xqedii_1vexecq.Xqedii_2ow587hjypp0y("QzVFvXhDQVqHEcmSeka74qgKDuD4V/SjvNx0Yq/D") + string3;
    }

    private static /* synthetic */ String Xqedii_2jpyit8m8ri64(String string) {
        return Xqedii_1vexecq.Xqedii_2ow587hjypp0y("g8EelQmbKcetF8nfI8IvBUVcJXNDH6Z2vvNDrtsdo9cAT3R7tMOqD7+Ku0JNnGsNJSuIVDGRy6N+FodxbMORfA==") + string;
    }

    private static /* synthetic */ String Xqedii_1bbmhgl38amgn(String string) {
        return Xqedii_1vexecq.Xqedii_2ow587hjypp0y("985yizZuKp+6sBDQ9j9BqUpgusCxf3+DPdFoNrKaQ9T0NxMczeqtFG6P5bM1N1ozRo1l6BfBceBxEpcS") + string;
    }

    private static /* synthetic */ String Xqedii_xajp865masqy(String string) {
        return Xqedii_1vexecq.Xqedii_2ow587hjypp0y("HfW/GO4znt0UYfxaC9ozfatOb11vXPGp5bgVVsUJWanQdyYkik0IL2dQ/cB6dxgoowv8EPMJQvXbCItI") + string;
    }

    private static /* synthetic */ String Xqedii_r0zd7zk3xa25(String string) {
        return Xqedii_1vexecq.Xqedii_2ow587hjypp0y("MuqlonSydsUt5GkmZnF9od/ughKB24U5aNel+VG2ujdL/sfPdDLfInHztOBTKADPn+1peA4l//iRCj0uU1uJ80r9gb0=") + string;
    }

    private static /* synthetic */ String Xqedii_16wh7oanplfsi(String string) {
        return Xqedii_1vexecq.Xqedii_2ow587hjypp0y("MuqlonSydsUt5GkmZnF9od/ughKB24U5aNel+VG2ujdL/sfPdDLfInHztOBTKADPn+1peA4l//iRCj0uU1uJ80r9gb0=") + string;
    }
}
