package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateUI.bedrock.BedrockUiService;
import dev.xqedii.ultimateUI.service.bossbar.BossbarRenderService;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.GuiService;
import dev.xqedii.ultimateUI.service.hud.HudService;
import dev.xqedii.ultimateUI.service.input.AnvilInputService;
import dev.xqedii.ultimateUI.service.keybind.KeybindService;
import dev.xqedii.ultimateUI.service.npc.CursorNpcService;
import dev.xqedii.ultimateUI.service.resourcepack.UiImageAtlasService;
import dev.xqedii.ultimateUI.util.PlatformCompat;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.event.PacketListenerCommon;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class PluginState extends JavaPlugin {
   public static final String Xqedii_2p4m7p618xp7d = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final String Xqedii_2nvsqlj = Xqedii_28avcbe.Xqedii_beguow7h551q("rqpHFcdLeFVQFl5kCbJFPoFiswgj2NHzpt7RUO1WmaCeTzKrHhoFj4b3A5s=");
   public static final String Xqedii_3a4ezh1 = Xqedii_28avcbe.Xqedii_beguow7h551q("0s88yFJwMZ+lGkTVZmh/hXWW+eJRmvA22i6JnrRTvKG1O54CNBQVAwk8K3KeZievi8/3Bg==");
   public static final String Xqedii_1tror93 = Xqedii_28avcbe.Xqedii_beguow7h551q("7mcI1lmRXrbnQG6m5Xcfx/HeIJ/iCthefVSlg8xhD3iz2U8V");
   public static final String Xqedii_2kx7zvn = Xqedii_28avcbe.Xqedii_beguow7h551q("KHpg0YVr8xkC7+7LZeQXSIMrGik29DgIrNGV/RE9Kin6wPV99GDYzxTw4wBrTg==");
   public static final String Xqedii_2f8ztji = Xqedii_28avcbe.Xqedii_beguow7h551q(
      "uFQz6Piu4eI/mi1eQz12Jidb0g5aMSct+CI4G78LBwV18oT2BV/ov2D3ex+UPt4mH+JaZOdzrisq6KSu"
   );
   public static final String Xqedii_zz5b27r = Xqedii_28avcbe.Xqedii_beguow7h551q(
      "efQ6tFL/1rAl0N9biy6GGfFdtHkoSl7Fx5sPSvzS08eBhniJC8icd70Ff7NfZAXsqZwX0jmVIH59CZ7WNvqFFbVrREx/hDLJ"
   );
   public static final String Xqedii_361md6f = Xqedii_28avcbe.Xqedii_beguow7h551q(
      "ETt/29phGKkdBH2aARdrU1CsM2dlFNzpy5rkz2kVHzVEAYeILWKJgqXzi7pRVVknrA56oL0gFZq7dRIY6D/wHN4FQpuggiiNk6k="
   );
   public static final String Xqedii_1nfuso9 = Xqedii_28avcbe.Xqedii_beguow7h551q(
      "fEjCuZJgf+rJqMv6Eczg2ui2g9Wn5z2JikIZiYuZLcPmgkqJt6TDOuI8jrkq6/htHSnnfFVr6IxZDAEkd8DG4N/gXq2eRxsl7FXueK2N"
   );
   public static final String Xqedii_3c46a1x = Xqedii_28avcbe.Xqedii_beguow7h551q(
      "ctg6rK/3Wu1UF5eHjPUgKUp5+5/WP5yuOX6JsjDqsbO0EUdZ8fJzwxSC/+qR6aw5NTTDGwVYstM+/13ig/AmOJUm7pDqiQHk50Q="
   );
   public static final String Xqedii_1bk6hdn = Xqedii_28avcbe.Xqedii_beguow7h551q(
      "7PFJWiIJFSf2YA5Cwjd/mYC9Uu2pqesmSgGCr4SHQ5qrHN1Ere65U/ju2VTR3uG4YrjLVga+vNLP59DqT/sq9cxW3pVBKwL0+GvVHIgf"
   );
   public static final String Xqedii_2tj9fkr = Xqedii_28avcbe.Xqedii_beguow7h551q(
      "hmtxG/J1bbVHjXDPCP2c1pTI+ByWRaM/QCez9td9pVtXZm5dsN1grAK3RDE5/czEBAK/qfpds1YDl04EbHLjMIY9FDa0Ed2L4D5Ziw=="
   );
   public static final String Xqedii_3spllpc = Xqedii_28avcbe.Xqedii_beguow7h551q(
      "3BdUi2sNx19Adjl4nGyvLnAExM1KUsCPqOy78Ynx/iR8t9nCRhgqI1KUvzs5XnmxCY574AixElrnqsZyLJYUO2T2b/IwHtny/lmo2EN6srFIfpc2SxN6xw=="
   );
   public static final String Xqedii_rluayth = Xqedii_28avcbe.Xqedii_beguow7h551q(
      "KOKDmCL9m7U9o1f9sXjvY9RKba1UqHdm79/aLBQp2L5Hm5kv+LM6/qvliw9w3tGYbtyqVwpPS7cF5qUcvWBPBKgEMXPH6BlmxIiBijVQeS4="
   );
   public static final String Xqedii_hb2c383 = Xqedii_28avcbe.Xqedii_beguow7h551q(
      "Z6YNy33nWwnaYxCfWeZ063eC9gjeZ67Q2V2F4+Y9Rkkq6PD129xHrwRmP9S8zu2vwRgc7tNuy8FDK+xk7ysobHmFCpDnX9fPyuK8CmKSAjb+bGpPoqKJHVSu5SrRrA=="
   );
   public static final String Xqedii_147fc6b = Xqedii_28avcbe.Xqedii_beguow7h551q(
      "Q2HBx3MKcFeM9cM21+Zf7BydU7GQts0cYURxnrjOiK39o8J/hAmEzyw7ZUc1TSx/NMptZdyKLegZiOKovC76XT8nCkmn0Y0FvkboDObi"
   );
   public static final String Xqedii_1tk69gi = Xqedii_28avcbe.Xqedii_beguow7h551q(
      "W7AuMdlelK/+BM9bFdHYVM7oIzcDKCvlVyI+AOQcrykYSMdE6hIwbIgsKU8y0abjVj2Sbk13fQ9zGJ2yqnLTkkdWeY0/wJGDxnkIeTJlIkwqp9LnRRRUXDtn8eI="
   );
   public static final String Xqedii_2ld6mit = Xqedii_28avcbe.Xqedii_beguow7h551q(
      "M92DajidicoFAGg7U9aUAOx9RpdT/6GusUVyGwWOZ/2dum+CHwN/rRY+8M2gEhz1sCBV87HkbSJdjkAG0p7M3SqT9eXapNzXqnNzNA=="
   );
   public static final String Xqedii_1bzu2g8 = Xqedii_28avcbe.Xqedii_beguow7h551q(
      "Z7zJf9UvB6Yoz54Z5QPIoxZHeSSXhB37MVFYJoLusdkaVZDdGWWHwAF1WIez+2c2y+tuRMAxgICcQ2UIEHS/IOhqoAWVHh9t3Ha+Zi3L"
   );
   public static final List<Entry<String, String>> Xqedii_2dpr802;
   public static final long UI_SESSION_SWITCH_DELAY_TICKS = 3L;
   public static final Map<String, String> Xqedii_1fxcb09;
   public static final float Xqedii_r0rik1m = 0.05F;
   public static final int Xqedii_o32tqnw = 3;
   public static final double Xqedii_1ft8l7d = 0.01;
   public static final MiniMessage Xqedii_1df0pdx;
   public static final LegacyComponentSerializer Xqedii_1gc2hbe;
   public static int Xqedii_299zx1x;
   public static float Xqedii_32orhhd;
   public HudService Xqedii_1fwpabk;
   public CameraService Xqedii_1tuq2ol;
   public CursorNpcService Xqedii_1a31167;
   public KeybindService Xqedii_f3ftqgq;
   public AnvilInputService Xqedii_2lp9ah4;
   public GuiService Xqedii_2k1vujp;
   public BedrockUiService Xqedii_1yufpo0;
   public Xqedii_2cm61d8 Xqedii_391oru2;
   public BossbarRenderService Xqedii_1h4p7ey;
   public Xqedii_2b3rrt2 Xqedii_2nbb2r8;
   public YamlConfiguration Xqedii_389zivo;
   public PlatformCompat.CancellableTask Xqedii_1fzr9sp;
   public boolean Xqedii_1lguiuv = (Xqedii_28avcbe.Xqedii_1h3g4w5nnxl59(-359018863, 17) != 0);
   public Xqedii_2nwgjlb Xqedii_1zavo1k;
   public boolean Xqedii_3g0zdbr = (Xqedii_28avcbe.Xqedii_1h3g4w5nnxl59(-359018863, 0) != 0);
   public Xqedii_2b0ukbv Xqedii_1mi7xjn = Xqedii_2b0ukbv.ERROR;
   public final Xqedii_2t253qr Xqedii_1e7k2q0 = new Xqedii_2t253qr();
   public Map<String, UiImageAtlasService.GeneratedImage> Xqedii_11hx7yt = new HashMap<>();
   public String Xqedii_3b8f4mz = Xqedii_28avcbe.Xqedii_beguow7h551q("N3h3o5w8ZOi1kHWJRFTT4IUPQ8pBvwiDcsF7ew==");
   public final Map<UUID, Location> Xqedii_1hpn9ga = new HashMap<>();
   public final Map<UUID, List<String>> Xqedii_yy2ps2m = new HashMap<>();
   public final Set<UUID> Xqedii_2t79mgx = ConcurrentHashMap.newKeySet();
   public final Set<UUID> Xqedii_12cf6tq = ConcurrentHashMap.newKeySet();
   public static final long EDITOR_TELEPORT_CLOSE_GUARD_TICKS = 6L;
   public static final long Xqedii_1rxndp1 = 60L;
   public PacketListenerCommon Xqedii_1pe76p2;
   public PacketListenerCommon Xqedii_3bx8dfb;
   public final AtomicBoolean Xqedii_3jm11h0 = new AtomicBoolean((Xqedii_28avcbe.Xqedii_9nmrk8mhjopj(-425825655, 4) != 0));

   static {
      if ((1654316131 * (1654316131 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Entry[] var10000 = new Entry[Xqedii_28avcbe.Xqedii_1x86i0q6xlcqq(1104899193, 21)];
         var10000[Xqedii_28avcbe.Xqedii_1x86i0q6xlcqq(1079733369, 21)] = Map.entry(
            Xqedii_28avcbe.Xqedii_beguow7h551q("JTuBq+yXSlPcECU1B26EmlA7qdH/lxL/n2QuYwxfADBQmSbe"),
            Xqedii_28avcbe.Xqedii_beguow7h551q("ETt/29phGKkdBH2aARdrU1CsM2dlFNzpy5rkz2kVHzVEAYeILWKJgqXzi7pRVVknrA56oL0gFZq7dRIY6D/wHN4FQpuggiiNk6k=")
         );
         var10000[Xqedii_28avcbe.Xqedii_14m2j5952uvg6(1363629819, 8)] = Map.entry(
            Xqedii_28avcbe.Xqedii_beguow7h551q("5O81hRIeEhZ3B2zlCvxNQ8RRqeaVCClA+0T6navMsdimixMCd1LM7Q=="),
            Xqedii_28avcbe.Xqedii_beguow7h551q("fEjCuZJgf+rJqMv6Eczg2ui2g9Wn5z2JikIZiYuZLcPmgkqJt6TDOuI8jrkq6/htHSnnfFVr6IxZDAEkd8DG4N/gXq2eRxsl7FXueK2N")
         );
         var10000[Xqedii_28avcbe.Xqedii_9nmrk8mhjopj(-291607927, 26)] = Map.entry(
            Xqedii_28avcbe.Xqedii_beguow7h551q("OB8+Oz/6GJpeTFrh+6/8QLgjOwIZsY5l3neQHJW0SV2iWVMj"),
            Xqedii_28avcbe.Xqedii_beguow7h551q("ctg6rK/3Wu1UF5eHjPUgKUp5+5/WP5yuOX6JsjDqsbO0EUdZ8fJzwxSC/+qR6aw5NTTDGwVYstM+/13ig/AmOJUm7pDqiQHk50Q=")
         );
         var10000[Xqedii_28avcbe.Xqedii_9nmrk8mhjopj(-425823607, 11)] = Map.entry(
            Xqedii_28avcbe.Xqedii_beguow7h551q("uROzzpqFPAQ2bK/5vRvMAqmkWEl34sXe2W1BTnem7HCcu0kGgzx8nQ=="),
            Xqedii_28avcbe.Xqedii_beguow7h551q("7PFJWiIJFSf2YA5Cwjd/mYC9Uu2pqesmSgGCr4SHQ5qrHN1Ere65U/ju2VTR3uG4YrjLVga+vNLP59DqT/sq9cxW3pVBKwL0+GvVHIgf")
         );
         var10000[Xqedii_28avcbe.Xqedii_14m2j5952uvg6(2137663722, 29)] = Map.entry(
            Xqedii_28avcbe.Xqedii_beguow7h551q("BgpkuGB6zGN21bNjd2sthO5iu3MsbARG0xsSFVloTeCabP4yPTY="),
            Xqedii_28avcbe.Xqedii_beguow7h551q("hmtxG/J1bbVHjXDPCP2c1pTI+ByWRaM/QCez9td9pVtXZm5dsN1grAK3RDE5/czEBAK/qfpds1YDl04EbHLjMIY9FDa0Ed2L4D5Ziw==")
         );
         var10000[Xqedii_28avcbe.Xqedii_9nmrk8mhjopj(-425835895, 11)] = Map.entry(
            Xqedii_28avcbe.Xqedii_beguow7h551q("VVumldjc3N682FYlxAUqVT3foTziwcVK5iuL55hcPa1Bz7jj"),
            Xqedii_28avcbe.Xqedii_beguow7h551q("ctg6rK/3Wu1UF5eHjPUgKUp5+5/WP5yuOX6JsjDqsbO0EUdZ8fJzwxSC/+qR6aw5NTTDGwVYstM+/13ig/AmOJUm7pDqiQHk50Q=")
         );
         var10000[Xqedii_28avcbe.Xqedii_9nmrk8mhjopj(-425825559, 4)] = Map.entry(
            Xqedii_28avcbe.Xqedii_beguow7h551q("ZGpI+vdN9xSv/nSIoQkwSYklOz6BQLbR3zp1NkCbJFQ6r8RDePRX34NG+gEuEvKQ/+c="),
            Xqedii_28avcbe.Xqedii_beguow7h551q(
               "3BdUi2sNx19Adjl4nGyvLnAExM1KUsCPqOy78Ynx/iR8t9nCRhgqI1KUvzs5XnmxCY574AixElrnqsZyLJYUO2T2b/IwHtny/lmo2EN6srFIfpc2SxN6xw=="
            )
         );
         var10000[Xqedii_28avcbe.Xqedii_1h3g4w5nnxl59(359021934, 9)] = Map.entry(
            Xqedii_28avcbe.Xqedii_beguow7h551q("tPaPQhQ0HNmrxe+7qJ9kZyQ2hm81fAip80z+fQnerJm33HnAU697R/D3"),
            Xqedii_28avcbe.Xqedii_beguow7h551q("KOKDmCL9m7U9o1f9sXjvY9RKba1UqHdm79/aLBQp2L5Hm5kv+LM6/qvliw9w3tGYbtyqVwpPS7cF5qUcvWBPBKgEMXPH6BlmxIiBijVQeS4=")
         );
         var10000[Xqedii_28avcbe.Xqedii_14m2j5952uvg6(-1256950273, 4)] = Map.entry(
            Xqedii_28avcbe.Xqedii_beguow7h551q("FkFIBAJSbe3d86qaqzU7/umEZXklRUxCQnNaj6NOREHY545J8i83Fg=="),
            Xqedii_28avcbe.Xqedii_beguow7h551q("Q2HBx3MKcFeM9cM21+Zf7BydU7GQts0cYURxnrjOiK39o8J/hAmEzyw7ZUc1TSx/NMptZdyKLegZiOKovC76XT8nCkmn0Y0FvkboDObi")
         );
         var10000[Xqedii_28avcbe.Xqedii_14m2j5952uvg6(-136672710, 27)] = Map.entry(
            Xqedii_28avcbe.Xqedii_beguow7h551q("2q/sI4nxKIWPr8Pu0qBbYze8oQGgPhxULd9woTaPRkOY3UhcXLs="),
            Xqedii_28avcbe.Xqedii_beguow7h551q("M92DajidicoFAGg7U9aUAOx9RpdT/6GusUVyGwWOZ/2dum+CHwN/rRY+8M2gEhz1sCBV87HkbSJdjkAG0p7M3SqT9eXapNzXqnNzNA==")
         );
         var10000[Xqedii_28avcbe.Xqedii_9nmrk8mhjopj(-427136375, 17)] = Map.entry(
            Xqedii_28avcbe.Xqedii_beguow7h551q("GKfdYVXXn1uUQat83/YG/Ul5XbgUMTX26sCpSdjrLHyIlhixMfZFnw=="),
            Xqedii_28avcbe.Xqedii_beguow7h551q("Z7zJf9UvB6Yoz54Z5QPIoxZHeSSXhB37MVFYJoLusdkaVZDdGWWHwAF1WIez+2c2y+tuRMAxgICcQ2UIEHS/IOhqoAWVHh9t3Ha+Zi3L")
         );
         var10000[Xqedii_28avcbe.Xqedii_14m2j5952uvg6(-78559396, 0)] = Map.entry(
            Xqedii_28avcbe.Xqedii_beguow7h551q("ssRtOF0CEebDilj8wClYE3lOIvKhRXOGV0T+b3TM3XYfeJb7DIW3tNm0"),
            Xqedii_28avcbe.Xqedii_beguow7h551q("Z7zJf9UvB6Yoz54Z5QPIoxZHeSSXhB37MVFYJoLusdkaVZDdGWWHwAF1WIez+2c2y+tuRMAxgICcQ2UIEHS/IOhqoAWVHh9t3Ha+Zi3L")
         );
         Xqedii_2dpr802 = List.of(var10000);
         Xqedii_1fxcb09 = Map.of(
            Xqedii_28avcbe.Xqedii_beguow7h551q("JTuBq+yXSlPcECU1B26EmlA7qdH/lxL/n2QuYwxfADBQmSbe"),
            Xqedii_28avcbe.Xqedii_beguow7h551q("ETt/29phGKkdBH2aARdrU1CsM2dlFNzpy5rkz2kVHzVEAYeILWKJgqXzi7pRVVknrA56oL0gFZq7dRIY6D/wHN4FQpuggiiNk6k="),
            Xqedii_28avcbe.Xqedii_beguow7h551q("5O81hRIeEhZ3B2zlCvxNQ8RRqeaVCClA+0T6navMsdimixMCd1LM7Q=="),
            Xqedii_28avcbe.Xqedii_beguow7h551q("fEjCuZJgf+rJqMv6Eczg2ui2g9Wn5z2JikIZiYuZLcPmgkqJt6TDOuI8jrkq6/htHSnnfFVr6IxZDAEkd8DG4N/gXq2eRxsl7FXueK2N"),
            Xqedii_28avcbe.Xqedii_beguow7h551q("OB8+Oz/6GJpeTFrh+6/8QLgjOwIZsY5l3neQHJW0SV2iWVMj"),
            Xqedii_28avcbe.Xqedii_beguow7h551q("ctg6rK/3Wu1UF5eHjPUgKUp5+5/WP5yuOX6JsjDqsbO0EUdZ8fJzwxSC/+qR6aw5NTTDGwVYstM+/13ig/AmOJUm7pDqiQHk50Q="),
            Xqedii_28avcbe.Xqedii_beguow7h551q("uROzzpqFPAQ2bK/5vRvMAqmkWEl34sXe2W1BTnem7HCcu0kGgzx8nQ=="),
            Xqedii_28avcbe.Xqedii_beguow7h551q("7PFJWiIJFSf2YA5Cwjd/mYC9Uu2pqesmSgGCr4SHQ5qrHN1Ere65U/ju2VTR3uG4YrjLVga+vNLP59DqT/sq9cxW3pVBKwL0+GvVHIgf"),
            Xqedii_28avcbe.Xqedii_beguow7h551q("BgpkuGB6zGN21bNjd2sthO5iu3MsbARG0xsSFVloTeCabP4yPTY="),
            Xqedii_28avcbe.Xqedii_beguow7h551q("hmtxG/J1bbVHjXDPCP2c1pTI+ByWRaM/QCez9td9pVtXZm5dsN1grAK3RDE5/czEBAK/qfpds1YDl04EbHLjMIY9FDa0Ed2L4D5Ziw==")
         );
         Xqedii_1df0pdx = MiniMessage.miniMessage();
         Xqedii_1gc2hbe = LegacyComponentSerializer.legacyAmpersand();
         Xqedii_299zx1x = Xqedii_28avcbe.Xqedii_1h3g4w5nnxl59(-359018863, 21);
         Xqedii_32orhhd = Float.intBitsToFloat(Xqedii_28avcbe.Xqedii_14m2j5952uvg6(-352359896, 21));
      }
   }
}
