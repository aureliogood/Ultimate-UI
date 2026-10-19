package dev.xqedii.ultimateUI.service.camera;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.Xqedii_elrxld2;
import dev.xqedii.ultimateUI.service.hud.HudService;
import dev.xqedii.ultimateUI.service.npc.CursorNpcService;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.PacketEvents;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.event.PacketListenerAbstract;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.event.PacketListenerCommon;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.event.PacketListenerPriority;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.event.PacketReceiveEvent;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.packettype.PacketTypeCommon;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.packettype.PacketType.Play.Client;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Player;

public abstract class CameraSoundMask extends CameraSpectate {
   public static final String Xqedii_3fjmcx2hqoh0d = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final String[] Xqedii_qwpf507;
   public static final String Xqedii_21qlw48 = Xqedii_elrxld2.Xqedii_2vm7vm90nfdvj(
      "CIlqRkOhfKHgbq4I/uC8vcoAZUctT/GcWJz9xBJmgIa55SMIqNbg9t6At9/CKWJ0NEd7yAF+mG7EhxsNOwK5Jo/2dsrhQtD6Nfrbw1TXY4ry2VlURFRA80ifcr+FkMiP"
   );
   public static final String Xqedii_2oslcte = Xqedii_elrxld2.Xqedii_2vm7vm90nfdvj(
      "UdtDpE3TP9mxYEOzgRIp9JggFDknrf2R3pyzD4VnXc+OJCQ1kdpzUHBCNcGjV0twbug29Gk6jpeY4AymqQ0E5W9hSAYI0TTPxkfPGQ8f/RRjVg3m8YILxfDpU6DIBg=="
   );
   public static final String Xqedii_y2nexwi = Xqedii_elrxld2.Xqedii_2vm7vm90nfdvj(
      "oSH9XwrCNSwOxC4h83hUgX7Jpkqbmu5MC9pFXoLjVhL9+YDOSs3+URBEHyRfpXVpG4UNGiyjFCiHRjc/z46oTf+GdzsGOcpSKtNjXRH4xnmn07rnz2YlZhrLY5hBsA=="
   );
   public static final String[] Xqedii_12v1yhf;
   public static final int Xqedii_62494cr = 20;
   public static final int Xqedii_k1h9zjp = 40;
   public static final long Xqedii_qr5jh7o = 5L;
   public final Set<UUID> Xqedii_1x43la0 = ConcurrentHashMap.newKeySet();
   public PacketListenerCommon Xqedii_32heg6n;

   public CameraSoundMask(UltimateUI var1, HudService var2, CursorNpcService var3) {
      super(var1, var2, var3);
   }

   public void Xqedii_13g85ac(Player var1) {
      if ((-1477848302 * (-1477848302 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (var1 != null) {
            this.Xqedii_1x43la0.add(var1.getUniqueId());
         }
      }
   }

   public void Xqedii_3gg2h5x(Player var1) {
      if ((780089083 ^ 780089083) != 0) {
         throw new IllegalStateException();
      } else {
         if (var1 != null) {
            this.Xqedii_1x43la0.remove(var1.getUniqueId());
         }
      }
   }

   public void Xqedii_3ldoae7() {
      if ((1084434412 * 1084434412 - 1084434412 & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_32heg6n == null) {
         this.Xqedii_32heg6n = new PacketListenerAbstract(PacketListenerPriority.MONITOR) {
            public static final String Xqedii_11b655w1x0sup = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

            public void onPacketReceive(PacketReceiveEvent var1) {
               if ((-231662848 * (-231662848 + 1) & 1) != 0) {
                  throw new IllegalStateException();
               } else if (var1 != null) {
                  PacketTypeCommon var2 = var1.getPacketType();
                  if (var2 == Client.ANIMATION || var2 == Client.PLAYER_DIGGING) {
                     if (var1.getPlayer() instanceof Player var3 && CameraSoundMask.this.Xqedii_1x43la0.contains(var3.getUniqueId())) {
                        CameraSoundMask.Xqedii_h2zy5sr(var3, CameraSoundMask.Xqedii_qwpf507, SoundCategory.BLOCKS);
                     }
                  }
               }
            }
         };

         try {
            PacketEvents.getAPI().getEventManager().registerListener(this.Xqedii_32heg6n);
         } catch (Throwable var2) {
            this.Xqedii_32heg6n = null;
            this.Xqedii_11is6fi.getLogger().warning(Xqedii_2gfq5w87q1qud(String.valueOf(var2)));
         }
      }
   }

   public void Xqedii_34hj3gy() {
      if ((2075064933 * 2075064933 + 2075064933 & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_32heg6n != null) {
         try {
            PacketEvents.getAPI().getEventManager().unregisterListener(this.Xqedii_32heg6n);
         } catch (Throwable var2) {
         }

         this.Xqedii_32heg6n = null;
      }
   }

   public void Xqedii_qd4x725(Player var1) {
      if (((1870976777 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         if (var1 != null && var1.isOnline()) {
            Xqedii_h2zy5sr(var1, Xqedii_12v1yhf, SoundCategory.AMBIENT);
         }
      }
   }

   public void Xqedii_3o9p0ox(Player var1) {
      if (((-1207305837 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3siyymm(
            var1,
            Xqedii_elrxld2.Xqedii_2vm7vm90nfdvj(
               "CIlqRkOhfKHgbq4I/uC8vcoAZUctT/GcWJz9xBJmgIa55SMIqNbg9t6At9/CKWJ0NEd7yAF+mG7EhxsNOwK5Jo/2dsrhQtD6Nfrbw1TXY4ry2VlURFRA80ifcr+FkMiP"
            )
         );
      }
   }

   public void Xqedii_1v9jfqb(Player var1) {
      if ((-522375731 * (-522375731 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3siyymm(
            var1,
            Xqedii_elrxld2.Xqedii_2vm7vm90nfdvj(
               "UdtDpE3TP9mxYEOzgRIp9JggFDknrf2R3pyzD4VnXc+OJCQ1kdpzUHBCNcGjV0twbug29Gk6jpeY4AymqQ0E5W9hSAYI0TTPxkfPGQ8f/RRjVg3m8YILxfDpU6DIBg=="
            )
         );
      }
   }

   public void Xqedii_3siyymm(Player var1, String var2) {
      if ((-455653351 * (-455653351 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         String[] var10000 = new String[Xqedii_elrxld2.Xqedii_3hz5c4inp35v5(-1360115349, 13)];
         var10000[Xqedii_elrxld2.Xqedii_32ezzkll5egl4(1559893141, 8)] = var2;
         var10000[Xqedii_elrxld2.Xqedii_3hz5c4inp35v5(-1427240597, 26)] = Xqedii_elrxld2.Xqedii_2vm7vm90nfdvj(
            "oSH9XwrCNSwOxC4h83hUgX7Jpkqbmu5MC9pFXoLjVhL9+YDOSs3+URBEHyRfpXVpG4UNGiyjFCiHRjc/z46oTf+GdzsGOcpSKtNjXRH4xnmn07rnz2YlZhrLY5hBsA=="
         );
         String[] var3 = var10000;
         Xqedii_38o2zes.Xqedii_u043a3q(
            this.Xqedii_11is6fi,
            () -> {
               if (((1176355347 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else {
                  for (int var2x = Xqedii_elrxld2.Xqedii_27mw9882xj5yz(725982501, 15);
                     var2x < Xqedii_elrxld2.Xqedii_3hz5c4inp35v5(-1360131713, 31) && var1.isOnline();
                     var2x++
                  ) {
                     Xqedii_h2zy5sr(var1, var3, SoundCategory.AMBIENT);

                     try {
                        Thread.sleep(Xqedii_elrxld2.Xqedii_3untjror075i7(5100559665819834004L, 42));
                     } catch (InterruptedException var4x) {
                        Thread.currentThread().interrupt();
                        return;
                     }
                  }
               }
            }
         );
         int[] var5 = new int[Xqedii_elrxld2.Xqedii_1e7cym7nd2mub(962211683, 1)];
         var5[Xqedii_elrxld2.Xqedii_27mw9882xj5yz(1506955956, 27)] = Xqedii_elrxld2.Xqedii_32ezzkll5egl4(-1559786646, 13);
         int[] var4 = var5;
         Xqedii_38o2zes.Xqedii_j3mggbv(
            this.Xqedii_11is6fi,
            var1,
            Xqedii_elrxld2.Xqedii_1c2wkl3nltp05(1803671980341256599L, 1),
            Xqedii_elrxld2.Xqedii_3untjror075i7(5101672371587143316L, 50),
            var3x -> {
               if ((-117032227 * (-117032227 + 1) & 1) != 0) {
                  throw new IllegalStateException();
               } else {
                  if (var1.isOnline()) {
                     int var10001 = Xqedii_elrxld2.Xqedii_1e7cym7nd2mub(794900826, 17);
                     int var10003 = var4[var10001];
                     var4[var10001] -= Xqedii_elrxld2.Xqedii_27mw9882xj5yz(820586842, 26);
                     if (var10003 > 0) {
                        Xqedii_h2zy5sr(var1, var3, SoundCategory.AMBIENT);
                        return;
                     }
                  }

                  var3x.cancel();
               }
            }
         );
      }
   }

   public static void Xqedii_h2zy5sr(Player var0, String[] var1, SoundCategory var2) {
      if ((938844109 * (938844109 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var3 = var1;
         int var4 = var1.length;

         for (int var5 = Xqedii_elrxld2.Xqedii_32ezzkll5egl4(1559893141, 21); var5 < var4; var5++) {
            String var6 = var3[var5];

            try {
               var0.stopSound(var6, var2);
            } catch (RuntimeException var8) {
            }
         }
      }
   }

   static {
      if ((-1104177193 ^ -1104177193) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10000 = new String[Xqedii_elrxld2.Xqedii_27mw9882xj5yz(-1555131755, 22)];
         var10000[Xqedii_elrxld2.Xqedii_1e7cym7nd2mub(1924423362, 2)] = Xqedii_elrxld2.Xqedii_2vm7vm90nfdvj(
            "OAo9MtH5knpILgJfu4o5Tdkt6f1ht+wjFLspIk64P49M1u1r0L9HTbQSv4EV9ESDIx3qCNdvl35YXrlLwfYXnARxdnCq7dd4AZRp+E/W"
         );
         var10000[Xqedii_elrxld2.Xqedii_32ezzkll5egl4(-1559893142, 8)] = Xqedii_elrxld2.Xqedii_2vm7vm90nfdvj(
            "DSSRpiZyFSjz5EIp2KOazhNzK/uAr38ywG9D3nlmHUyO/XDjdY07cF9BsQhduk9ABtZhgXG4S6+d+eIRm/7TWJypHolcV13fhqwFR6Xvy7x9PQ=="
         );
         Xqedii_qwpf507 = var10000;
         var10000 = new String[Xqedii_elrxld2.Xqedii_32ezzkll5egl4(-1556747414, 20)];
         var10000[Xqedii_elrxld2.Xqedii_32ezzkll5egl4(1559893141, 21)] = Xqedii_elrxld2.Xqedii_2vm7vm90nfdvj(
            "oSH9XwrCNSwOxC4h83hUgX7Jpkqbmu5MC9pFXoLjVhL9+YDOSs3+URBEHyRfpXVpG4UNGiyjFCiHRjc/z46oTf+GdzsGOcpSKtNjXRH4xnmn07rnz2YlZhrLY5hBsA=="
         );
         var10000[Xqedii_elrxld2.Xqedii_1e7cym7nd2mub(1757252837, 11)] = Xqedii_elrxld2.Xqedii_2vm7vm90nfdvj(
            "QyDogPHD9S+3RCsKOZ332zbaNCXPR1sHx4SWoL8OrfklWUGelNfv8YUWUEpfraqSPnQyShpKPDvD8TNuNS3wKlEzF8KoEvhFPRwBUSSQx1EYTnc0PNAY1F0kBiAbtX/5RCvOTPhekOcDRQy9ylen37N+"
         );
         var10000[Xqedii_elrxld2.Xqedii_27mw9882xj5yz(1513417001, 18)] = Xqedii_elrxld2.Xqedii_2vm7vm90nfdvj(
            "Ao0iEcPBQPseIGUTXBJjGtRNXcLvXG2GnLzgS3VFx0XhYbcVqKGr2DSdwDTym8RvQiXLM1bPGOMYtnhLZZVYiPMp7IA5HUdBnL0G2LDhEpmKFKk0fzByaHibUj/3itV30wcqZYQiGLh6Ekam7/wwzaZ0UXVRPkn9uQETxg=="
         );
         var10000[Xqedii_elrxld2.Xqedii_1e7cym7nd2mub(1731811887, 25)] = Xqedii_elrxld2.Xqedii_2vm7vm90nfdvj(
            "MaV/prwwXXzOmuqP+AQ5h47HprYKDfJgVZ3a4Mlw0rgE0+5iUTAy3uaJjgyArS1xMbOQwy74+ks/ivnU8MJ8XYUBcN3ITx4EbikljVjpe0j3u3dEzN6io4dRpTturws0nHf8fBkb5W8p8wDqP+sRlad9lw2PSsS+FUby5LkERyWU8vTqkGEfRw=="
         );
         Xqedii_12v1yhf = var10000;
      }
   }

   private static /* synthetic */ String Xqedii_2gfq5w87q1qud(String string) {
        return Xqedii_elrxld2.Xqedii_2vm7vm90nfdvj("7NWXSbHM7GyzKj3/ui6H/VGEzP4taN5lMILCnTeFLdNpzIU1u7dZaYTgwhL7nezMiKmISzArQnpfuqbttyarI1OtdcrSKCPUC2beUhGa4Dp6bxdL1WmaNhmq3IwbhIcE/MqgI49FZ6nU54fMtGml6DG/zDvtDjoZxcCZuyVYDiOfvMaeXvXNvHqJOzD3jLK3Nfxl5xNSGLk=") + string + Xqedii_elrxld2.Xqedii_2vm7vm90nfdvj("3/CLC2V1P7ar1FB2Y8B/lPlro2ij+tgLOtTJ7ydG");
    }
}
