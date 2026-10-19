/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.configuration.ConfigurationSection
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 *  org.bukkit.entity.TextDisplay.TextAlignment
 *  org.bukkit.plugin.Plugin
 */
package dev.xqedii.ultimateUI.service.gui.editor.shell.managers;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_2w5y601;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.Xqedii_3c6skvl;
import dev.xqedii.ultimateUI.Xqedii_ml97w4s;
import dev.xqedii.ultimateUI.gui.model.HoverElement;
import dev.xqedii.ultimateUI.gui.parser.TemplateListLayout;
import dev.xqedii.ultimateUI.gui.parser.TemplateScroll;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.editor.shell.managers.EditorNavbarHistoryPart;
import dev.xqedii.ultimateUI.service.gui.model.EditorRect;
import dev.xqedii.ultimateUI.service.gui.model.EditorSession;
import dev.xqedii.ultimateUI.service.gui.model.EditorSidebarTab;
import dev.xqedii.ultimateUI.service.gui.model.EditorTool;
import dev.xqedii.ultimateUI.service.gui.model.RoundedBox;
import dev.xqedii.ultimateUI.service.gui.model.RoundedCornerGlyphs;
import dev.xqedii.ultimateUI.service.gui.model.RoundedCornerOffsets;
import dev.xqedii.ultimateUI.service.gui.model.RoundedTransform;
import dev.xqedii.ultimateUI.service.hud.HudPositionCalculator;
import dev.xqedii.ultimateUI.service.hud.HudService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.TextDisplay;
import org.bukkit.plugin.Plugin;

public abstract class EditorLayersLayerPart
extends EditorNavbarHistoryPart {
    public static final String Xqedii_7p3bhx5vjy7j = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
    public static final String Xqedii_3534rb4;
    public static final String Xqedii_2g2kudi;
    public static final String Xqedii_sx8qi7k;
    public static final String Xqedii_22lfpk5;
    public static final String Xqedii_djjcrxq;
    public static final String Xqedii_6ocnopa;
    public static final String Xqedii_9dvkcqb;
    public static final String Xqedii_3nbrgrn;
    public static final String Xqedii_nez9tlj;
    public static final String Xqedii_1mmdcu5;
    public static final String Xqedii_2w80w9l;
    public static final String Xqedii_203ai1h;
    public static final String Xqedii_1d3ogoj;
    public static final String Xqedii_15akt8o;
    public static final String Xqedii_x0eixjl;
    public static final String Xqedii_2i0chcr;
    public static final String Xqedii_1dodf2o;
    public static final String Xqedii_8xjdj85;
    public static final String Xqedii_1ubnhpl;
    public static final String Xqedii_8eidili;

    public EditorLayersLayerPart(UltimateUI ultimateUI, HudService hudService, CameraService cameraService) {
        super(ultimateUI, hudService, cameraService);
    }

    public abstract ConfigurationSection findShellBlockSection(EditorSession var1, String var2);

    public boolean isInsideSidebarLayersHitbox(EditorSession editorSession, double d, double d2) {
        if ((0x8562F0EB ^ 0x8562F0EB) != 0) {
            throw new IllegalStateException();
        }
        return (this.isInsideShellBlock(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BzG2v+GJIzubnUmrrG2s3OmsvIIPoSkwhSeDCMzTI1ZJJMO0uMzBz/hgejvbRmeMcApijVeo"), d, d2) || this.isInsideShellBlock(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("9aaGomvQrliu/giiWirPCQqUpH3kmb4BPS/M6cAlTNmbRSd68WI/jUV4zN8CqbD6xY3JhA=="), d, d2) ? Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 8) : Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 4)) != 0;
    }

    public boolean hasLegacySidebarUi(EditorSession editorSession) {
        if ((-647227269 * -647227269 + -647227269 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 31) != 0;
        }
        return (this.findShellBlockSection(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("khzTO8nWrzsUvfWhQKChGFI6+qSbsuERnzVguXFnmOLlOQjGgcr9UdbJO5vV6LAAfFdzOQ==")) != null || this.findShellBlockSection(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("u0AArnE5fUxL6HZqzE9sqXMSAUmElj72tMV/l2AHDrnIBemsMD9eil/WEqhndYjYXrtYlLFN")) != null || this.findShellBlockSection(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Iqn6F4U951QPY5bxZAZyOm+nskUDcKSHxKSc9r/NWmh3JiZnhfCxKyan536/npAVtA42N6gQfHcXEIi3eA8=")) != null || this.findShellBlockSection(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Ndu97I+3+3ClNDU+0RNoBcymM/qCqFlFg8ouOLZIkj6D/GFl/hnx1US8Qy3+qTzON3HUHKQw")) != null || this.findShellBlockSection(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BzG2v+GJIzubnUmrrG2s3OmsvIIPoSkwhSeDCMzTI1ZJJMO0uMzBz/hgejvbRmeMcApijVeo")) != null || this.findShellBlockSection(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("9aaGomvQrliu/giiWirPCQqUpH3kmb4BPS/M6cAlTNmbRSd68WI/jUV4zN8CqbD6xY3JhA==")) != null || this.findShellBlockSection(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("pBe0fH9jRlt14hEKb7o3jPKF7K4F0wxfJZ5U1l9X0eYRTUhrn8YyyhnLcOsqSAlr")) != null || this.findShellBlockSection(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BSW39i5HcmjGkLsn4Fpc9uQqk9NqhhfH7wZTG8LWna0xBswCSapn2HbfmdUlHIqr")) != null || this.findShellBlockSection(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ngWIh131+joMJkENfc41ZGEwW0XJohdP9esCqIb/J7Y8l4ueljoCS2Ca7RgYpJCr")) != null || this.findShellBlockSection(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("f41iRBL852VxQebZT0arSA90OxpSRn6oQ8UZhsi+VVbHPLnYqlPgxgsrJJfQ1niE")) != null || this.findShellBlockSection(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("gyHMTmjF3KsOTRVYuZdxQMWK4eCDKBfYT6PEVohX6OO8SQXF68ahxk8OTh2bcqTD")) != null || this.findShellBlockSection(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("TijH8tTbYpo0BKBEZBBJkM83CDvBfWQFjNzGi3hA9LSLcBJcFE0EBmF+NWGJWZfl")) != null || this.findShellBlockSection(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("rQl03oQU3Nv6lq9RWzfS4sw2xWyJmfuYcC6vlt7fRfilsa2kYBLptCDapydaDMrkxes56LshQVgs/tpD")) != null ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127277, 0) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(961010650, 9)) != 0;
    }

    public String resolveTimelineContextRowByHit(EditorSession editorSession, double d, double d2) {
        if (((0x7211CC3E | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        }
        double d3 = editorSession.shellHitX(d);
        double d4 = editorSession.shellHitY(d2);
        if (this.isInsideShellBlock(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("UwuN0md6gDRpIcBKbM/GAHUAS0ztY6n6Fd9m5dmEy26zM+FEigAEvwZ8xyvok0IBrbTIQnOBXQU+mE/bWhlVD2BDiMikgy6B"), d, d2) || this.isInsideShellBlock(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("UwuN0md6gDRpIcBKbM/GAHUAS0ztY6n6Fd9m5dmEy26zM+FEigAEvwZ8xyvok0IBrbTIQnOBXQU+mE/bWhlVD2BDiMikgy6B"), d3, d4)) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("lYcijUIQvBKnTwxqXAzKodRol4fIvdDKsc3uXWBjtCETHTv76R9LLdjpy88=");
        }
        if (this.isInsideShellBlock(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("iNyrUHh6rWcqc5+XdAeMMsCxur7Qx7+HV7kXEv5I8DfZFUpNbdcQ53/kmgkOIk9mOXXTVdhWLyFXITwuCeCPaJWUKl82M/UD"), d, d2) || this.isInsideShellBlock(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("iNyrUHh6rWcqc5+XdAeMMsCxur7Qx7+HV7kXEv5I8DfZFUpNbdcQ53/kmgkOIk9mOXXTVdhWLyFXITwuCeCPaJWUKl82M/UD"), d3, d4)) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("kthcyCj3J5mqECxMGan/Jvq0Ca8Qybu8s0wLZak3WKJpQMK6IMpAVFkT+NU=");
        }
        if (this.isInsideShellBlock(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("T0JDM+l6aOBMwQP1b5/m+ymR2oC7tUROo0C89LexIK3b31HDwPt+KZYDgNLrLWtVAQ0wslSdWRlaEcTl380Oxqey"), d, d2) || this.isInsideShellBlock(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("T0JDM+l6aOBMwQP1b5/m+ymR2oC7tUROo0C89LexIK3b31HDwPt+KZYDgNLrLWtVAQ0wslSdWRlaEcTl380Oxqey"), d3, d4)) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("52H0KSqG/HRN1lJETtE2t6SxyrMSioBMoYA9d1F9ckf2xfALm3E=");
        }
        if (this.isInsideShellBlock(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("9s9zEHrgOHZgPMj5IAde+q8bon4fhG+ZBFRnCcaUGRI031NKmzSRURk+HTuwTf6kTQ2YXMwdOKCxOnfjg4uhVA=="), d, d2) || this.isInsideShellBlock(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("9s9zEHrgOHZgPMj5IAde+q8bon4fhG+ZBFRnCcaUGRI031NKmzSRURk+HTuwTf6kTQ2YXMwdOKCxOnfjg4uhVA=="), d3, d4)) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("FVyc1uCzSTxyFFzafsZc6dyndixg41vIgCHrtbNDk2tywoiLFpCxO1Rc");
        }
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
    }

    public String formatAnimationTimelineRowLabel(String string) {
        if ((13892297 * 13892297 - 13892297 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("lYcijUIQvBKnTwxqXAzKodRol4fIvdDKsc3uXWBjtCETHTv76R9LLdjpy88=").equals(string)) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("hsvj7q2ov/ifBSN/1N8V2ViwHn37gy+iHNp62ZohXiRZZ6BpR359poR49YU=");
        }
        if (Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("kthcyCj3J5mqECxMGan/Jvq0Ca8Qybu8s0wLZak3WKJpQMK6IMpAVFkT+NU=").equals(string)) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("zG49BvFR4DucuDaxz3JOR5t1OyPDYaJkwkeR94WAc3ftUYqXRZM9FYOJsX0=");
        }
        if (Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("52H0KSqG/HRN1lJETtE2t6SxyrMSioBMoYA9d1F9ckf2xfALm3E=").equals(string)) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("s0H1L8smGMImMnnGrOq/Of6Wvkp5KRwxnrmaw66pRf4X6rbyF84=");
        }
        if (Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("FVyc1uCzSTxyFFzafsZc6dyndixg41vIgCHrtbNDk2tywoiLFpCxO1Rc").equals(string)) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("8AA0WYgjTFEacsKrVU5EtfBvJMH7iDhWTMqqRW+xEH4Sdb2qrhBTsi0H");
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(768385452, 30)];
        stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)3)] = string;
        return this.firstNonBlank(stringArray);
    }

    public String formatTimelineKeyframeValue(String string, Object object) {
        if ((1173822464 * (1173822464 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (object == null) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("rgYEOOykXzvOW6bwBhyUcPNlpxEmvaxL2E2SZspz4a7N6sVI");
        }
        if (object instanceof Number) {
            Number number = (Number)object;
            return this.formatAnimationTimelineNumber(number.doubleValue());
        }
        if (object instanceof Map) {
            double d;
            double d2;
            Map map;
            Map map2 = map = (Map)object;
            if (Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("kthcyCj3J5mqECxMGan/Jvq0Ca8Qybu8s0wLZak3WKJpQMK6IMpAVFkT+NU=").equals(string)) {
                d2 = this.parseDouble(map2.get(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("hQDIczWQOugPl0NYFOCS9ZL5LskFVXO49JX0gCP4")), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(783840806342437465L, 20)));
                d = this.parseDouble(map2.get(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BaJvLxDLpZjGuPlcv+UoERQ4OvjKf3ixBOKZbis8")), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282639521878969L, 18)));
                if (Double.isFinite(d2) && Double.isFinite(d)) {
                    return EditorLayersLayerPart.Xqedii_2z9dcb0g52nag(this.formatAnimationTimelineNumber(d2), this.formatAnimationTimelineNumber(d));
                }
            }
            if (Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("52H0KSqG/HRN1lJETtE2t6SxyrMSioBMoYA9d1F9ckf2xfALm3E=").equals(string)) {
                d2 = this.parseDouble(map2.get(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("hQDIczWQOugPl0NYFOCS9ZL5LskFVXO49JX0gCP4")), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5484931870321067209L, 55)));
                d = this.parseDouble(map2.get(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BaJvLxDLpZjGuPlcv+UoERQ4OvjKf3ixBOKZbis8")), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-8291539072483160039L, 20)));
                double d3 = this.parseDouble(map2.get(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("LD1FfCdlknnw4eOF5c9W6n25OnNA/uZqF6Q2cwXy+GeNehrM4Go=")), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282639521944489L, 17)));
                double d4 = this.parseDouble(map2.get(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("gOuqfVGert7OymRue3ngMuPYEkAt4QwiKCVL9OT4tU16t4Rp22AZOw==")), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941870784562249L, 20)));
                if (Double.isFinite(d3) && Double.isFinite(d4)) {
                    if (Double.isFinite(d2) && Double.isFinite(d)) {
                        return EditorLayersLayerPart.Xqedii_rx511l1lfg6y(this.formatAnimationTimelineNumber(d2), this.formatAnimationTimelineNumber(d), this.formatAnimationTimelineNumber(d3), this.formatAnimationTimelineNumber(d4));
                    }
                    return EditorLayersLayerPart.Xqedii_hzhzgx534dme(this.formatAnimationTimelineNumber(d3), this.formatAnimationTimelineNumber(d4));
                }
            }
        }
        return String.valueOf(object);
    }

    public String formatAnimationTimelineNumber(double d) {
        int n;
        if ((0xD4DDD2A0 ^ 0xD4DDD2A0) != 0) {
            throw new IllegalStateException();
        }
        if (!Double.isFinite(d)) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("DVdnCVcDJLWf56knNgKWSRb+MfzHcbg6P74/8BjE");
        }
        Object[] objectArray = new Object[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 29)];
        objectArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)2)] = d;
        String string = String.format(Locale.ROOT, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("e71a736JJczmmIV1i4bGWkA17Or4s8uahBqR68HXWSI0UPGh"), objectArray);
        for (n = string.length(); n > 0 && string.charAt(n - Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1615134948, 31)) == Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374718829, 6); --n) {
        }
        if (n > 0 && string.charAt(n - Xqedii_3c6skvl.Xqedii_et1f9vygj64d(29933706, 16)) == Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-2114944849, 28)) {
            --n;
        }
        if (n <= 0) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("DVdnCVcDJLWf56knNgKWSRb+MfzHcbg6P74/8BjE");
        }
        return string.substring(Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 11), n);
    }

    public abstract void applyBoundsToTarget(EditorSession var1, String var2, EditorRect var3);

    public abstract void clearEditorOverlaysOnly(Player var1, EditorSession var2);

    public abstract void setActiveEditorTool(Player var1, EditorSession var2, EditorTool var3);

    public abstract HoverElement findFirstByTargetId(EditorSession var1, String var2);

    public abstract List<HoverElement> findTargetElements(EditorSession var1, String var2);

    public abstract List<String> getSelectedTargetIds(EditorSession var1);

    public abstract EditorRect getTargetBounds(EditorSession var1, String var2);

    public abstract boolean isSelectedTarget(EditorSession var1, String var2);

    public abstract void normalizeSelectionState(EditorSession var1);

    public abstract void renderSelectionOverlay(Player var1, EditorSession var2);

    public abstract void refreshSelectionOutlineColorOnly(Player var1, EditorSession var2);

    public abstract void rerenderEditableContent(Player var1, EditorSession var2);

    public abstract void rerenderEditableSelection(Player var1, EditorSession var2);

    public abstract boolean sameRect(EditorRect var1, EditorRect var2);

    public abstract void showSelectionOverlay(Player var1, EditorSession var2);

    public abstract String targetIdOf(HoverElement var1);

    public abstract void translateSelectionOutline(Player var1, EditorSession var2, double var3, double var5);

    public abstract void translateTargetElements(Player var1, EditorSession var2, String var3, double var4, double var6);

    public abstract void updateHoveredHighlight(Player var1, EditorSession var2, String var3, String var4);

    public abstract boolean hasMapPath(Map<String, Object> var1, String var2);

    public abstract double readMapPathDouble(Map<String, Object> var1, String var2, double var3);

    public abstract Object readMapPathValue(Map<String, Object> var1, String var2);

    public abstract String toSidebarTypeLabel(String var1);

    public abstract Map<String, Object> resolveRawTargetByTargetId(EditorSession var1, String var2);

    public abstract String readTargetCustomName(EditorSession var1, String var2);

    public abstract String findTargetIdByPath(EditorSession var1, String var2);

    public abstract double readTargetLayer(EditorSession var1, String var2);

    public abstract String resolveTimelineHierarchyTargetPath(EditorSession var1, String var2);

    @Override
    public abstract EditorRect findShellBlockRect(EditorSession var1, String var2);

    public abstract void ensureShellBlockCache(EditorSession var1);

    public abstract void moveShellElement(Player var1, EditorSession var2, String var3, double var4, double var6, double var8, double var10);

    @Override
    public abstract void setShellText(Player var1, String var2, String var3);

    public abstract void cacheShellTextForDeferredSpawn(EditorSession var1, String var2, String var3);

    @Override
    public abstract void setShellColor(Player var1, EditorSession var2, String var3, String var4);

    public abstract void setShellOpacity(Player var1, String var2, int var3);

    public abstract void applyShellOpacityNow(Player var1, String var2, int var3);

    public abstract void setHudOpacityIfExists(Player var1, String var2, int var3);

    public abstract int getShellOpacity(Player var1, EditorSession var2, String var3, int var4);

    @Override
    public abstract void beginShellOpacityBatch(EditorSession var1);

    @Override
    public abstract void endShellOpacityBatch(Player var1, EditorSession var2);

    @Override
    public abstract void setSidebarPanelVisible(Player var1, EditorSession var2, String var3, boolean var4);

    public abstract boolean setSidebarPanelVisibleTracked(Player var1, EditorSession var2, String var3, boolean var4);

    public abstract void spawnShellPanelHud(Player var1, EditorSession var2, ConfigurationSection var3, String var4);

    public abstract void clearShellElementHud(Player var1, EditorSession var2, String var3);

    public abstract boolean isShellPanelSpawned(Player var1, EditorSession var2, ConfigurationSection var3, String var4);

    public abstract boolean isShellElementHudPresent(Player var1, String var2);

    @Override
    public abstract boolean isInsideShellBlock(EditorSession var1, String var2, double var3, double var5);

    public abstract boolean belongsToSidebarPanel(String var1, String var2);

    public abstract void updateEditorPropertiesSidebar(Player var1, EditorSession var2);

    public abstract void updateEditorKeyframeSidebar(Player var1, EditorSession var2);

    public abstract String stringValue(Object var1);

    public double clampLayersScrollValue(double d, int n) {
        if (((0xD79C859B | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (!Double.isFinite(d)) {
            return Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-1374066612943878626L, 53));
        }
        return Math.max(Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282639521999961L, 25)), Math.min((double)n, d));
    }

    public void armLayersReorderDrag(EditorSession editorSession, String string, double d, double d2) {
        if ((0xFD9E7097 ^ 0xFD9E7097) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            this.clearLayersReorderArm(editorSession);
            return;
        }
        editorSession.layersReorderArmedTargetId = string;
        editorSession.layersReorderArmedStartHitX = d;
        editorSession.layersReorderArmedStartHitY = d2;
        editorSession.layersReorderLastHitX = d;
        editorSession.layersReorderLastHitY = d2;
    }

    public void clearLayersReorderArm(EditorSession editorSession) {
        if (((721372769 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return;
        }
        editorSession.layersReorderArmedTargetId = null;
        editorSession.layersReorderArmedStartHitX = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-7894901716342638780L, 43));
        editorSession.layersReorderArmedStartHitY = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282639521999961L, 9));
    }

    public boolean isLayersReorderArmed(EditorSession editorSession) {
        if (((-105082935 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        return (editorSession != null && editorSession.layersReorderArmedTargetId != null && !editorSession.layersReorderArmedTargetId.isBlank() ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1615134948, 31) : Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 24)) != 0;
    }

    public boolean isLayersReorderActive(EditorSession editorSession) {
        if ((0xFC0FF7F4 ^ 0xFC0FF7F4) != 0) {
            throw new IllegalStateException();
        }
        return (editorSession != null && editorSession.layersReorderActive && editorSession.layersReorderTargetId != null && !editorSession.layersReorderTargetId.isBlank() ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(119734824, 18) : Xqedii_3c6skvl.Xqedii_et1f9vygj64d(289421560, 5)) != 0;
    }

    public void stopLayersReorderAutoScroll(EditorSession editorSession) {
        if (((0x64B4D429 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return;
        }
        editorSession.layersReorderAutoScrollToken += Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 29);
        editorSession.layersReorderAutoScrollDirection = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-606455481, 25);
    }

    public boolean isLayersLeftHeld(EditorSession editorSession) {
        if ((1091778142 * 1091778142 - 1091778142 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1550549571, 5) != 0;
        }
        return ((long)Xqedii_38o2zes.Xqedii_316oplq() - editorSession.lastLeftClickTick <= Xqedii_3c6skvl.Xqedii_4d486dpawhek(-682167451446144089L, 56) ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-463452928, 23) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1205590585, 17)) != 0;
    }

    public boolean isTargetVisible(EditorSession editorSession, String string) {
        if (((-502593973 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 25) != 0;
        }
        if (editorSession.hiddenLayerTargetIds.contains(string)) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 0) != 0;
        }
        String string2 = string;
        do {
            int n;
            if ((n = string2.lastIndexOf(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("G8mKIUt+DzkpcH2FMVVZlOkjTasVGxiyOL+eYyQbl1kzINOptQzxmY4bIPU4f6Nh"))) < 0) {
                return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(478939296, 20) != 0;
            }
            if (!(string2 = string2.substring(Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 13), n)).isBlank()) continue;
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-320004957, 24) != 0;
        } while (!editorSession.hiddenLayerTargetIds.contains(string2));
        return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 30) != 0;
    }

    public boolean isTargetLocked(EditorSession editorSession, String string) {
        if ((0xAFD70228 ^ 0xAFD70228) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 7) != 0;
        }
        return editorSession.lockedLayerTargetIds.contains(string);
    }

    public boolean isTargetInteractable(EditorSession editorSession, String string) {
        if ((1887393742 * 1887393742 + 1887393742 & 1) != 0) {
            throw new IllegalStateException();
        }
        return (this.isTargetVisible(editorSession, string) && !this.isTargetLocked(editorSession, string) ? Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 28) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1907230986, 7)) != 0;
    }

    public String resolveElementId(Map<String, Object> map, int n, Map<String, Integer> map2) {
        Integer n2;
        String string;
        if ((0x66B8EBB2 ^ 0x66B8EBB2) != 0) {
            throw new IllegalStateException();
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-80001240, 22)];
        stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)-1544688356, (int)16)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("AaHXdqbWDhzhLapsbjURRzzN6FCuVQPo1semSMbdG6g=")));
        String string2 = this.firstNonBlank(stringArray);
        if (string2.isBlank()) {
            String[] stringArray2 = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1979594560, 8)];
            stringArray2[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)-532348701, (int)31)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("T7JZpZT/5DbcTHdyWAvQqXit5DOTw6tMBF+DnI8LWibLiyQR24b54br5sRghXHm1J36Fgux8W2RX99wlvNa+Uaps")));
            string = this.firstNonBlank(stringArray2);
            if (!string.isBlank()) {
                string2 = EditorLayersLayerPart.Xqedii_1m1w18r3go983(this.sanitizeGeneratedRuntimeId(string));
            }
        }
        if ((n2 = map2.get(string = string2.isBlank() ? EditorLayersLayerPart.Xqedii_3f7ar4ewlk0vf(n) : string2)) == null) {
            map2.put(string, Xqedii_3c6skvl.Xqedii_306hip527e6uo(1843175852, 20));
            return string;
        }
        int n3 = n2 + Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127148, 7);
        map2.put(string, n3);
        return EditorLayersLayerPart.Xqedii_2mum1ayvoy3jo(string, n3);
    }

    @Override
    public String sanitizeGeneratedRuntimeId(String string) {
        if (((0xF8D70044 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (string == null || string.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        }
        StringBuilder stringBuilder = new StringBuilder(string.length() + Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1759846191, 3));
        char[] cArray = string.toCharArray();
        int n = cArray.length;
        for (int i = Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-2140016606, 14); i < n; ++i) {
            char c = cArray[i];
            if (Character.isLetterOrDigit(c) || c == Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374843053, 11) || c == Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-451016856, 11)) {
                stringBuilder.append(c);
                continue;
            }
            if (stringBuilder.length() != 0 && stringBuilder.charAt(stringBuilder.length() - Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127244, 5)) == Xqedii_3c6skvl.Xqedii_306hip527e6uo(852271532, 24)) continue;
            stringBuilder.append((char)Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1550551459, 5));
        }
        while (stringBuilder.length() > 0 && stringBuilder.charAt(stringBuilder.length() - Xqedii_3c6skvl.Xqedii_306hip527e6uo(1305256364, 29)) == Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1078253585, 13)) {
            stringBuilder.setLength(stringBuilder.length() - Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127278, 1));
        }
        return stringBuilder.toString();
    }

    public String formatLayerRuntimeNameForRow(LayerTreeRow layerTreeRow, String string) {
        String string2;
        if ((-862448163 * -862448163 + -862448163 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (layerTreeRow == null || layerTreeRow.entry == null) {
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716073, 2)];
            stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)16)] = string;
            stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)1915757184, (int)22)] = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("UaLDVC/sQReto2FXxCJvz8xzY3rCLMQ+eV/cX92pdWpGLMUvrXo=");
            string2 = this.firstNonBlank(stringArray);
        } else {
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716589, 8)];
            stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)1077475345, (int)13)] = layerTreeRow.entry.displayName;
            stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1875681708, (int)25)] = string;
            stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)961011674, (int)9)] = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("UaLDVC/sQReto2FXxCJvz8xzY3rCLMQ+eV/cX92pdWpGLMUvrXo=");
            string2 = this.firstNonBlank(stringArray);
        }
        String string3 = string2;
        int n = layerTreeRow == null || layerTreeRow.entry == null ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 14) : this.resolveLayerTargetDepth(layerTreeRow.entry.targetId);
        return this.truncateLayerDisplayNameForDepth(string3, n);
    }

    public String truncateLayerDisplayNameForDepth(String string, int n) {
        if ((-1748457204 * -1748457204 - -1748457204 & 1) != 0) {
            throw new IllegalStateException();
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1979594304, 8)];
        stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)24)] = string;
        stringArray[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)1374716077, (int)0)] = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("UaLDVC/sQReto2FXxCJvz8xzY3rCLMQ+eV/cX92pdWpGLMUvrXo=");
        String string2 = this.firstNonBlank(stringArray);
        int n2 = Math.max(Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 13), n);
        int n3 = Math.max(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842143660, 12), Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-541822321, 26) - n2 * Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-893351423, 24));
        if (string2.length() <= n3) {
            return string2;
        }
        return EditorLayersLayerPart.Xqedii_2cogteqkjf5hd(string2.substring(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 12), n3));
    }

    public int resolveLayerTargetDepth(String string) {
        int n;
        if ((-672232461 * -672232461 - -672232461 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (string == null || string.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 19);
        }
        int n2 = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1193868155, 6);
        int n3 = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-303227741, 24);
        String string2 = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("G8mKIUt+DzkpcH2FMVVZlOkjTasVGxiyOL+eYyQbl1kzINOptQzxmY4bIPU4f6Nh");
        while ((n = string.indexOf(string2, n3)) >= 0) {
            ++n2;
            n3 = n + string2.length();
        }
        return n2;
    }

    public String layerRuntimeLogicalId(String string) {
        if ((0xC23E0480 ^ 0xC23E0480) != 0) {
            throw new IllegalStateException();
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-640009913, 25)];
        stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)25)] = string;
        String string2 = this.firstNonBlank(stringArray);
        if (string2.startsWith(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("puKrpuHayAgMnKvxUAn7zTJNLQnrkqeBbIBG3Ofrvfsz6RTWjZrzPEi5nmLY9w3uAqNi85di3VvJzQ=="))) {
            return string2;
        }
        return EditorLayersLayerPart.Xqedii_1sygibrbjuxd4(string2);
    }

    public String layerRuntimeRowBaseId(int n) {
        if ((767653395 * (767653395 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        return EditorLayersLayerPart.Xqedii_a03cz5pl8xzz(Math.max(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 9), n));
    }

    public String layerRuntimeRowId(int n) {
        if (((1457870343 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        return EditorLayersLayerPart.Xqedii_2n693ccuvgv0a(this.layerRuntimeRowBaseId(n));
    }

    public String layerRuntimeRowNameId(int n) {
        if ((-1451142312 * -1451142312 + -1451142312 & 1) != 0) {
            throw new IllegalStateException();
        }
        return EditorLayersLayerPart.Xqedii_32d6pnn0a45yj(this.layerRuntimeRowBaseId(n));
    }

    public String layerRuntimeRowDropdownHitboxId(int n) {
        if ((0x72A16601 ^ 0x72A16601) != 0) {
            throw new IllegalStateException();
        }
        return EditorLayersLayerPart.Xqedii_3jbpk6eegvx9j(this.layerRuntimeRowBaseId(n));
    }

    public String layerSlotBaseId(int n) {
        if (((1704171411 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        return EditorLayersLayerPart.Xqedii_23kt8glf8jnfs(n);
    }

    public String layerSlotId(int n) {
        if (((0x2222DE5B | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        return EditorLayersLayerPart.Xqedii_3nml3ilqpwdk5(this.layerSlotBaseId(n));
    }

    public String layerOpacityId(int n) {
        if ((1543636675 * 1543636675 + 1543636675 & 1) != 0) {
            throw new IllegalStateException();
        }
        return EditorLayersLayerPart.Xqedii_3sk9zj3w5eg5e(this.layerSlotBaseId(n));
    }

    public String layerOpacityHitboxId(int n) {
        if ((-1095676168 * -1095676168 + -1095676168 & 1) != 0) {
            throw new IllegalStateException();
        }
        return EditorLayersLayerPart.Xqedii_15ejq3gam5895(this.layerSlotBaseId(n));
    }

    public String layerNameId(int n) {
        if ((0x40AF98CD ^ 0x40AF98CD) != 0) {
            throw new IllegalStateException();
        }
        return EditorLayersLayerPart.Xqedii_1s2zykskaydju(this.layerSlotBaseId(n));
    }

    public String layerDropdownHitboxId(int n) {
        if ((2054313438 * 2054313438 - 2054313438 & 1) != 0) {
            throw new IllegalStateException();
        }
        return EditorLayersLayerPart.Xqedii_3tyanatwqhnhc(this.layerSlotBaseId(n));
    }

    public Map<String, Object> moveRawTargetToParent(EditorSession editorSession, String string, String string2) {
        List list;
        Object object;
        List<Map<String, Object>> list2;
        double[] dArray;
        if ((578290731 * 578290731 + 578290731 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || editorSession.rawBlocks == null || string == null || string.isBlank()) {
            return null;
        }
        Map<String, Object> map = null;
        if (string2 != null && !string2.isBlank() && (map = this.resolveRawMapAtPath(editorSession.rawBlocks, string2)) == null) {
            return null;
        }
        Map<String, Object> map2 = this.resolveRawMapAtPath(editorSession.rawBlocks, string);
        if (map2 == null) {
            return null;
        }
        double[] dArray2 = this.resolveRawTargetAbsolutePosition(editorSession, string, map2);
        if (string2 == null || string2.isBlank()) {
            double[] dArray3 = new double[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(36177703, 2)];
            dArray3[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)289421560, (int)5)] = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(4293457140139526075L, 59));
            dArray = dArray3;
            dArray3[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)1374716077, (int)29)] = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941870784038089L, 33));
        } else {
            dArray = this.resolveRawTargetAbsolutePosition(editorSession, string2, map);
        }
        double[] dArray4 = dArray;
        String[] stringArray = string.split(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("X1vv9ErcJjBVZiLsJsr8HDTQxfHrNZhzWj+gmudpU2w="));
        if (stringArray.length == 0) {
            return null;
        }
        Object current = editorSession.rawBlocks;
        for (int i = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1054790090, 20); i < stringArray.length - Xqedii_3c6skvl.Xqedii_et1f9vygj64d(671556354, 10); ++i) {
            String string3 = stringArray[i];
            if (current instanceof List) {
                List list2_ = (List) current;
                int n_ = this.parsePathIndex(string3);
                if (n_ < 0 || n_ >= list2_.size()) {
                    return null;
                }
                current = list2_.get(n_);
                continue;
            }
            if (current instanceof Map) {
                Map map2_ = (Map) current;
                current = map2_.get(string3);
                continue;
            }
            return null;
        }
        if (!(current instanceof List)) {
            return null;
        }
        List list4 = (List) current;
        int n_idx = this.parsePathIndex(stringArray[stringArray.length - Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 27)]);
        if (n_idx < 0 || n_idx >= list4.size()) {
            return null;
        }
        List list2_rem = list4;
        Object map3_obj = list2_rem.remove(n_idx);
        if (!(map3_obj instanceof Map)) {
            list2_rem.add(Math.max(Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 28), Math.min(list2_rem.size(), n_idx)), map3_obj);
            return null;
        }
        Map<String, Object> map4 = (Map<String, Object>) map3_obj;
        List list_target;
        if (string2 == null || string2.isBlank()) {
            list_target = editorSession.rawBlocks;
        } else {
            if (map == null) {
                list2_rem.add(Math.max(Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1113353091, 29), Math.min(list2_rem.size(), n_idx)), map4);
                return null;
            }
            Object obj_children = map.get(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("SL5OQIcJDVNkOGR2Km60QVp4TewrB2oikAY/p9QOgXV99z+cYBOYqMExkLs="));
            if (obj_children instanceof List) {
                list_target = (List) obj_children;
            } else {
                list_target = new ArrayList<Map<String, Object>>();
                map.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("SL5OQIcJDVNkOGR2Km60QVp4TewrB2oikAY/p9QOgXV99z+cYBOYqMExkLs="), list_target);
            }
        }
        list_target.add(map4);
        double d = dArray2[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(238945360, 19)] - dArray4[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-532348701, 31)];
        double d2 = dArray2[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842119084, 13)] - dArray4[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842131372, 12)];
        this.setRawTargetLocalPosition(map4, d, d2);
        return map4;
    }

    public double[] resolveRawTargetAbsolutePosition(EditorSession editorSession, String string, Map<String, Object> map) {
        String string2;
        int n;
        if ((853944428 * 853944428 + 853944428 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            double[] dArray = new double[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1803682397, 13)];
            dArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)-901849391, (int)12)] = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-5940056541117323406L, 8));
            dArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)-633780263, (int)1)] = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(9035837573552546963L, 54));
            return dArray;
        }
        double d = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-750137853208915379L, 56));
        double d2 = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-2477601335831678781L, 50));
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(478939296, 20)];
        stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)24)] = string;
        String string3 = this.firstNonBlank(stringArray);
        double[] dArray = this.resolveLaidOutBlockPosition(editorSession, string3);
        if (dArray != null) {
            return dArray;
        }
        Map<String, Object> map2 = map;
        if (map2 == null && !string3.isBlank()) {
            map2 = this.resolveRawMapAtPath(editorSession.rawBlocks, string3);
        }
        if (map2 != null) {
            d += this.readRawTargetLocalX(map2);
            d2 += this.readRawTargetLocalY(map2);
        }
        while ((n = string3.lastIndexOf(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("G8mKIUt+DzkpcH2FMVVZlOkjTasVGxiyOL+eYyQbl1kzINOptQzxmY4bIPU4f6Nh"))) >= 0 && !(string2 = string3.substring(Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1803698781, 13), n)).isBlank()) {
            double[] dArray2;
            double[] dArray3 = this.resolveLaidOutBlockPosition(editorSession, string2);
            if (dArray3 != null) {
                d += dArray3[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1887366141, 25)];
                d2 += dArray3[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-2129394799, 1)];
                break;
            }
            Map<String, Object> map3 = this.resolveRawMapAtPath(editorSession.rawBlocks, string2);
            if (map3 != null) {
                d += this.readRawTargetLocalX(map3);
                d2 += this.readRawTargetLocalY(map3);
            }
            if ((dArray2 = this.resolveScrollContentShift(editorSession, string2)) != null) {
                d -= dArray2[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 17)];
                d2 -= dArray2[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127244, 5)];
            }
            string3 = string2;
        }
        double[] dArray4 = new double[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-39611267, 29)];
        dArray4[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)1)] = d;
        dArray4[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)1374716077, (int)21)] = d2;
        return dArray4;
    }

    public double[] resolveScrollContentShift(EditorSession editorSession, String string) {
        if (((42763826 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            return null;
        }
        Map<String, Object> map = this.resolveRawMapAtPath(editorSession.rawBlocks, string);
        if (map == null || !TemplateScroll.hasScroll(map) || TemplateListLayout.hasListLayout(map)) {
            return null;
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1843175852, 20)];
        stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)578843120, (int)6)] = this.stringValue(map.get(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("AaHXdqbWDhzhLapsbjURRzzN6FCuVQPo1semSMbdG6g=")));
        String string2 = this.firstNonBlank(stringArray).trim();
        double[] dArray = editorSession.scrollOffsets.get(string2.isBlank() ? string : string2);
        return dArray == null || dArray.length < Xqedii_3c6skvl.Xqedii_et1f9vygj64d(959975744, 21) ? null : dArray;
    }

    public double[] resolveLaidOutBlockPosition(EditorSession editorSession, String string) {
        if ((1029161911 * 1029161911 - 1029161911 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || editorSession.renderBlocks == null || string == null || string.isBlank()) {
            return null;
        }
        int n = string.lastIndexOf(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("G8mKIUt+DzkpcH2FMVVZlOkjTasVGxiyOL+eYyQbl1kzINOptQzxmY4bIPU4f6Nh"));
        if (n <= 0 || !TemplateListLayout.hasListLayout(this.resolveRawMapAtPath(editorSession.rawBlocks, string.substring(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 8), n)))) {
            return null;
        }
        for (Map<String, Object> map : editorSession.renderBlocks) {
            double[] dArray;
            if (map == null || !string.equals(String.valueOf(map.get(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("T7JZpZT/5DbcTHdyWAvQqXit5DOTw6tMBF+DnI8LWibLiyQR24b54br5sRghXHm1J36Fgux8W2RX99wlvNa+Uaps"))))) continue;
            double d = this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("QqeF71pxxTPGBSnnh8yGwISB/izKDr2mTprtXbrw3BZnZGafYt3mIuVULrmvk4RY"), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5498439370668295369L, 53)));
            double d2 = this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("AkEvr/8pc4KcO3RRtC3MZjWKc4EczVpW19dwZw39iuLqF2dG6peGmgvYKJ2VchmM"), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(5191742686005194671L, 3)));
            if (Double.isFinite(d) && Double.isFinite(d2)) {
                double[] dArray2 = new double[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127268, 2)];
                dArray2[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)-1550549571, (int)5)] = d;
                dArray = dArray2;
                dArray2[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1837932972, (int)22)] = d2;
            } else {
                dArray = null;
            }
            return dArray;
        }
        return null;
    }

    public double readRawTargetLocalX(Map<String, Object> map) {
        if ((2083769688 * (2083769688 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (map == null) {
            return Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-5496266451775514501L, 55));
        }
        return this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("QqeF71pxxTPGBSnnh8yGwISB/izKDr2mTprtXbrw3BZnZGafYt3mIuVULrmvk4RY"), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("hQDIczWQOugPl0NYFOCS9ZL5LskFVXO49JX0gCP4"), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("shfQF2QFx9lDY9pWzsGJWT8ZgZTGKXK60zIC3vhD9Idc5S572JK4tLQ7ZKk="), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("2eRjN0tWsQNAiJKxoTT9q47d3sA8bNzQaZjasP/3MqyJdI0RbwDv1ZH5dOTBknhVxd2qw8EoyCvr8aqBHic="), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(7331409615758070653L, 62))))));
    }

    public double readRawTargetLocalY(Map<String, Object> map) {
        if ((0x51029C03 ^ 0x51029C03) != 0) {
            throw new IllegalStateException();
        }
        if (map == null) {
            return Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-2748133225887757251L, 54));
        }
        return this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("AkEvr/8pc4KcO3RRtC3MZjWKc4EczVpW19dwZw39iuLqF2dG6peGmgvYKJ2VchmM"), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BaJvLxDLpZjGuPlcv+UoERQ4OvjKf3ixBOKZbis8"), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("HIaoKcIop7p/6VZEnYaX48MuOMISXu5Y8UebztlmIC4s+N5OtiZ9uKG4ln0="), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("7pGO/byANSeuyKeZYuhujL3Uvu76A0PwPmTJR2IvBBvBksemQgl5za527laVvGlbN80mngdwNeUV6O+AYyg="), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-5940056541117323406L, 8))))));
    }

    public void setRawTargetLocalPosition(Map<String, Object> map, double d, double d2) {
        if ((-675493203 * -675493203 + -675493203 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (map == null) {
            return;
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("QqeF71pxxTPGBSnnh8yGwISB/izKDr2mTprtXbrw3BZnZGafYt3mIuVULrmvk4RY")) || this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("AkEvr/8pc4KcO3RRtC3MZjWKc4EczVpW19dwZw39iuLqF2dG6peGmgvYKJ2VchmM"))) {
            this.setMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("QqeF71pxxTPGBSnnh8yGwISB/izKDr2mTprtXbrw3BZnZGafYt3mIuVULrmvk4RY"), d);
            this.setMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("AkEvr/8pc4KcO3RRtC3MZjWKc4EczVpW19dwZw39iuLqF2dG6peGmgvYKJ2VchmM"), d2);
            return;
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("hQDIczWQOugPl0NYFOCS9ZL5LskFVXO49JX0gCP4")) || this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BaJvLxDLpZjGuPlcv+UoERQ4OvjKf3ixBOKZbis8"))) {
            this.setMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("hQDIczWQOugPl0NYFOCS9ZL5LskFVXO49JX0gCP4"), d);
            this.setMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BaJvLxDLpZjGuPlcv+UoERQ4OvjKf3ixBOKZbis8"), d2);
            return;
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("shfQF2QFx9lDY9pWzsGJWT8ZgZTGKXK60zIC3vhD9Idc5S572JK4tLQ7ZKk=")) || this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("HIaoKcIop7p/6VZEnYaX48MuOMISXu5Y8UebztlmIC4s+N5OtiZ9uKG4ln0="))) {
            this.setMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("shfQF2QFx9lDY9pWzsGJWT8ZgZTGKXK60zIC3vhD9Idc5S572JK4tLQ7ZKk="), d);
            this.setMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("HIaoKcIop7p/6VZEnYaX48MuOMISXu5Y8UebztlmIC4s+N5OtiZ9uKG4ln0="), d2);
            return;
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("2eRjN0tWsQNAiJKxoTT9q47d3sA8bNzQaZjasP/3MqyJdI0RbwDv1ZH5dOTBknhVxd2qw8EoyCvr8aqBHic=")) || this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("7pGO/byANSeuyKeZYuhujL3Uvu76A0PwPmTJR2IvBBvBksemQgl5za527laVvGlbN80mngdwNeUV6O+AYyg="))) {
            this.setMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("2eRjN0tWsQNAiJKxoTT9q47d3sA8bNzQaZjasP/3MqyJdI0RbwDv1ZH5dOTBknhVxd2qw8EoyCvr8aqBHic="), d);
            this.setMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("7pGO/byANSeuyKeZYuhujL3Uvu76A0PwPmTJR2IvBBvBksemQgl5za527laVvGlbN80mngdwNeUV6O+AYyg="), d2);
            return;
        }
        if (map.containsKey(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("VngT8WdKVtYwKjSZFU4hXx2yv3qAzhugzDqTb+AyRfYHbYRlNsrdkA=="))) {
            this.setMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("shfQF2QFx9lDY9pWzsGJWT8ZgZTGKXK60zIC3vhD9Idc5S572JK4tLQ7ZKk="), d);
            this.setMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("HIaoKcIop7p/6VZEnYaX48MuOMISXu5Y8UebztlmIC4s+N5OtiZ9uKG4ln0="), d2);
            return;
        }
        this.setMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("QqeF71pxxTPGBSnnh8yGwISB/izKDr2mTprtXbrw3BZnZGafYt3mIuVULrmvk4RY"), d);
        this.setMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("AkEvr/8pc4KcO3RRtC3MZjWKc4EczVpW19dwZw39iuLqF2dG6peGmgvYKJ2VchmM"), d2);
    }

    public boolean shouldSkipLayerStaticMove(Player player, EditorSession editorSession, String string, EditorRect editorRect, boolean bl) {
        if (((0xE4FF520A | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (!bl || player == null || editorSession == null || string == null || string.isBlank() || editorRect == null) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 12) != 0;
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1915757184, 22)];
        stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)-158445066, (int)31)] = string;
        String string2 = this.firstNonBlank(stringArray).toLowerCase(Locale.ROOT);
        if (this.isLayersReorderActive(editorSession) && string2.endsWith(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("6jRZ+RkPnz6GG85WTNdQ9i1mneuq/qw5S2UOEJweAGCCL5BdRcyUwAsWV9I="))) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 5) != 0;
        }
        if (!this.isLayerStaticRuntimeId(string)) {
            return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-471841536, 23) != 0;
        }
        EditorRect editorRect2 = editorSession.shellRuntimeRects.get(string);
        if (editorRect2 == null || !this.sameRect(editorRect2, editorRect)) {
            return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-2129394801, 1) != 0;
        }
        return (this.hudService.getHud(player, EditorLayersLayerPart.Xqedii_12yg477gl8zhr(string)) != null ? Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1193868091, 6) : Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 17)) != 0;
    }

    public boolean isLayerStaticRuntimeId(String string) {
        if ((524383878 * 524383878 + 524383878 & 1) != 0) {
            throw new IllegalStateException();
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1053741514, 20)];
        stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)1193868155, (int)6)] = string;
        String string2 = this.firstNonBlank(stringArray).toLowerCase(Locale.ROOT);
        return (string2.endsWith(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("aIJXgtsGXWcdmno+idqkKHlqXlbz3iKdtSOGOZVvXFhTxFv7kJA=")) || string2.endsWith(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("IGpXrPmEZUj4kWCE9zHEbMr55Z9ug6YlXBPxhfD7hcnyc+F1NAw=")) || string2.endsWith(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BJzG4Ofg57Oy7W+F5ElGfgFAHWZ9tU80Jmxpc09Pe/bFLwQMN5oYu2JON8E=")) || string2.endsWith(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("IC+jrnq5t1T5SKD6h+oJTyMei/uRNKYvEGQu8w0CIAVaK7CGo2553VFLdWxFcWWvqxSqzE5ckDk=")) || string2.endsWith(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("gARQQvICUDNgGODhRmy7Bchyp7LTQOPIh8k4ZOp57HHwIShNot1utZOp")) ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1064697400, 0) : Xqedii_3c6skvl.Xqedii_et1f9vygj64d(578843120, 6)) != 0;
    }

    public boolean trySwapLayerTextWithoutMove(Player player, EditorSession editorSession, String string, EditorRect editorRect, boolean bl, TextDisplay.TextAlignment textAlignment, int n, String string2, int n2, double d, boolean bl2, boolean bl3) {
        if (((0x199EE893 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (!bl || player == null || editorSession == null || string == null || string.isBlank() || editorRect == null) {
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-556676546, 28) != 0;
        }
        if (!this.isLayerSwappableTextRuntimeId(string)) {
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-775274786, 4) != 0;
        }
        EditorRect editorRect2 = editorSession.shellRuntimeRects.get(string);
        if (editorRect2 == null || !this.sameRect(editorRect2, editorRect)) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 21) != 0;
        }
        String string3 = EditorLayersLayerPart.Xqedii_2e36s5grypjnl(string);
        Entity entity = this.hudService.getHud(player, string3);
        if (entity == null) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 14) != 0;
        }
        this.hudService.setTextAlignment(entity, textAlignment);
        this.hudService.setTextWrap(entity, n);
        String string4 = this.hudService.getHudText(entity, null);
        if (!this.equalsNullable(string4, string2)) {
            this.hudService.setHudText(entity, string2, null, Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-450924696, 11) != 0);
        }
        if (this.hudService.getHudOpacity(entity) != n2) {
            this.hudService.setOpacity(entity, n2);
        }
        this.hudService.setHudNoTransition(entity);
        this.applyElementTransform(entity, d, bl2, bl3);
        this.clearOutlineHud(player, string3);
        return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(36177699, 2) != 0;
    }

    public boolean isLayerSwappableTextRuntimeId(String string) {
        if ((0x68AA27E7 ^ 0x68AA27E7) != 0) {
            throw new IllegalStateException();
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1544753892, 16)];
        stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)25)] = string;
        String string2 = this.firstNonBlank(stringArray).toLowerCase(Locale.ROOT);
        if (!string2.startsWith(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("8wEbfhXmWXlgQEm6436iVC4mGO6LEiIHZIwbVu31fkQfembTM+1Iw9+NYLQY4eMctOJqRDr95LUvlPmdrZ0fJa7m2rYjOdc5Qx6gVDv9VnI=").toLowerCase(Locale.ROOT))) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 14) != 0;
        }
        return (string2.endsWith(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("fcXQ6UHzA/JyIPXhH3j2vfDJTy+l/Wc64Tv4ZWzBQvw4Njw8uEg=")) || string2.endsWith(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("7cfuvYGNRWZMicH2Im53u0ZkES2YvtdmA9A6N89CC5cn0nowNqaEF9xfrL2VuTiUfml9y8TSb/E=")) || string2.endsWith(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("aIJXgtsGXWcdmno+idqkKHlqXlbz3iKdtSOGOZVvXFhTxFv7kJA=")) || string2.endsWith(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("IGpXrPmEZUj4kWCE9zHEbMr55Z9ug6YlXBPxhfD7hcnyc+F1NAw=")) || string2.endsWith(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BJzG4Ofg57Oy7W+F5ElGfgFAHWZ9tU80Jmxpc09Pe/bFLwQMN5oYu2JON8E=")) ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1343112708, 11) : Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 26)) != 0;
    }

    public void setLayerTextInterpolationInstant(Player player, String string) {
        if ((-1905573932 * -1905573932 - -1905573932 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || string == null || string.isBlank()) {
            return;
        }
        String string2 = string.toLowerCase(Locale.ROOT);
        if (!string2.startsWith(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("8wEbfhXmWXlgQEm6436iVC4mGO6LEiIHZIwbVu31fkQfembTM+1Iw9+NYLQY4eMctOJqRDr95LUvlPmdrZ0fJa7m2rYjOdc5Qx6gVDv9VnI=").toLowerCase(Locale.ROOT))) {
            return;
        }
        Entity entity = this.hudService.getHud(player, EditorLayersLayerPart.Xqedii_py9ijbjucpda(string));
        if (entity != null) {
            this.hudService.setHudNoTransition(entity);
        }
    }

    public List<LayerTreeRow> collectLayerTreeRows(EditorSession editorSession) {
        Object object;
        if ((0x7C20ED3B ^ 0x7C20ED3B) != 0) {
            throw new IllegalStateException();
        }
        List<LayerEntry> list = this.collectLayerEntries(editorSession);
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        LinkedHashMap<String, LayerEntry> linkedHashMap = new LinkedHashMap<String, LayerEntry>();
        for (LayerEntry arrayList2 : list) {
            arrayList2.children.clear();
            linkedHashMap.put(arrayList2.targetId, arrayList2);
        }
        java.util.ArrayList arrayList3 = new ArrayList();
        for (LayerEntry layerEntry : linkedHashMap.values()) {
            object = this.resolveLayerParentTargetId(layerEntry.targetId, linkedHashMap);
            if (object == null) {
                arrayList3.add(layerEntry);
                continue;
            }
            LayerEntry layerEntry2 = (LayerEntry)linkedHashMap.get(object);
            if (layerEntry2 == null || layerEntry2 == layerEntry) {
                arrayList3.add(layerEntry);
                continue;
            }
            layerEntry2.children.add(layerEntry);
        }
        this.sortLayerTreeEntries(arrayList3, this.layerEntryComparator());
        editorSession.collapsedLayerTargetIds.retainAll(linkedHashMap.keySet());
        ArrayList<LayerTreeRow> arrayList = new ArrayList<LayerTreeRow>();
        for (int i = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(687569735, 14); i < arrayList3.size(); ++i) {
            object = (LayerEntry)arrayList3.get(i);
            int n = i < arrayList3.size() - Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-2129394799, 1) ? Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 9) : Xqedii_3c6skvl.Xqedii_et1f9vygj64d(72355390, 3);
            this.appendLayerTreeRows((LayerEntry)object, Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1869145375, 27), n != 0, editorSession, arrayList, Collections.emptyList());
        }
        return arrayList;
    }

    public void appendLayerTreeRows(LayerEntry layerEntry, int n, boolean bl, EditorSession editorSession, List<LayerTreeRow> list, List<Integer> list2) {
        if ((1110928529 * 1110928529 + 1110928529 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (layerEntry == null || editorSession == null || list == null || list2 == null) {
            return;
        }
        int n2 = !layerEntry.children.isEmpty() ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1853811709, 25) : Xqedii_3c6skvl.Xqedii_et1f9vygj64d(335777665, 9);
        int n3 = n2 != 0 && !editorSession.collapsedLayerTargetIds.contains(layerEntry.targetId) ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1608741880, 12) : Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1064697401, 0);
        int n4 = n > 0 ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127272, 2) : Xqedii_3c6skvl.Xqedii_et1f9vygj64d(955781440, 21);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(list2);
        if (bl && n > 0) {
            arrayList.add(n);
        }
        list.add(new LayerTreeRow(layerEntry, n2 != 0, n3 != 0, n4 != 0, Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 14) != 0, bl, n4 != 0, this.toLayerTreeDepthValue(n, n2 != 0), arrayList, Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 18) != 0));
        if (n3 == 0) {
            return;
        }
        for (int i = Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 6); i < layerEntry.children.size(); ++i) {
            int n5 = i < layerEntry.children.size() - Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1267560525, 2) ? Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(480505069, 8) : Xqedii_3c6skvl.Xqedii_et1f9vygj64d(14934085, 15);
            this.appendLayerTreeRows(layerEntry.children.get(i), n + Xqedii_3c6skvl.Xqedii_306hip527e6uo(-305356372, 31), n5 != 0, editorSession, list, arrayList);
        }
    }

    public String resolveLayerParentTargetId(String string, Map<String, LayerEntry> map) {
        if ((1389379800 * 1389379800 + 1389379800 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (string == null || string.isBlank() || map == null || map.isEmpty()) {
            return null;
        }
        String string2 = string;
        int n;
        while ((n = string2.lastIndexOf(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("G8mKIUt+DzkpcH2FMVVZlOkjTasVGxiyOL+eYyQbl1kzINOptQzxmY4bIPU4f6Nh"))) >= 0) {
            String string3 = string2.substring(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 14), n);
            if (string3.isBlank()) {
                return null;
            }
            if (map.containsKey(string3)) {
                return string3;
            }
            string2 = string3;
        }
        return null;
    }

    public void sortLayerTreeEntries(List<LayerEntry> list, Comparator<LayerEntry> comparator) {
        if (((0xF39546CF | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (list == null || list.isEmpty() || comparator == null) {
            return;
        }
        list.sort(comparator);
        for (LayerEntry layerEntry : list) {
            this.sortLayerTreeEntries(layerEntry.children, comparator);
        }
    }

    public Comparator<LayerEntry> layerEntryComparator() {
        if ((-1686390468 * -1686390468 - -1686390468 & 1) != 0) {
            throw new IllegalStateException();
        }
        return (layerEntry, layerEntry2) -> {
            if ((-1448350577 * -1448350577 - -1448350577 & 1) != 0) {
                throw new IllegalStateException();
            }
            int n = Double.compare(layerEntry2.layer, layerEntry.layer);
            if (n != 0) {
                return n;
            }
            int n2 = layerEntry.displayName.compareToIgnoreCase(layerEntry2.displayName);
            if (n2 != 0) {
                return n2;
            }
            return layerEntry.targetId.compareToIgnoreCase(layerEntry2.targetId);
        };
    }

    public int toLayerTreeDepthValue(int n, boolean bl) {
        if ((0xE0386F4B ^ 0xE0386F4B) != 0) {
            throw new IllegalStateException();
        }
        if (n <= 0) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 30);
        }
        int n2 = bl ? n + Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 26) : n;
        return Math.max(Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 11), n2);
    }

    public List<LayerEntry> collectLayerEntries(EditorSession editorSession) {
        if (((-596000710 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        ArrayList<LayerEntry> arrayList = new ArrayList<LayerEntry>();
        if (editorSession == null || editorSession.renderBlocks == null || editorSession.renderBlocks.isEmpty()) {
            return arrayList;
        }
        HashMap<String, LayerEntry> hashMap = new HashMap<String, LayerEntry>();
        HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
        int n = Xqedii_3c6skvl.Xqedii_et1f9vygj64d(578843120, 6);
        for (Map<String, Object> object : editorSession.renderBlocks) {
            String string;
            ++n;
            if (object == null || object.isEmpty()) continue;
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374732461, 14)];
            stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)-1887366141, (int)25)] = this.stringValue(this.readMapPathValue(object, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("02a8+4G93rzDL4ODr7PdBbUzIa4GPi8YHvqdNM9J42f/pNbI")));
            stringArray[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)1374716077, (int)20)] = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("TfZY+wVXSFSHWu7fmgJ0a/HGYyUWEBiNrTBJ4EoeG0ar+0WWRNg=");
            String string2 = this.firstNonBlank(stringArray).toLowerCase(Locale.ROOT);
            if (!this.isRenderableBlockType(string2)) continue;
            String string3 = this.resolveElementId(object, n, hashMap2);
            String string4 = this.runtimeElementId(editorSession, string3);
            String[] stringArray2 = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842128300, 9)];
            stringArray2[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)-2140016606, (int)14)] = this.stringValue(this.readMapPathValue(object, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BN2mIpX19aY47CHfKqOZUl8CwXCwYxszBCFmGeDwgJ+D9a8y6wWBY+UQSDkHNCz8b8BEVa4iWT+GSXRE+Mw1mg==")));
            stringArray2[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842094508, (int)15)] = string4;
            String string5 = this.firstNonBlank(stringArray2);
            if (string5 == null || string5.isBlank()) continue;
            String[] stringArray3 = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 1)];
            stringArray3[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)8)] = this.stringValue(this.readMapPathValue(object, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("vWvrMF5LKrigs68zQfTgbk2XACFDlzgDgRqtC1AbsArCfCCApug4aStG1clDPTBIwP5v2QnvT6lntHDAXTbXu/Hdx/A=")));
            String string6 = this.firstNonBlank(stringArray3);
            String string7 = this.readTargetCustomName(editorSession, string6);
            double d = this.readMapPathDouble(object, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("J6Blg0Gm6q4e8CiuRniNS3fsvv6xhaoGYvawylBDn36ckzMOeOo="), this.readMapPathDouble(object, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("MuPL9TmzNgpj9jwLfvQzfScf176BXaztJfEkWpQ1T/0fyVa2rhr9kskz7vnQ72Gq"), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282639521999961L, 13))));
            LayerEntry layerEntry3 = (LayerEntry)hashMap.get(string5);
            if (layerEntry3 != null) {
                if (!(d > layerEntry3.layer)) continue;
                layerEntry3.layer = d;
                continue;
            }
            String string8 = this.toSidebarTypeLabel(string2);
            if (Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2)) {
                string = string7.isBlank() ? this.resolveTextLayerLabel(object) : string7;
                hashMap.put(string5, new LayerEntry(string5, string6, string8, d, string, Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 13) != 0));
                continue;
            }
            string = string7.isBlank() ? this.resolveDefaultLayerDisplayName(object, string8, string3, string5, string6) : string7;
            hashMap.put(string5, new LayerEntry(string5, string6, string8, d, string, Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 20) != 0));
        }
        arrayList.addAll(hashMap.values());
        arrayList.sort((layerEntry, layerEntry2) -> {
            if (((-786749163 << 1 | 1) & 1) == 0) {
                throw new IllegalStateException();
            }
            int cmp = Double.compare(layerEntry2.layer, layerEntry.layer);
            if (cmp != 0) {
                return cmp;
            }
            return layerEntry.typeLabel.compareToIgnoreCase(layerEntry2.typeLabel);
        });
        HashMap<String, Integer> hashMap3 = new HashMap<String, Integer>();
        for (LayerEntry layerEntry4 : arrayList) {
            if (!layerEntry4.numbered) continue;
            int n2 = hashMap3.getOrDefault(layerEntry4.typeLabel, Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 17)) + Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842192812, 16);
            hashMap3.put(layerEntry4.typeLabel, n2);
            layerEntry4.displayName = EditorLayersLayerPart.Xqedii_12ak9yo4fqonp(layerEntry4.typeLabel, n2);
        }
        return arrayList;
    }

    public String resolveDefaultLayerDisplayName(Map<String, Object> map, String string, String string2, String string3, String string4) {
        if ((1496213861 * 1496213861 - 1496213861 & 1) != 0) {
            throw new IllegalStateException();
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(768385452, 29)];
        stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)-1212910961, (int)26)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("AaHXdqbWDhzhLapsbjURRzzN6FCuVQPo1semSMbdG6g=")));
        stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)335778177, (int)9)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("owYCXiwBie7kpGqh5m/qJ/WtLTLv/mAqqoaLu1gj6+x8PgE9q8L+/lIZHwZeGA==")));
        String string5 = this.firstNonBlank(stringArray).trim();
        if (!string5.isBlank()) {
            return string5;
        }
        String[] stringArray2 = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 17)];
        stringArray2[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)-1374716078, (int)6)] = string4;
        String string6 = this.sanitizeGeneratedRuntimeId(this.firstNonBlank(stringArray2));
        if (!string6.isBlank()) {
            String[] stringArray3 = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374720173, 12)];
            stringArray3[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)-1544688356, (int)16)] = string;
            stringArray3[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)1205459513, (int)17)] = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("gdnPrgtRJ8TkgAtmrC1RrSkTnPHw50f3svk3u0nKXd40P+7XLEk=");
            return EditorLayersLayerPart.Xqedii_376w57clzc08x(this.firstNonBlank(stringArray3), string6);
        }
        String[] stringArray4 = new String[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1544950500, 16)];
        stringArray4[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)-133087176, (int)29)] = string2;
        stringArray4[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)1374716077, (int)7)] = string3;
        stringArray4[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)-1078693233, (int)26)] = string;
        stringArray4[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127279, (int)0)] = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("gdnPrgtRJ8TkgAtmrC1RrSkTnPHw50f3svk3u0nKXd40P+7XLEk=");
        return this.firstNonBlank(stringArray4);
    }

    public String resolveTextLayerLabel(ConfigurationSection configurationSection) {
        if ((0xD0A45701 ^ 0xD0A45701) != 0) {
            throw new IllegalStateException();
        }
        if (configurationSection == null) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("0gDXCw04KNH/n5CHJAN1cdRGPbo9Ut8uu3UIV/vVpRU3g59L");
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374683309, 14)];
        stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)28)] = configurationSection.getString(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG"));
        stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)-1945591780, (int)28)] = configurationSection.getString(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("XlqmUyGtIAKJ6KrQP2X2Pmg8G6T+q9CHokK1ld/MPdd+bQLcP7uGdCcX"));
        stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)2113774484, (int)21)] = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        String string = this.firstNonBlank(stringArray);
        String string2 = string.replace((char)Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-201945519, 23), (char)Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-266174343, 30)).replace((char)Xqedii_3c6skvl.Xqedii_et1f9vygj64d(72355494, 3), (char)Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374650541, 16)).replaceAll(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("bfBWnbiXfgthUCpUJnlPTA2ZR3U0OQVJyN0/ajyDYCkVZHTqQsbokQJb"), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==")).replaceAll(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("1XOMxmeVPn/EYXwEFwXiWeYJKfs1j6N9DeWDF7P+jDl+78/Cm/ydKViHj3iCO65MhIiPntnQG69ZC4MkmpR4c1C9N4I="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==")).replaceAll(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("j1kI3JhyF3pJwZMGe2Dbj0XnxHDMX4anvzzFsYCRB1tMWQ=="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("HkKpDKyPzHrbqGQwIZpV+CjjdujFRXQQWfTMIB1v")).trim();
        if (string2.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("0gDXCw04KNH/n5CHJAN1cdRGPbo9Ut8uu3UIV/vVpRU3g59L");
        }
        if (string2.length() > Xqedii_3c6skvl.Xqedii_306hip527e6uo(1624023468, 23)) {
            return EditorLayersLayerPart.Xqedii_1qt5rgw3pzpba(string2.substring(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-943683071, 24), Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-67727791, 23)));
        }
        return string2;
    }

    public String resolveTextLayerLabel(Map<String, Object> map) {
        if ((865251157 * 865251157 + 865251157 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (map == null || map.isEmpty()) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("0gDXCw04KNH/n5CHJAN1cdRGPbo9Ut8uu3UIV/vVpRU3g59L");
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716076, 31)];
        stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)24)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG")));
        stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)1922020276, (int)10)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("XlqmUyGtIAKJ6KrQP2X2Pmg8G6T+q9CHokK1ld/MPdd+bQLcP7uGdCcX")));
        stringArray[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)1374978221, (int)18)] = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        String string = this.firstNonBlank(stringArray);
        String string2 = string.replace((char)Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1193867771, 6), (char)Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127788, 4)).replace((char)Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-2139803614, 14), (char)Xqedii_3c6skvl.Xqedii_et1f9vygj64d(144711292, 4)).replaceAll(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("bfBWnbiXfgthUCpUJnlPTA2ZR3U0OQVJyN0/ajyDYCkVZHTqQsbokQJb"), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==")).replaceAll(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("1XOMxmeVPn/EYXwEFwXiWeYJKfs1j6N9DeWDF7P+jDl+78/Cm/ydKViHj3iCO65MhIiPntnQG69ZC4MkmpR4c1C9N4I="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==")).replaceAll(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("j1kI3JhyF3pJwZMGe2Dbj0XnxHDMX4anvzzFsYCRB1tMWQ=="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("HkKpDKyPzHrbqGQwIZpV+CjjdujFRXQQWfTMIB1v")).trim();
        if (string2.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("0gDXCw04KNH/n5CHJAN1cdRGPbo9Ut8uu3UIV/vVpRU3g59L");
        }
        if (string2.length() > Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1550549251, 5)) {
            return EditorLayersLayerPart.Xqedii_1h4vzuxjkvxe8(string2.substring(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 3), Xqedii_3c6skvl.Xqedii_306hip527e6uo(768385455, 29)));
        }
        return string2;
    }

    public boolean applySiblingLayerOrderingOnRawTargets(EditorSession editorSession, Map<String, Map<String, Object>> map, List<String> list) {
        int n = 0;
        if ((-1487254381 * -1487254381 + -1487254381 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || list == null || list.isEmpty()) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 18) != 0;
        }
        double d = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941887963907273L, 46));
        if (map != null && !map.isEmpty()) {
            for (String string : list) {
                Map<String, Object> map2 = map.get(string);
                if (map2 == null) continue;
                d = Math.max(d, this.readRawTargetLayer(map2));
            }
        }
        if (!Double.isFinite(d)) {
            for (String string : list) {
                d = Math.max(d, this.readTargetLayer(editorSession, string));
            }
        }
        if (!Double.isFinite(d)) {
            d = list.size();
        }
        n = Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 7);
        double d2 = d;
        for (String string : list) {
            int n3;
            Map<String, Object> map3;
            Map<String, Object> map4 = map3 = map == null ? null : map.get(string);
            if (map3 != null) {
                LinkedHashSet<Map<String, Object>> linkedHashSet = new LinkedHashSet<Map<String, Object>>();
                if (this.isRawImageGroupOwner(map3)) {
                    this.collectImageGroupLayerTargets(map3, linkedHashSet);
                } else {
                    linkedHashSet.add(map3);
                }
                n3 = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1883786126, 18);
                for (Map map5 : linkedHashSet) {
                    n3 |= this.setRawTargetLayer(map5, d2) ? 1 : 0;
                }
            } else {
                n3 = this.setTargetLayer(editorSession, string, d2) ? 1 : 0;
            }
            n |= n3;
            d2 -= Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(8047167603765363858L, 51));
        }
        return n != 0;
    }

    public String resolveRawTargetLayerPath(Map<String, Object> map) {
        if (((-1123669467 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (map == null) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("J6Blg0Gm6q4e8CiuRniNS3fsvv6xhaoGYvawylBDn36ckzMOeOo="))) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("J6Blg0Gm6q4e8CiuRniNS3fsvv6xhaoGYvawylBDn36ckzMOeOo=");
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("MuPL9TmzNgpj9jwLfvQzfScf176BXaztJfEkWpQ1T/0fyVa2rhr9kskz7vnQ72Gq"))) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("MuPL9TmzNgpj9jwLfvQzfScf176BXaztJfEkWpQ1T/0fyVa2rhr9kskz7vnQ72Gq");
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("s66nsxnKzF3aVyGlhcO9W+qieOxaNuYnqYeg/w2Bn3V0PQxQ+CI="))) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("s66nsxnKzF3aVyGlhcO9W+qieOxaNuYnqYeg/w2Bn3V0PQxQ+CI=");
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3/sGGrxWTcpHzx8XZznFqDQo167ESRM/Rb/jyEFpUJt5jM3ozRkM5pFNJjr9jRT7GZgUGQ=="))) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3/sGGrxWTcpHzx8XZznFqDQo167ESRM/Rb/jyEFpUJt5jM3ozRkM5pFNJjr9jRT7GZgUGQ==");
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("XTStjeTn4aiVf2oMLMBetZ6RPFfTsEb/4aM7yxI5n0wwUBhtheeMmvb0VkOf9Ni5vloWHA=="))) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("XTStjeTn4aiVf2oMLMBetZ6RPFfTsEb/4aM7yxI5n0wwUBhtheeMmvb0VkOf9Ni5vloWHA==");
        }
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
    }

    public boolean isRawUiImageGlyphBlock(Map<String, Object> map) {
        if ((-1924772377 * -1924772377 - -1924772377 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (map == null || map.isEmpty()) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 3) != 0;
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(671556354, 10)];
        stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)9)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG")));
        String string = this.firstNonBlank(stringArray).toLowerCase(Locale.ROOT);
        if (!string.isBlank() && (string.contains(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("JZO80psPIOKwqwOfGFxnymQQBS6v4Frkd9hEFHiglvm7p3oWaC7zibfY7OwajN7UhwL70oYXPwn2iw==")) || string.contains(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("0zXpbpgdL/mvFQd6j3pqfWYhs+4FsU1yFR3EBWE12by7XqScRZI=")))) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 6) != 0;
        }
        String[] stringArray2 = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-910128639, 24)];
        stringArray2[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)-1374716078, (int)0)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("AaHXdqbWDhzhLapsbjURRzzN6FCuVQPo1semSMbdG6g=")));
        stringArray2[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)1374716077, (int)14)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("owYCXiwBie7kpGqh5m/qJ/WtLTLv/mAqqoaLu1gj6+x8PgE9q8L+/lIZHwZeGA==")));
        String string2 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
        String[] stringArray3 = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 19)];
        stringArray3[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)-1374716078, (int)22)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("02a8+4G93rzDL4ODr7PdBbUzIa4GPi8YHvqdNM9J42f/pNbI")));
        String string3 = this.firstNonBlank(stringArray3).toLowerCase(Locale.ROOT);
        return (!string2.isBlank() && string2.startsWith(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("D1WyIr25e2Hk++99XcGS0SGkNp80XGyyait0+LFtQskiroCH")) && !Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("9f9MmEg9nQ5bzWhMkB2qMVzMCzKioZcMMqvumJFaeoI8Ig6gULrbtQ==").equals(string3) ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127292, 4) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-606455481, 25)) != 0;
    }

    public boolean isRawImageGroupOwner(Map<String, Object> map) {
        if ((774822422 * 774822422 - 774822422 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (map == null || map.isEmpty()) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 29) != 0;
        }
        Object object = this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Og0Mq8b5U7F8OAwefdij+ImwzuN202NQKKSYnWCKTTjlF+muJjuKQqmGjUOG/llf/z3uXybgbYCwUqkT0sH2orMsyqcus7huXz4sTBut1X+8zbIPm/ZISh9q3hmlV/J7uPs="));
        return (this.parseBooleanFlag(object, Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 17) != 0) || this.isRawImageGroupRoot(map) ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127278, 1) : Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 14)) != 0;
    }

    public String findImageGroupOwnerPath(EditorSession editorSession, String string) {
        if ((1961623617 * 1961623617 + 1961623617 & 1) != 0) {
            throw new IllegalStateException();
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(480505069, 8)];
        stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)961010650, (int)9)] = string;
        String string2 = this.firstNonBlank(stringArray);
        if (editorSession == null || string2.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        }
        Map<String, Object> map;
        while (!this.isRawImageGroupOwner(map = this.resolveRawMapAtPath(editorSession.rawBlocks, string2))) {
            if (map != null && !this.isRawUiImageGlyphBlock(map)) {
                return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
            }
            int n = string2.lastIndexOf(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("G8mKIUt+DzkpcH2FMVVZlOkjTasVGxiyOL+eYyQbl1kzINOptQzxmY4bIPU4f6Nh"));
            if (n <= 0) {
                return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
            }
            string2 = string2.substring(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 30), n);
        }
        return string2;
    }

    public String resolveImageGroupMemberRootPath(EditorSession editorSession, String string) {
        String string2;
        if (((0x3F7708FD | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        String string3 = this.findImageGroupOwnerPath(editorSession, string);
        if (string3.isBlank()) {
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842094508, 15)];
            stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)-1064697401, (int)0)] = string;
            string2 = this.firstNonBlank(stringArray);
        } else {
            string2 = string3;
        }
        return string2;
    }

    public boolean isImageGroupMemberPath(EditorSession editorSession, String string, String string2) {
        if (((0x75D5A6D | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(119734824, 18)];
        stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)-151613871, (int)23)] = string;
        String string3 = this.firstNonBlank(stringArray);
        String[] stringArray2 = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 16)];
        stringArray2[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)1922021300, (int)10)] = string2;
        String string4 = this.firstNonBlank(stringArray2);
        if (string3.isBlank() || string4.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1205590585, 17) != 0;
        }
        if (string4.equals(string3)) {
            return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1615134948, 31) != 0;
        }
        if (!string4.startsWith(EditorLayersLayerPart.Xqedii_2y1sdtapapq5a(string3))) {
            return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1979594816, 8) != 0;
        }
        if (editorSession == null || !this.isRawImageGroupOwner(this.resolveRawMapAtPath(editorSession.rawBlocks, string3))) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842119084, 13) != 0;
        }
        return string3.equals(this.findImageGroupOwnerPath(editorSession, string4));
    }

    public boolean isBetterImageGroupRootCandidate(HoverElement hoverElement, HoverElement hoverElement2) {
        double d;
        if (((543116124 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (hoverElement == null || hoverElement.baseScale == null) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 29) != 0;
        }
        if (hoverElement2 == null || hoverElement2.baseScale == null) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842143660, 14) != 0;
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 28)];
        stringArray[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)-1374716078, (int)9)] = hoverElement.type;
        boolean bl = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("9f9MmEg9nQ5bzWhMkB2qMVzMCzKioZcMMqvumJFaeoI8Ig6gULrbtQ==").equalsIgnoreCase(this.firstNonBlank(stringArray));
        String[] stringArray2 = new String[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1884048270, 18)];
        stringArray2[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)-1113353091, (int)29)] = hoverElement2.type;
        boolean bl2 = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("9f9MmEg9nQ5bzWhMkB2qMVzMCzKioZcMMqvumJFaeoI8Ig6gULrbtQ==").equalsIgnoreCase(this.firstNonBlank(stringArray2));
        if (bl != bl2) {
            return bl;
        }
        double d2 = Math.abs(hoverElement.baseScale.getX()) * Math.abs(hoverElement.baseScale.getY());
        return (d2 > (d = Math.abs(hoverElement2.baseScale.getX()) * Math.abs(hoverElement2.baseScale.getY())) ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(119734824, 18) : Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 18)) != 0;
    }

    public void collectImageGroupLayerTargets(Map<String, Object> map, LinkedHashSet<Map<String, Object>> linkedHashSet) {
        if ((981944304 * (981944304 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (map == null || linkedHashSet == null || !linkedHashSet.add(map)) {
            return;
        }
        Object object = this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("SL5OQIcJDVNkOGR2Km60QVp4TewrB2oikAY/p9QOgXV99z+cYBOYqMExkLs="));
        if (!(object instanceof List)) {
            return;
        }
        List list = (List)object;
        for (Object e : list) {
            Map map2;
            Map map3;
            if (!(e instanceof Map) || (map3 = (Map)e).isEmpty() || !this.isRawUiImageGlyphBlock(map2 = map3)) continue;
            linkedHashSet.add(map2);
        }
    }

    public boolean hasDirectRawUiImageGlyphChild(Map<String, Object> map) {
        List list;
        if ((0x1F2FCD7A ^ 0x1F2FCD7A) != 0) {
            throw new IllegalStateException();
        }
        if (map == null || map.isEmpty()) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 4) != 0;
        }
        Object object = this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("SL5OQIcJDVNkOGR2Km60QVp4TewrB2oikAY/p9QOgXV99z+cYBOYqMExkLs="));
        if (!(object instanceof List) || (list = (List)object).isEmpty()) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 20) != 0;
        }
        for (Object e : list) {
            Map map2;
            Map map3;
            if (!(e instanceof Map) || (map3 = (Map)e).isEmpty() || !this.isRawUiImageGlyphBlock(map2 = map3)) continue;
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 16) != 0;
        }
        return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1064697401, 0) != 0;
    }

    public boolean isRawImageGroupRoot(Map<String, Object> map) {
        Object object;
        int n;
        if ((-676577491 * -676577491 - -676577491 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (map == null || map.isEmpty()) {
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1759846255, 3) != 0;
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842258348, 16)];
        stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)-471841536, (int)23)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("AaHXdqbWDhzhLapsbjURRzzN6FCuVQPo1semSMbdG6g=")));
        stringArray[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)1374716077, (int)21)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("owYCXiwBie7kpGqh5m/qJ/WtLTLv/mAqqoaLu1gj6+x8PgE9q8L+/lIZHwZeGA==")));
        String string = this.firstNonBlank(stringArray).toLowerCase(Locale.ROOT);
        Object object2 = this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("SL5OQIcJDVNkOGR2Km60QVp4TewrB2oikAY/p9QOgXV99z+cYBOYqMExkLs="));
        int n2 = n = object2 instanceof List && !((List)object2).isEmpty() ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1841865132, 18) : Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1887366141, 25);
        if (n == 0) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 9) != 0;
        }
        if (!string.isBlank() && string.startsWith(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("D1WyIr25e2Hk++99XcGS0SGkNp80XGyyait0+LFtQskiroCH"))) {
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-901853487, 12) != 0;
        }
        String[] stringArray2 = new String[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(687553351, 14)];
        stringArray2[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)14934085, (int)15)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("02a8+4G93rzDL4ODr7PdBbUzIa4GPi8YHvqdNM9J42f/pNbI")));
        object = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
        if (!Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("9f9MmEg9nQ5bzWhMkB2qMVzMCzKioZcMMqvumJFaeoI8Ig6gULrbtQ==").equals(object)) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 18) != 0;
        }
        return this.hasDirectRawUiImageGlyphChild(map);
    }

    public Map<String, Object> resolveImageGroupRootRawTarget(EditorSession editorSession, String string, Map<String, Object> map, String string2) {
        if (((-256820752 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (this.isRawImageGroupRoot(map)) {
            return map;
        }
        if (editorSession == null) {
            return null;
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1841602988, 18)];
        stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)1869145375, (int)27)] = string2;
        stringArray[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)1374716077, (int)16)] = this.resolveTimelineHierarchyTargetPath(editorSession, string);
        String string3 = this.findImageGroupOwnerPath(editorSession, this.firstNonBlank(stringArray));
        if (string3.isBlank()) {
            return null;
        }
        Map<String, Object> map2 = this.resolveRawMapAtPath(editorSession.rawBlocks, string3);
        return this.isRawImageGroupRoot(map2) ? map2 : null;
    }

    public double readRawTargetLayer(Map<String, Object> map) {
        if ((0xDA8157BB ^ 0xDA8157BB) != 0) {
            throw new IllegalStateException();
        }
        String string = this.resolveRawTargetLayerPath(map);
        if (string.isBlank()) {
            return Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941870784038089L, 53));
        }
        return this.readMapPathDouble(map, string, Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282639521999961L, 44)));
    }

    public boolean setRawTargetLayer(Map<String, Object> map, double d) {
        if (((0x4EBE62E2 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (map == null) {
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1922021300, 10) != 0;
        }
        String string = this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("J6Blg0Gm6q4e8CiuRniNS3fsvv6xhaoGYvawylBDn36ckzMOeOo=")) ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("J6Blg0Gm6q4e8CiuRniNS3fsvv6xhaoGYvawylBDn36ckzMOeOo=") : (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("MuPL9TmzNgpj9jwLfvQzfScf176BXaztJfEkWpQ1T/0fyVa2rhr9kskz7vnQ72Gq")) ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("MuPL9TmzNgpj9jwLfvQzfScf176BXaztJfEkWpQ1T/0fyVa2rhr9kskz7vnQ72Gq") : (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("s66nsxnKzF3aVyGlhcO9W+qieOxaNuYnqYeg/w2Bn3V0PQxQ+CI=")) ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("s66nsxnKzF3aVyGlhcO9W+qieOxaNuYnqYeg/w2Bn3V0PQxQ+CI=") : (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3/sGGrxWTcpHzx8XZznFqDQo167ESRM/Rb/jyEFpUJt5jM3ozRkM5pFNJjr9jRT7GZgUGQ==")) ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3/sGGrxWTcpHzx8XZznFqDQo167ESRM/Rb/jyEFpUJt5jM3ozRkM5pFNJjr9jRT7GZgUGQ==") : (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("XTStjeTn4aiVf2oMLMBetZ6RPFfTsEb/4aM7yxI5n0wwUBhtheeMmvb0VkOf9Ni5vloWHA==")) ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("XTStjeTn4aiVf2oMLMBetZ6RPFfTsEb/4aM7yxI5n0wwUBhtheeMmvb0VkOf9Ni5vloWHA==") : (map.containsKey(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("VngT8WdKVtYwKjSZFU4hXx2yv3qAzhugzDqTb+AyRfYHbYRlNsrdkA==")) ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3/sGGrxWTcpHzx8XZznFqDQo167ESRM/Rb/jyEFpUJt5jM3ozRkM5pFNJjr9jRT7GZgUGQ==") : Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("J6Blg0Gm6q4e8CiuRniNS3fsvv6xhaoGYvawylBDn36ckzMOeOo="))))));
        double d2 = this.readMapPathDouble(map, string, Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(8379271440297151591L, 31)));
        if (Math.abs(d2 - d) < Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-8132957104896384113L, 17))) {
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-151613871, 23) != 0;
        }
        this.setMapPathValue(map, string, d);
        return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1825350060, 24) != 0;
    }

    public void applySiblingLayerOrdering(EditorSession editorSession, List<String> list) {
        if ((-2094012647 * -2094012647 + -2094012647 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || list == null || list.isEmpty()) {
            return;
        }
        double d = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(7568748663205416437L, 0));
        for (String string : list) {
            d = Math.max(d, this.readTargetLayer(editorSession, string));
        }
        if (!Double.isFinite(d)) {
            d = list.size();
        }
        double d2 = d;
        for (String string : list) {
            this.setTargetLayer(editorSession, string, d2);
            d2 -= Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941870784050381L, 14));
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean setTargetLayer(EditorSession editorSession, String string, double d) {
        int n = 0;
        int n2;
        Map<String, Object> map;
        String string22;
        Object object;
        if ((0xE5DA25CB ^ 0xE5DA25CB) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(14934085, 15) != 0;
        }
        LinkedHashMap<Object, Map<String, Object>> linkedHashMap = new LinkedHashMap<Object, Map<String, Object>>();
        List<Map<String, Object>> list = editorSession.renderBlocks;
        if (list == null || list.isEmpty()) {
            list = this.resolveRenderableBlocks(editorSession.rawBlocks, editorSession.components, editorSession);
        }
        if (list != null) {
            for (Map object2 : list) {
                Map<String, Object> map2;
                if (object2 == null || object2.isEmpty()) continue;
                String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1837932972, 22)];
                stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)1869145375, (int)27)] = this.stringValue(this.readMapPathValue(object2, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BN2mIpX19aY47CHfKqOZUl8CwXCwYxszBCFmGeDwgJ+D9a8y6wWBY+UQSDkHNCz8b8BEVa4iWT+GSXRE+Mw1mg==")));
                object = this.firstNonBlank(stringArray);
                if (!this.equalsNullable((String)object, string)) continue;
                String[] stringArray2 = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 12)];
                stringArray2[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)1040470030, (int)27)] = this.stringValue(this.readMapPathValue(object2, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("vWvrMF5LKrigs68zQfTgbk2XACFDlzgDgRqtC1AbsArCfCCApug4aStG1clDPTBIwP5v2QnvT6lntHDAXTbXu/Hdx/A=")));
                string22 = this.firstNonBlank(stringArray2);
                if (string22.isBlank() || linkedHashMap.containsKey(string22) || (map2 = this.resolveRawMapAtPath(editorSession.rawBlocks, string22)) == null) continue;
                linkedHashMap.put(string22, map2);
            }
        }
        if (linkedHashMap.isEmpty()) {
            map = this.resolveRawTargetByTargetId(editorSession, string);
            if (map == null) {
                return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 7) != 0;
            }
            String var8_10 = this.resolveTimelineHierarchyTargetPath(editorSession, string);
            if (var8_10.isBlank()) {
                var8_10 = string;
            }
            linkedHashMap.put(var8_10, map);
        }
        String bestTargetKey = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        int bestDepthVal = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(775274793, 4);
        for (Object keyObj : linkedHashMap.keySet()) {
            String candKey = (String) keyObj;
            if (candKey == null || candKey.isBlank()) continue;
            int candDepth = this.resolveLayerTargetDepth(candKey);
            if (bestTargetKey.isBlank() || candDepth < bestDepthVal || (candDepth == bestDepthVal && candKey.length() < bestTargetKey.length())) {
                bestTargetKey = candKey;
                bestDepthVal = candDepth;
            }
        }
        if (bestTargetKey.isBlank()) {
            bestTargetKey = (String) linkedHashMap.keySet().iterator().next();
        }
        object = (Map) linkedHashMap.get(bestTargetKey);
        String targetLayerPath = this.resolveRawTargetLayerPath((Map<String, Object>)object);
        if (object == null || targetLayerPath.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 29) != 0;
        }
        double d2 = this.readMapPathDouble((Map<String, Object>)object, targetLayerPath, Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-922782927046317267L, 9)));
        double d3 = d - d2;
        LinkedHashSet<Map<String, Object>> linkedHashSet = new LinkedHashSet<Map<String, Object>>(linkedHashMap.values());
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1911586989, 29)];
        stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)22)] = bestTargetKey;
        stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)1615134948, (int)31)] = this.resolveTimelineHierarchyTargetPath(editorSession, string);
        String string4 = this.firstNonBlank(stringArray);
        Map<String, Object> map3 = this.resolveImageGroupRootRawTarget(editorSession, string, (Map<String, Object>)object, string4);
        int n6 = Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 4);
        if (map3 == null && linkedHashMap.size() > Xqedii_3c6skvl.Xqedii_et1f9vygj64d(72355398, 3)) {
            n2 = Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 4);
            int n7 = Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 2);
            for (Object object2 : linkedHashMap.values()) {
                if (object2 == null || ((Map)object2).isEmpty()) continue;
                String[] stringArray3 = new String[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-320004957, 24)];
                stringArray3[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)238945360, (int)19)] = this.stringValue(this.readMapPathValue((Map<String, Object>)object2, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("02a8+4G93rzDL4ODr7PdBbUzIa4GPi8YHvqdNM9J42f/pNbI")));
                String string5 = this.firstNonBlank(stringArray3).toLowerCase(Locale.ROOT);
                if (Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("9f9MmEg9nQ5bzWhMkB2qMVzMCzKioZcMMqvumJFaeoI8Ig6gULrbtQ==").equals(string5)) continue;
                ++n2;
                if (!this.isRawUiImageGlyphBlock((Map<String, Object>)object2)) continue;
                ++n7;
            }
            n6 = n2 > Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127292, 4) && n7 == n2 ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1343112708, 11) : Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 25);
        }
        int n8 = n2 = map3 != null || n6 != 0 ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1915757184, 22) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-303227741, 24);
        if (n2 == 0 && Math.abs(d3) < Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-9149531276872185642L, 31))) {
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-75806936, 22) != 0;
        }
        if (map3 != null) {
            this.collectImageGroupLayerTargets(map3, linkedHashSet);
        }
        Object object3 = this.readMapPathValue((Map<String, Object>)object, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Og0Mq8b5U7F8OAwefdij+ImwzuN202NQKKSYnWCKTTjlF+muJjuKQqmGjUOG/llf/z3uXybgbYCwUqkT0sH2orMsyqcus7huXz4sTBut1X+8zbIPm/ZISh9q3hmlV/J7uPs="));
        if (n2 == 0 && this.parseBooleanFlag(object3, Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 27) != 0)) {
            this.collectImageGroupLayerTargets((Map<String, Object>)object, linkedHashSet);
        }
        n = Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 21);
        for (Map map4 : linkedHashSet) {
            String string6 = this.resolveRawTargetLayerPath(map4);
            if (string6.isBlank()) continue;
            if (n2 != 0) {
                n |= this.setRawTargetLayer(map4, d) ? 1 : 0;
                continue;
            }
            double d4 = this.readMapPathDouble(map4, string6, Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941870784038089L, 18)));
            n |= this.setRawTargetLayer(map4, d4 + d3) ? 1 : 0;
        }
        return n != 0;
    }

    public String resolveDirectLayerParentTargetId(String string) {
        if ((1686025831 * 1686025831 + 1686025831 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (string == null || string.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        }
        int n = string.lastIndexOf(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("G8mKIUt+DzkpcH2FMVVZlOkjTasVGxiyOL+eYyQbl1kzINOptQzxmY4bIPU4f6Nh"));
        if (n < 0) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        }
        String string2 = string.substring(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1979594816, 8), n);
        return string2 == null ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==") : string2;
    }

    public boolean canUseFastLayerRuntimeRender(Map<String, Object> map, String string) {
        if ((-1506348096 * -1506348096 + -1506348096 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (map == null || string == null) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 26) != 0;
        }
        String string2 = string.toLowerCase(Locale.ROOT);
        if (!Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) && !Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("TfZY+wVXSFSHWu7fmgJ0a/HGYyUWEBiNrTBJ4EoeG0ar+0WWRNg=").equals(string2)) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 19) != 0;
        }
        return (!this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("yqHECpx5OaUeeD7TEYkS8Ni5gkA5jTnl0zp7VDaT1HuMx0FHjfug0VOz7Rj+F7N4XYMfXQ==")) && !this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("dKZBOYbenVzURjGVo+1ZCmWDEC9dg/BwGlbAQF9q5LywhuA0fZpHy1GDT+wxUS4JrSQLOjmT")) && !this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Hb8OQOe0aiwH7BIUxVENKD1UlkOIBhEY29nm3Fi++xPSkNwHagSex8O6Q2E38JoX9RhunYE9gnR8Bttim6k=")) && !this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("kz9FHfGvXx3dFCJiSo/1vjBlgz19G+0MYVgrQf0DhWxZvmM+8fdS9fwB5MkNfqA+oxL/C83FtDA=")) && !this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("x3BIY7OFfN1Z1ljYqPBcB8XfcERzosOyxDIViu6Vk3A2BFErv9oKe9ZJMl+OZH9Zc1E=")) && !this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ozSn+lDhbqsl+9kJV7qQP1dZl+3eqG0xuSry4+taX+hE48/WQ5dQl8L7mXjPBW6ptWw/uA==")) && !this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("bO298qgSEIrx8V9OzD10io9NZS1/B/gMUyRcanjosiE4nWxD")) && !this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("5QcjzQWb7X0ZHO4YF+lqUe1BO7NiS8WCHC+DRcHe1vFqKlHxeDROKG8r2UYfNmRH")) && !this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Zt9B608Om0TTeLltP3zRAPwIEjVZLJurZPcuQUfeXdUdLSTS/vmHy/26xTUK1w==")) ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842258348, 17) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1922021300, 10)) != 0;
    }

    /*
     * Exception decompiling
     */
    public TextDisplay.TextAlignment readTextAlignmentFromMap(Map<String, Object> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public int readTextWrapLineWidthFromMap(Map<String, Object> map) {
        if ((0x81BE609F ^ 0x81BE609F) != 0) {
            throw new IllegalStateException();
        }
        Object object = this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("loSFu7WR7+iO5FCQBEATLTHnsBXGZFjdCeICr1Qsdpljfi5cTfDtup4VmPpFxg=="));
        if (object == null) {
            object = this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("AIevt5XzNFyF8lbVa4eONag8Wc52Fh0uY5gXXAq/xthviJ5VC5b46uU4db8="));
        }
        if (object == null) {
            object = this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("gjKr6+Qf3cvz8fyYaipPPOIa5CPDotLGbT6u4wn0ZTO2msQ0zKxso6F9SwNo+A=="));
        }
        return this.normalizeTextWrapLineWidth(object);
    }

    public void renderLayerShellElementFast(Player player, EditorSession editorSession, Map<String, Object> map, String string, String string2, boolean bl) {
        String string3;
        int n;
        if (((0x6686A7D7 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || map == null || string == null || string.isBlank()) {
            return;
        }
        String string4 = EditorLayersLayerPart.Xqedii_qooafmhjjf5j(string);
        double d = this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("QqeF71pxxTPGBSnnh8yGwISB/izKDr2mTprtXbrw3BZnZGafYt3mIuVULrmvk4RY"), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("hQDIczWQOugPl0NYFOCS9ZL5LskFVXO49JX0gCP4"), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282639521999961L, 8))));
        double d2 = this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("AkEvr/8pc4KcO3RRtC3MZjWKc4EczVpW19dwZw39iuLqF2dG6peGmgvYKJ2VchmM"), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BaJvLxDLpZjGuPlcv+UoERQ4OvjKf3ixBOKZbis8"), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(3682217240968475359L, 13))));
        double d3 = this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("J6Blg0Gm6q4e8CiuRniNS3fsvv6xhaoGYvawylBDn36ckzMOeOo="), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("MuPL9TmzNgpj9jwLfvQzfScf176BXaztJfEkWpQ1T/0fyVa2rhr9kskz7vnQ72Gq"), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("s66nsxnKzF3aVyGlhcO9W+qieOxaNuYnqYeg/w2Bn3V0PQxQ+CI="), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282639521999961L, 42)))));
        double d4 = this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ECyrqavj1dHxeSQ7gZ6k2/rXGjdu+ZgbYvEmQauqWMLvsF2w7odqkffpRxnU307+"), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("LD1FfCdlknnw4eOF5c9W6n25OnNA/uZqF6Q2cwXy+GeNehrM4Go="), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Rw1pNGFaYQRtz81V2WppdmYsn5eqnkg0RT9s1akha4njOyMYjfmWxZsy5QPBVwz8MTE="), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(7472282743272648951L, 56)))));
        double d5 = this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("4MVSlqpIF9VLsJ+FcXcJ9Kn5TIjpHVHa65wepB0KzIaKBDXF/VrSyvxD21yKfFiHFp0="), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("gOuqfVGert7OymRue3ngMuPYEkAt4QwiKCVL9OT4tU16t4Rp22AZOw=="), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("mLUTgcs0kj7BALmB4V4hv34QFPtZOEngA2gIQBYIBRRSqqxP+NDPW1uqezWCi9q7YtQHpQ=="), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-1980048569058978905L, 62)))));
        int n2 = d4 < Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(3682217240968475359L, 13)) ? Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 1) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-303227741, 24);
        int n3 = d5 < Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-5614368578658832811L, 13)) ? Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 0) : Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1077475345, 13);
        double d6 = Math.max(Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-614894932012297305L, 60)), Math.abs(d4));
        double d7 = Math.max(Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941870985430217L, 28)), Math.abs(d5));
        EditorRect editorRect = new EditorRect(d, d2, d6, d7);
        int n4 = n = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) && this.isLayerSwappableTextRuntimeId(string) ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842192812, 16) : Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 4);
        if (this.shouldSkipLayerStaticMove(player, editorSession, string, editorRect, bl) && n == 0) {
            editorSession.shellRuntimeRects.put(string, editorRect);
            return;
        }
        double d8 = this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("lYcijUIQvBKnTwxqXAzKodRol4fIvdDKsc3uXWBjtCETHTv76R9LLdjpy88="), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("/iy128rbnMybxjb3DEO3Hhuvj+qgE5dY7IyIRVAtRStHyWBrXAt/Gw=="), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(6175021960001416430L, 5))));
        int n5 = Math.max(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(29868170, 16), Math.min(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842126444, 6), (int)Math.round(this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("FVyc1uCzSTxyFFzafsZc6dyndixg41vIgCHrtbNDk2tywoiLFpCxO1Rc"), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(3238543128644021165L, 9))))));
        TextDisplay.TextAlignment textAlignment = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) ? this.readTextAlignmentFromMap(map) : TextDisplay.TextAlignment.CENTER;
        int n6 = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) ? this.readTextWrapLineWidthFromMap(map) : Xqedii_3c6skvl.Xqedii_306hip527e6uo(768385450, 27);
        double d9 = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) ? this.toInternalTextTopY(d2, d7) : d2;
        double d10 = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) ? this.applyTextAlignmentOffset(d, d6, textAlignment) : d;
        HudPositionCalculator.Placement placement = this.positionCalculator.calculateBoxPlacement(d10, d9, d3, d6, d7);
        if (Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2)) {
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(29999242, 16)];
            stringArray[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)-1374716078, (int)17)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG")));
            stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)-2129394799, (int)1)] = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
            string3 = this.firstNonBlank(stringArray);
        } else {
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1477525561, 29)];
            stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)29)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("XlqmUyGtIAKJ6KrQP2X2Pmg8G6T+q9CHokK1ld/MPdd+bQLcP7uGdCcX")));
            stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)768385452, (int)30)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG")));
            stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)59998484, (int)17)] = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Np/ZKQ9D4rxTzz/czjbkxq+PEsPbrkWhT1LWFKz1");
            string3 = this.firstNonBlank(stringArray);
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1441824941, 26)];
        stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)1375139470, (int)15)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("60jivqWNOwpTpzjxFfZHyfCieekjya9Blgpo9qlxV2lX0T/CY6A=")));
        stringArray[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)1374716077, (int)7)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("xP9TPRv7EVrwANrp206zvEaiasPrMgw3PscALel0sQYjd7QGkmIG6id5goA4Ibhj5Gk=")));
        String string5 = this.firstNonBlank(stringArray);
        string3 = this.withHexPrefix(string3, string5);
        String string6 = this.applyPlaceholderApi(player, string3);
        string6 = this.applyPreferredFont(string6, null, (!Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1843175852, 20) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-151613871, 23)) != 0);
        if (Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) && this.trySwapLayerTextWithoutMove(player, editorSession, string, editorRect, bl, textAlignment, n6, string6, n5, d8, n2 != 0, n3 != 0)) {
            editorSession.shellRuntimeRects.put(string, editorRect);
            return;
        }
        Entity entity = this.hudService.getHud(player, string4);
        if (entity != null) {
            int n7;
            EditorRect editorRect2 = editorSession.shellRuntimeRects.get(string);
            int n8 = n7 = editorRect2 != null && !this.sameRect(editorRect2, editorRect) ? Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 4) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1205590585, 17);
            if (n7 != 0) {
                this.hudService.setHudTransitionTicks(entity, Xqedii_3c6skvl.Xqedii_et1f9vygj64d(957878592, 21), Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127272, 2));
            } else {
                this.hudService.setHudNoTransition(entity);
            }
        }
        this.upsertHud(player, string4, placement.location(), placement.scale(), string6, n5, textAlignment, n6);
        this.setLayerTextInterpolationInstant(player, string);
        this.applyElementTransformById(player, string4, d8, n2 != 0, n3 != 0);
        this.clearOutlineHud(player, string4);
        editorSession.shellRuntimeRects.put(string, editorRect);
    }

    public long buildLayersWindowSignature(EditorSession editorSession, List<LayerTreeRow> list, int n, int n2) {
        if (((0xEE9C2AA9 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (list == null || list.isEmpty()) {
            return Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(8594154997266500806L, 27);
        }
        int n3 = Math.max(Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 1), Math.min(list.size(), n));
        int n4 = Math.max(n3, Math.min(list.size(), n2));
        long l = Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-5695673194153150487L, 36);
        l = this.mixLayersSignature(l, n3);
        l = this.mixLayersSignature(l, n4);
        for (int i = n3; i < n4; ++i) {
            LayerTreeRow layerTreeRow = list.get(i);
            l = this.mixLayersSignature(l, layerTreeRow.entry.targetId == null ? Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 8) : layerTreeRow.entry.targetId.hashCode());
            l = this.mixLayersSignature(l, layerTreeRow.entry.displayName == null ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(289421560, 5) : layerTreeRow.entry.displayName.hashCode());
            l = this.mixLayersSignature(l, layerTreeRow.depthValue);
            l = this.mixLayersSignature(l, layerTreeRow.dropdown ? Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 3) : Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 18));
            l = this.mixLayersSignature(l, layerTreeRow.open ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(587343879, 26) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-158445066, 31));
            l = this.mixLayersSignature(l, layerTreeRow.children ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1833738668, 23) : Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 14));
            l = this.mixLayersSignature(l, layerTreeRow.parent ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(587343879, 26) : Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 3));
            l = this.mixLayersSignature(l, layerTreeRow.under ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127244, 5) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-606455481, 25));
            l = this.mixLayersSignature(l, layerTreeRow.end ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(29933706, 16) : Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-2140016606, 14));
            l = this.mixLayersSignature(l, layerTreeRow.dragPlaceholder ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(587343879, 26) : Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 13));
            l = this.mixLayersSignature(l, this.isTargetVisible(editorSession, layerTreeRow.entry.targetId) ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842131372, 12) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1550549571, 5));
            l = this.mixLayersSignature(l, this.isSelectedTarget(editorSession, layerTreeRow.entry.targetId) ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1608741880, 12) : Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 29));
            l = this.mixLayersSignature(l, this.isLayersReorderActive(editorSession) && this.equalsNullable(layerTreeRow.entry.targetId, editorSession.layersReorderHoverTargetId) ? Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-633780263, 1) : Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 15));
            l = this.mixLayersSignature(l, layerTreeRow.extraLines.size());
            for (Integer n5 : layerTreeRow.extraLines) {
                l = this.mixLayersSignature(l, n5 == null ? Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1922021300, 10) : n5);
            }
        }
        return l;
    }

    public long mixLayersSignature(long l, int n) {
        if (((-1083970648 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        long l2 = l ^ (long)n & Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(3720430165121352905L, 62);
        return l2 * Xqedii_3c6skvl.Xqedii_4d486dpawhek(-7887926846649003100L, 57);
    }

    public void renderLayerRuntimeShellElement(Player player, EditorSession editorSession, ConfigurationSection configurationSection, String string, String string2, boolean bl) {
        String string3;
        String string4;
        int n;
        if (((0x8CCC93F2 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || configurationSection == null || string == null || string.isBlank()) {
            return;
        }
        String string5 = EditorLayersLayerPart.Xqedii_37hv94usm9304(string);
        double d = this.readDouble(configurationSection, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("QqeF71pxxTPGBSnnh8yGwISB/izKDr2mTprtXbrw3BZnZGafYt3mIuVULrmvk4RY"), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("hQDIczWQOugPl0NYFOCS9ZL5LskFVXO49JX0gCP4"), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-8021460481851559251L, 16)));
        double d2 = this.readDouble(configurationSection, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("AkEvr/8pc4KcO3RRtC3MZjWKc4EczVpW19dwZw39iuLqF2dG6peGmgvYKJ2VchmM"), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BaJvLxDLpZjGuPlcv+UoERQ4OvjKf3ixBOKZbis8"), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-2807184289329416406L, 12)));
        double d3 = this.readDouble(configurationSection, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("J6Blg0Gm6q4e8CiuRniNS3fsvv6xhaoGYvawylBDn36ckzMOeOo="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("J6Blg0Gm6q4e8CiuRniNS3fsvv6xhaoGYvawylBDn36ckzMOeOo="), this.readDouble(configurationSection, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("MuPL9TmzNgpj9jwLfvQzfScf176BXaztJfEkWpQ1T/0fyVa2rhr9kskz7vnQ72Gq"), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("s66nsxnKzF3aVyGlhcO9W+qieOxaNuYnqYeg/w2Bn3V0PQxQ+CI="), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(7454211170158522615L, 56))));
        double d4 = this.readDouble(configurationSection, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ECyrqavj1dHxeSQ7gZ6k2/rXGjdu+ZgbYvEmQauqWMLvsF2w7odqkffpRxnU307+"), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("LD1FfCdlknnw4eOF5c9W6n25OnNA/uZqF6Q2cwXy+GeNehrM4Go="), this.readDouble(configurationSection, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Rw1pNGFaYQRtz81V2WppdmYsn5eqnkg0RT9s1akha4njOyMYjfmWxZsy5QPBVwz8MTE="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("LD1FfCdlknnw4eOF5c9W6n25OnNA/uZqF6Q2cwXy+GeNehrM4Go="), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(3727331857486164838L, 22))));
        double d5 = this.readDouble(configurationSection, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("4MVSlqpIF9VLsJ+FcXcJ9Kn5TIjpHVHa65wepB0KzIaKBDXF/VrSyvxD21yKfFiHFp0="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("gOuqfVGert7OymRue3ngMuPYEkAt4QwiKCVL9OT4tU16t4Rp22AZOw=="), this.readDouble(configurationSection, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("mLUTgcs0kj7BALmB4V4hv34QFPtZOEngA2gIQBYIBRRSqqxP+NDPW1uqezWCi9q7YtQHpQ=="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("gOuqfVGert7OymRue3ngMuPYEkAt4QwiKCVL9OT4tU16t4Rp22AZOw=="), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(3919041668941600603L, 10))));
        int n2 = d4 < Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(1863665928742559539L, 21)) ? Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-633780263, 1) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-75806936, 22);
        int n3 = d5 < Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282639521999961L, 10)) ? Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 12) : Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 21);
        double d6 = Math.max(Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282581070179417L, 38)), Math.abs(d4));
        double d7 = Math.max(Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826327375901355097L, 48)), Math.abs(d5));
        EditorRect editorRect = new EditorRect(d, d2, d6, d7);
        int n4 = n = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) && this.isLayerSwappableTextRuntimeId(string) ? Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-320004957, 24) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1544688356, 16);
        if (this.shouldSkipLayerStaticMove(player, editorSession, string, editorRect, bl) && n == 0) {
            editorSession.shellRuntimeRects.put(string, editorRect);
            return;
        }
        double d8 = this.readDouble(configurationSection, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("lYcijUIQvBKnTwxqXAzKodRol4fIvdDKsc3uXWBjtCETHTv76R9LLdjpy88="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("/iy128rbnMybxjb3DEO3Hhuvj+qgE5dY7IyIRVAtRStHyWBrXAt/Gw=="), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-7679616546854421701L, 3)));
        int n5 = this.readOpacity(configurationSection, Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1375690925, 12));
        TextDisplay.TextAlignment textAlignment = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) ? this.readTextAlignment(configurationSection) : TextDisplay.TextAlignment.CENTER;
        int n6 = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) ? this.readTextWrapLineWidth(configurationSection) : Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842133164, 5);
        double d9 = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) ? this.toInternalTextTopY(d2, d7) : d2;
        double d10 = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) ? this.applyTextAlignmentOffset(d, d6, textAlignment) : d;
        HudPositionCalculator.Placement placement = this.positionCalculator.calculateBoxPlacement(d10, d9, d3, d6, d7);
        if (Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2)) {
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(36177703, 2)];
            stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)26)] = configurationSection.getString(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG"));
            stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)-633780263, (int)1)] = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
            string4 = this.firstNonBlank(stringArray);
        } else {
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-288241090, 28)];
            stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)-1907230986, (int)7)] = configurationSection.getString(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("XlqmUyGtIAKJ6KrQP2X2Pmg8G6T+q9CHokK1ld/MPdd+bQLcP7uGdCcX"));
            stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)957878592, (int)21)] = configurationSection.getString(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG"));
            stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)-305356372, (int)30)] = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Np/ZKQ9D4rxTzz/czjbkxq+PEsPbrkWhT1LWFKz1");
            string4 = this.firstNonBlank(stringArray);
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(72355406, 3)];
        stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)16)] = configurationSection.getString(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("60jivqWNOwpTpzjxFfZHyfCieekjya9Blgpo9qlxV2lX0T/CY6A="));
        stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)-1544753892, (int)16)] = configurationSection.getString(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("xP9TPRv7EVrwANrp206zvEaiasPrMgw3PscALel0sQYjd7QGkmIG6id5goA4Ibhj5Gk="));
        String string6 = this.firstNonBlank(stringArray);
        string4 = this.withHexPrefix(string4, string6);
        String string7 = this.applyPlaceholderApi(player, string4);
        string7 = this.applyPreferredFont(string7, configurationSection, (!Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-2140000222, 14) : Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 29)) != 0);
        if (Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) && this.trySwapLayerTextWithoutMove(player, editorSession, string, editorRect, bl, textAlignment, n6, string7, n5, d8, n2 != 0, n3 != 0)) {
            editorSession.shellRuntimeRects.put(string, editorRect);
            return;
        }
        double d11 = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) ? Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-5202565253965910100L, 3)) : this.readOutlineSize(configurationSection);
        String string8 = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==") : this.readOutlineColor(configurationSection);
        String string9 = string3 = !Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2) && d11 > Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(3765811220635497299L, 61)) ? this.applyOutlineColor(string7, string8) : null;
        if (this.isRoundedType(string2)) {
            boolean bl2 = this.isDirectionalRoundedType(string2);
            double d12 = this.readRoundedRadius(configurationSection, d6, d7);
            String string10 = this.readRoundedCornerUnicode(configurationSection);
            String string11 = bl2 ? this.readRoundedCornerUnicodeTopLeft(configurationSection) : Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
            String string12 = bl2 ? this.readRoundedCornerUnicodeTopRight(configurationSection) : Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
            String string13 = bl2 ? this.readRoundedCornerUnicodeBottomRight(configurationSection) : Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
            String string14 = bl2 ? this.readRoundedCornerUnicodeBottomLeft(configurationSection) : Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
            double d13 = this.readRoundedTopLeftOffsetX(configurationSection);
            double d14 = this.readRoundedTopLeftOffsetY(configurationSection);
            double d15 = this.readRoundedTopRightOffsetX(configurationSection);
            double d16 = this.readRoundedTopRightOffsetY(configurationSection);
            double d17 = this.readRoundedBottomRightOffsetX(configurationSection);
            double d18 = this.readRoundedBottomRightOffsetY(configurationSection);
            double d19 = this.readRoundedBottomLeftOffsetX(configurationSection);
            double d20 = this.readRoundedBottomLeftOffsetY(configurationSection);
            double d21 = d + d6 / Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502948467853804745L, 43));
            double d22 = d9 + d7 / Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941870784050377L, 14));
            this.renderRoundedOutline(player, new RoundedBox(string5, d, d9, d3, d6, d7), string3, n5, d12, new RoundedCornerGlyphs(string10, string11, string12, string13, string14), new RoundedCornerOffsets(d13, d14, d15, d16, d17, d18, d19, d20), new RoundedTransform(d8, n2 != 0, n3 != 0, d21, d22), d11, TextDisplay.TextAlignment.CENTER, Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-6752804766955969733L, 34)));
            this.renderRoundedBlock(player, new RoundedBox(string5, d, d9, d3, d6, d7), string7, n5, d12, new RoundedCornerGlyphs(string10, string11, string12, string13, string14), new RoundedCornerOffsets(d13, d14, d15, d16, d17, d18, d19, d20), new RoundedTransform(d8, n2 != 0, n3 != 0, d21, d22), TextDisplay.TextAlignment.CENTER);
        } else {
            Entity entity = this.hudService.getHud(player, string5);
            if (entity != null) {
                int n7;
                EditorRect editorRect2 = editorSession.shellRuntimeRects.get(string);
                int n8 = n7 = editorRect2 != null && !this.sameRect(editorRect2, editorRect) ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(289421592, 5) : Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 18);
                if (n7 != 0) {
                    this.hudService.setHudTransitionTicks(entity, Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 0), Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-825112002, 28));
                } else {
                    this.hudService.setHudNoTransition(entity);
                }
            }
            this.upsertHud(player, string5, placement.location(), placement.scale(), string7, n5, textAlignment, n6);
            this.setLayerTextInterpolationInstant(player, string);
            this.applyElementTransformById(player, string5, d8, n2 != 0, n3 != 0);
            if (Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("PNz0FD2Fiak68ax6AH7P0LWiHgD8h8Qmt6UkH1buBjRLbZNG").equals(string2)) {
                this.clearOutlineHud(player, string5);
            } else {
                double d23 = d10 + d6 / Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-8291539072483233895L, 20));
                double d24 = d9 + d7 / Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(2635588151600886714L, 38));
                this.renderSimpleOutline(player, new RoundedBox(string5, d10, d9, d3, d6, d7), string3, n5, TextDisplay.TextAlignment.CENTER, textAlignment, new RoundedTransform(d8, n2 != 0, n3 != 0, d23, d24), d11, Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(4023865139420439113L, 50)));
            }
        }
        editorSession.shellRuntimeRects.put(string, editorRect);
    }

    public void toggleLayerVisibility(Player player, EditorSession editorSession, String string) {
        if ((0x4F3A1BEA ^ 0x4F3A1BEA) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || string == null || string.isBlank()) {
            return;
        }
        this.recordEditorMutation(editorSession);
        LinkedHashSet<String> linkedHashSet = this.resolveVisibilityCascadeTargetIds(editorSession, string);
        if (editorSession.hiddenLayerTargetIds.contains(string)) {
            editorSession.hiddenLayerTargetIds.removeAll(linkedHashSet);
        } else {
            editorSession.hiddenLayerTargetIds.addAll(linkedHashSet);
        }
        if (linkedHashSet.contains(editorSession.hoveredElementId)) {
            this.updateHoveredHighlight(player, editorSession, editorSession.hoveredElementId, null);
            editorSession.hoveredElementId = null;
        }
        this.normalizeSelectionState(editorSession);
        this.rerenderEditableSelection(player, editorSession);
        this.refreshSelectionOutlineColorOnly(player, editorSession);
        this.updateEditorPropertiesSidebar(player, editorSession);
        this.renderLayersPanel(player, editorSession);
    }

    public LinkedHashSet<String> resolveVisibilityCascadeTargetIds(EditorSession editorSession, String string) {
        if ((903284473 * 903284473 - 903284473 & 1) != 0) {
            throw new IllegalStateException();
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        if (string == null || string.isBlank()) {
            return linkedHashSet;
        }
        linkedHashSet.add(string);
        if (editorSession == null) {
            return linkedHashSet;
        }
        String string2 = EditorLayersLayerPart.Xqedii_2n3gilarj48u9(string);
        for (LayerEntry layerEntry : this.collectLayerEntries(editorSession)) {
            if (layerEntry == null || layerEntry.targetId == null || layerEntry.targetId.isBlank() || !layerEntry.targetId.equals(string) && !layerEntry.targetId.startsWith(string2)) continue;
            linkedHashSet.add(layerEntry.targetId);
        }
        return linkedHashSet;
    }

    public LinkedHashSet<String> resolveDescendantLayerTargetIds(EditorSession editorSession, String string) {
        String string2;
        String string3;
        if (((528666884 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        if (editorSession == null || string == null || string.isBlank()) {
            return linkedHashSet;
        }
        String string4 = EditorLayersLayerPart.Xqedii_16wpla9joqij0(string);
        String string5 = this.resolveTimelineHierarchyTargetPath(editorSession, string);
        String string6 = string5.isBlank() ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==") : EditorLayersLayerPart.Xqedii_1asl20lskryjs(string5);
        for (LayerEntry object : this.collectLayerEntries(editorSession)) {
            if (object == null || object.targetId == null || object.targetId.isBlank() || !object.targetId.startsWith(string4) && (string6.isBlank() || object.targetPath == null || !object.targetPath.startsWith(string6))) continue;
            linkedHashSet.add(object.targetId);
        }
        if (editorSession.renderBlocks != null) {
            for (Map map : editorSession.renderBlocks) {
                if (map == null || map.isEmpty()) continue;
                String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842094508, 15)];
                stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)30)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BN2mIpX19aY47CHfKqOZUl8CwXCwYxszBCFmGeDwgJ+D9a8y6wWBY+UQSDkHNCz8b8BEVa4iWT+GSXRE+Mw1mg==")));
                string3 = this.firstNonBlank(stringArray);
                String[] stringArray2 = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 3)];
                stringArray2[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)-532348701, (int)31)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("vWvrMF5LKrigs68zQfTgbk2XACFDlzgDgRqtC1AbsArCfCCApug4aStG1clDPTBIwP5v2QnvT6lntHDAXTbXu/Hdx/A=")));
                string2 = this.firstNonBlank(stringArray2);
                if (string3.isBlank() || !string3.startsWith(string4) && (string6.isBlank() || string2.isBlank() || !string2.startsWith(string6))) continue;
                linkedHashSet.add(string3);
            }
        }
        if (editorSession.elements != null) {
            for (HoverElement hoverElement : editorSession.elements) {
                String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-269673309, 24)];
                stringArray[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)-1374716078, (int)9)] = hoverElement == null ? null : hoverElement.targetId;
                stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127244, (int)5)] = hoverElement == null ? null : hoverElement.id;
                string3 = this.firstNonBlank(stringArray);
                String[] stringArray3 = new String[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-316890132, 0)];
                stringArray3[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)30)] = hoverElement == null ? null : hoverElement.targetPath;
                string2 = this.firstNonBlank(stringArray3);
                if (string3.isBlank() || !string3.startsWith(string4) && (string6.isBlank() || string2.isBlank() || !string2.startsWith(string6))) continue;
                linkedHashSet.add(string3);
            }
        }
        return linkedHashSet;
    }

    public LinkedHashSet<String> resolvePreviewHierarchyTargetIds(EditorSession editorSession, String string) {
        if (((0x7D0DB66C | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 10)];
        stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)238945360, (int)19)] = string;
        String string2 = this.firstNonBlank(stringArray);
        if (string2.isBlank()) {
            return linkedHashSet;
        }
        linkedHashSet.add(string2);
        linkedHashSet.addAll(this.resolveDescendantLayerTargetIds(editorSession, string2));
        return linkedHashSet;
    }

    public void toggleLayerLock(Player player, EditorSession editorSession, String string) {
        int n;
        if ((-1684826656 * -1684826656 - -1684826656 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || string == null || string.isBlank()) {
            return;
        }
        this.recordEditorMutation(editorSession);
        if (editorSession.lockedLayerTargetIds.contains(string)) {
            editorSession.lockedLayerTargetIds.remove(string);
            n = Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 9);
        } else {
            editorSession.lockedLayerTargetIds.add(string);
            n = Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 14);
        }
        if (n != 0 && string.equals(editorSession.hoveredElementId)) {
            this.updateHoveredHighlight(player, editorSession, editorSession.hoveredElementId, null);
            editorSession.hoveredElementId = null;
        }
        this.refreshSelectionOutlineColorOnly(player, editorSession);
        this.updateEditorPropertiesSidebar(player, editorSession);
        this.renderLayersPanel(player, editorSession);
    }

    public void toggleSidebarSelectionVisibility(Player player, EditorSession editorSession) {
        if (((1764646938 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return;
        }
        List<String> list = this.getSelectedTargetIds(editorSession);
        if (list.isEmpty()) {
            return;
        }
        this.recordEditorMutation(editorSession);
        int n = !this.isTargetVisible(editorSession, list.get(Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(527395045, 19))) ? Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-450926744, 11) : Xqedii_3c6skvl.Xqedii_et1f9vygj64d(36177695, 2);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        for (String string : list) {
            LinkedHashSet<String> linkedHashSet2 = this.resolveVisibilityCascadeTargetIds(editorSession, string);
            linkedHashSet.addAll(linkedHashSet2);
            if (n != 0) {
                editorSession.hiddenLayerTargetIds.removeAll(linkedHashSet2);
                continue;
            }
            editorSession.hiddenLayerTargetIds.addAll(linkedHashSet2);
        }
        if (linkedHashSet.contains(editorSession.hoveredElementId)) {
            this.updateHoveredHighlight(player, editorSession, editorSession.hoveredElementId, null);
            editorSession.hoveredElementId = null;
        }
        this.normalizeSelectionState(editorSession);
        this.rerenderEditableSelection(player, editorSession);
        this.refreshSelectionOutlineColorOnly(player, editorSession);
        this.updateEditorPropertiesSidebar(player, editorSession);
        this.renderLayersPanel(player, editorSession);
    }

    public void toggleSidebarSelectionLocked(Player player, EditorSession editorSession) {
        if ((-1316628314 * (-1316628314 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return;
        }
        List<String> list = this.getSelectedTargetIds(editorSession);
        if (list.isEmpty()) {
            return;
        }
        this.recordEditorMutation(editorSession);
        int n = !this.isTargetLocked(editorSession, list.get(Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 1))) ? Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 17) : Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 23);
        for (String string : list) {
            if (n != 0) {
                editorSession.lockedLayerTargetIds.add(string);
                continue;
            }
            editorSession.lockedLayerTargetIds.remove(string);
        }
        if (n != 0 && list.contains(editorSession.hoveredElementId)) {
            this.updateHoveredHighlight(player, editorSession, editorSession.hoveredElementId, null);
            editorSession.hoveredElementId = null;
        }
        this.refreshSelectionOutlineColorOnly(player, editorSession);
        this.updateEditorPropertiesSidebar(player, editorSession);
        this.renderLayersPanel(player, editorSession);
    }

    public void cycleSidebarSelectionAnchor(Player player, EditorSession editorSession) {
        TextDisplay.TextAlignment textAlignment;
        if (((1950953271 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return;
        }
        List<String> list = this.getSelectedTargetIds(editorSession);
        if (list.isEmpty()) {
            this.updateEditorPropertiesSidebar(player, editorSession);
            return;
        }
        TextDisplay.TextAlignment textAlignment2 = null;
        int n = Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1040470030, 27);
        int n2 = Xqedii_3c6skvl.Xqedii_et1f9vygj64d(955781440, 21);
        for (String string2 : list) {
            Map<String, Object> map = this.resolveRawTargetByTargetId(editorSession, string2);
            if (map == null || map.isEmpty()) continue;
            n2 = Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127272, 2);
            TextDisplay.TextAlignment textAlignment3 = this.readHudAlignment(map);
            if (textAlignment2 == null) {
                textAlignment2 = textAlignment3;
                continue;
            }
            if (textAlignment2 == textAlignment3) continue;
            n = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(994519291, 30);
        }
        if (n2 == 0) {
            this.updateEditorPropertiesSidebar(player, editorSession);
            return;
        }
        if (n != 0 || textAlignment2 == null) {
            textAlignment = TextDisplay.TextAlignment.CENTER;
        } else {
            textAlignment = switch (Xqedii_2w5y601.Xqedii_1n7n3sb[textAlignment2.ordinal()]) {
                default -> throw new MatchException(null, null);
                case 1 -> TextDisplay.TextAlignment.CENTER;
                case 2 -> TextDisplay.TextAlignment.RIGHT;
                case 3 -> TextDisplay.TextAlignment.LEFT;
            };
        }
        String string2 = switch (Xqedii_2w5y601.Xqedii_1n7n3sb[textAlignment.ordinal()]) {
            case 1 -> Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("SDu6idCTJFQOEZ/85ukyix9RnImxDXb5SX82KYYoOTRHOUSW");
            case 3 -> Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("TJvqdzFn/XqKfERp9kRpNp4ygfcqsg2LePq2y+5xB3ziHuwnNOw=");
            default -> Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("qKBOWsihiD1ssA444y5gGzDSxvvsCcn2RD7w5zmK+I4E3FWt/elP8g==");
        };
        int n3 = Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 15);
        int n4 = Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 14);
        for (String string3 : list) {
            Map<String, Object> map = this.resolveRawTargetByTargetId(editorSession, string3);
            if (map == null || map.isEmpty() || this.readHudAlignment(map) == textAlignment) continue;
            if (n4 == 0) {
                this.recordEditorMutation(editorSession);
                n4 = Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 1);
            }
            this.setMapPathValue(map, this.resolveTargetHudAlignmentWritePath(map), string2);
            n3 = Xqedii_3c6skvl.Xqedii_et1f9vygj64d(119734824, 18);
        }
        if (n3 == 0) {
            this.updateEditorPropertiesSidebar(player, editorSession);
            return;
        }
        this.rerenderEditableContent(player, editorSession);
        this.renderLayersPanel(player, editorSession);
    }

    public TextDisplay.TextAlignment readTargetHudAlignment(EditorSession editorSession, String string) {
        if (((1619683242 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        Map<String, Object> map = this.resolveRawTargetByTargetId(editorSession, string);
        if (map == null || map.isEmpty()) {
            return TextDisplay.TextAlignment.CENTER;
        }
        return this.readHudAlignment(map);
    }

    public String formatSidebarHudAlignment(TextDisplay.TextAlignment textAlignment) {
        if ((0x39683453 ^ 0x39683453) != 0) {
            throw new IllegalStateException();
        }
        TextDisplay.TextAlignment textAlignment2 = textAlignment == null ? TextDisplay.TextAlignment.CENTER : textAlignment;
        return switch (Xqedii_2w5y601.Xqedii_1n7n3sb[textAlignment2.ordinal()]) {
            case 1 -> Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("sgdXWjcBsdQqwPSdcgf1kITrTIf1K1fElpaGqxuH956+85be");
            case 3 -> Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("/NXMlUohyhFIH8t4nG/ChmXG55+5WLq41YB3Vct8k/dW6rUkkL0=");
            default -> Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("jnLgmQCLZaB+Ch0zDYihS3VbnCDC1XpiYyMF4LlHLqjPE0BnAbINyw==");
        };
    }

    public String resolveTargetHudAlignmentWritePath(Map<String, Object> map) {
        if (((-1500607020 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (map == null || map.isEmpty()) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("g5E4gR/CeJ/SuB+m20KP25tajsBWtc7zxpBWF5DitPeNZPmZg6/YIw==");
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("g5E4gR/CeJ/SuB+m20KP25tajsBWtc7zxpBWF5DitPeNZPmZg6/YIw=="))) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("g5E4gR/CeJ/SuB+m20KP25tajsBWtc7zxpBWF5DitPeNZPmZg6/YIw==");
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ksWiCgmZO02FN7EZCp6dQrQ4POR/5maV5V+/RQyvckcts8X3Cldl7KnxiDQXTyEy"))) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ksWiCgmZO02FN7EZCp6dQrQ4POR/5maV5V+/RQyvckcts8X3Cldl7KnxiDQXTyEy");
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("4y6VysgsIHMVFMG7gZUZvPZfK3T/E9w2FVz20LU6yJw5Q4i7WfGzvovTDS65xibWbJVHbovz"))) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("4y6VysgsIHMVFMG7gZUZvPZfK3T/E9w2FVz20LU6yJw5Q4i7WfGzvovTDS65xibWbJVHbovz");
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("QJkbQjjNZh3JgzOJbK4QHVEhxojG9DtJPUNnX2i1/M6FPUM1YetagtyXzqkG8nbmQf+vFEfi2U760QZHQNU="))) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("QJkbQjjNZh3JgzOJbK4QHVEhxojG9DtJPUNnX2i1/M6FPUM1YetagtyXzqkG8nbmQf+vFEfi2U760QZHQNU=");
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("8J2bxht4QZ1W9xwW7peObdsN3cG+IvRN4Qe4eBYEaX/QapF21xxQkOgq"))) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("8J2bxht4QZ1W9xwW7peObdsN3cG+IvRN4Qe4eBYEaX/QapF21xxQkOgq");
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Z9+0H8ocUvK9afbYW4kj0k2vBMPSkV6koOwazojlbFqNw9XDw0zv/zkAiUarqujfsqJvmG6ugt4="))) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Z9+0H8ocUvK9afbYW4kj0k2vBMPSkV6koOwazojlbFqNw9XDw0zv/zkAiUarqujfsqJvmG6ugt4=");
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("OD6sr5//BMw4W3a9yY++IRZEaGQZ4F7ngcgIOubgY94rTLZYiZsNveFEPSWwO60z"))) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("OD6sr5//BMw4W3a9yY++IRZEaGQZ4F7ngcgIOubgY94rTLZYiZsNveFEPSWwO60z");
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("DndwJcoWNGCRANuKRqfzEHWL+5WeEKQ9pfF7sYgkEdPgVv5es9UQWc+ndun8x+YsSDc="))) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("DndwJcoWNGCRANuKRqfzEHWL+5WeEKQ9pfF7sYgkEdPgVv5es9UQWc+ndun8x+YsSDc=");
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("L5JOIYv9LjwEV5FjmKX/rOtc0mREunukcSdQCZDvy8OJdFDHQK/aW+RTJgFYTFMjX6BNpvwC0wc="))) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("L5JOIYv9LjwEV5FjmKX/rOtc0mREunukcSdQCZDvy8OJdFDHQK/aW+RTJgFYTFMjX6BNpvwC0wc=");
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("SZF8Q6XJbJkR/FjrCSzoiERXiWJa2D9xNXKXZz0A7PgpgNAyfnqCAt/Fvsh7i36lQRmhvh2csC6DlhjM51w="))) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("SZF8Q6XJbJkR/FjrCSzoiERXiWJa2D9xNXKXZz0A7PgpgNAyfnqCAt/Fvsh7i36lQRmhvh2csC6DlhjM51w=");
        }
        if (this.hasMapPath(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("NKgDAChWTAVj4k4dd8gfz7cYdsLMQkWUUBsRBeKyd8TAsJX+zukgvLq+0A+k6Xoa7WiC9TJNk84XZjqP1vjZlA=="))) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("NKgDAChWTAVj4k4dd8gfz7cYdsLMQkWUUBsRBeKyd8TAsJX+zukgvLq+0A+k6Xoa7WiC9TJNk84XZjqP1vjZlA==");
        }
        return map.containsKey(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("VngT8WdKVtYwKjSZFU4hXx2yv3qAzhugzDqTb+AyRfYHbYRlNsrdkA==")) ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("4y6VysgsIHMVFMG7gZUZvPZfK3T/E9w2FVz20LU6yJw5Q4i7WfGzvovTDS65xibWbJVHbovz") : Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("g5E4gR/CeJ/SuB+m20KP25tajsBWtc7zxpBWF5DitPeNZPmZg6/YIw==");
    }

    public void appendSelectionTarget(EditorSession editorSession, String string) {
        if (((1241787905 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            return;
        }
        if (editorSession.selectedElementId == null || editorSession.selectedElementId.isBlank()) {
            editorSession.selectedElementId = string;
            editorSession.additionalSelectedElementIds.clear();
            return;
        }
        if (string.equals(editorSession.selectedElementId) || editorSession.additionalSelectedElementIds.contains(string)) {
            return;
        }
        editorSession.additionalSelectedElementIds.add(string);
    }

    public void toggleLayerSelectionTarget(EditorSession editorSession, String string) {
        if ((-1141208715 * (-1141208715 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            return;
        }
        if (!this.isTargetInteractable(editorSession, string)) {
            return;
        }
        if (string.equals(editorSession.selectedElementId)) {
            if (editorSession.additionalSelectedElementIds.isEmpty()) {
                editorSession.selectedElementId = null;
                return;
            }
            String string2 = (String)editorSession.additionalSelectedElementIds.iterator().next();
            editorSession.additionalSelectedElementIds.remove(string2);
            editorSession.selectedElementId = string2;
            return;
        }
        if (editorSession.additionalSelectedElementIds.remove(string)) {
            return;
        }
        this.appendSelectionTarget(editorSession, string);
    }

    public boolean hasLayerEntryTargetId(EditorSession editorSession, String string) {
        if (((1874963398 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 13) != 0;
        }
        for (LayerEntry layerEntry : this.collectLayerEntries(editorSession)) {
            if (layerEntry == null || !string.equals(layerEntry.targetId)) continue;
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-320004957, 24) != 0;
        }
        return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(289421560, 5) != 0;
    }

    public void clearStaleLayerRuntimeShellIds(Player player, EditorSession editorSession, LinkedHashSet<String> linkedHashSet) {
        if (((0xAF3E910F | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || editorSession.runtimeLayerShellIds.isEmpty()) {
            return;
        }
        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<String>(editorSession.runtimeLayerShellIds);
        linkedHashSet2.removeAll(linkedHashSet);
        for (String string : linkedHashSet2) {
            this.removeLayerRuntimeShellElement(player, string);
            editorSession.shellRuntimeRects.remove(string);
        }
    }

    public void removeLayerRuntimeShellElement(Player player, String string) {
        if ((0xE4245334 ^ 0xE4245334) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || string == null || string.isBlank()) {
            return;
        }
        String string2 = EditorLayersLayerPart.Xqedii_860zwdndv0yl(string);
        this.clearOutlineHud(player, string2);
        this.removeBaseHud(player, string2);
        this.removeRoundedParts(player, string2);
    }

    public int resolveLayerSlotByHit(EditorSession editorSession, double d, double d2) {
        if ((0x1D5ED785 ^ 0x1D5ED785) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716590, 9);
        }
        List<LayerTreeRow> list = this.collectLayerTreeRows(editorSession);
        int n = Math.max(Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1544688356, 16), list.size() - Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127246, 1));
        int n2 = (int)Math.floor(this.clampLayersScrollValue(editorSession.layersScrollOffset, n) + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(6010953710679333826L, 61)));
        int n3 = Math.max(Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1550549571, 5), Math.min(Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(300974253, 26), list.size() - n2));
        if (n3 == 0) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(-1842127277, 5);
        }
        int n4 = Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1106280622, 28);
        double d3 = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(826282605179038808L, 36));
        for (int i = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-80001240, 22); i <= n3; ++i) {
            double d4;
            if (!this.isInsideShellBlock(editorSession, this.layerSlotId(i), d, d2) && !this.isInsideShellBlock(editorSession, this.layerDropdownHitboxId(i), d, d2) && !this.isInsideShellBlock(editorSession, this.layerOpacityHitboxId(i), d, d2)) continue;
            EditorRect editorRect = this.findShellBlockRect(editorSession, this.layerSlotId(i));
            double d5 = d4 = editorRect == null ? Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-4145769536241748020L, 19)) : Math.abs(d2 - (editorRect.y + editorRect.height / Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-4703201450264817079L, 53))));
            if (!(d4 < d3)) continue;
            d3 = d4;
            n4 = i;
        }
        if (n4 != Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374781614, 16)) {
            return n4;
        }
        EditorRect editorRect = this.findShellBlockRect(editorSession, this.layerSlotId(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1707909548, 27)));
        if (editorRect == null) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(-1842127277, 6);
        }
        double d6 = Math.max(Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-903406783140719705L, 61)), editorRect.height);
        EditorRect editorRect2 = this.resolveLayersListRect(editorSession, list);
        double d7 = editorRect2 == null ? editorRect.x : editorRect2.x;
        double d8 = editorRect2 == null ? editorRect.maxX() : editorRect2.maxX();
        double d9 = editorRect.y - d6 * Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(5296221361224637597L, 3));
        double d10 = editorRect.y + d6 * (double)n3;
        if (d < d7 || d > d8 || d2 < d9 || d2 > d10) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(-1842127277, 29);
        }
        int n5 = (int)Math.floor((d2 - editorRect.y) / d6) + Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 25);
        return Math.max(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1825350060, 24), Math.min(n3, n5));
    }

    public boolean isLayerDropdownHit(EditorSession editorSession, int n, int n2, double d, double d2) {
        if ((2113011083 * 2113011083 + 2113011083 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || n2 < Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1907231114, 7)) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 1) != 0;
        }
        return this.isInsideShellBlockPadded(editorSession, this.layerDropdownHitboxId(n2), d, d2, Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5503152152382850249L, 49)), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-366079319535761114L, 55)));
    }

    public boolean isInsideShellBlockPadded(EditorSession editorSession, String string, double d, double d2, double d3, double d4) {
        if ((327327010 * 327327010 + 327327010 & 1) != 0) {
            throw new IllegalStateException();
        }
        EditorRect editorRect = this.findShellBlockRect(editorSession, string);
        if (editorRect == null) {
            return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(59736340, 17) != 0;
        }
        double d5 = Math.max(Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-375068926604457690L, 55)), d3);
        double d6 = Math.max(Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(8594154997266500806L, 27)), d4);
        return (d >= editorRect.x - d5 && d <= editorRect.maxX() + d5 && d2 >= editorRect.y - d6 && d2 <= editorRect.maxY() + d6 ? Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1267560525, 2) : Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 2)) != 0;
    }

    public void clearLayersRuntimeHud(Player player) {
        if ((1046652220 * 1046652220 + 1046652220 & 1) != 0) {
            throw new IllegalStateException();
        }
        EditorSession editorSession = player == null ? null : (EditorSession)this.editorSessions.get(player.getUniqueId());
        this.clearLayersRuntimeHud(player, editorSession);
    }

    public void clearLayersRuntimeHud(Player player, EditorSession editorSession) {
        if ((1350935586 * (1350935586 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession != null) {
            editorSession.layersRenderQueued = (Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 4)) != 0;
            this.stopLayersReorderAutoScroll(editorSession);
            this.clearLayersReorderArm(editorSession);
            editorSession.layersReorderActive = (Xqedii_3c6skvl.Xqedii_et1f9vygj64d(955781440, 21)) != 0;
            editorSession.layersReorderTargetId = null;
            editorSession.layersReorderHoverTargetId = null;
            editorSession.layersReorderGhostLabel = null;
            editorSession.layersReorderPreviewInsertIndex = Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374718126, 11);
            editorSession.layersReorderLastHitX = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-1454096218051238757L, 57));
            editorSession.layersReorderLastHitY = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(891255852356649161L, 11));
        }
        if (player != null) {
            this.clearLayersReorderGhostHud(player);
        }
        if (player == null || editorSession == null || editorSession.runtimeLayerShellIds.isEmpty()) {
            return;
        }
        editorSession.layersScrollAnimationToken += Xqedii_3c6skvl.Xqedii_306hip527e6uo(1841865132, 18);
        editorSession.layersScrollVelocity = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(6253343766296114105L, 7));
        editorSession.layersRenderedStart = Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1920920573, 25);
        editorSession.layersRenderedCount = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-75806936, 22);
        editorSession.layersRenderedFraction = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941870784038089L, 7));
        editorSession.layersRenderedSignature = Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-5940056541117323406L, 8);
        ArrayList<String> arrayList = new ArrayList<String>(editorSession.runtimeLayerShellIds);
        for (String string : arrayList) {
            this.removeLayerRuntimeShellElement(player, string);
            editorSession.shellRuntimeRects.remove(string);
        }
        editorSession.runtimeLayerShellIds.clear();
    }

    public EditorRect resolveLayersListRect(EditorSession editorSession) {
        if ((-1193245566 * -1193245566 - -1193245566 & 1) != 0) {
            throw new IllegalStateException();
        }
        return this.resolveLayersListRect(editorSession, this.collectLayerTreeRows(editorSession));
    }

    public EditorRect resolveLayersListRect(EditorSession editorSession, List<LayerTreeRow> list) {
        if (((0xAD1811C5 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        List<LayerTreeRow> list2 = list == null ? Collections.emptyList() : list;
        int n = Math.max(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-2129394801, 1), list2.size() - Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-772767571, 27));
        int n2 = (int)Math.floor(this.clampLayersScrollValue(editorSession == null ? Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-5905291172238938736L, 24)) : (double)editorSession.layersScrollOffset, n) + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-4437559327878468419L, 16)));
        int n3 = Math.max(Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 23), Math.min(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(578844208, 6), Math.max(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1979594816, 8), list2.size() - n2)));
        EditorRect editorRect = this.findShellBlockRect(editorSession, this.layerSlotId(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-463452928, 23)));
        double d = this.resolveLayersGridStartY(editorSession);
        double d2 = this.resolveLayersRowStep(editorSession);
        if (editorRect != null) {
            return new EditorRect(editorRect.x, d, editorRect.width, (double)n3 * Math.max(Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(3528402849913417228L, 40)), d2));
        }
        return new EditorRect(this.resolveLayersGridStartX(editorSession), d, Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941881456870601L, 35)), (double)n3 * Math.max(Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(6078839673134040265L, 61)), d2));
    }

    public double resolveLayersRowStep(EditorSession editorSession) {
        double d;
        if (((602194638 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        EditorRect editorRect = this.findShellBlockRect(editorSession, this.layerSlotId(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1945591780, 28)));
        EditorRect editorRect2 = this.findShellBlockRect(editorSession, this.layerSlotId(Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-633780257, 1)));
        if (editorRect != null && editorRect2 != null && Double.isFinite(d = Math.abs(editorRect2.y - editorRect.y)) && d > Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(4221194222357772109L, 48))) {
            return d;
        }
        Double d2 = this.resolveLayersGridElementHeight(editorSession);
        if (d2 != null) {
            double d3 = Math.abs(d2 + this.resolveLayersGridGap(editorSession));
            if (Double.isFinite(d3) && d3 > Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-2107622086900277702L, 20))) {
                return d3;
            }
            if (d2 > Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(8838845121272439506L, 39))) {
                return d2;
            }
        }
        if (editorRect != null && Double.isFinite(editorRect.height) && editorRect.height > Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(4993443614271700361L, 36))) {
            return editorRect.height;
        }
        return Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941870768764873L, 25));
    }

    public double resolveLayersGridStartX(EditorSession editorSession) {
        if (((-1637511103 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        Map<String, Object> map = this.findLayersGridBlockMap(editorSession);
        if (map != null) {
            return this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("QqeF71pxxTPGBSnnh8yGwISB/izKDr2mTprtXbrw3BZnZGafYt3mIuVULrmvk4RY"), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("hQDIczWQOugPl0NYFOCS9ZL5LskFVXO49JX0gCP4"), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826300171578502233L, 46))));
        }
        EditorRect editorRect = this.findShellBlockRect(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("QDx2f/bFSqckwwbIvHdMB9y85rzmIju6euZ/ZPOYBeHfUvbRYmDj7A=="));
        if (editorRect != null) {
            return editorRect.x + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-681815607725255769L, 59));
        }
        EditorRect editorRect2 = this.findShellBlockRect(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("u0AArnE5fUxL6HZqzE9sqXMSAUmElj72tMV/l2AHDrnIBemsMD9eil/WEqhndYjYXrtYlLFN"));
        if (editorRect2 != null) {
            return editorRect2.x + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282639555439705L, 27));
        }
        return Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941870784019201L, 16));
    }

    public double resolveLayersGridStartY(EditorSession editorSession) {
        if (((0x6B0A62D4 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        Map<String, Object> map = this.findLayersGridBlockMap(editorSession);
        if (map != null) {
            return this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("AkEvr/8pc4KcO3RRtC3MZjWKc4EczVpW19dwZw39iuLqF2dG6peGmgvYKJ2VchmM"), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BaJvLxDLpZjGuPlcv+UoERQ4OvjKf3ixBOKZbis8"), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-753801733507378265L, 58))));
        }
        EditorRect editorRect = this.findShellBlockRect(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("QDx2f/bFSqckwwbIvHdMB9y85rzmIju6euZ/ZPOYBeHfUvbRYmDj7A=="));
        if (editorRect != null) {
            return editorRect.y + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-5418175086126272594L, 3));
        }
        EditorRect editorRect2 = this.findShellBlockRect(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("u0AArnE5fUxL6HZqzE9sqXMSAUmElj72tMV/l2AHDrnIBemsMD9eil/WEqhndYjYXrtYlLFN"));
        if (editorRect2 != null) {
            return editorRect2.y + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282640062008409L, 31));
        }
        return Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502163476681114825L, 51));
    }

    public double resolveLayersGridGap(EditorSession editorSession) {
        if (((-15238956 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        Map<String, Object> map = this.findLayersGridBlockMap(editorSession);
        if (map != null) {
            return this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("nc2SIaRHCPYvzXpmYCrrCqo2aU58/0vDxnJ4f4vC5jbWAw=="), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("LK6f2frMZnxGqJLOJ/7KVcDpv6Cr93r3v+gyFqf1lLclAfOl9/xj3pQ6"), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(1114204605417971907L, 44))));
        }
        return Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-825436951871482969L, 50));
    }

    public Double resolveLayersGridElementHeight(EditorSession editorSession) {
        if ((435702968 * (435702968 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        Map<String, Object> map = this.findLayersGridBlockMap(editorSession);
        if (map == null) {
            return null;
        }
        double d = this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("r/YZkxZlduV+lZKe07KoiSTM61mopywSUEBNOOhzl7p6AphOSjV6fGTwk15nXQ=="), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("tt+U7ZoLT/cgvqdrtlnrWBkhs/zk0sN2qZA7OcwquBK+cd8C+vyAdDVIzmMYBeNf38SR6vFR"), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("56Yplhm5Zkftmr5hGVTScwh65z+m5+OOcCoCMYP0zWYZ4sfdEh+kX43WW6yqA5cpuJubsgtFnuk="), this.readMapPathDouble(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("aE2OewrvVqtTv2Bo5smRMbDXdxNFsIaqEJLFD901eZrLRr3/TgA2fYezzLgzqsfxnY89zutltL4="), Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(4926481118480614473L, 8))))));
        if (!Double.isFinite(d)) {
            return null;
        }
        return Math.max(Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282639521999961L, 10)), d);
    }

    public Map<String, Object> findLayersGridBlockMap(EditorSession editorSession) {
        if (((-699867974 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || editorSession.shellBlocks == null || editorSession.shellBlocks.isEmpty()) {
            return null;
        }
        ConfigurationSection configurationSection = this.findShellBlockSection(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("QDx2f/bFSqckwwbIvHdMB9y85rzmIju6euZ/ZPOYBeHfUvbRYmDj7A=="));
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 9)];
        stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)2109580180, (int)21)] = configurationSection == null ? null : configurationSection.getString(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("vWvrMF5LKrigs68zQfTgbk2XACFDlzgDgRqtC1AbsArCfCCApug4aStG1clDPTBIwP5v2QnvT6lntHDAXTbXu/Hdx/A="));
        String string = this.firstNonBlank(stringArray);
        if (string.isBlank()) {
            return null;
        }
        for (Map<String, Object> map : editorSession.shellBlocks) {
            if (map == null || map.isEmpty()) continue;
            String[] stringArray2 = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1308905486, 27)];
            stringArray2[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)29868170, (int)16)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("02a8+4G93rzDL4ODr7PdBbUzIa4GPi8YHvqdNM9J42f/pNbI")));
            stringArray2[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)144710796, (int)4)] = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("TfZY+wVXSFSHWu7fmgJ0a/HGYyUWEBiNrTBJ4EoeG0ar+0WWRNg=");
            String string2 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
            if (!Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("xQohIJHEckvtkwmcwtWkD6H9NiI6F8W1wBBN9il2h/Gz4ws3qPq+nnwB425N9goc").equals(string2)) continue;
            String[] stringArray3 = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 27)];
            stringArray3[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)19)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("vWvrMF5LKrigs68zQfTgbk2XACFDlzgDgRqtC1AbsArCfCCApug4aStG1clDPTBIwP5v2QnvT6lntHDAXTbXu/Hdx/A=")));
            String string3 = this.firstNonBlank(stringArray3);
            if (!this.belongsToSidebarPanel(string, string3)) continue;
            return map;
        }
        return null;
    }

    public boolean isInsideRect(EditorRect editorRect, double d, double d2) {
        if (((1932449365 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorRect == null) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 27) != 0;
        }
        return editorRect.contains(d, d2);
    }

    public boolean handleLayersScroll(Player player, EditorSession editorSession, double d, double d2, int n) {
        if (((-2099923411 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || n == 0) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 0) != 0;
        }
        List<LayerTreeRow> list = this.collectLayerTreeRows(editorSession);
        EditorRect editorRect = this.resolveLayersListRect(editorSession, list);
        if (!this.isInsideRect(editorRect, d, d2)) {
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-158445066, 31) != 0;
        }
        int n2 = n > 0 ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1707909548, 27) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1883786125, 18);
        int n3 = Math.max(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-133087176, 29), list.size() - Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716589, 5));
        if (n3 <= 0) {
            editorSession.layersScrollOffset = Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-266174351, 30);
            editorSession.layersScrollPosition = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282639521999961L, 3));
            editorSession.layersScrollTarget = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282639521999961L, 46));
            editorSession.layersScrollVelocity = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941870784038089L, 11));
            editorSession.layersScrollAnimationToken += Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1884048270, 18);
            this.flashLayersScrollEdge(player, editorSession, (n2 < 0 ? Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-633780263, 1) : Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 12)) != 0);
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1280019825, 26) != 0;
        }
        int n4 = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1267560525, 2);
        int n5 = (int)Math.floor(this.clampLayersScrollValue(editorSession.layersScrollOffset, n3) + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(7320911111656527603L, 33)));
        int n6 = (int)Math.floor(this.clampLayersScrollValue(n5 + n2 * n4, n3) + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(4051940761543421966L, 42)));
        if (n6 == n5) {
            this.flashLayersScrollEdge(player, editorSession, (n2 < 0 ? Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-825112002, 28) : Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 0)) != 0);
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 25) != 0;
        }
        editorSession.layersScrollOffset = n6;
        editorSession.layersScrollPosition = n6;
        editorSession.layersScrollTarget = n6;
        editorSession.layersScrollVelocity = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941870784038089L, 48));
        editorSession.layersScrollAnimationToken += Xqedii_3c6skvl.Xqedii_et1f9vygj64d(335778177, 9);
        this.queueLayersPanelRender(player, editorSession);
        return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-633780263, 1) != 0;
    }

    public void flashLayersScrollEdge(Player player, EditorSession editorSession, boolean bl) {
        if (((0xA932BD6B | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return;
        }
        if (this.isLayersReorderActive(editorSession)) {
            this.setShellOpacity(player, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("reKw17dWDvl2K1X/iLDhHIpTl7Dq5lMuljAMkWg6DO2N4fm3XDKg3kF8+R/IZnxb"), Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-450924696, 11));
            this.setShellOpacity(player, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("1wUUnfhpeZuNhYR8XrnTxfOjp7wkuPfdauQrVq+gLqzbp6eZoBPkB8QKb3Ao/RyqwRLeaPev"), Xqedii_3c6skvl.Xqedii_et1f9vygj64d(520235015, 26));
            return;
        }
        String string = bl ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("reKw17dWDvl2K1X/iLDhHIpTl7Dq5lMuljAMkWg6DO2N4fm3XDKg3kF8+R/IZnxb") : Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("1wUUnfhpeZuNhYR8XrnTxfOjp7wkuPfdauQrVq+gLqzbp6eZoBPkB8QKb3Ao/RyqwRLeaPev");
        int n = this.getShellOpacity(player, editorSession, string, Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-556676546, 28));
        int n2 = bl ? (editorSession.layersScrollTopFlashToken = editorSession.layersScrollTopFlashToken + Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1193868091, 6)) : (editorSession.layersScrollBottomFlashToken = editorSession.layersScrollBottomFlashToken + Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842258348, 17));
        int[] nArray = new int[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(587343879, 26)];
        nArray[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)-1374716078, (int)21)] = Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 24);
        int[] nArray2 = nArray;
        Xqedii_38o2zes.Xqedii_j3mggbv((Plugin)this.plugin, (Entity)player, Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282639521999961L, 46), Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(-5502941870784038090L, 20), cancellableTask -> {
            int n3;
            int n4;
            if ((1993053455 * (1993053455 + 1) & 1) != 0) {
                throw new IllegalStateException();
            }
            if (!player.isOnline()) {
                cancellableTask.cancel();
                return;
            }
            EditorSession editorSession2 = (EditorSession)this.editorSessions.get(player.getUniqueId());
            if (editorSession2 != editorSession) {
                cancellableTask.cancel();
                return;
            }
            int n5 = n4 = bl ? editorSession.layersScrollTopFlashToken : editorSession.layersScrollBottomFlashToken;
            if (n4 != n2) {
                cancellableTask.cancel();
                return;
            }
            if (editorSession.rightSidebarTab != EditorSidebarTab.LAYERS) {
                this.setShellOpacity(player, string, Xqedii_3c6skvl.Xqedii_et1f9vygj64d(238945360, 19));
                cancellableTask.cancel();
                return;
            }
            int n6 = Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 17);
            nArray[n6] = nArray2[n6] + Xqedii_3c6skvl.Xqedii_306hip527e6uo(1837932972, 22);
            if (nArray2[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-775274786, 4)] <= Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1375240365, 18)) {
                double d = (double)nArray2[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1550549571, 5)] / Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502967215386051785L, 45));
                n3 = (int)Math.round((double)n + (Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-2743598874294547395L, 54)) - (double)n) * d);
            } else {
                int n7 = nArray2[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(14934085, 15)] - Xqedii_3c6skvl.Xqedii_306hip527e6uo(-305356371, 31);
                n3 = (int)Math.round(Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-1036442384060404436L, 17)) * (Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502924295777862857L, 46)) - (double)n7 / Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-5220579652475392082L, 3))));
            }
            this.setShellOpacity(player, string, Math.max(Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 13), Math.min(Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1443856210, 26), n3)));
            if (nArray2[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 30)] >= Xqedii_3c6skvl.Xqedii_306hip527e6uo(1976345004, 26)) {
                this.setShellOpacity(player, string, Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 10));
                cancellableTask.cancel();
            }
        });
    }

    public void queueLayersPanelRender(Player player, EditorSession editorSession) {
        if (((0x10AF804F | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || editorSession.layersRenderQueued) {
            return;
        }
        editorSession.layersRenderQueued = (Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 5)) != 0;
        Xqedii_38o2zes.Xqedii_1avvt9e((Plugin)this.plugin, (Entity)player, () -> {
            if ((1886593640 * 1886593640 - 1886593640 & 1) != 0) {
                throw new IllegalStateException();
            }
            EditorSession currentSession = (EditorSession)this.editorSessions.get(player.getUniqueId());
            if (currentSession == null) {
                return;
            }
            currentSession.layersRenderQueued = (Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-2129394801, 1)) != 0;
            this.renderLayersPanel(player, currentSession);
        });
    }

    public String resolveLayersReorderHoverTargetId(EditorSession editorSession, List<LayerTreeRow> list, int n, double d, double d2) {
        Object object;
        if ((794897734 * 794897734 + 794897734 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || list == null || list.isEmpty() || n < 0 || n >= list.size()) {
            return null;
        }
        List<LayerTreeRow> list2 = this.buildLayersRowsWithReorderPlaceholder(editorSession, list);
        int n2 = Math.max(Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-775274786, 4), list2.size() - Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842250156, 13));
        int n3 = (int)Math.floor(this.clampLayersScrollValue(editorSession.layersScrollOffset, n2) + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(8838845121272439506L, 39)));
        int n4 = Math.max(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1608745976, 12), Math.min(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842119596, 9), Math.max(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(14934085, 15), list2.size() - n3)));
        if (n4 <= 0) {
            return null;
        }
        int n5 = this.resolveLayerSlotByHitStrict(editorSession, n4, d, d2);
        if (n5 < Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-640009913, 25) || n5 > n4) {
            return null;
        }
        int n6 = n3 + (n5 - Xqedii_3c6skvl.Xqedii_306hip527e6uo(1833738668, 23));
        if (n6 < 0 || n6 >= list2.size()) {
            return null;
        }
        LayerTreeRow layerTreeRow = list2.get(n6);
        if (layerTreeRow == null || layerTreeRow.dragPlaceholder || layerTreeRow.entry == null) {
            return null;
        }
        boolean bl = this.isInsideShellBlock(editorSession, this.layerDropdownHitboxId(n5), d, d2);
        int n7 = Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-2129394801, 1);
        int n8 = Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1608745976, 12);
        if (!bl && this.isInsideShellBlock(editorSession, this.layerSlotId(n5), d, d2) && (object = this.findShellBlockRect(editorSession, this.layerSlotId(n5))) != null) {
            n7 = d <= ((EditorRect)object).x + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5306098503086556361L, 59)) ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(29933706, 16) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1113353091, 29);
            double d3 = ((EditorRect)object).y + ((EditorRect)object).height * Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826281134135962713L, 43));
            double d4 = ((EditorRect)object).maxY() - ((EditorRect)object).height * Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-7004796978979617827L, 58));
            int n9 = n8 = d2 >= d3 && d2 <= d4 ? Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 15) : Xqedii_3c6skvl.Xqedii_et1f9vygj64d(36177695, 2);
        }
        if (!bl && n7 == 0 && n8 == 0) {
            return null;
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127340, 6)];
        stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)26)] = layerTreeRow.entry.targetId;
        object = this.firstNonBlank(stringArray);
        String[] stringArray2 = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1843175852, 20)];
        stringArray2[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)-1374716078, (int)24)] = editorSession.layersReorderTargetId;
        String string = this.firstNonBlank(stringArray2);
        if (((String)object).isBlank() || string.isBlank() || ((String)object).equals(string) || this.isLayerTargetDescendantOf((String)object, string)) {
            return null;
        }
        return (String) object;
    }

    public int resolveLayerSlotByHitStrict(EditorSession editorSession, int n, double d, double d2) {
        if ((-1802669320 * (-1802669320 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || n <= 0) {
            return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(453126151, 26);
        }
        int n2 = Xqedii_3c6skvl.Xqedii_et1f9vygj64d(906252302, 27);
        double d3 = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502948466780062921L, 42));
        for (int i = Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1915757184, 22); i <= n; ++i) {
            double d4;
            if (!this.isInsideShellBlock(editorSession, this.layerSlotId(i), d, d2) && !this.isInsideShellBlock(editorSession, this.layerDropdownHitboxId(i), d, d2) && !this.isInsideShellBlock(editorSession, this.layerOpacityHitboxId(i), d, d2)) continue;
            EditorRect editorRect = this.findShellBlockRect(editorSession, this.layerSlotId(i));
            double d5 = d4 = editorRect == null ? Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-2545831026302894631L, 62)) : Math.abs(d2 - (editorRect.y + editorRect.height / Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941871186691273L, 29))));
            if (!(d4 < d3)) continue;
            d3 = d4;
            n2 = i;
        }
        return n2;
    }

    public int snapLayersReorderInsertIndexToSiblingBoundary(EditorSession editorSession, List<LayerTreeRow> list, int n, int n2) {
        Object object;
        String string;
        int n3;
        Object object2;
        List<LayerTreeRow> list2;
        if ((0x2BF90B2F ^ 0x2BF90B2F) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || list == null || list.isEmpty() || n < 0 || n >= list.size()) {
            return Math.max(Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(687569735, 14), n2);
        }
        LayerTreeRow layerTreeRow = list.get(n);
        if (layerTreeRow == null || layerTreeRow.entry == null) {
            ArrayList<LayerTreeRow> arrayList = new ArrayList<LayerTreeRow>(list);
            arrayList.remove(n);
            return Math.max(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1911562880, 22), Math.min(arrayList.size(), n2));
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842131372, 12)];
        stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)13)] = layerTreeRow.entry.targetId;
        String string2 = this.firstNonBlank(stringArray);
        List<LayerTreeRow> list3 = list2 = string2.isBlank() ? new ArrayList<LayerTreeRow>(list) : this.buildRowsWithoutSourceSubtree(list, string2);
        if (string2.isBlank()) {
            list2.remove(n);
        }
        String string3 = this.resolveDirectLayerParentTargetId(layerTreeRow.entry.targetId);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-775274786, 4); i < list2.size(); ++i) {
            LayerTreeRow layerTreeRow2 = list2.get(i);
            if (layerTreeRow2 == null || layerTreeRow2.entry == null || !this.equalsNullable((String)(object2 = this.resolveDirectLayerParentTargetId(layerTreeRow2.entry.targetId)), string3)) continue;
            arrayList.add(i);
        }
        if (arrayList.isEmpty()) {
            return Math.max(Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-901849391, 12), Math.min(list2.size(), n2));
        }
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        linkedHashSet.add((Integer)arrayList.get(Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1883786126, 18)));
        for (n3 = Xqedii_3c6skvl.Xqedii_306hip527e6uo(2110562732, 28); n3 < arrayList.size(); ++n3) {
            linkedHashSet.add((Integer)arrayList.get(n3));
        }
        n3 = (Integer)arrayList.get(arrayList.size() - Xqedii_3c6skvl.Xqedii_306hip527e6uo(1841602988, 19));
        object2 = list2.get(n3);
        if (object2 == null || ((LayerTreeRow)object2).entry == null) {
            string = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        } else {
            String[] stringArray2 = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(403783737, 29)];
            stringArray2[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)477890720, (int)20)] = ((LayerTreeRow)object2).entry.targetId;
            string = this.firstNonBlank(stringArray2);
        }
        String string4 = string;
        int n4 = n3 + Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1945591780, 28);
        while (n4 < list2.size()) {
            LayerTreeRow layerTreeRow3 = list2.get(n4);
            if (layerTreeRow3 == null || layerTreeRow3.entry == null) {
                ++n4;
                continue;
            }
            String[] stringArray3 = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842192812, 16)];
            stringArray3[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)16)] = layerTreeRow3.entry.targetId;
            object = this.firstNonBlank(stringArray3);
            if (!this.isLayerTargetDescendantOf((String)object, string4)) break;
            ++n4;
        }
        linkedHashSet.add(n4);
        int n5 = Math.max(Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-775274786, 4), Math.min(list2.size(), n2));
        List<Integer> sortedIndices = new ArrayList<Integer>(linkedHashSet);
        sortedIndices.sort(Integer::compareTo);
        for (Integer n7 : sortedIndices) {
            int n6;
            if (n7 == null || (n6 = Math.max(Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 13), Math.min(list2.size(), n7))) < n5) continue;
            return n6;
        }
        return sortedIndices.isEmpty() ? n5 : Math.max(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1887366141, 25), Math.min(list2.size(), sortedIndices.get(sortedIndices.size() - Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127278, 1))));
    }

    public boolean isLayerTargetDescendantOf(String string, String string2) {
        if ((-770023227 * -770023227 + -770023227 & 1) != 0) {
            throw new IllegalStateException();
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1544753892, 16)];
        stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)1759846255, (int)3)] = string;
        String string3 = this.firstNonBlank(stringArray);
        String[] stringArray2 = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1979594560, 8)];
        stringArray2[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)-1374716078, (int)10)] = string2;
        String string4 = this.firstNonBlank(stringArray2);
        if (string3.isBlank() || string4.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 23) != 0;
        }
        return string3.startsWith(EditorLayersLayerPart.Xqedii_1qoowl98xk5w9(string4));
    }

    public List<LayerTreeRow> buildRowsWithoutSourceSubtree(List<LayerTreeRow> list, String string) {
        if ((0x862591A3 ^ 0x862591A3) != 0) {
            throw new IllegalStateException();
        }
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 6)];
        stringArray[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)-75806936, (int)22)] = string;
        String string2 = this.firstNonBlank(stringArray);
        if (string2.isBlank()) {
            return new ArrayList<LayerTreeRow>(list);
        }
        ArrayList<LayerTreeRow> arrayList = new ArrayList<LayerTreeRow>(list.size());
        for (LayerTreeRow layerTreeRow : list) {
            if (layerTreeRow == null || layerTreeRow.entry == null) {
                arrayList.add(layerTreeRow);
                continue;
            }
            String[] stringArray2 = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(239469648, 19)];
            stringArray2[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)17)] = layerTreeRow.entry.targetId;
            String string3 = this.firstNonBlank(stringArray2);
            if (string3.isBlank()) {
                arrayList.add(layerTreeRow);
                continue;
            }
            if (string3.equals(string2) || this.isLayerTargetDescendantOf(string3, string2)) continue;
            arrayList.add(layerTreeRow);
        }
        return arrayList;
    }

    public int resolveLayersReorderPreviewInsertIndex(EditorSession editorSession, List<LayerTreeRow> list, int n, double d) {
        int n2;
        int n3;
        List<LayerTreeRow> list2;
        String string;
        if (((1122845027 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || list == null || list.isEmpty() || n < 0 || n >= list.size()) {
            return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(59736340, 17);
        }
        LayerTreeRow layerTreeRow = list.get(n);
        if (layerTreeRow == null || layerTreeRow.entry == null) {
            string = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        } else {
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127272, 2)];
            stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)36177695, (int)2)] = layerTreeRow.entry.targetId;
            string = this.firstNonBlank(stringArray);
        }
        String string2 = string;
        List<LayerTreeRow> list3 = list2 = string2.isBlank() ? new ArrayList<LayerTreeRow>(list) : this.buildRowsWithoutSourceSubtree(list, string2);
        if (string2.isBlank()) {
            list2.remove(n);
        }
        if ((n3 = list2.size()) <= 0) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 16);
        }
        int n4 = list.size();
        if (n4 <= Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1884048270, 18)) {
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1193868155, 6);
        }
        EditorRect editorRect = this.resolveLayersListRect(editorSession, list);
        int n5 = Math.max(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(477890720, 20), n4 - Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-825112001, 28));
        int n6 = (int)Math.floor(this.clampLayersScrollValue(editorSession.layersScrollOffset, n5) + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(3202606772629229221L, 62)));
        int n7 = Math.max(Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 28), Math.min(Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-316890116, 0), Math.max(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 5), n4 - n6)));
        if (editorRect == null) {
            n2 = n;
        } else if (d <= editorRect.y) {
            n2 = n6;
        } else if (d >= editorRect.maxY()) {
            n2 = n6 + n7;
        } else {
            double d2 = Math.max(Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282639521747801L, 20)), this.resolveLayersRowStep(editorSession));
            double d3 = (d - editorRect.y) / d2;
            int n8 = (int)Math.floor(d3 + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-5174420615229458878L, 26)));
            n8 = Math.max(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 14), Math.min(n7, n8));
            n2 = n6 + n8;
        }
        n2 = Math.max(Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 4), Math.min(n4, n2));
        int n9 = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1907230986, 7);
        int n10 = Math.max(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 9), Math.min(n4, n2));
        if (!string2.isBlank()) {
            for (int i = Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1040470030, 27); i < n10; ++i) {
                LayerTreeRow layerTreeRow2 = list.get(i);
                if (layerTreeRow2 == null || layerTreeRow2.entry == null) continue;
                String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127277, 0)];
                stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)16)] = layerTreeRow2.entry.targetId;
                String string3 = this.firstNonBlank(stringArray);
                if (string3.isBlank() || !string3.equals(string2) && !this.isLayerTargetDescendantOf(string3, string2)) continue;
                ++n9;
            }
        } else if (n2 > n) {
            n9 = Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 27);
        }
        int n11 = n2 - n9;
        return Math.max(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 11), Math.min(n3, n11));
    }

    public int findLayerRowIndexByTargetId(List<LayerTreeRow> list, String string) {
        if (((1797233279 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (list == null || list.isEmpty() || string == null || string.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-2109580181, 21);
        }
        for (int i = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-901849391, 12); i < list.size(); ++i) {
            LayerTreeRow layerTreeRow = list.get(i);
            if (layerTreeRow == null || layerTreeRow.entry == null || !string.equals(layerTreeRow.entry.targetId)) continue;
            return i;
        }
        return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1357938862, 24);
    }

    public List<LayerTreeRow> buildLayersRowsWithReorderPlaceholder(EditorSession editorSession, List<LayerTreeRow> list) {
        List<LayerTreeRow> list2;
        String string;
        if ((0xA2B44E58 ^ 0xA2B44E58) != 0) {
            throw new IllegalStateException();
        }
        if (!this.isLayersReorderActive(editorSession) || list == null || list.isEmpty()) {
            return list;
        }
        int n = this.findLayerRowIndexByTargetId(list, editorSession.layersReorderTargetId);
        if (n < 0) {
            return list;
        }
        LayerTreeRow layerTreeRow = list.get(n);
        if (layerTreeRow == null || layerTreeRow.entry == null) {
            string = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        } else {
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1707909548, 27)];
            stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)1040470030, (int)27)] = layerTreeRow.entry.targetId;
            string = this.firstNonBlank(stringArray);
        }
        String string2 = string;
        List<LayerTreeRow> list3 = list2 = string2.isBlank() ? new ArrayList<LayerTreeRow>(list) : this.buildRowsWithoutSourceSubtree(list, string2);
        if (string2.isBlank()) {
            list2.remove(n);
        }
        int n2 = Math.max(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-2140016606, 14), Math.min(list2.size(), editorSession.layersReorderPreviewInsertIndex));
        ArrayList<LayerTreeRow> arrayList = new ArrayList<LayerTreeRow>(list.size());
        arrayList.addAll(list2.subList(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 31), n2));
        arrayList.add(this.createLayersDragPlaceholderRow(layerTreeRow));
        arrayList.addAll(list2.subList(n2, list2.size()));
        return arrayList;
    }

    public LayerTreeRow createLayersDragPlaceholderRow(LayerTreeRow layerTreeRow) {
        if ((-1993237800 * -1993237800 + -1993237800 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (layerTreeRow == null) {
            return null;
        }
        return new LayerTreeRow(layerTreeRow.entry, layerTreeRow.dropdown, layerTreeRow.open, layerTreeRow.children, layerTreeRow.parent, layerTreeRow.under, layerTreeRow.end, layerTreeRow.depthValue, layerTreeRow.extraLines, Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842094508, 15) != 0);
    }

    public void renderLayersReorderGhostHud(Player player, EditorSession editorSession, double d, double d2) {
        if ((-2061324391 * -2061324391 + -2061324391 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || !this.isLayersReorderActive(editorSession)) {
            this.clearLayersReorderGhostHud(player, editorSession);
            return;
        }
        List<LayerTreeRow> list = this.collectLayerTreeRows(editorSession);
        int n = this.findLayerRowIndexByTargetId(list, editorSession.layersReorderTargetId);
        if (n < 0) {
            this.clearLayersReorderGhostHud(player, editorSession);
            return;
        }
        LayerTreeRow layerTreeRow = list.get(n);
        EditorRect editorRect = this.resolveLayersListRect(editorSession, list);
        if (editorRect == null) {
            this.clearLayersReorderGhostHud(player, editorSession);
            return;
        }
        double d3 = Math.max(Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(439236976043804759L, 31)), this.resolveLayersRowStep(editorSession));
        double d4 = Math.max(Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(5676883013992690649L, 7)), d3);
        double d5 = d2 - d4 / Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(7472225568668004599L, 56));
        double d6 = editorRect.y - d4 * Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(5553481261636487576L, 8));
        double d7 = editorRect.maxY() - d4 * Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(2497949975222167317L, 5));
        d5 = Math.max(d6, Math.min(d7, d5));
        List<Map<String, Object>> list2 = this.buildLayersReorderGhostBlocks(editorSession, layerTreeRow, editorRect.x, d5);
        List<Map<String, Object>> list3 = this.resolveRenderableBlocksNoCopy(list2, editorSession.components);
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        int n2 = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1803698781, 13);
        for (Map<String, Object> map : list3) {
            ++n2;
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1875681708, 24)];
            stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)36177695, (int)2)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("02a8+4G93rzDL4ODr7PdBbUzIa4GPi8YHvqdNM9J42f/pNbI")));
            stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)335778177, (int)9)] = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("TfZY+wVXSFSHWu7fmgJ0a/HGYyUWEBiNrTBJ4EoeG0ar+0WWRNg=");
            String string = this.firstNonBlank(stringArray).toLowerCase(Locale.ROOT);
            if (!this.isRenderableBlockType(string)) continue;
            String string2 = this.resolveElementId(map, n2, hashMap);
            String string3 = this.layerRuntimeLogicalId(EditorLayersLayerPart.Xqedii_34rkkdqeebg2o(string2));
            if (this.canUseFastLayerRuntimeRender(map, string)) {
                this.renderLayerShellElementFast(player, editorSession, map, string3, string, Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1979594816, 8) != 0);
            } else {
                ConfigurationSection configurationSection = this.mapToSection(map);
                if (configurationSection == null) continue;
                this.renderLayerRuntimeShellElement(player, editorSession, configurationSection, string3, string, Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 10) != 0);
            }
            linkedHashSet.add(string3);
        }
        this.clearStaleLayersReorderGhostShellIds(player, editorSession, linkedHashSet);
        editorSession.runtimeLayerReorderGhostShellIds.clear();
        editorSession.runtimeLayerReorderGhostShellIds.addAll(linkedHashSet);
    }

    public void clearLayersReorderGhostHud(Player player) {
        if ((0xBE0EF07E ^ 0xBE0EF07E) != 0) {
            throw new IllegalStateException();
        }
        EditorSession editorSession = player == null ? null : (EditorSession)this.editorSessions.get(player.getUniqueId());
        this.clearLayersReorderGhostHud(player, editorSession);
    }

    public void clearLayersReorderGhostHud(Player player, EditorSession editorSession) {
        if ((-191341427 * (-191341427 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || editorSession.runtimeLayerReorderGhostShellIds.isEmpty()) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<String>(editorSession.runtimeLayerReorderGhostShellIds);
        for (String string : arrayList) {
            this.removeLayerRuntimeShellElement(player, string);
            editorSession.shellRuntimeRects.remove(string);
        }
        editorSession.runtimeLayerReorderGhostShellIds.clear();
    }

    public void clearStaleLayersReorderGhostShellIds(Player player, EditorSession editorSession, LinkedHashSet<String> linkedHashSet) {
        if ((-1049380876 * -1049380876 - -1049380876 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || editorSession.runtimeLayerReorderGhostShellIds.isEmpty()) {
            return;
        }
        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<String>(editorSession.runtimeLayerReorderGhostShellIds);
        linkedHashSet2.removeAll(linkedHashSet);
        for (String string : linkedHashSet2) {
            this.removeLayerRuntimeShellElement(player, string);
            editorSession.shellRuntimeRects.remove(string);
        }
    }

    public List<Map<String, Object>> buildLayersReorderGhostBlocks(EditorSession editorSession, LayerTreeRow layerTreeRow, double d, double d2) {
        Serializable serializable;
        LinkedHashMap<String, Object> linkedHashMap;
        if ((0xE919146F ^ 0xE919146F) != 0) {
            throw new IllegalStateException();
        }
        ArrayList<Serializable> arrayList = new ArrayList<Serializable>();
        if (layerTreeRow != null) {
            linkedHashMap = new LinkedHashMap<String, Object>();
            linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("AaHXdqbWDhzhLapsbjURRzzN6FCuVQPo1semSMbdG6g="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("S6Oykk6Zzsyc14ZInWK9mnwzuV4D7VtaaUFgAxr8lafSVamokPQpYlfGSjJxMUBztVGQsCiPoMdvGQ=="));
            linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("jGkRtdNeXD+t+91kDMRySTH053EACoHzLiuZkxcdGgutcDvx"), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("S6Oykk6Zzsyc14ZInWK9mnwzuV4D7VtaaUFgAxr8lafSVamokPQpYlfGSjJxMUBztVGQsCiPoMdvGQ=="));
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1843175852, 19)];
            stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)25)] = editorSession.layersReorderGhostLabel;
            stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127292, (int)4)] = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("UaLDVC/sQReto2FXxCJvz8xzY3rCLMQ+eV/cX92pdWpGLMUvrXo=");
            linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ziobjXGLhEjwNvYy0plHy7MgEitX5TgbGLJR6ahw/ZJ2TwRx"), this.formatLayerRuntimeNameForRow(layerTreeRow, this.firstNonBlank(stringArray)));
            linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("vTqHP7ogzb7rSY/5evFTVRNR9OBzim/PYeC7BmK/n6xiz5By8JPewnwvMdk="), layerTreeRow.dropdown);
            linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("SL5OQIcJDVNkOGR2Km60QVp4TewrB2oikAY/p9QOgXV99z+cYBOYqMExkLs="), layerTreeRow.children);
            linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("flBnCw4CV3dQuMGY8BnpiX5MT7JgYzamizH6qO7pNMk0ruGZmjQ="), layerTreeRow.under);
            linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("bDHpSGnk1rBLCP8357f0oF6iKMvK76r9GJe8HHHBYn50WXiS"), layerTreeRow.open);
            linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("SaDBLO9AmVEbXuSnIhjk4S83qGdFjSc8hCe7mT9djYyvyBHjXeKFqA=="), layerTreeRow.parent);
            linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("+BNdKoD0BE/SbsgDxAdQ4l/HmYrbVsUQLB5tXlVZluURyg=="), layerTreeRow.end);
            linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("WABIrXIdQ0IP4unyEjxfzco6Fr0QHPOuOXpx/j7rhmlziA=="), layerTreeRow.depthValue);
            linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("4rEtjOSVWC4r+HW58NMlNyzTSbrhxJEQokrsJu8m4chjs5nerao9D7+oOyX8n7mk"), layerTreeRow.extraLines);
            linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("EWV4dK4z1DG+6dNvLG2A9g3t5AzxcAiNqWlpn05HjKoyYjUkJkqMU/FFJ1Aoi8RMAAqRpqEVqmw2CA=="), Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374748589, 7));
            int n = layerTreeRow.entry != null && this.isTargetVisible(editorSession, layerTreeRow.entry.targetId) ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(2110562732, 28) : Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 30);
            int n2 = layerTreeRow.entry != null && this.isSelectedTarget(editorSession, layerTreeRow.entry.targetId) ? Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1267560525, 2) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1907230986, 7);
            linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("jBI3TWxPVHXd20/iXzsNVgMKsxBZhi+YcQFCobJQV0ZyHFnfQ0B2crKHraCuag=="), n2 != 0 ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("TI83NNLh0FHTWiQENzbAPmCVVs13y6vSwb/25mIw") : Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("aqmP0+8T1IRA+zqAeJc8uDqbGXT6o+lk6QjAQo7k"));
            linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("DOi+lD+hjbRrtjM7NfvIUIx7UHNjJqiOejWBRVbIw5Hqyo/q2Pejs/heCkqYfA=="), n2 != 0 ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ZC2KLhuBO6IYtmTw3iULS9iWsadBUqGEYll/VVGi") : Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("seOCOwpIN/n2AQvWnmy4gR2v/ueGQO4YLnrcXskU"));
            if (n == 0) {
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("70I1fESwkCpHQhkavoYwkMAN42ULIv1q/FGH6X6EqDxPTKciQ7Z9hNLBzETzgyaNDwRUjw=="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA=="));
            } else {
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("70I1fESwkCpHQhkavoYwkMAN42ULIv1q/FGH6X6EqDxPTKciQ7Z9hNLBzETzgyaNDwRUjw=="), n2 != 0 ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Ra99wX+GgChl9/2oUUHbEnU8m30Q/xHr2Wx72JhR") : Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("7ca5v0QOfIwoS9nZfLuE3h8D1fyglBlsT2L7V3L5"));
            }
            LinkedHashMap<String, Object> itemMap = new LinkedHashMap<String, Object>();
            itemMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("zqV3UZHulE2VHa2VqeOMIPBJ+GQTAypdmy7bKlQLyQ2EVCYqADIciS7T8bAyHg=="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("azq42NEL9fFTItNtrv4h6q7OLUAUK+GqMbrVIwvdryoyIQ+ZqZQdseJDZ115F8Cwf/XxfA=="));
            itemMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("VngT8WdKVtYwKjSZFU4hXx2yv3qAzhugzDqTb+AyRfYHbYRlNsrdkA=="), linkedHashMap);
            arrayList.add(itemMap);
        }
        linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("hQDIczWQOugPl0NYFOCS9ZL5LskFVXO49JX0gCP4"), d);
        linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BaJvLxDLpZjGuPlcv+UoERQ4OvjKf3ixBOKZbis8"), d2);
        double d3 = this.resolveLayersGridGap(editorSession);
        serializable = this.resolveLayersGridElementHeight(editorSession);
        LinkedHashMap<String, Object> linkedHashMap2 = new LinkedHashMap<String, Object>();
        linkedHashMap2.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("02a8+4G93rzDL4ODr7PdBbUzIa4GPi8YHvqdNM9J42f/pNbI"), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("xQohIJHEckvtkwmcwtWkD6H9NiI6F8W1wBBN9il2h/Gz4ws3qPq+nnwB425N9goc"));
        linkedHashMap2.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("bB9hzm3SN6e/j/1Cp14+bZTZgVVvPcdd19TBwYjnLaGmGwRr2g6V4ZEJziWdJA=="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("F+A0w6ezV6bSUPhTHDtv12ziYEChzj/UUNi3Zm5tGU/2i6mE8dhHLg=="));
        linkedHashMap2.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("nc2SIaRHCPYvzXpmYCrrCqo2aU58/0vDxnJ4f4vC5jbWAw=="), d3);
        if (serializable != null) {
            linkedHashMap2.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("r/YZkxZlduV+lZKe07KoiSTM61mopywSUEBNOOhzl7p6AphOSjV6fGTwk15nXQ=="), serializable);
        }
        linkedHashMap2.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("kthcyCj3J5mqECxMGan/Jvq0Ca8Qybu8s0wLZak3WKJpQMK6IMpAVFkT+NU="), linkedHashMap);
        linkedHashMap2.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("SL5OQIcJDVNkOGR2Km60QVp4TewrB2oikAY/p9QOgXV99z+cYBOYqMExkLs="), arrayList);
        ArrayList<Map<String, Object>> arrayList2 = new ArrayList<Map<String, Object>>();
        arrayList2.add(linkedHashMap2);
        return arrayList2;
    }

    public void renderLayersPanel(Player player, EditorSession editorSession) {
        int n;
        if ((399642921 * (399642921 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return;
        }
        if (!this.isLayersPanelRuntimeAvailable(editorSession)) {
            this.clearLayersReorderGhostHud(player);
            this.clearLayersRuntimeHud(player);
            return;
        }
        if (editorSession.rightSidebarTab != EditorSidebarTab.LAYERS) {
            this.clearLayersReorderGhostHud(player);
            this.clearLayersRuntimeHud(player);
            return;
        }
        List<LayerTreeRow> list = this.collectLayerTreeRows(editorSession);
        List<LayerTreeRow> list2 = this.buildLayersRowsWithReorderPlaceholder(editorSession, list);
        int n2 = Math.max(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(289421560, 5), list2.size() - Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842250156, 13));
        int n3 = (int)Math.floor(this.clampLayersScrollValue(editorSession.layersScrollOffset, n2) + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(3511303167546899734L, 44)));
        int n4 = Math.min(list2.size(), n3 + Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1207556665, 17));
        long l = this.buildLayersWindowSignature(editorSession, list2, n3, n4);
        int n5 = list2.size() > Xqedii_3c6skvl.Xqedii_306hip527e6uo(2110562733, 28) ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1775018412, 26) : Xqedii_3c6skvl.Xqedii_et1f9vygj64d(72355390, 3);
        int n6 = n = editorSession.runtimeLayerShellIds.isEmpty() || editorSession.layersRenderedStart != n3 || editorSession.layersRenderedCount != n4 - n3 || editorSession.layersRenderedSignature != l ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842192812, 16) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1803698781, 13);
        if (n != 0) {
            List<LayerTreeRow> list3 = list2.subList(n3, n4);
            this.renderLayersRuntimeRows(player, editorSession, list3, Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-3537416643769075304L, 24)), n3, n5 != 0);
            editorSession.layersRenderedStart = n3;
            editorSession.layersRenderedCount = n4 - n3;
            editorSession.layersRenderedFraction = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941870784038089L, 9));
            editorSession.layersRenderedSignature = l;
        }
        editorSession.layersRenderedFraction = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-826282639521999961L, 18));
        editorSession.layersScrollOffset = n3;
        editorSession.layersScrollPosition = n3;
        editorSession.layersScrollTarget = n3;
        editorSession.layersScrollVelocity = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5502941870784038089L, 18));
        if (!this.isLayersReorderActive(editorSession)) {
            this.clearLayersReorderGhostHud(player);
        }
    }

    public boolean isLayersPanelRuntimeAvailable(EditorSession editorSession) {
        if ((679651477 * (679651477 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 9) != 0;
        }
        return (this.findShellBlockSection(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("QDx2f/bFSqckwwbIvHdMB9y85rzmIju6euZ/ZPOYBeHfUvbRYmDj7A==")) != null || this.findShellBlockSection(editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("pBe0fH9jRlt14hEKb7o3jPKF7K4F0wxfJZ5U1l9X0eYRTUhrn8YyyhnLcOsqSAlr")) != null ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(335778177, 9) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-606455481, 25)) != 0;
    }

    public void renderLayersRuntimeRows(Player player, EditorSession editorSession, List<LayerTreeRow> list, double d, int n, boolean bl) {
        if ((1818491513 * 1818491513 + 1818491513 & 1) != 0) {
            throw new IllegalStateException();
        }
        List<Map<String, Object>> list2 = this.buildLayersRuntimeGridBlocks(editorSession, list, d, n);
        List<Map<String, Object>> list3 = this.resolveRenderableBlocksNoCopy(list2, editorSession.components);
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        int n2 = Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 17);
        for (Map<String, Object> map : list3) {
            ++n2;
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1078693233, 26)];
            stringArray[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)-1374716078, (int)6)] = this.stringValue(this.readMapPathValue(map, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("02a8+4G93rzDL4ODr7PdBbUzIa4GPi8YHvqdNM9J42f/pNbI")));
            stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1841865132, (int)18)] = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("TfZY+wVXSFSHWu7fmgJ0a/HGYyUWEBiNrTBJ4EoeG0ar+0WWRNg=");
            String string = this.firstNonBlank(stringArray).toLowerCase(Locale.ROOT);
            if (!this.isRenderableBlockType(string)) continue;
            String string2 = this.resolveElementId(map, n2, hashMap);
            String string3 = this.layerRuntimeLogicalId(string2);
            if (this.canUseFastLayerRuntimeRender(map, string)) {
                this.renderLayerShellElementFast(player, editorSession, map, string3, string, bl);
            } else {
                ConfigurationSection configurationSection = this.mapToSection(map);
                if (configurationSection == null) continue;
                this.renderLayerRuntimeShellElement(player, editorSession, configurationSection, string3, string, bl);
            }
            linkedHashSet.add(string3);
        }
        this.clearStaleLayerRuntimeShellIds(player, editorSession, linkedHashSet);
        editorSession.runtimeLayerShellIds.clear();
        editorSession.runtimeLayerShellIds.addAll(linkedHashSet);
    }

    public List<Map<String, Object>> buildLayersRuntimeGridBlocks(EditorSession editorSession, List<LayerTreeRow> list, double d, int n) {
        if (((0xC8A38A87 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        java.util.ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i = Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842128300, 10); i <= list.size(); ++i) {
                int n2;
                LayerTreeRow layerTreeRow = list.get(i - Xqedii_3c6skvl.Xqedii_et1f9vygj64d(478939296, 20));
                LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("AaHXdqbWDhzhLapsbjURRzzN6FCuVQPo1semSMbdG6g="), this.layerSlotBaseId(i));
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("jGkRtdNeXD+t+91kDMRySTH053EACoHzLiuZkxcdGgutcDvx"), this.layerSlotBaseId(i));
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ziobjXGLhEjwNvYy0plHy7MgEitX5TgbGLJR6ahw/ZJ2TwRx"), this.formatLayerRuntimeNameForRow(layerTreeRow, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("UaLDVC/sQReto2FXxCJvz8xzY3rCLMQ+eV/cX92pdWpGLMUvrXo=")));
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("vTqHP7ogzb7rSY/5evFTVRNR9OBzim/PYeC7BmK/n6xiz5By8JPewnwvMdk="), layerTreeRow.dropdown);
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("SL5OQIcJDVNkOGR2Km60QVp4TewrB2oikAY/p9QOgXV99z+cYBOYqMExkLs="), layerTreeRow.children);
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("flBnCw4CV3dQuMGY8BnpiX5MT7JgYzamizH6qO7pNMk0ruGZmjQ="), layerTreeRow.under);
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("bDHpSGnk1rBLCP8357f0oF6iKMvK76r9GJe8HHHBYn50WXiS"), layerTreeRow.open);
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("SaDBLO9AmVEbXuSnIhjk4S83qGdFjSc8hCe7mT9djYyvyBHjXeKFqA=="), layerTreeRow.parent);
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("+BNdKoD0BE/SbsgDxAdQ4l/HmYrbVsUQLB5tXlVZluURyg=="), layerTreeRow.end);
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("WABIrXIdQ0IP4unyEjxfzco6Fr0QHPOuOXpx/j7rhmlziA=="), layerTreeRow.depthValue);
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("4rEtjOSVWC4r+HW58NMlNyzTSbrhxJEQokrsJu8m4chjs5nerao9D7+oOyX8n7mk"), layerTreeRow.extraLines);
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("r/M403I6LDe/oKdSB2CqguliLcxeQtg2ou72xAjPLIMsL1WL2BB5Nzsr7+Ur+Ok6"), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ircB3HOdKPBCO6BoxFpmVf5/CzvbdZDcfm/pvynb4TfJ8OcK3JHfDA=="));
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("uGWDaHBNlg4H6LNu0M68zIJOxG1SxB1FcjABi9ZnCAKL8EY+N/eLqA2fJHQg1Q=="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ikTvS8lVTTx1kXU9o4klPXfEaNCOgIWlU4XvvPKykd2fUm5pzI6yPw=="));
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("oYsyVzP1NCBBImvWsya2HS4U6GcGNtRMD8idmRB81/1IEpLxb4jKOSr36CdvcAIyLu4="), Xqedii_3c6skvl.Xqedii_et1f9vygj64d(59736340, 17));
                linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("EWV4dK4z1DG+6dNvLG2A9g3t5AzxcAiNqWlpn05HjKoyYjUkJkqMU/FFJ1Aoi8RMAAqRpqEVqmw2CA=="), Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1359904941, 16));
                int n3 = n2 = this.isLayersReorderActive(editorSession) && !layerTreeRow.dragPlaceholder && layerTreeRow.entry != null && this.equalsNullable(layerTreeRow.entry.targetId, editorSession.layersReorderHoverTargetId) ? Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 27) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(480505325, 8);
                if (n2 != 0) {
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("oYsyVzP1NCBBImvWsya2HS4U6GcGNtRMD8idmRB81/1IEpLxb4jKOSr36CdvcAIyLu4="), Xqedii_3c6skvl.Xqedii_306hip527e6uo(1707909548, 21));
                }
                if (layerTreeRow.dragPlaceholder) {
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ziobjXGLhEjwNvYy0plHy7MgEitX5TgbGLJR6ahw/ZJ2TwRx"), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("HkKpDKyPzHrbqGQwIZpV+CjjdujFRXQQWfTMIB1v"));
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("vTqHP7ogzb7rSY/5evFTVRNR9OBzim/PYeC7BmK/n6xiz5By8JPewnwvMdk="), Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-532348701, 31) != 0);
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("SL5OQIcJDVNkOGR2Km60QVp4TewrB2oikAY/p9QOgXV99z+cYBOYqMExkLs="), Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 7) != 0);
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("flBnCw4CV3dQuMGY8BnpiX5MT7JgYzamizH6qO7pNMk0ruGZmjQ="), Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1064697401, 0) != 0);
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("bDHpSGnk1rBLCP8357f0oF6iKMvK76r9GJe8HHHBYn50WXiS"), Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 23) != 0);
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("SaDBLO9AmVEbXuSnIhjk4S83qGdFjSc8hCe7mT9djYyvyBHjXeKFqA=="), Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 8) != 0);
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("+BNdKoD0BE/SbsgDxAdQ4l/HmYrbVsUQLB5tXlVZluURyg=="), Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(527395045, 19) != 0);
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("WABIrXIdQ0IP4unyEjxfzco6Fr0QHPOuOXpx/j7rhmlziA=="), Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 19));
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("4rEtjOSVWC4r+HW58NMlNyzTSbrhxJEQokrsJu8m4chjs5nerao9D7+oOyX8n7mk"), Collections.emptyList());
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("jBI3TWxPVHXd20/iXzsNVgMKsxBZhi+YcQFCobJQV0ZyHFnfQ0B2crKHraCuag=="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA=="));
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("DOi+lD+hjbRrtjM7NfvIUIx7UHNjJqiOejWBRVbIw5Hqyo/q2Pejs/heCkqYfA=="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA=="));
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("70I1fESwkCpHQhkavoYwkMAN42ULIv1q/FGH6X6EqDxPTKciQ7Z9hNLBzETzgyaNDwRUjw=="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA=="));
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("r/M403I6LDe/oKdSB2CqguliLcxeQtg2ou72xAjPLIMsL1WL2BB5Nzsr7+Ur+Ok6"), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ircB3HOdKPBCO6BoxFpmVf5/CzvbdZDcfm/pvynb4TfJ8OcK3JHfDA=="));
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("oYsyVzP1NCBBImvWsya2HS4U6GcGNtRMD8idmRB81/1IEpLxb4jKOSr36CdvcAIyLu4="), Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 11));
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("EWV4dK4z1DG+6dNvLG2A9g3t5AzxcAiNqWlpn05HjKoyYjUkJkqMU/FFJ1Aoi8RMAAqRpqEVqmw2CA=="), Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1922021300, 10));
                } else {
                    boolean bl = this.isTargetVisible(editorSession, layerTreeRow.entry.targetId);
                    boolean bl2 = this.isSelectedTarget(editorSession, layerTreeRow.entry.targetId);
                    int n4 = bl2 || n2 != 0 ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1615134948, 31) : Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1077475345, 13);
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("jBI3TWxPVHXd20/iXzsNVgMKsxBZhi+YcQFCobJQV0ZyHFnfQ0B2crKHraCuag=="), n4 != 0 ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("TI83NNLh0FHTWiQENzbAPmCVVs13y6vSwb/25mIw") : Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("aqmP0+8T1IRA+zqAeJc8uDqbGXT6o+lk6QjAQo7k"));
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("DOi+lD+hjbRrtjM7NfvIUIx7UHNjJqiOejWBRVbIw5Hqyo/q2Pejs/heCkqYfA=="), n4 != 0 ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ZC2KLhuBO6IYtmTw3iULS9iWsadBUqGEYll/VVGi") : Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("seOCOwpIN/n2AQvWnmy4gR2v/ueGQO4YLnrcXskU"));
                    linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("r/M403I6LDe/oKdSB2CqguliLcxeQtg2ou72xAjPLIMsL1WL2BB5Nzsr7+Ur+Ok6"), n4 != 0 ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Njvie7ewiJdgUhsEYLa8XZFhXybtJVLEamNpWspcG7fyl37SMaNwIQ==") : Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ircB3HOdKPBCO6BoxFpmVf5/CzvbdZDcfm/pvynb4TfJ8OcK3JHfDA=="));
                    if (!bl) {
                        linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("70I1fESwkCpHQhkavoYwkMAN42ULIv1q/FGH6X6EqDxPTKciQ7Z9hNLBzETzgyaNDwRUjw=="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA=="));
                    } else {
                        linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("70I1fESwkCpHQhkavoYwkMAN42ULIv1q/FGH6X6EqDxPTKciQ7Z9hNLBzETzgyaNDwRUjw=="), n4 != 0 ? Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Ra99wX+GgChl9/2oUUHbEnU8m30Q/xHr2Wx72JhR") : Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("7ca5v0QOfIwoS9nZfLuE3h8D1fyglBlsT2L7V3L5"));
                    }
                }
                LinkedHashMap<String, Object> linkedHashMap2 = new LinkedHashMap<String, Object>();
                linkedHashMap2.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("zqV3UZHulE2VHa2VqeOMIPBJ+GQTAypdmy7bKlQLyQ2EVCYqADIciS7T8bAyHg=="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("azq42NEL9fFTItNtrv4h6q7OLUAUK+GqMbrVIwvdryoyIQ+ZqZQdseJDZ115F8Cwf/XxfA=="));
                linkedHashMap2.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("VngT8WdKVtYwKjSZFU4hXx2yv3qAzhugzDqTb+AyRfYHbYRlNsrdkA=="), linkedHashMap);
                arrayList.add(linkedHashMap2);
            }
        }
        double d2 = this.resolveLayersGridStartX(editorSession);
        double d3 = this.resolveLayersRowStep(editorSession);
        double d4 = this.resolveLayersGridStartY(editorSession) - Math.max(Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-5174420615246203326L, 26)), d) * d3;
        double d5 = this.resolveLayersGridGap(editorSession);
        Double d6 = this.resolveLayersGridElementHeight(editorSession);
        LinkedHashMap<String, Double> linkedHashMap = new LinkedHashMap<String, Double>();
        linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("hQDIczWQOugPl0NYFOCS9ZL5LskFVXO49JX0gCP4"), d2);
        linkedHashMap.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BaJvLxDLpZjGuPlcv+UoERQ4OvjKf3ixBOKZbis8"), d4);
        LinkedHashMap<String, Object> linkedHashMap3 = new LinkedHashMap<String, Object>();
        linkedHashMap3.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("02a8+4G93rzDL4ODr7PdBbUzIa4GPi8YHvqdNM9J42f/pNbI"), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("xQohIJHEckvtkwmcwtWkD6H9NiI6F8W1wBBN9il2h/Gz4ws3qPq+nnwB425N9goc"));
        linkedHashMap3.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("bB9hzm3SN6e/j/1Cp14+bZTZgVVvPcdd19TBwYjnLaGmGwRr2g6V4ZEJziWdJA=="), Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("F+A0w6ezV6bSUPhTHDtv12ziYEChzj/UUNi3Zm5tGU/2i6mE8dhHLg=="));
        linkedHashMap3.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("nc2SIaRHCPYvzXpmYCrrCqo2aU58/0vDxnJ4f4vC5jbWAw=="), d5);
        if (d6 != null) {
            linkedHashMap3.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("r/YZkxZlduV+lZKe07KoiSTM61mopywSUEBNOOhzl7p6AphOSjV6fGTwk15nXQ=="), d6);
        }
        linkedHashMap3.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("kthcyCj3J5mqECxMGan/Jvq0Ca8Qybu8s0wLZak3WKJpQMK6IMpAVFkT+NU="), linkedHashMap);
        linkedHashMap3.put(Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("SL5OQIcJDVNkOGR2Km60QVp4TewrB2oikAY/p9QOgXV99z+cYBOYqMExkLs="), arrayList);
        ArrayList<Map<String, Object>> arrayList2 = new ArrayList<Map<String, Object>>();
        arrayList2.add(linkedHashMap3);
        return arrayList2;
    }

    public boolean handleLayersReorderCursorMove(Player player, EditorSession editorSession, double d, double d2) {
        if ((-1959071169 * -1959071169 + -1959071169 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 3) != 0;
        }
        boolean bl = this.isLayersReorderArmed(editorSession);
        boolean bl2 = this.isLayersReorderActive(editorSession);
        if (!bl && !bl2) {
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1375139470, 15) != 0;
        }
        editorSession.layersReorderLastHitX = d;
        editorSession.layersReorderLastHitY = d2;
        if (editorSession.rightSidebarTab != EditorSidebarTab.LAYERS) {
            this.finishLayersReorderDrag(player, editorSession, Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 11) != 0);
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 2) != 0;
        }
        if (!this.isLayersLeftHeld(editorSession)) {
            this.finishLayersReorderDrag(player, editorSession, bl2);
            return (bl2 || bl ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842258348, 17) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(480505325, 8)) != 0;
        }
        if (!bl2) {
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(403783737, 29)];
            stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)-532348701, (int)31)] = editorSession.layersReorderArmedTargetId;
            String string = this.firstNonBlank(stringArray);
            if (string.isBlank()) {
                this.clearLayersReorderArm(editorSession);
                return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(14934085, 15) != 0;
            }
            double d3 = Math.hypot(d - editorSession.layersReorderArmedStartHitX, d2 - editorSession.layersReorderArmedStartHitY);
            if (d3 <= Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(8097902843250740357L, 27))) {
                return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-1945591780, 28) != 0;
            }
            if (!this.beginLayersReorderDrag(player, editorSession, string, d, d2)) {
                this.finishLayersReorderDrag(player, editorSession, Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 11) != 0);
                return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-640009913, 25) != 0;
            }
            this.queueLayersPanelRender(player, editorSession);
        }
        int n = editorSession.layersReorderPreviewInsertIndex;
        String string = editorSession.layersReorderHoverTargetId;
        this.updateLayersReorderDropPreview(editorSession, d, d2);
        this.updateLayersReorderHoverTarget(editorSession, d, d2);
        if (editorSession.layersReorderPreviewInsertIndex != n || !this.equalsNullable(string, editorSession.layersReorderHoverTargetId)) {
            this.queueLayersPanelRender(player, editorSession);
        }
        this.updateLayersReorderAutoScroll(player, editorSession, d, d2);
        this.renderLayersReorderGhostHud(player, editorSession, d, d2);
        return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1989038582, 31) != 0;
    }

    public boolean beginLayersReorderDrag(Player player, EditorSession editorSession, String string, double d, double d2) {
        String string2;
        if (((0x5EB05057 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || string == null || string.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 19) != 0;
        }
        List<LayerTreeRow> list = this.collectLayerTreeRows(editorSession);
        if (list.size() <= Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 3)) {
            return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(2080940060, 28) != 0;
        }
        int n = this.findLayerRowIndexByTargetId(list, string);
        if (n < 0) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 28) != 0;
        }
        LayerTreeRow layerTreeRow = list.get(n);
        editorSession.layersReorderActive = (Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-160002479, 23)) != 0;
        editorSession.layersReorderTargetId = string;
        if (layerTreeRow == null || layerTreeRow.entry == null) {
            string2 = string;
        } else {
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(36177703, 2)];
            stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)1842127276, (int)20)] = layerTreeRow.entry.displayName;
            stringArray[Xqedii_3c6skvl.Xqedii_306hip527e6uo((int)2110562732, (int)28)] = string;
            string2 = this.firstNonBlank(stringArray);
        }
        editorSession.layersReorderGhostLabel = string2;
        editorSession.layersReorderPreviewInsertIndex = Math.max(Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 14), Math.min(list.size() - Xqedii_3c6skvl.Xqedii_et1f9vygj64d(587343879, 26), n));
        editorSession.layersReorderHoverTargetId = null;
        editorSession.layersReorderLastHitX = d;
        editorSession.layersReorderLastHitY = d2;
        this.startLayersReorderReleaseWatch(player, editorSession);
        return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 7) != 0;
    }

    public void startLayersReorderReleaseWatch(Player player, EditorSession editorSession) {
        if ((18226361 * 18226361 + 18226361 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || !this.isLayersReorderActive(editorSession)) {
            return;
        }
        int n = editorSession.layersReorderReleaseWatchToken += Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 7);
        Xqedii_38o2zes.Xqedii_j3mggbv((Plugin)this.plugin, (Entity)player, Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(439236977654941783L, 31), Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(-5940056541117323150L, 8), cancellableTask -> {
            if ((0x2C4D081C ^ 0x2C4D081C) != 0) {
                throw new IllegalStateException();
            }
            if (!player.isOnline()) {
                cancellableTask.cancel();
                return;
            }
            EditorSession editorSession2 = (EditorSession)this.editorSessions.get(player.getUniqueId());
            if (editorSession2 == null || editorSession2 != editorSession || n != editorSession2.layersReorderReleaseWatchToken) {
                cancellableTask.cancel();
                return;
            }
            if (!this.isLayersReorderActive(editorSession2)) {
                cancellableTask.cancel();
                return;
            }
            if (this.isLayersLeftHeld(editorSession2)) {
                return;
            }
            this.finishLayersReorderDrag(player, editorSession2, Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 0) != 0);
            cancellableTask.cancel();
        });
    }

    public void finishLayersReorderDrag(Player player, EditorSession editorSession, boolean bl) {
        if ((-1822708031 * -1822708031 - -1822708031 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return;
        }
        boolean bl2 = this.isLayersReorderActive(editorSession);
        editorSession.layersReorderReleaseWatchToken += Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1915757184, 22);
        this.stopLayersReorderAutoScroll(editorSession);
        if (player != null) {
            this.clearLayersReorderGhostHud(player, editorSession);
        }
        if (bl && bl2 && player != null) {
            this.applyLayersReorderDrop(player, editorSession);
        }
        this.clearLayersReorderArm(editorSession);
        editorSession.layersReorderActive = (Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 20)) != 0;
        editorSession.layersReorderTargetId = null;
        editorSession.layersReorderHoverTargetId = null;
        editorSession.layersReorderGhostLabel = null;
        editorSession.layersReorderPreviewInsertIndex = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1883786125, 18);
        editorSession.layersReorderAutoScrollDirection = Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1113353091, 29);
        if (bl2 && player != null) {
            this.queueLayersPanelRender(player, editorSession);
        }
    }

    public void updateLayersReorderDropPreview(EditorSession editorSession, double d, double d2) {
        if ((-762930832 * -762930832 + -762930832 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (!this.isLayersReorderActive(editorSession)) {
            return;
        }
        List<LayerTreeRow> list = this.collectLayerTreeRows(editorSession);
        int n = this.findLayerRowIndexByTargetId(list, editorSession.layersReorderTargetId);
        if (n < 0) {
            return;
        }
        editorSession.layersReorderPreviewInsertIndex = this.resolveLayersReorderPreviewInsertIndex(editorSession, list, n, d2);
    }

    public void updateLayersReorderHoverTarget(EditorSession editorSession, double d, double d2) {
        if ((1382970319 * 1382970319 + 1382970319 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (!this.isLayersReorderActive(editorSession)) {
            if (editorSession != null) {
                editorSession.layersReorderHoverTargetId = null;
            }
            return;
        }
        List<LayerTreeRow> list = this.collectLayerTreeRows(editorSession);
        int n = this.findLayerRowIndexByTargetId(list, editorSession.layersReorderTargetId);
        if (n < 0) {
            editorSession.layersReorderHoverTargetId = null;
            return;
        }
        editorSession.layersReorderHoverTargetId = this.resolveLayersReorderHoverTargetId(editorSession, list, n, d, d2);
    }

    public void updateLayersReorderAutoScroll(Player player, EditorSession editorSession, double d, double d2) {
        if ((0x5313CD96 ^ 0x5313CD96) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return;
        }
        int n = Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 18);
        EditorRect editorRect = this.resolveLayersListRect(editorSession);
        if (editorRect != null && d >= editorRect.x && d <= editorRect.maxX()) {
            if (d2 <= editorRect.y + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(-4621150091544836890L, 6))) {
                n = Xqedii_3c6skvl.Xqedii_306hip527e6uo(-1842127277, 0);
            } else if (d2 >= editorRect.maxY() - Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(8397089397332771755L, 14))) {
                n = Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127278, 1);
            }
        }
        if (editorSession.layersReorderAutoScrollDirection == n) {
            return;
        }
        editorSession.layersReorderAutoScrollDirection = n;
        if (n == 0) {
            this.stopLayersReorderAutoScroll(editorSession);
            return;
        }
        this.startLayersReorderAutoScroll(player, editorSession);
    }

    public void startLayersReorderAutoScroll(Player player, EditorSession editorSession) {
        if ((0x407FB560 ^ 0x407FB560) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || editorSession.layersReorderAutoScrollDirection == 0) {
            return;
        }
        int n = editorSession.layersReorderAutoScrollToken += Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-640009913, 25);
        Xqedii_38o2zes.Xqedii_j3mggbv((Plugin)this.plugin, (Entity)player, Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(-5502836317667771594L, 45), Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(7819779892190075797L, 11), cancellableTask -> {
            if ((-987313981 * (-987313981 + 1) & 1) != 0) {
                throw new IllegalStateException();
            }
            if (!player.isOnline()) {
                cancellableTask.cancel();
                return;
            }
            EditorSession editorSession2 = (EditorSession)this.editorSessions.get(player.getUniqueId());
            if (editorSession2 == null || editorSession2 != editorSession) {
                cancellableTask.cancel();
                return;
            }
            if (n != editorSession2.layersReorderAutoScrollToken || editorSession2.layersReorderAutoScrollDirection == 0 || !this.isLayersReorderActive(editorSession2) || editorSession2.rightSidebarTab != EditorSidebarTab.LAYERS || !this.isLayersLeftHeld(editorSession2)) {
                cancellableTask.cancel();
                return;
            }
            List<LayerTreeRow> list = this.collectLayerTreeRows(editorSession2);
            int n2 = Math.max(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1157686240, 7), list.size() - Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1343145476, 11));
            int n3 = (int)Math.floor(this.clampLayersScrollValue(editorSession2.layersScrollOffset, n2) + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(5435889355160363607L, 3)));
            int n4 = (int)Math.floor(this.clampLayersScrollValue(n3 + editorSession2.layersReorderAutoScrollDirection, n2) + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-6372953356390352030L, 2)));
            if (n4 == n3) {
                this.flashLayersScrollEdge(player, editorSession2, (editorSession2.layersReorderAutoScrollDirection < 0 ? Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1544753892, 16) : Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1054790090, 20)) != 0);
                return;
            }
            editorSession2.layersScrollOffset = n4;
            editorSession2.layersScrollPosition = n4;
            editorSession2.layersScrollTarget = n4;
            editorSession2.layersScrollVelocity = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(8263419968497973095L, 0));
            int n5 = editorSession2.layersReorderPreviewInsertIndex;
            String string = editorSession2.layersReorderHoverTargetId;
            this.updateLayersReorderDropPreview(editorSession2, editorSession2.layersReorderLastHitX, editorSession2.layersReorderLastHitY);
            this.updateLayersReorderHoverTarget(editorSession2, editorSession2.layersReorderLastHitX, editorSession2.layersReorderLastHitY);
            if (editorSession2.layersReorderPreviewInsertIndex != n5 || !this.equalsNullable(string, editorSession2.layersReorderHoverTargetId)) {
                this.queueLayersPanelRender(player, editorSession2);
            } else {
                this.queueLayersPanelRender(player, editorSession2);
            }
            this.renderLayersReorderGhostHud(player, editorSession2, editorSession2.layersReorderLastHitX, editorSession2.layersReorderLastHitY);
        });
    }

    public void applyLayersReorderDrop(Player player, EditorSession editorSession) {
        List<Object> list;
        int n;
        int n2;
        Object object;
        if ((-1097513436 * (-1097513436 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || !this.isLayersReorderActive(editorSession)) {
            return;
        }
        List<LayerTreeRow> list2 = this.collectLayerTreeRows(editorSession);
        int n3 = this.findLayerRowIndexByTargetId(list2, editorSession.layersReorderTargetId);
        if (n3 < 0 || list2.size() <= Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127148, 7)) {
            return;
        }
        String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127148, 7)];
        stringArray[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)-1374716078, (int)15)] = editorSession.layersReorderTargetId;
        String string = this.firstNonBlank(stringArray);
        if (string.isBlank()) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<String>(this.getSelectedTargetIds(editorSession));
        List<String> list3 = this.captureSelectionTargetPaths(editorSession, arrayList);
        this.updateLayersReorderHoverTarget(editorSession, editorSession.layersReorderLastHitX, editorSession.layersReorderLastHitY);
        String[] stringArray2 = new String[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1650224003, 29)];
        stringArray2[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)-1374716078, (int)20)] = editorSession.layersReorderHoverTargetId;
        String string2 = this.firstNonBlank(stringArray2);
        if (!string2.isBlank() && !string2.equals(string) && !this.isLayerTargetDescendantOf(string2, string) && this.applyLayersReorderDropAsChild(editorSession, list2, n3, string, string2)) {
            this.rerenderAfterLayersStructureChange(player, editorSession, arrayList, list3);
            return;
        }
        List<LayerTreeRow> list4 = this.buildRowsWithoutSourceSubtree(list2, string);
        this.updateLayersReorderDropPreview(editorSession, editorSession.layersReorderLastHitX, editorSession.layersReorderLastHitY);
        int n4 = Math.max(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 15), Math.min(list4.size(), editorSession.layersReorderPreviewInsertIndex));
        String string3 = this.resolveDirectLayerParentTargetId(string);
        LayerTreeRow layerTreeRow = n4 < list4.size() ? list4.get(n4) : null;
        String string4 = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        if (layerTreeRow != null && layerTreeRow.entry != null) {
            string4 = this.resolveDirectLayerParentTargetId(layerTreeRow.entry.targetId);
        } else if (!list4.isEmpty() && (object = list4.get(list4.size() - Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127268, 3))) != null && ((LayerTreeRow)object).entry != null) {
            string4 = this.resolveDirectLayerParentTargetId(((LayerTreeRow)object).entry.targetId);
        }
        List<String> siblingOrder = this.collectDirectSiblingTargetOrder(list4, string4);
        int n5 = layerTreeRow != null && layerTreeRow.entry != null ? ((n2 = siblingOrder.indexOf(layerTreeRow.entry.targetId)) < 0 ? siblingOrder.size() : n2) : siblingOrder.size();
        n5 = Math.max(Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 20), Math.min(siblingOrder.size(), n5));
        ArrayList<String> arrayList2 = new ArrayList<String>(siblingOrder);
        arrayList2.add(n5, string);
        int n6 = n = !this.equalsNullable(string3, string4) ? Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 13) : Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 18);
        List<String> list_siblings;
        if (n == 0 && arrayList2.equals(list_siblings = this.collectDirectSiblingTargetOrder(list2, string3))) {
            return;
        }
        list_siblings = n != 0 ? this.collectDirectSiblingTargetOrder(list4, string3) : Collections.emptyList();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add(string);
        linkedHashSet.addAll(arrayList2);
        linkedHashSet.addAll(list_siblings);
        Map<String, Map<String, Object>> map = this.captureRawTargetsById(editorSession, linkedHashSet);
        this.recordEditorMutation(editorSession);
        if (n != 0) {
            Map<String, Object> map2 = this.moveRawTargetToParent(editorSession, string, string4);
            if (map2 == null) {
                return;
            }
            map.put(string, map2);
        }
        this.applySiblingLayerOrderingOnRawTargets(editorSession, map, arrayList2);
        if (n != 0) {
            this.rerenderAfterLayersStructureChange(player, editorSession, arrayList, list3);
            return;
        }
        this.rerenderAfterLayersStructureChange(player, editorSession, arrayList, list3);
    }

    public boolean applyLayersReorderDropAsChild(EditorSession editorSession, List<LayerTreeRow> list, int n, String string, String string2) {
        boolean bl;
        List<String> list2;
        if ((-1695575190 * (-1695575190 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || list == null || list.isEmpty() || n < 0 || n >= list.size() || string == null || string.isBlank() || string2 == null || string2.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(238945360, 19) != 0;
        }
        String string3 = this.resolveDirectLayerParentTargetId(string);
        int n2 = !this.equalsNullable(string3, string2) ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842143660, 14) : Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1911562880, 22);
        List<LayerTreeRow> list3 = this.buildRowsWithoutSourceSubtree(list, string);
        List<String> list4 = this.collectDirectSiblingTargetOrder(list3, string2);
        list4.add(string);
        if (n2 == 0 && list4.equals(list2 = this.collectDirectSiblingTargetOrder(list, string3))) {
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(961010650, 9) != 0;
        }
        list2 = n2 != 0 ? this.collectDirectSiblingTargetOrder(list3, string3) : Collections.emptyList();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add(string);
        linkedHashSet.addAll(list4);
        linkedHashSet.addAll(list2);
        Map<String, Map<String, Object>> map = this.captureRawTargetsById(editorSession, linkedHashSet);
        this.recordEditorMutation(editorSession);
        if (n2 != 0) {
            Map<String, Object> map2 = this.moveRawTargetToParent(editorSession, string, string2);
            if (map2 == null) {
                return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 22) != 0;
            }
            map.put(string, map2);
        }
        return ((bl = this.applySiblingLayerOrderingOnRawTargets(editorSession, map, list4)) || n2 != 0 ? Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-926905855, 24) : Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-133087176, 29)) != 0;
    }

    public List<String> collectDirectSiblingTargetOrder(List<LayerTreeRow> list, String string) {
        if ((-452031775 * -452031775 - -452031775 & 1) != 0) {
            throw new IllegalStateException();
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        if (list == null || list.isEmpty()) {
            return arrayList;
        }
        for (LayerTreeRow layerTreeRow : list) {
            String string2;
            if (layerTreeRow == null || layerTreeRow.entry == null || layerTreeRow.entry.targetId == null || layerTreeRow.entry.targetId.isBlank() || !this.equalsNullable(string2 = this.resolveDirectLayerParentTargetId(layerTreeRow.entry.targetId), string)) continue;
            arrayList.add(layerTreeRow.entry.targetId);
        }
        return arrayList;
    }

    public List<String> captureSelectionTargetPaths(EditorSession editorSession, List<String> list) {
        if (((0x44E3758D | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        if (editorSession == null || list == null || list.isEmpty()) {
            return arrayList;
        }
        for (String string : list) {
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_et1f9vygj64d(335778177, 9)];
            stringArray[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)-1374716078, (int)22)] = string;
            String string2 = this.firstNonBlank(stringArray);
            if (string2.isBlank()) continue;
            HoverElement hoverElement = this.findFirstByTargetId(editorSession, string2);
            String[] stringArray2 = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1837932972, 22)];
            stringArray2[Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp((int)-633780261, (int)1)] = hoverElement == null ? null : hoverElement.targetPath;
            String string3 = this.firstNonBlank(stringArray2);
            if (string3.isBlank() && this.resolveRawMapAtPath(editorSession.rawBlocks, string2) != null) {
                string3 = string2;
            }
            if (string3.isBlank()) continue;
            arrayList.add(string3);
        }
        return arrayList;
    }

    public boolean isKnownSelectionTargetId(EditorSession editorSession, String string) {
        if (((-1664336211 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 2) != 0;
        }
        if (this.findFirstByTargetId(editorSession, string) != null) {
            return Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716077, 10) != 0;
        }
        return this.hasLayerEntryTargetId(editorSession, string);
    }

    public void restoreSelectionAfterLayersStructureChange(EditorSession editorSession, List<String> list, List<String> list2) {
        String string;
        if ((1321246508 * (1321246508 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return;
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        if (list2 != null) {
            for (String string2 : list2) {
                string = this.findTargetIdByPath(editorSession, string2);
                if (string.isBlank()) continue;
                linkedHashSet.add(string);
            }
        }
        if (linkedHashSet.isEmpty() && list != null) {
            for (String string2 : list) {
                String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127340, 6)];
                stringArray[Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8((int)-1374716078, (int)9)] = string2;
                string = this.firstNonBlank(stringArray);
                if (string.isBlank() || !this.isKnownSelectionTargetId(editorSession, string)) continue;
                linkedHashSet.add(string);
            }
        }
        editorSession.selectedElementId = null;
        editorSession.additionalSelectedElementIds.clear();
        for (String string2 : linkedHashSet) {
            this.appendSelectionTarget(editorSession, string2);
        }
        this.normalizeSelectionState(editorSession);
        editorSession.selectionOutlineVisible = (editorSession.selectedElementId != null ? Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127148, 7) : Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 23)) != 0;
    }

    public void rerenderAfterLayersStructureChange(Player player, EditorSession editorSession, List<String> list, List<String> list2) {
        if ((471723886 * 471723886 + 471723886 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return;
        }
        editorSession.spawnOpacityRetoggledTargetIds.clear();
        editorSession.pendingSpawnOpacityRetoggleTargetIds.clear();
        editorSession.spawnOpacityRetoggleTaskQueued = (Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 14)) != 0;
        this.rerenderEditableContent(player, editorSession);
        this.restoreSelectionAfterLayersStructureChange(editorSession, list, list2);
        this.rerenderEditableSelection(player, editorSession);
    }

    public void rerenderSelectionAfterLayersStructureChange(Player player, EditorSession editorSession, List<String> list, List<String> list2) {
        if ((1129404585 * 1129404585 + 1129404585 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return;
        }
        this.rerenderEditableSelection(player, editorSession);
        this.restoreSelectionAfterLayersStructureChange(editorSession, list, list2);
        this.rerenderEditableSelection(player, editorSession);
    }

    public Map<String, Map<String, Object>> captureRawTargetsById(EditorSession editorSession, Collection<String> collection) {
        if (((0xF627CCB1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        LinkedHashMap<String, Map<String, Object>> linkedHashMap = new LinkedHashMap<String, Map<String, Object>>();
        if (editorSession == null || collection == null || collection.isEmpty()) {
            return linkedHashMap;
        }
        for (String string : collection) {
            HoverElement hoverElement;
            String[] stringArray = new String[Xqedii_3c6skvl.Xqedii_306hip527e6uo(1844224428, 21)];
            stringArray[Xqedii_3c6skvl.Xqedii_et1f9vygj64d((int)1343110660, (int)11)] = string;
            String string2 = this.firstNonBlank(stringArray);
            if (string2.isBlank() || linkedHashMap.containsKey(string2)) continue;
            Map<String, Object> map = this.resolveRawMapAtPath(editorSession.rawBlocks, string2);
            if (map == null && (hoverElement = this.findFirstByTargetId(editorSession, string2)) != null && hoverElement.targetPath != null && !hoverElement.targetPath.isBlank()) {
                map = this.resolveRawMapAtPath(editorSession.rawBlocks, hoverElement.targetPath);
            }
            if (map == null) continue;
            linkedHashMap.put(string2, map);
        }
        return linkedHashMap;
    }

    public boolean handleLayersPanelClick(Player player, EditorSession editorSession, double d, double d2) {
        int n;
        if ((1818499319 * (1818499319 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 28) != 0;
        }
        List<LayerTreeRow> list = this.collectLayerTreeRows(editorSession);
        EditorRect editorRect = this.resolveLayersListRect(editorSession, list);
        if (list.isEmpty()) {
            return this.isInsideRect(editorRect, d, d2);
        }
        int n2 = Math.max(Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 26), list.size() - Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716069, 31));
        editorSession.layersScrollOffset = n = (int)Math.floor(this.clampLayersScrollValue(editorSession.layersScrollOffset, n2) + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_34m2qw74vaapp(4474648666619000048L, 14)));
        editorSession.layersScrollPosition = n;
        editorSession.layersScrollTarget = n;
        editorSession.layersScrollVelocity = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_1hybwtk004yv2(-3691131708185269065L, 11));
        int n3 = this.resolveLayerSlotByHit(editorSession, d, d2);
        if (n3 < Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(2107483028, 21) || n3 > Xqedii_3c6skvl.Xqedii_et1f9vygj64d(247858256, 19)) {
            return this.isInsideRect(editorRect, d, d2);
        }
        int n4 = n + (n3 - Xqedii_3c6skvl.Xqedii_et1f9vygj64d(807567474, 30));
        if (n4 < 0 || n4 >= list.size()) {
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1193868091, 6) != 0;
        }
        LayerTreeRow layerTreeRow = list.get(n4);
        LayerEntry layerEntry = layerTreeRow.entry;
        if (this.isLayerDropdownHit(editorSession, n, n3, d, d2) && layerTreeRow.dropdown) {
            this.finishLayersReorderDrag(player, editorSession, Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 28) != 0);
            editorSession.layersScrollAnimationToken += Xqedii_3c6skvl.Xqedii_et1f9vygj64d(1615134948, 31);
            editorSession.layersScrollVelocity = Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_jv4kk5d55oex(1114208983734476995L, 44));
            editorSession.layersScrollTarget = editorSession.layersScrollPosition;
            this.recordEditorMutation(editorSession);
            if (editorSession.collapsedLayerTargetIds.contains(layerEntry.targetId)) {
                editorSession.collapsedLayerTargetIds.remove(layerEntry.targetId);
            } else {
                editorSession.collapsedLayerTargetIds.add(layerEntry.targetId);
            }
            this.renderLayersPanel(player, editorSession);
            return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-450926744, 11) != 0;
        }
        if (this.isInsideShellBlock(editorSession, this.layerOpacityHitboxId(n3), d, d2) || this.isInsideShellBlock(editorSession, this.layerOpacityId(n3), d, d2)) {
            this.finishLayersReorderDrag(player, editorSession, Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-450924696, 11) != 0);
            this.toggleLayerVisibility(player, editorSession, layerEntry.targetId);
            return Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-926905855, 24) != 0;
        }
        boolean bl = player.isSneaking();
        if (bl) {
            this.toggleLayerSelectionTarget(editorSession, layerEntry.targetId);
            this.finishLayersReorderDrag(player, editorSession, Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 22) != 0);
        } else {
            editorSession.selectedElementId = layerEntry.targetId;
            editorSession.additionalSelectedElementIds.clear();
            this.armLayersReorderDrag(editorSession, layerEntry.targetId, d, d2);
        }
        this.normalizeSelectionState(editorSession);
        editorSession.activeHandle = null;
        editorSession.resizeAnchorValid = (Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842127276, 4)) != 0;
        editorSession.handlesCollapsed = (Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(-1374716078, 18)) != 0;
        this.updateHoveredHighlight(player, editorSession, editorSession.hoveredElementId, null);
        editorSession.hoveredElementId = null;
        this.clearEditorOverlaysOnly(player, editorSession);
        if (editorSession.selectedElementId != null) {
            this.showSelectionOverlay(player, editorSession);
        }
        if (editorSession.selectedElementId != null || !editorSession.additionalSelectedElementIds.isEmpty()) {
            this.playEditorSfx(player, editorSession, Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("A3MEY8yS5BHVpCPbZgvoi0N4JHO92PiENoJrPCw17p0Ht3dR1q/QWU0AN1C0kCVYpeFEsdPiIrY="));
        }
        this.updateEditorPropertiesSidebar(player, editorSession);
        this.renderLayersPanel(player, editorSession);
        return Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-633780263, 1) != 0;
    }

    public String resolveLayerSelectionTargetByHit(EditorSession editorSession, double d, double d2) {
        if ((0x81586E00 ^ 0x81586E00) != 0) {
            throw new IllegalStateException();
        }
        return this.resolveLayerSelectionTargetByHit(editorSession, d, d2, Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1907230986, 7) != 0);
    }

    public String resolveLayerSelectionTargetByHit(EditorSession editorSession, double d, double d2, boolean bl) {
        LayerEntry layerEntry;
        if ((492407251 * (492407251 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return null;
        }
        List<LayerTreeRow> list = this.collectLayerTreeRows(editorSession);
        if (list.isEmpty()) {
            return null;
        }
        int n = Math.max(Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(1205590585, 17), list.size() - Xqedii_3c6skvl.Xqedii_15fmwl6bjb8a8(1374716069, 31));
        int n2 = (int)Math.floor(this.clampLayersScrollValue(editorSession.layersScrollOffset, n) + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(6411288472959633452L, 34)));
        int n3 = this.resolveLayerSlotByHit(editorSession, d, d2);
        if (n3 < Xqedii_3c6skvl.Xqedii_et1f9vygj64d(478939296, 20) || n3 > Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(687815495, 14)) {
            return null;
        }
        int n4 = n2 + (n3 - Xqedii_3c6skvl.Xqedii_306hip527e6uo(1842131372, 12));
        if (n4 < 0 || n4 >= list.size()) {
            return null;
        }
        LayerTreeRow layerTreeRow = list.get(n4);
        LayerEntry layerEntry2 = layerEntry = layerTreeRow == null ? null : layerTreeRow.entry;
        if (layerEntry == null || layerEntry.targetId == null || layerEntry.targetId.isBlank()) {
            return null;
        }
        if (!bl) {
            if (this.isLayerDropdownHit(editorSession, n2, n3, d, d2) && layerTreeRow.dropdown) {
                return null;
            }
            if (this.isInsideShellBlock(editorSession, this.layerOpacityHitboxId(n3), d, d2) || this.isInsideShellBlock(editorSession, this.layerOpacityId(n3), d, d2)) {
                return null;
            }
        }
        return layerEntry.targetId;
    }

    public String resolveLayerSelectionTargetPathByHit(EditorSession editorSession, double d, double d2, boolean bl) {
        LayerEntry layerEntry;
        if (((0x2345AC43 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        }
        List<LayerTreeRow> list = this.collectLayerTreeRows(editorSession);
        if (list.isEmpty()) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        }
        int n = Math.max(Xqedii_3c6skvl.Xqedii_et1f9vygj64d(671555330, 10), list.size() - Xqedii_3c6skvl.Xqedii_306hip527e6uo(1841570220, 15));
        int n2 = (int)Math.floor(this.clampLayersScrollValue(editorSession.layersScrollOffset, n) + Double.longBitsToDouble(Xqedii_3c6skvl.Xqedii_4d486dpawhek(-1305607933359338683L, 51)));
        int n3 = this.resolveLayerSlotByHit(editorSession, d, d2);
        if (n3 < Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-1907231114, 7) || n3 > Xqedii_3c6skvl.Xqedii_2emr1d24zbwnp(-12892376, 22)) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        }
        int n4 = n2 + (n3 - Xqedii_3c6skvl.Xqedii_et1f9vygj64d(-463452928, 23));
        if (n4 < 0 || n4 >= list.size()) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        }
        LayerTreeRow layerTreeRow = list.get(n4);
        LayerEntry layerEntry2 = layerEntry = layerTreeRow == null ? null : layerTreeRow.entry;
        if (layerEntry == null || layerEntry.targetPath == null || layerEntry.targetPath.isBlank()) {
            return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
        }
        if (!bl) {
            if (this.isLayerDropdownHit(editorSession, n2, n3, d, d2) && layerTreeRow.dropdown) {
                return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
            }
            if (this.isInsideShellBlock(editorSession, this.layerOpacityHitboxId(n3), d, d2) || this.isInsideShellBlock(editorSession, this.layerOpacityId(n3), d, d2)) {
                return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("3rlE92EWdc63WyXZNaM7VjGzxWYmOkAQdjdRrA==");
            }
        }
        return layerEntry.targetPath;
    }

    private static /* synthetic */ String Xqedii_2z9dcb0g52nag(String string, String string2) {
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("OAflCnMgbXVRgoLdJjgDOGREvS5FCz6KLceJo7jQSCw=") + string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("/5V7XxChP+UvRYAK+CFPAqUa4J5J1BykXzZlGgAvxHSUDpe+") + string2;
    }

    private static /* synthetic */ String Xqedii_rx511l1lfg6y(String string, String string2, String string3, String string4) {
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("OAflCnMgbXVRgoLdJjgDOGREvS5FCz6KLceJo7jQSCw=") + string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("/5V7XxChP+UvRYAK+CFPAqUa4J5J1BykXzZlGgAvxHSUDpe+") + string2 + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("NbMEVi+JyXTzqUfqDlIcgs1X4IobSSaIbvfcnvCM7t7pQgo9dDMswJ6ueag=") + string3 + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("rffwrdsUvT2LeN5LfoM/k8skG07PC/lxWiEM6AVayxE0U0w6r0KQcv4K8migxA==") + string4;
    }

    private static /* synthetic */ String Xqedii_hzhzgx534dme(String string, String string2) {
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("/jfCxCIV5RJHBdrgGf8gtZQgRWl/YExmobOhD64JxnEdjQRLc41f/Q==") + string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("rffwrdsUvT2LeN5LfoM/k8skG07PC/lxWiEM6AVayxE0U0w6r0KQcv4K8migxA==") + string2;
    }

    private static /* synthetic */ String Xqedii_1m1w18r3go983(String string) {
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("qxCYC3oiwASUvlKxMbozbEeQJq/sgjdgbRKPTQ3H7QsM4+GKzTI=") + string;
    }

    private static /* synthetic */ String Xqedii_3f7ar4ewlk0vf(int n) {
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("hx6qGtMkzJXzn46Een8FS0fcjAVgZr12DpoIxGjS1gRh+B1N90trGw==") + n;
    }

    private static /* synthetic */ String Xqedii_2mum1ayvoy3jo(String string, int n) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("huU+CDZkQXCf/CH4/u311i7yHlo9P88zUoPYSqpQ") + n;
    }

    private static /* synthetic */ String Xqedii_2cogteqkjf5hd(String string) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("xewnpAt3pvSjBL0uLhcXdS3sF7xSYL7zVLCL0FrEpsPPVw==");
    }

    private static /* synthetic */ String Xqedii_1sygibrbjuxd4(String string) {
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("puKrpuHayAgMnKvxUAn7zTJNLQnrkqeBbIBG3Ofrvfsz6RTWjZrzPEi5nmLY9w3uAqNi85di3VvJzQ==") + string;
    }

    private static /* synthetic */ String Xqedii_a03cz5pl8xzz(int n) {
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("f1rBY70sW46xuMfLWd59LcGQjF0FNoSZ8/gasWeggbwIGVdgXMmof3sDJrxqPuFBcbTSwipgQCVcvKaNeDqq8f8revBhnADFD0rlyoZZ") + n;
    }

    private static /* synthetic */ String Xqedii_2n693ccuvgv0a(String string) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ZAog1CTi3jwg8oW1qwFdvYy/iaHbbhSw21kTBMyrNKZILyjJ");
    }

    private static /* synthetic */ String Xqedii_32d6pnn0a45yj(String string) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("fcXQ6UHzA/JyIPXhH3j2vfDJTy+l/Wc64Tv4ZWzBQvw4Njw8uEg=");
    }

    private static /* synthetic */ String Xqedii_3jbpk6eegvx9j(String string) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("bl/GoGMko5w6rU0It2kWNccJcgjyVMwXYdgoBMaEHFW4DuqAv0V1twhRq5RNrtmA7b8MBHk80zdtiQ==");
    }

    private static /* synthetic */ String Xqedii_23kt8glf8jnfs(int n) {
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("8wEbfhXmWXlgQEm6436iVC4mGO6LEiIHZIwbVu31fkQfembTM+1Iw9+NYLQY4eMctOJqRDr95LUvlPmdrZ0fJa7m2rYjOdc5Qx6gVDv9VnI=") + n;
    }

    private static /* synthetic */ String Xqedii_3nml3ilqpwdk5(String string) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ZAog1CTi3jwg8oW1qwFdvYy/iaHbbhSw21kTBMyrNKZILyjJ");
    }

    private static /* synthetic */ String Xqedii_3sk9zj3w5eg5e(String string) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BJzG4Ofg57Oy7W+F5ElGfgFAHWZ9tU80Jmxpc09Pe/bFLwQMN5oYu2JON8E=");
    }

    private static /* synthetic */ String Xqedii_15ejq3gam5895(String string) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("IC+jrnq5t1T5SKD6h+oJTyMei/uRNKYvEGQu8w0CIAVaK7CGo2553VFLdWxFcWWvqxSqzE5ckDk=");
    }

    private static /* synthetic */ String Xqedii_1s2zykskaydju(String string) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("fcXQ6UHzA/JyIPXhH3j2vfDJTy+l/Wc64Tv4ZWzBQvw4Njw8uEg=");
    }

    private static /* synthetic */ String Xqedii_3tyanatwqhnhc(String string) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("bl/GoGMko5w6rU0It2kWNccJcgjyVMwXYdgoBMaEHFW4DuqAv0V1twhRq5RNrtmA7b8MBHk80zdtiQ==");
    }

    private static /* synthetic */ String Xqedii_12yg477gl8zhr(String string) {
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("+lvDBnccQ/j00sWspcgvspZk1pys53MW6gSs1++LNDBE/h/iavaNkRUsPudz1gBcIWzaI7Ju") + string;
    }

    private static /* synthetic */ String Xqedii_2e36s5grypjnl(String string) {
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("+lvDBnccQ/j00sWspcgvspZk1pys53MW6gSs1++LNDBE/h/iavaNkRUsPudz1gBcIWzaI7Ju") + string;
    }

    private static /* synthetic */ String Xqedii_py9ijbjucpda(String string) {
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("+lvDBnccQ/j00sWspcgvspZk1pys53MW6gSs1++LNDBE/h/iavaNkRUsPudz1gBcIWzaI7Ju") + string;
    }

    private static /* synthetic */ String Xqedii_12ak9yo4fqonp(String string, int n) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("JBf2OFCwiUF4vlwoIjJu65UQZoKfWoDywEu4f/wmN3Y=") + n;
    }

    private static /* synthetic */ String Xqedii_376w57clzc08x(String string, String string2) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("HkKpDKyPzHrbqGQwIZpV+CjjdujFRXQQWfTMIB1v") + string2;
    }

    private static /* synthetic */ String Xqedii_1qt5rgw3pzpba(String string) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("xewnpAt3pvSjBL0uLhcXdS3sF7xSYL7zVLCL0FrEpsPPVw==");
    }

    private static /* synthetic */ String Xqedii_1h4vzuxjkvxe8(String string) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("xewnpAt3pvSjBL0uLhcXdS3sF7xSYL7zVLCL0FrEpsPPVw==");
    }

    private static /* synthetic */ String Xqedii_2y1sdtapapq5a(String string) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("G8mKIUt+DzkpcH2FMVVZlOkjTasVGxiyOL+eYyQbl1kzINOptQzxmY4bIPU4f6Nh");
    }

    private static /* synthetic */ String Xqedii_qooafmhjjf5j(String string) {
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("+lvDBnccQ/j00sWspcgvspZk1pys53MW6gSs1++LNDBE/h/iavaNkRUsPudz1gBcIWzaI7Ju") + string;
    }

    private static /* synthetic */ String Xqedii_37hv94usm9304(String string) {
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("+lvDBnccQ/j00sWspcgvspZk1pys53MW6gSs1++LNDBE/h/iavaNkRUsPudz1gBcIWzaI7Ju") + string;
    }

    private static /* synthetic */ String Xqedii_2n3gilarj48u9(String string) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("G8mKIUt+DzkpcH2FMVVZlOkjTasVGxiyOL+eYyQbl1kzINOptQzxmY4bIPU4f6Nh");
    }

    private static /* synthetic */ String Xqedii_16wpla9joqij0(String string) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("G8mKIUt+DzkpcH2FMVVZlOkjTasVGxiyOL+eYyQbl1kzINOptQzxmY4bIPU4f6Nh");
    }

    private static /* synthetic */ String Xqedii_1asl20lskryjs(String string) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("G8mKIUt+DzkpcH2FMVVZlOkjTasVGxiyOL+eYyQbl1kzINOptQzxmY4bIPU4f6Nh");
    }

    private static /* synthetic */ String Xqedii_860zwdndv0yl(String string) {
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("+lvDBnccQ/j00sWspcgvspZk1pys53MW6gSs1++LNDBE/h/iavaNkRUsPudz1gBcIWzaI7Ju") + string;
    }

    private static /* synthetic */ String Xqedii_1qoowl98xk5w9(String string) {
        return string + Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("G8mKIUt+DzkpcH2FMVVZlOkjTasVGxiyOL+eYyQbl1kzINOptQzxmY4bIPU4f6Nh");
    }

    private static /* synthetic */ String Xqedii_34rkkdqeebg2o(String string) {
        return Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("6/ceU4z0suot7ZFo1e3oGFNqpfsmOaRdIZQ/4I2kdy/0ir3ZmhVwZ1TwVF0RjaBO73xc5xGeSJX+wCgRQ1sTwwwV/gg=") + string;
    }

    static {
        Xqedii_8eidili = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("9s9zEHrgOHZgPMj5IAde+q8bon4fhG+ZBFRnCcaUGRI031NKmzSRURk+HTuwTf6kTQ2YXMwdOKCxOnfjg4uhVA==");
        Xqedii_1ubnhpl = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("T0JDM+l6aOBMwQP1b5/m+ymR2oC7tUROo0C89LexIK3b31HDwPt+KZYDgNLrLWtVAQ0wslSdWRlaEcTl380Oxqey");
        Xqedii_8xjdj85 = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("iNyrUHh6rWcqc5+XdAeMMsCxur7Qx7+HV7kXEv5I8DfZFUpNbdcQ53/kmgkOIk9mOXXTVdhWLyFXITwuCeCPaJWUKl82M/UD");
        Xqedii_1dodf2o = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("UwuN0md6gDRpIcBKbM/GAHUAS0ztY6n6Fd9m5dmEy26zM+FEigAEvwZ8xyvok0IBrbTIQnOBXQU+mE/bWhlVD2BDiMikgy6B");
        Xqedii_2i0chcr = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("FVyc1uCzSTxyFFzafsZc6dyndixg41vIgCHrtbNDk2tywoiLFpCxO1Rc");
        Xqedii_x0eixjl = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("52H0KSqG/HRN1lJETtE2t6SxyrMSioBMoYA9d1F9ckf2xfALm3E=");
        Xqedii_15akt8o = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("kthcyCj3J5mqECxMGan/Jvq0Ca8Qybu8s0wLZak3WKJpQMK6IMpAVFkT+NU=");
        Xqedii_1d3ogoj = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("lYcijUIQvBKnTwxqXAzKodRol4fIvdDKsc3uXWBjtCETHTv76R9LLdjpy88=");
        Xqedii_203ai1h = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("rQl03oQU3Nv6lq9RWzfS4sw2xWyJmfuYcC6vlt7fRfilsa2kYBLptCDapydaDMrkxes56LshQVgs/tpD");
        Xqedii_2w80w9l = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("TijH8tTbYpo0BKBEZBBJkM83CDvBfWQFjNzGi3hA9LSLcBJcFE0EBmF+NWGJWZfl");
        Xqedii_1mmdcu5 = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("gyHMTmjF3KsOTRVYuZdxQMWK4eCDKBfYT6PEVohX6OO8SQXF68ahxk8OTh2bcqTD");
        Xqedii_nez9tlj = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("f41iRBL852VxQebZT0arSA90OxpSRn6oQ8UZhsi+VVbHPLnYqlPgxgsrJJfQ1niE");
        Xqedii_3nbrgrn = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("ngWIh131+joMJkENfc41ZGEwW0XJohdP9esCqIb/J7Y8l4ueljoCS2Ca7RgYpJCr");
        Xqedii_9dvkcqb = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BSW39i5HcmjGkLsn4Fpc9uQqk9NqhhfH7wZTG8LWna0xBswCSapn2HbfmdUlHIqr");
        Xqedii_6ocnopa = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("pBe0fH9jRlt14hEKb7o3jPKF7K4F0wxfJZ5U1l9X0eYRTUhrn8YyyhnLcOsqSAlr");
        Xqedii_djjcrxq = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("9aaGomvQrliu/giiWirPCQqUpH3kmb4BPS/M6cAlTNmbRSd68WI/jUV4zN8CqbD6xY3JhA==");
        Xqedii_22lfpk5 = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("BzG2v+GJIzubnUmrrG2s3OmsvIIPoSkwhSeDCMzTI1ZJJMO0uMzBz/hgejvbRmeMcApijVeo");
        Xqedii_sx8qi7k = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Ndu97I+3+3ClNDU+0RNoBcymM/qCqFlFg8ouOLZIkj6D/GFl/hnx1US8Qy3+qTzON3HUHKQw");
        Xqedii_2g2kudi = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("Iqn6F4U951QPY5bxZAZyOm+nskUDcKSHxKSc9r/NWmh3JiZnhfCxKyan536/npAVtA42N6gQfHcXEIi3eA8=");
        Xqedii_3534rb4 = Xqedii_3c6skvl.Xqedii_38ppq5cdt6k6n("khzTO8nWrzsUvfWhQKChGFI6+qSbsuERnzVguXFnmOLlOQjGgcr9UdbJO5vV6LAAfFdzOQ==");
    }

    public final class LayerTreeRow {
        public static final String Xqedii_1eed3qv7o7iro = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
        public final LayerEntry entry;
        public final boolean dropdown;
        public final boolean open;
        public final boolean children;
        public final boolean parent;
        public final boolean under;
        public final boolean end;
        public final int depthValue;
        public final List<Integer> extraLines;
        public final boolean dragPlaceholder;
        private static transient /* synthetic */ String YVrZzDDzSh = "00000000000000000000000000000000000000000000";

        public LayerTreeRow(LayerEntry layerEntry, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, int n, List<Integer> list, boolean bl7) {
            this.entry = layerEntry;
            this.dropdown = bl;
            this.open = bl2;
            this.children = bl3;
            this.parent = bl4;
            this.under = bl5;
            this.end = bl6;
            this.depthValue = n;
            this.extraLines = list == null ? Collections.emptyList() : List.copyOf(list);
            this.dragPlaceholder = bl7;
        }
    }

    public final class LayerEntry {
        public static final String Xqedii_eyrnljnbjopu = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
        public final String targetId;
        public final String targetPath;
        public final String typeLabel;
        public String displayName;
        public double layer;
        public final boolean numbered;
        public final List<LayerEntry> children = new ArrayList<LayerEntry>();
        private static transient /* synthetic */ String wXgKbQYdCG = "00000000000000000000000000000000000000000000";

        public LayerEntry(String string, String string2, String string3, double d) {
            this(string, string2, string3, d, string3, Xqedii_ml97w4s.Xqedii_30o9xtqkibre4(-970144154, 14) != 0);
        }

        public LayerEntry(String string, String string2, String string3, double d, String string4, boolean bl) {
            this.targetId = string;
            this.targetPath = string2 == null || string2.isBlank() ? Xqedii_ml97w4s.Xqedii_1bh7czqfpz0d5("BTD06NeNriR4inP/zvaGOcAHh93QVni5suKrJg==") : string2;
            this.typeLabel = string3;
            this.displayName = string4 == null || string4.isBlank() ? string3 : string4;
            this.layer = d;
            this.numbered = bl;
        }
    }
}

