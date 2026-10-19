package dev.xqedii.ultimateUI.service.input;

import dev.xqedii.ultimateUI.Xqedii_1zrrgg4;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.bukkit.entity.Player;

public final class AnvilInputRequest {
   public static final String Xqedii_3tumaaz7sqig1 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final int HARD_MAX_LENGTH = 50;
   public final String title;
   public final String Xqedii_evkfrm9;
   public final int Xqedii_huvd8g5;
   public final InputFilter Xqedii_2n1zda8;
   public final boolean Xqedii_78ngfyz;
   public final boolean Xqedii_2qncn5d;
   public final boolean Xqedii_2h61o9i;
   public final int Xqedii_6o0thak;
   public final boolean Xqedii_2xu0k5s;
   public final BiConsumer<Player, String> Xqedii_3dueeet;
   public final AnvilInputRequest.CommitHandler Xqedii_3ei1ims;
   public final AnvilInputRequest.CancelHandler Xqedii_32k4d25;
   public final Consumer<Player> Xqedii_211ny6z;

   public AnvilInputRequest(AnvilInputRequest.Builder var1) {
      this.title = var1.title;
      this.Xqedii_evkfrm9 = var1.Xqedii_foaagqm;
      this.Xqedii_huvd8g5 = var1.Xqedii_1ok0wcn;
      this.Xqedii_2n1zda8 = var1.Xqedii_2fkb54l;
      this.Xqedii_78ngfyz = var1.Xqedii_1nh64ae;
      this.Xqedii_2qncn5d = var1.Xqedii_1sxyq0z;
      this.Xqedii_2h61o9i = var1.Xqedii_88xa8sm;
      this.Xqedii_6o0thak = var1.Xqedii_2urtrmh;
      this.Xqedii_2xu0k5s = var1.Xqedii_3iev88n;
      this.Xqedii_3dueeet = var1.Xqedii_1w2y1n1;
      this.Xqedii_3ei1ims = var1.Xqedii_2bxfv7a;
      this.Xqedii_32k4d25 = var1.Xqedii_10vnz24;
      this.Xqedii_211ny6z = var1.Xqedii_1trjdop;
   }

   public static AnvilInputRequest.Builder builder() {
      if (((698745977 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return new AnvilInputRequest.Builder();
      }
   }

   public String title() {
      if ((370345915 * 370345915 + 370345915 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.title;
      }
   }

   public String initial() {
      if ((301535143 ^ 301535143) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_evkfrm9;
      }
   }

   public int maxLength() {
      if ((-841705995 * -841705995 + -841705995 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_huvd8g5;
      }
   }

   public InputFilter filter() {
      if ((-2018727555 * (-2018727555 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2n1zda8;
      }
   }

   public boolean allowEmpty() {
      if (((1800162097 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_78ngfyz;
      }
   }

   public boolean closeOnClick() {
      if ((1086798828 * 1086798828 + 1086798828 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2qncn5d;
      }
   }

   public boolean closeOnMax() {
      if ((263753027 * 263753027 - 263753027 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2h61o9i;
      }
   }

   public int idleTimeoutTicks() {
      if ((951072703 ^ 951072703) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_6o0thak;
      }
   }

   public boolean commitEditsOnEscape() {
      if ((-1182792916 * -1182792916 - -1182792916 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2xu0k5s;
      }
   }

   public BiConsumer<Player, String> onChange() {
      if ((2058731995 ^ 2058731995) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_3dueeet;
      }
   }

   public AnvilInputRequest.CommitHandler onCommit() {
      if ((1464487432 * 1464487432 - 1464487432 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_3ei1ims;
      }
   }

   public AnvilInputRequest.CancelHandler onCancel() {
      if (((-1813417784 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_32k4d25;
      }
   }

   public Consumer<Player> onReject() {
      if ((-59708374 * -59708374 + -59708374 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_211ny6z;
      }
   }

   public static final class Builder {
      public static final String Xqedii_1cobzy008hzw3 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
      public String title = Xqedii_1zrrgg4.Xqedii_2t8qhmp8mc079("v01JZKJmUKt/hmefrOb0iL1UzDHMS22FT47FlQ==");
      public String Xqedii_foaagqm = Xqedii_1zrrgg4.Xqedii_2t8qhmp8mc079("v01JZKJmUKt/hmefrOb0iL1UzDHMS22FT47FlQ==");
      public int Xqedii_1ok0wcn = Xqedii_1zrrgg4.Xqedii_1wkiu1xidjsbh(638194534, 6);
      public InputFilter Xqedii_2fkb54l = InputFilter.ANY;
      public boolean Xqedii_1nh64ae = (Xqedii_1zrrgg4.Xqedii_1wkiu1xidjsbh(-1742176616, 8) != 0);
      public boolean Xqedii_1sxyq0z = (Xqedii_1zrrgg4.Xqedii_1wkiu1xidjsbh(2123929640, 24) != 0);
      public boolean Xqedii_88xa8sm = (Xqedii_1zrrgg4.Xqedii_1wkiu1xidjsbh(169862694, 14) != 0);
      public int Xqedii_2urtrmh = Xqedii_1zrrgg4.Xqedii_20qingxhjmrwc(913860255, 12);
      public boolean Xqedii_3iev88n = (Xqedii_1zrrgg4.Xqedii_muhupzl1kr4a(-1785842239, 9) != 0);
      public BiConsumer<Player, String> Xqedii_1w2y1n1;
      public AnvilInputRequest.CommitHandler Xqedii_2bxfv7a;
      public AnvilInputRequest.CancelHandler Xqedii_10vnz24;
      public Consumer<Player> Xqedii_1trjdop;

      public AnvilInputRequest.Builder title(String var1) {
         if ((853245400 * 853245400 - 853245400 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            this.title = var1 == null ? Xqedii_1zrrgg4.Xqedii_2t8qhmp8mc079("v01JZKJmUKt/hmefrOb0iL1UzDHMS22FT47FlQ==") : var1;
            return this;
         }
      }

      public AnvilInputRequest.Builder initial(String var1) {
         if ((-367173718 * (-367173718 + 1) & 1) != 0) {
            throw new IllegalStateException();
         } else {
            this.Xqedii_foaagqm = var1 == null ? Xqedii_1zrrgg4.Xqedii_2t8qhmp8mc079("v01JZKJmUKt/hmefrOb0iL1UzDHMS22FT47FlQ==") : var1;
            return this;
         }
      }

      public AnvilInputRequest.Builder maxLength(int var1) {
         if ((-153807311 * (-153807311 + 1) & 1) != 0) {
            throw new IllegalStateException();
         } else {
            this.Xqedii_1ok0wcn = Math.max(
               Xqedii_1zrrgg4.Xqedii_1wkiu1xidjsbh(-376864121, 28), Math.min(Xqedii_1zrrgg4.Xqedii_1wkiu1xidjsbh(162730757, 21), var1)
            );
            return this;
         }
      }

      public AnvilInputRequest.Builder filter(InputFilter var1) {
         if (((-1893564629 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            this.Xqedii_2fkb54l = var1 == null ? InputFilter.ANY : var1;
            return this;
         }
      }

      public AnvilInputRequest.Builder filter(String var1) {
         if ((1687539187 * 1687539187 - 1687539187 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return this.filter(InputFilter.fromId(var1));
         }
      }

      public AnvilInputRequest.Builder allowEmpty(boolean var1) {
         if ((117222077 * 117222077 + 117222077 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            this.Xqedii_1nh64ae = var1;
            return this;
         }
      }

      public AnvilInputRequest.Builder closeOnClick(boolean var1) {
         if (((-47907590 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            this.Xqedii_1sxyq0z = var1;
            return this;
         }
      }

      public AnvilInputRequest.Builder closeOnMax(boolean var1) {
         if ((513313612 ^ 513313612) != 0) {
            throw new IllegalStateException();
         } else {
            this.Xqedii_88xa8sm = var1;
            return this;
         }
      }

      public AnvilInputRequest.Builder idleTimeoutTicks(int var1) {
         if (((445969954 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            this.Xqedii_2urtrmh = Math.max(Xqedii_1zrrgg4.Xqedii_20qingxhjmrwc(913860255, 28), var1);
            return this;
         }
      }

      public AnvilInputRequest.Builder commitEditsOnEscape(boolean var1) {
         if (((-468840508 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            this.Xqedii_3iev88n = var1;
            return this;
         }
      }

      public AnvilInputRequest.Builder onChange(BiConsumer<Player, String> var1) {
         if ((1065357269 * 1065357269 + 1065357269 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            this.Xqedii_1w2y1n1 = var1;
            return this;
         }
      }

      public AnvilInputRequest.Builder onChange(Consumer<String> var1) {
         if ((1900032186 ^ 1900032186) != 0) {
            throw new IllegalStateException();
         } else {
            this.Xqedii_1w2y1n1 = var1 == null ? null : (var1x, var2) -> {
               if (((1630582820 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else {
                  var1.accept(var2);
               }
            };
            return this;
         }
      }

      public AnvilInputRequest.Builder onCommit(AnvilInputRequest.CommitHandler var1) {
         if (((-2084843865 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            this.Xqedii_2bxfv7a = var1;
            return this;
         }
      }

      public AnvilInputRequest.Builder onCommit(Consumer<String> var1) {
         if ((-1029332700 * -1029332700 + -1029332700 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            this.Xqedii_2bxfv7a = var1 == null ? null : (var1x, var2, var3) -> {
               if ((-698701457 * -698701457 - -698701457 & 1) != 0) {
                  throw new IllegalStateException();
               } else {
                  var1.accept(var2);
               }
            };
            return this;
         }
      }

      public AnvilInputRequest.Builder onCancel(AnvilInputRequest.CancelHandler var1) {
         if ((289259311 * 289259311 - 289259311 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            this.Xqedii_10vnz24 = var1;
            return this;
         }
      }

      public AnvilInputRequest.Builder onCancel(Runnable var1) {
         if ((350249674 * (350249674 + 1) & 1) != 0) {
            throw new IllegalStateException();
         } else {
            this.Xqedii_10vnz24 = var1 == null ? null : (var1x, var2, var3) -> {
               if ((-573365528 * (-573365528 + 1) & 1) != 0) {
                  throw new IllegalStateException();
               } else {
                  var1.run();
               }
            };
            return this;
         }
      }

      public AnvilInputRequest.Builder onReject(Consumer<Player> var1) {
         if ((359919416 * 359919416 + 359919416 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            this.Xqedii_1trjdop = var1;
            return this;
         }
      }

      public AnvilInputRequest build() {
         if (((1600361780 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            return new AnvilInputRequest(this);
         }
      }
   }

   @FunctionalInterface
   public interface CancelHandler {
      String Xqedii_18z0l00dfib8u = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

      void accept(Player var1, String var2, InputCloseReason var3);
   }

   @FunctionalInterface
   public interface CommitHandler {
      String Xqedii_ya8lw0egek1s = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

      void accept(Player var1, String var2, InputCloseReason var3);
   }
}
