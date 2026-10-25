/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.configuration.ConfigurationSection
 *  org.bukkit.entity.Player
 *  org.bukkit.entity.TextDisplay.TextAlignment
 */
package dev.xqedii.ultimateUI.service.gui.editor.shell.managers;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_170zfgx;
import dev.xqedii.ultimateUI.Xqedii_2ntqrxd;
import dev.xqedii.ultimateUI.Xqedii_32drtqx;
import dev.xqedii.ultimateUI.Xqedii_3b4mho8;
import dev.xqedii.ultimateUI.Xqedii_bwmwn2k;
import dev.xqedii.ultimateUI.gui.model.HoverElement;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.editor.shell.managers.AnimationTimelineManager;
import dev.xqedii.ultimateUI.service.gui.editor.shell.managers.EditorLayersLayerPart;
import dev.xqedii.ultimateUI.service.gui.editor.shell.managers.EditorNavbarHistoryPart;
import dev.xqedii.ultimateUI.service.gui.model.EditorPropertyField;
import dev.xqedii.ultimateUI.service.gui.model.EditorRect;
import dev.xqedii.ultimateUI.service.gui.model.EditorSession;
import dev.xqedii.ultimateUI.service.gui.model.EditorSidebarTab;
import dev.xqedii.ultimateUI.service.gui.model.EditorTool;
import dev.xqedii.ultimateUI.service.hud.HudPositionCalculator;
import dev.xqedii.ultimateUI.service.hud.HudService;
import java.lang.invoke.MethodHandle;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.entity.TextDisplay;

public abstract class EditorTimelineKeyframePart
extends EditorLayersLayerPart {
    public static final String Xqedii_2tqy1sdtk36uc = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
    public final AnimationTimelineManager animationTimelineManager = new AnimationTimelineManager();

    public EditorTimelineKeyframePart(UltimateUI ultimateUI, HudService hudService, CameraService cameraService) {
        super(ultimateUI, hudService, cameraService);
    }

    public abstract void applyTimelinePositionPreview(Player var1, EditorSession var2);

    public abstract void clearTimelinePreviewOffset(Player var1, EditorSession var2);

    public abstract String resolveAnimationBaseTargetId(String var1);

    public abstract void syncTimelinePreviewAppliedBoundsToCurrent(EditorSession var1, String var2);

    public abstract EditorRect resolveTimelineStableBaseBounds(EditorSession var1, String var2);

    public abstract double resolveTimelineStableBaseRotation(EditorSession var1, String var2);

    public abstract double resolveTimelineStableBaseOpacity(EditorSession var1, String var2);

    public abstract Double resolveTimelineExplicitTickZeroOpacity(EditorSession var1, String var2);

    public abstract void resetSidebarFieldDrag(Player var1, EditorSession var2);

    public abstract void toggleSidebarItemDesignGlowing(Player var1, EditorSession var2);

    public abstract void cycleSidebarHoverEffect(Player var1, EditorSession var2, boolean var3);

    public abstract void toggleSidebarTextAlignment(Player var1, EditorSession var2);

    public abstract boolean isTextDesignSidebarMode(EditorSession var1);

    public abstract void cycleSidebarBorderRadiusMode(Player var1, EditorSession var2);

    public abstract boolean isItemDesignSidebarMode(EditorSession var1);

    @Override
    public abstract void updateEditorPropertiesSidebar(Player var1, EditorSession var2);

    @Override
    public abstract void updateEditorKeyframeSidebar(Player var1, EditorSession var2);

    public abstract void updateEditorDesignSidebar(Player var1, EditorSession var2);

    public abstract int readTargetOpacity(EditorSession var1, String var2);

    public abstract double readTargetRotation(EditorSession var1, String var2);

    public abstract String readTargetColor(EditorSession var1, String var2);

    public abstract String readTargetOutlineColor(EditorSession var1, String var2);

    public abstract boolean isTargetOutlineColorAuto(EditorSession var1, String var2);

    public abstract boolean setTargetOpacity(EditorSession var1, String var2, int var3);

    public abstract boolean setTargetRotation(EditorSession var1, String var2, double var3);

    public abstract boolean setTargetColor(EditorSession var1, String var2, String var3);

    public abstract boolean setTargetHoverColor(EditorSession var1, String var2, String var3);

    public abstract boolean setTargetOutlineColor(EditorSession var1, String var2, String var3);

    public abstract boolean setTargetOutlineColorAuto(EditorSession var1, String var2);

    public abstract HoverEffectRuntimeConfig resolveHoverEffectRuntimeConfig(String var1);

    public abstract String readTargetRawType(EditorSession var1, String var2);

    public abstract String readTargetName(EditorSession var1, String var2);

    public abstract void clearPendingItemDesignInventoryPick(EditorSession var1);

    public abstract void setCursorActionsDropdownVisible(Player var1, EditorSession var2, boolean var3);

    public abstract void setCursorActionsEditDropdownVisible(Player var1, EditorSession var2, boolean var3);

    public abstract boolean isKeyframePropertiesSidebarMode(EditorSession var1);

    public abstract boolean isActionsSidebarMode(EditorSession var1);

    public abstract double snapToGrid(EditorSession var1, double var2);

    public abstract String resolveRawTargetPathByTargetId(EditorSession var1, String var2);

    public abstract void setRightSidebarTab(Player var1, EditorSession var2, EditorSidebarTab var3, boolean var4);

    public abstract void updateSidebarTabVisualState(Player var1, EditorSession var2, boolean var3, boolean var4);

    public abstract boolean setPanelVisibleByComponentName(Player var1, EditorSession var2, String var3, boolean var4, boolean var5);

    public void updateAnimationTimelineSliderDrag(Player player, EditorSession editorSession, double d) {
        int n;
        if ((-1920729743 * -1920729743 - -1920729743 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || !editorSession.animationTimelinePanelVisible) {
            return;
        }
        double d2 = this.resolveTimelineSliderStartX(editorSession);
        if (!Double.isFinite(d2)) {
            this.stopAnimationTimelineSliderDrag(editorSession);
            return;
        }
        double d3 = d2 + Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-1679148319981916095L, 24));
        double d4 = Math.max(d2, Math.min(d3, d));
        double d5 = this.sliderXToPreciseTick(editorSession, d4);
        editorSession.animationTimelineTick = n = this.clampAnimationTimelineTick((int)Math.round(d5));
        editorSession.animationTimelineSliderDragTick = d5;
        this.updateTimelineSliderVisualByX(player, editorSession, d4);
        this.applyTimelinePositionPreview(player, editorSession);
        if (editorSession.selectionOutlineVisible && editorSession.selectedElementId != null && !editorSession.selectedElementId.isBlank()) {
            this.renderSelectionOverlay(player, editorSession);
        }
    }

    public void updateTimelineSliderVisual(Player player, EditorSession editorSession, int n) {
        int n2;
        if ((-400299012 * (-400299012 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || !editorSession.animationTimelinePanelVisible) {
            return;
        }
        double d = this.resolveTimelineSliderStartX(editorSession);
        if (!Double.isFinite(d)) {
            return;
        }
        editorSession.animationTimelineTick = n2 = this.clampAnimationTimelineTick(n);
        editorSession.animationTimelineSliderDragTick = null;
        double d2 = this.sliderTickToX(editorSession, n2);
        if (!Double.isFinite(d2)) {
            return;
        }
        this.updateTimelineSliderVisualByX(player, editorSession, d2);
    }

    public void updateTimelineSliderVisualByX(Player player, EditorSession editorSession, double d) {
        EditorRect editorRect;
        EditorRect editorRect2;
        if ((598787911 * 598787911 + 598787911 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || !editorSession.animationTimelinePanelVisible || !Double.isFinite(d)) {
            return;
        }
        EditorRect editorRect3 = this.findShellBlockRect(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Bgd+P04NcpQVC/8dzw2vtYEc8dGaQHOGAPBKcSg9ny+TVArrrpLJ/6Nf0aZh8OJu4MWTGL/9+sQKiP9gxwrLpavye2YCU1n+hp2Z3gF6n1CvFQrgt5OWCAJhXOHExQ=="));
        if (editorRect3 != null && !this.sameRect(editorRect3, editorRect2 = new EditorRect(d, editorRect3.y, editorRect3.width, editorRect3.height))) {
            this.moveShellElement(player, editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Bgd+P04NcpQVC/8dzw2vtYEc8dGaQHOGAPBKcSg9ny+TVArrrpLJ/6Nf0aZh8OJu4MWTGL/9+sQKiP9gxwrLpavye2YCU1n+hp2Z3gF6n1CvFQrgt5OWCAJhXOHExQ=="), editorRect2.x, editorRect2.y, editorRect2.width, editorRect2.height);
        }
        if ((editorRect2 = this.findShellBlockRect(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("KxDWL0p0rUjFxjpskk6NVmWVjwivMmJ2ZpfUdkeknkPs5R7LkiFUfEN2ypjpRftePj5lWBDGuRg31PrpEyPd/GpybKxQzxxtYly13WMZdFktjHn7KEn7qBGG5Kc="))) != null && !this.sameRect(editorRect2, editorRect = new EditorRect(d, editorRect2.y, editorRect2.width, editorRect2.height))) {
            this.moveShellElement(player, editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("KxDWL0p0rUjFxjpskk6NVmWVjwivMmJ2ZpfUdkeknkPs5R7LkiFUfEN2ypjpRftePj5lWBDGuRg31PrpEyPd/GpybKxQzxxtYly13WMZdFktjHn7KEn7qBGG5Kc="), editorRect.x, editorRect.y, editorRect.width, editorRect.height);
        }
    }

    public double resolveTimelineSliderStartX(EditorSession editorSession) {
        if ((497975220 * 497975220 - 497975220 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-1501127880585492902L, 17));
        }
        if (editorSession.animationTimelineSliderStartX != null && Double.isFinite(editorSession.animationTimelineSliderStartX)) {
            return editorSession.animationTimelineSliderStartX;
        }
        EditorRect editorRect = this.findShellBlockRect(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Bgd+P04NcpQVC/8dzw2vtYEc8dGaQHOGAPBKcSg9ny+TVArrrpLJ/6Nf0aZh8OJu4MWTGL/9+sQKiP9gxwrLpavye2YCU1n+hp2Z3gF6n1CvFQrgt5OWCAJhXOHExQ=="));
        if (editorRect == null) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287170351268626187L, 40));
        }
        double d = this.clampAnimationTimelineTick(editorSession.animationTimelineTick);
        if (editorSession.animationTimelineSliderDragTick != null && Double.isFinite(editorSession.animationTimelineSliderDragTick)) {
            d = Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-5586856221134212632L, 32)), Math.min(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287178081538670347L, 44)), editorSession.animationTimelineSliderDragTick));
        }
        double d2 = editorRect.x - Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(3982585889736028423L, 6)) * d;
        editorSession.animationTimelineSliderStartX = d2;
        return d2;
    }

    public double sliderTickToX(EditorSession editorSession, int n) {
        if ((1091434584 * 1091434584 + 1091434584 & 1) != 0) {
            throw new IllegalStateException();
        }
        return this.sliderTickToX(editorSession, (double)this.clampAnimationTimelineTick(n));
    }

    public double sliderTickToX(EditorSession editorSession, double d) {
        if (((0xF5173507 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        double d2 = this.resolveTimelineSliderStartX(editorSession);
        if (!Double.isFinite(d2)) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-7676927977847575179L, 24));
        }
        double d3 = Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-6075191601621718100L, 27)), Math.min(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-5440091306253874419L, 12)), d));
        return d2 + Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(-2824317221294392993L, 38)) * d3;
    }

    public int sliderXToTick(EditorSession editorSession, double d) {
        if ((-858181216 * -858181216 - -858181216 & 1) != 0) {
            throw new IllegalStateException();
        }
        return this.clampAnimationTimelineTick((int)Math.round(this.sliderXToPreciseTick(editorSession, d)));
    }

    public double sliderXToPreciseTick(EditorSession editorSession, double d) {
        if ((1768404553 * 1768404553 - 1768404553 & 1) != 0) {
            throw new IllegalStateException();
        }
        double d2 = this.resolveTimelineSliderStartX(editorSession);
        if (!Double.isFinite(d2) || !Double.isFinite(d)) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(7859597924725665941L, 51));
        }
        double d3 = (d - d2) / Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(8416035956919104272L, 40));
        return Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 33)), Math.min(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(1798160264385733707L, 15)), d3));
    }

    @Override
    public int clampAnimationTimelineTick(int n) {
        if ((-1298208517 * (-1298208517 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        return Math.max(Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 6), Math.min(Xqedii_32drtqx.Xqedii_3h0mif43akudp(-2066854599, 21), n));
    }

    @Override
    public void closeTimelineContextDropdowns(Player player, EditorSession editorSession) {
        if (((0xF744CE9E | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return;
        }
        if (editorSession.keyframeDropdownVisible) {
            this.setTimelineKeyframeDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_ffzx1ycco61l(770215279, 21) != 0);
        }
        if (editorSession.keyframeTimelineDropdownVisible) {
            this.setTimelineTimelineDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_3h0mif43akudp(-455894164, 1) != 0);
        }
        editorSession.animationTimelineContextTargetId = null;
        editorSession.animationTimelineContextRow = null;
        editorSession.animationTimelineContextTick = Xqedii_32drtqx.Xqedii_3h0mif43akudp(1489577526, 10);
    }

    public void refreshAfterTimelineSelectionChange(Player player, EditorSession editorSession) {
        if ((1298621313 * (1298621313 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return;
        }
        editorSession.rightSidebarHoverTab = null;
        this.updateSidebarTabVisualState(player, editorSession, Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 8) != 0, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 6) != 0);
        this.updateEditorPropertiesSidebar(player, editorSession);
    }

    public String resolveTimelineEditableTargetId(EditorSession editorSession) {
        int n;
        if ((491113562 * (491113562 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || editorSession.activeTool != EditorTool.ANIMATION) {
            return null;
        }
        List<String> list = this.getSelectedTargetIds(editorSession);
        if (list.size() != Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489310658, 16)) {
            return null;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1187715365, 31)];
        stringArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)593218426, (int)3)] = list.get(Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 21));
        String string = this.firstNonBlank(stringArray);
        if (string.isBlank()) {
            return null;
        }
        HoverElement hoverElement = this.findFirstByTargetId(editorSession, string);
        if (hoverElement == null) {
            return null;
        }
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 1)];
        stringArray2[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1128816075, (int)15)] = hoverElement.targetKind;
        if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("u/ZQAthRJjrWMH5dXpyCQs0usFj5/hgraxKMHo71aoM0PPqldZvqA4wXORD7WQ==").equalsIgnoreCase(this.firstNonBlank(stringArray2))) {
            return null;
        }
        String[] stringArray3 = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-527902990, 25)];
        stringArray3[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1214843834, (int)12)] = hoverElement.type;
        String string2 = this.firstNonBlank(stringArray3).toLowerCase(Locale.ROOT);
        int n2 = n = Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("iGnIi0AiOld/X8gOHJYOq0P4QcA3v0yeBbRVvenf6GBY8+wx0b5eTQ==").equals(string2) && this.isAnimationTimelineImageGroupRoot(editorSession, string) ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(647814007, 4) : Xqedii_32drtqx.Xqedii_3h0mif43akudp(920242599, 18);
        if (!(n != 0 || Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("RNTTTrCNucdx2b+polJYGmhqUUE7ux1wloDNi9D/3hApUUYPHn4=").equals(string2) || Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Y6V4YHipUWkmB+m80VsYN1x653XfMhMl31JSMG3t0eq/ocuv").equals(string2) || this.isRoundedType(string2))) {
            return null;
        }
        return string;
    }

    public String resolveTimelineImageGroupRootPath(EditorSession editorSession, String string) {
        int n;
        if (((-1136949678 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245126, 2)];
        stringArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1573536585, (int)31)] = string;
        String string2 = this.firstNonBlank(stringArray);
        if (editorSession == null || string2.isBlank()) {
            return string2;
        }
        String string3 = string2;
        while (!string3.isBlank()) {
            Map<String, Object> map = this.resolveRawMapAtPath(editorSession.rawBlocks, string3);
            if (this.isTimelineImageGroupRawTarget(map)) {
                return string3;
            }
            if (map != null && !this.isRawUiImageGlyphBlock(map)) {
                return string2;
            }
            int n2 = string3.lastIndexOf(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("5b5ccabXXzZQ+A9W1Za+dQ7xCfBnHManqHyVmM7oNMgvi4V874cIUSIHVuEgpi85"));
            if (n2 < 0) break;
            string3 = string3.substring(Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 25), n2);
        }
        return (n = string2.indexOf(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("5b5ccabXXzZQ+A9W1Za+dQ7xCfBnHManqHyVmM7oNMgvi4V874cIUSIHVuEgpi85"))) > 0 ? string2.substring(Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1762376009, 20), n) : string2;
    }

    public boolean isAnimationTimelineImageGroupRoot(EditorSession editorSession, String string) {
        if ((-1114172304 * -1114172304 - -1114172304 & 1) != 0) {
            throw new IllegalStateException();
        }
        return this.isTimelineImageGroupRawTarget(this.resolveRawTargetByTargetId(editorSession, string));
    }

    public boolean isTimelineImageGroupRawTarget(Map<String, Object> map) {
        Object object;
        int n;
        if ((826594664 * 826594664 + 826594664 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (map == null || map.isEmpty()) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1214843834, 12) != 0;
        }
        Object object2 = this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lruJ2tMbcpU5yi5TTE7y10C+2DtMjqSHix/ycDkkn1dYZPIwYJwKICj1Wi8kx63jib4nzeT97TwMo8pPjOGi4rPjsvKYQXV3sU9ROs1n5Ii1CGxpkWPP8BJ+E4d9R1ni6C8="));
        if (this.parseBooleanFlag(object2, Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 23) != 0)) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 7) != 0;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1187715365, 31)];
        stringArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)647813991, (int)4)] = this.stringValue(this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("gYXhoU8G/OoV2/NZ/0qTeQ7jyIpyNDfCqQ5wH9MML0s=")));
        String string = this.firstNonBlank(stringArray).toLowerCase(Locale.ROOT);
        Object object3 = this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("gnQH3ScQv8oiEM2k4g8WPTZ9xzNJqkura8DqouCONxDVUlJugFpt/CnUBic="));
        int n2 = n = object3 instanceof List && !((List)object3).isEmpty() ? Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1377451759, 10) : Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1122914843, 26);
        if (n == 0) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 9) != 0;
        }
        if (string.startsWith(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("umvu3R28KmWZ2EZ+odQsxFcOBuu5laXZGZMieWLDCDelK4hp"))) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(296609217, 2) != 0;
        }
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-573987018, 26)];
        stringArray2[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)1315812243, (int)11)] = this.stringValue(this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("5ADSzjnBkVO4tK01f4v4Hohw5AVQSc7sGYFnqCzYMx6WM/8Y")));
        object = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
        return (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("iGnIi0AiOld/X8gOHJYOq0P4QcA3v0yeBbRVvenf6GBY8+wx0b5eTQ==").equals(object) && this.hasTimelineGroupGlyphChildren(map) ? Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 3) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 22)) != 0;
    }

    public boolean hasTimelineGroupGlyphChildren(Map<String, Object> map) {
        List list;
        if ((365803153 * 365803153 + 365803153 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (map == null || map.isEmpty()) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 5) != 0;
        }
        Object object = this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("gnQH3ScQv8oiEM2k4g8WPTZ9xzNJqkura8DqouCONxDVUlJugFpt/CnUBic="));
        if (!(object instanceof List) || (list = (List)object).isEmpty()) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 11) != 0;
        }
        for (Object e : list) {
            Map<String, Object> map2 = this.toStringObjectMap(e);
            if (map2 == null || map2.isEmpty()) continue;
            String[] stringArray = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1823576645, 3)];
            stringArray[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1((int)-300459016, (int)14)] = this.stringValue(this.readMapPathValue(map2, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Y6V4YHipUWkmB+m80VsYN1x653XfMhMl31JSMG3t0eq/ocuv")));
            String string = this.firstNonBlank(stringArray).toLowerCase(Locale.ROOT);
            if (!string.isBlank() && (string.contains(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("fY5OPCwSDlCDxrkauZdpkyw9XNlYbnwbmF6OyLEcmA1rCrd40v6Pambf34SFjlAsKqEX902ZnoGs1Q==")) || string.contains(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("9GcY3qMKyrdoosQlJhOXT6RvgrJzsmISNt2nXEs0ElSA8uxkIzw=")))) {
                return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 27) != 0;
            }
            String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(573947064, 31)];
            stringArray2[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)-744788764, (int)9)] = this.stringValue(this.readMapPathValue(map2, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("gYXhoU8G/OoV2/NZ/0qTeQ7jyIpyNDfCqQ5wH9MML0s=")));
            String string2 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
            String[] stringArray3 = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1217238579, 24)];
            stringArray3[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1((int)-300459016, (int)24)] = this.stringValue(this.readMapPathValue(map2, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("5ADSzjnBkVO4tK01f4v4Hohw5AVQSc7sGYFnqCzYMx6WM/8Y")));
            String string3 = this.firstNonBlank(stringArray3).toLowerCase(Locale.ROOT);
            if (string2.isBlank() || !string2.startsWith(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("umvu3R28KmWZ2EZ+odQsxFcOBuu5laXZGZMieWLDCDelK4hp")) || Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("iGnIi0AiOld/X8gOHJYOq0P4QcA3v0yeBbRVvenf6GBY8+wx0b5eTQ==").equals(string3)) continue;
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1214839738, 12) != 0;
        }
        return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1762376009, 20) != 0;
    }

    public String resolveTimelineTargetLabel(EditorSession editorSession, String string) {
        if ((-1185811180 * -1185811180 - -1185811180 & 1) != 0) {
            throw new IllegalStateException();
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 17)];
        stringArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1214843834, (int)12)] = string;
        String string2 = this.firstNonBlank(stringArray);
        if (string2.isBlank()) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("3l3Fy9MGVXdlaeUt6VATQ7iyfYp6Sd066x8U3BdckTbjTs3R3hU=");
        }
        if (this.isAnimationTimelineImageGroupRoot(editorSession, string2)) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("EDsigPmhC48usuYLRKjGfjCvIrpEM9TsfueJqsKokJ6O2LSA20c=");
        }
        HoverElement hoverElement = this.findFirstByTargetId(editorSession, string2);
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 11)];
        stringArray2[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)9)] = hoverElement == null ? null : hoverElement.type;
        String string3 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
        if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Y6V4YHipUWkmB+m80VsYN1x653XfMhMl31JSMG3t0eq/ocuv").equals(string3)) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("XlMMNyI7E2jDXuCapX8vu68q9XwG1JS8qkn1KvV+4nt6ERL/");
        }
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("3l3Fy9MGVXdlaeUt6VATQ7iyfYp6Sd066x8U3BdckTbjTs3R3hU=");
    }

    public void rerenderTimelineSelectionTarget(Player player, EditorSession editorSession, String string) {
        if ((1965140801 * 1965140801 - 1965140801 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || string == null || string.isBlank()) {
            return;
        }
        this.clearTimelinePreviewOffset(player, editorSession);
        this.rerenderEditableContent(player, editorSession);
    }

    public Map<String, Object> ensureAnimationTimelineRowMap(Map<String, Object> map, String string) {
        if ((1052501427 * (1052501427 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        Map<String, Object> map2 = this.ensureChildMap(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("bKn8iirO0M/MKnCtEZ6R8cljIPJ64Js1K2Op6ETR6M5L1mDlEmrMZjjY+72dbc2WZykUDMy+9sP8HGbP"));
        Map<String, Object> map3 = this.ensureChildMap(map2, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("RO9T2pqu1FK8yTfnaIf2sjCrMrDXHt85vZ4xgYDaxsqxm9PNWwIiZvMQHx9eaA=="));
        return this.ensureChildMap(map3, string);
    }

    public Map<String, Object> readAnimationTimelineRowMap(Map<String, Object> map, String string) {
        if ((728530459 * 728530459 - 728530459 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (map == null || string == null || string.isBlank()) {
            return null;
        }
        Object object = map.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("bKn8iirO0M/MKnCtEZ6R8cljIPJ64Js1K2Op6ETR6M5L1mDlEmrMZjjY+72dbc2WZykUDMy+9sP8HGbP"));
        if (!(object instanceof Map)) {
            return null;
        }
        Map map2 = (Map)object;
        Object v = map2.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("RO9T2pqu1FK8yTfnaIf2sjCrMrDXHt85vZ4xgYDaxsqxm9PNWwIiZvMQHx9eaA=="));
        if (!(v instanceof Map)) {
            return null;
        }
        Map map3 = (Map)v;
        Object v2 = map3.get(string);
        if (!(v2 instanceof Map)) {
            return null;
        }
        return (Map)v2;
    }

    public Map<String, Object> ensureChildMap(Map<String, Object> map, String string) {
        if (((15598715 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (map == null || string == null || string.isBlank()) {
            return new LinkedHashMap<String, Object>();
        }
        Object object = map.get(string);
        if (object instanceof Map) {
            return (Map)object;
        }
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        map.put(string, linkedHashMap);
        return linkedHashMap;
    }

    public Map<String, Object> sortAnimationTimelineTickMap(Map<String, Object> map) {
        if ((0x89F192B9 ^ 0x89F192B9) != 0) {
            throw new IllegalStateException();
        }
        TreeMap treeMap = new TreeMap();
        if (map != null) {
            for (Map.Entry object : map.entrySet()) {
                double entry;
                if (object == null || object.getKey() == null || !Double.isFinite(entry = this.parseDouble(object.getKey(), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708060426550845638L, 50))))) continue;
                int n = this.clampAnimationTimelineTick((int)Math.round(entry));
                treeMap.putIfAbsent(n, object.getValue());
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<?, ?> entry : ((Map<?, ?>) treeMap).entrySet()) {
            linkedHashMap.put(Integer.toString((Integer)entry.getKey()), entry.getValue());
        }
        return linkedHashMap;
    }

    public boolean containsAnimationTimelineTick(Map<String, Object> map, int n) {
        if ((-995018944 * (-995018944 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        return (this.readAnimationTimelineTickValue(map, n) != null ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(1843174003, 22) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 9)) != 0;
    }

    public Object readAnimationTimelineTickValue(Map<String, Object> map, int n) {
        if (((1214262260 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (map == null || map.isEmpty()) {
            return null;
        }
        int n2 = this.clampAnimationTimelineTick(n);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            double d;
            if (entry == null || entry.getKey() == null || !Double.isFinite(d = this.parseDouble(entry.getKey(), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4143054613571174187L, 6)))) || this.clampAnimationTimelineTick((int)Math.round(d)) != n2) continue;
            return entry.getValue();
        }
        return null;
    }

    public Object removeAnimationTimelineTickValue(Map<String, Object> map, int n) {
        if (((0x8C57E90 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (map == null || map.isEmpty()) {
            return null;
        }
        int n2 = this.clampAnimationTimelineTick(n);
        String string = null;
        for (String string2 : map.keySet()) {
            double d;
            if (string2 == null || !Double.isFinite(d = this.parseDouble(string2, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4323207394759016203L, 56)))) || this.clampAnimationTimelineTick((int)Math.round(d)) != n2) continue;
            string = string2;
            break;
        }
        if (string == null) {
            return null;
        }
        return map.remove(string);
    }

    public EditorNavbarHistoryPart.AnimationTimelineKeyframeRef resolveTimelineHoveredKeyframe(EditorSession editorSession, double d, double d2) {
        if ((-710769695 * -710769695 - -710769695 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || editorSession.runtimeTimelineKeyframeIds.isEmpty()) {
            return null;
        }
        HashSet<String> hashSet = new HashSet<String>();
        EditorNavbarHistoryPart.AnimationTimelineKeyframeRef animationTimelineKeyframeRef = null;
        double d3 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-2483720686486259841L, 56));
        for (String string : editorSession.runtimeTimelineKeyframeIds) {
            EditorRect editorRect;
            String string2;
            EditorNavbarHistoryPart.AnimationTimelineKeyframeRef animationTimelineKeyframeRef2 = this.parseAnimationTimelineKeyframeRef(string);
            if (animationTimelineKeyframeRef2 == null || !hashSet.add(string2 = EditorTimelineKeyframePart.Xqedii_2xec58yinasb9(animationTimelineKeyframeRef2.rowKey(), animationTimelineKeyframeRef2.tick()))) continue;
            String string3 = EditorTimelineKeyframePart.Xqedii_2qg9ncoy1f13x(animationTimelineKeyframeRef2.rowKey(), animationTimelineKeyframeRef2.tick());
            EditorRect editorRect2 = this.findShellBlockRect(editorSession, EditorTimelineKeyframePart.Xqedii_39qn57lrc8zug(string3));
            if (this.isInsideRect(editorRect2, d, d2)) {
                return animationTimelineKeyframeRef2;
            }
            if (editorRect2 != null || !this.isInsideRect(editorRect = this.findShellBlockRect(editorSession, string3), d, d2)) continue;
            double d4 = editorRect.x + editorRect.width / Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-8614447283178026314L, 58));
            double d5 = editorRect.y + editorRect.height / Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647816459L, 20));
            double d6 = d - d4;
            double d7 = d2 - d5;
            double d8 = d6 * d6 + d7 * d7;
            if (animationTimelineKeyframeRef != null && !(d8 < d3)) continue;
            animationTimelineKeyframeRef = animationTimelineKeyframeRef2;
            d3 = d8;
        }
        return animationTimelineKeyframeRef;
    }

    public EditorNavbarHistoryPart.AnimationTimelineKeyframeRef parseAnimationTimelineKeyframeRef(String string) {
        if (((75015484 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (string == null || string.isBlank()) {
            return null;
        }
        String string2 = string;
        if (string2.endsWith(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("083CkO3UysE6SL2dhftQxzywriRk9pfhZ+sMzzAQzo51TSegg4sFcpLp"))) {
            string2 = string2.substring(Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1687362349, 17), string2.length() - Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("083CkO3UysE6SL2dhftQxzywriRk9pfhZ+sMzzAQzo51TSegg4sFcpLp").length());
        }
        if (!string2.startsWith(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("edrcJisfXKJFPmvxeP9A9Qt28ykk2uJVEpU+jwOhdwRxUMT8p+fepyqFOZjce7B5HUK9nm2K92zV/lFfuFcvfWtY8daawVEGjW36ZgMRB7BSdvdj"))) {
            return null;
        }
        String string3 = string2.substring(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("edrcJisfXKJFPmvxeP9A9Qt28ykk2uJVEpU+jwOhdwRxUMT8p+fepyqFOZjce7B5HUK9nm2K92zV/lFfuFcvfWtY8daawVEGjW36ZgMRB7BSdvdj").length());
        int n = string3.lastIndexOf(Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1680677677, 17));
        if (n <= 0 || n >= string3.length() - Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245154, 5)) {
            return null;
        }
        String string4 = string3.substring(Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 9), n).toLowerCase(Locale.ROOT);
        if (!Xqedii_bwmwn2k.Xqedii_1mo40pi.containsKey(string4)) {
            return null;
        }
        double d = this.parseDouble(string3.substring(n + Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489277890, 15)), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-1501127880585492902L, 17)));
        if (!Double.isFinite(d)) {
            return null;
        }
        int n2 = this.clampAnimationTimelineTick((int)Math.round(d));
        return new EditorNavbarHistoryPart.AnimationTimelineKeyframeRef(string4, n2);
    }

    public List<Integer> readAnimationTimelineTicks(EditorSession editorSession, String string, String string2) {
        if ((1044605624 * 1044605624 + 1044605624 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank() || string2 == null || string2.isBlank()) {
            return Collections.emptyList();
        }
        Map<String, Object> map = this.resolveRawTargetByTargetId(editorSession, string);
        Map<String, Object> map2 = this.readAnimationTimelineRowMap(map, string2);
        if (map2 == null || map2.isEmpty()) {
            return Collections.emptyList();
        }
        TreeMap<Integer, Boolean> treeMap = new TreeMap<Integer, Boolean>();
        for (String string3 : map2.keySet()) {
            double d = this.parseDouble(string3, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708624338576941254L, 53)));
            if (!Double.isFinite(d)) continue;
            treeMap.put(this.clampAnimationTimelineTick((int)Math.round(d)), Boolean.TRUE);
        }
        return new ArrayList<Integer>(treeMap.keySet());
    }

    public TreeMap<Integer, double[]> readTimelinePositionPoints(EditorSession editorSession, String string) {
        Object object;
        if (((-1847170112 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        TreeMap<Integer, double[]> treeMap = new TreeMap<Integer, double[]>();
        if (editorSession == null || string == null || string.isBlank()) {
            return treeMap;
        }
        Map<String, Object> map = this.resolveRawTargetByTargetId(editorSession, string);
        Map<String, Object> map2 = this.readAnimationTimelineRowMap(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lVyLqZ0/l42NHS2Z4u8jaugWB4pabPNyLAKoAr7n6uc/FLCXzHscKW2vd90="));
        if (map2 == null || map2.isEmpty()) {
            return treeMap;
        }
        TreeMap<Integer, Map> treeMap2 = new TreeMap<Integer, Map>();
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            double d;
            if (entry == null || entry.getValue() == null || !Double.isFinite(d = this.parseDouble(entry.getKey(), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(5383640542495528408L, 42)))) || !((object = entry.getValue()) instanceof Map)) continue;
            Map map3 = (Map)object;
            int n = this.clampAnimationTimelineTick((int)Math.round(d));
            treeMap2.put(n, map3);
        }
        if (treeMap2.isEmpty()) {
            return treeMap;
        }
        EditorRect editorRect = this.resolveTimelineStableBaseBounds(editorSession, string);
        double d = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 22));
        double d2 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 57));
        if (editorRect != null) {
            d = editorRect.x;
            d2 = editorRect.y;
        } else {
            object = this.getTargetBounds(editorSession, string);
            if (object != null) {
                d = ((EditorRect)object).x;
                d2 = ((EditorRect)object).y;
            }
        }
        for (Map.Entry entry : treeMap2.entrySet()) {
            int n = (Integer)entry.getKey();
            Map map4 = (Map)entry.getValue();
            if (map4 == null || map4.isEmpty()) continue;
            double[] dArray = this.interpolateTimelineVector2(treeMap, n, d, d2);
            double d3 = this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("6PRyAXp6WF8hg9Z5Khip7jKIxT7T9BoFXKS9hUVs")), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403375612567750L, 37)));
            double d4 = this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Kug6JC6vMArxS1TYzCDHTExm1/nFgRotaWTJIqx6")), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(3092888118014401259L, 25)));
            double d5 = this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("UAwMZlGTjZXWDh75yWypmoR5bInPIreWbLIpL6sBNCzT7V3w")), this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("xSi7Zj+eRh2Byvx+/t8wvjb7nG+DGQyoYmBdxgUXQ0ehRA46")), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-8589669174337033368L, 62))));
            double d6 = this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("iojHTHBs6y/FBBT2yxYxjxsF2yI4RSegu+CZAoDeunRPmvGi")), this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("OnGiNBz7EjSf40ILU4Nj3ZYEMdgK4y10MK4/Bo9WoD5sAr4f")), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(6437721029025608407L, 20))));
            boolean bl = Double.isFinite(d3);
            boolean bl2 = Double.isFinite(d4);
            boolean bl3 = Double.isFinite(d5);
            boolean bl4 = Double.isFinite(d6);
            if (!bl && !bl2 && !bl3 && !bl4) continue;
            double d7 = dArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp(1826935707, 25)];
            double d8 = dArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489244994, 7)];
            if (bl) {
                d7 = d3;
            } else if (bl3) {
                d7 = dArray[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 18)] + d5;
            }
            if (bl2) {
                d8 = d4;
            } else if (bl4) {
                d8 = dArray[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 27)] + d6;
            }
            if (!Double.isFinite(d7) || !Double.isFinite(d8)) continue;
            double[] dArray2 = new double[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300475399, 14)];
            dArray2[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)29)] = d7;
            dArray2[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489244610, (int)9)] = d8;
            treeMap.put(n, dArray2);
        }
        return treeMap;
    }

    public TreeMap<Integer, double[]> readAnimationTimelineScalePoints(EditorSession editorSession, String string) {
        if ((204265891 * 204265891 - 204265891 & 1) != 0) {
            throw new IllegalStateException();
        }
        TreeMap<Integer, double[]> treeMap = new TreeMap<Integer, double[]>();
        if (editorSession == null || string == null || string.isBlank()) {
            return treeMap;
        }
        Map<String, Object> map = this.resolveRawTargetByTargetId(editorSession, string);
        Map<String, Object> map2 = this.readAnimationTimelineRowMap(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("R1YSngvbwI50UhU8FNC0NrXgVRxJfbUMfTvw+2OgFwesfDq3Xg8="));
        if (map2 == null || map2.isEmpty()) {
            return treeMap;
        }
        TreeMap<Integer, double[]> treeMap2 = this.readTimelinePositionPoints(editorSession, string);
        Map<Integer, String> map3 = this.readTimelineInterpModes(editorSession, string, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lVyLqZ0/l42NHS2Z4u8jaugWB4pabPNyLAKoAr7n6uc/FLCXzHscKW2vd90="));
        EditorRect editorRect = this.resolveTimelineStableBaseBounds(editorSession, string);
        double d = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336739758278L, 1));
        double d2 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(3214971963143834746L, 30));
        if (editorRect != null) {
            d = editorRect.x;
            d2 = editorRect.y;
        } else {
            Object object;
            Object object2 = object = this.isAnimationTimelineImageGroupRoot(editorSession, string) ? this.resolveTimelineGroupLogicalBounds(editorSession, string) : null;
            if (object == null) {
                object = this.getTargetBounds(editorSession, string);
            }
            if (object != null) {
                d = ((EditorRect)object).x;
                d2 = ((EditorRect)object).y;
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            double d3 = this.parseDouble(entry.getKey(), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4269155403137548047L, 3)));
            if (!Double.isFinite(d3)) continue;
            int n = this.clampAnimationTimelineTick((int)Math.round(d3));
            Object object = entry.getValue();
            if (!(object instanceof Map)) continue;
            Map map4 = (Map)object;
            double d4 = this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("6XnTc6zAYC7sWEhK2OTJ5ySYCW3+CdfncZRiSA/6i2xaTAgcVUg=")), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-6228683258813549504L, 11)));
            double d5 = this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nVThWvX+m3EA+JZCwgyIrYDk3e5kq9ItA46/BMlumuS//1qlhw6cKw==")), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-6075191601651946580L, 27)));
            if (!Double.isFinite(d4) || !Double.isFinite(d5)) continue;
            double d6 = this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("twHXpWh5FDNaIvo7PJ14MAWJYn7aQF0zZxAYf0Bkl1kUdfMQdgGfHPK+")), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(6738699407913082213L, 30)));
            double d7 = this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("gOLdB5VgswB8pc6Fh+jyTf2qvM1XvML8gDRcGUaeveqBEDWOTkEYj0u9")), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-3134248297040182795L, 9)));
            if (!Double.isFinite(d6) || !Double.isFinite(d7)) {
                double d8 = this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("6PRyAXp6WF8hg9Z5Khip7jKIxT7T9BoFXKS9hUVs")), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(3596320528771483669L, 16)));
                double d9 = this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Kug6JC6vMArxS1TYzCDHTExm1/nFgRotaWTJIqx6")), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-1692980594265851907L, 60)));
                if (Double.isFinite(d8) && Double.isFinite(d9)) {
                    double[] dArray = this.interpolateTimelineVector2(treeMap2, n, d, d2, map3);
                    d6 = d8 - dArray[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 17)];
                    d7 = d9 - dArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-688725880, 9)];
                }
            }
            if (!Double.isFinite(d6)) {
                d6 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336739758278L, 0));
            }
            if (!Double.isFinite(d7)) {
                d7 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-152979643580078217L, 52));
            }
            double[] dArray = new double[Xqedii_32drtqx.Xqedii_3h0mif43akudp(887544121, 7)];
            dArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-786768293, (int)30)] = d6;
            dArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489261506, (int)14)] = d7;
            dArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)479884141, (int)30)] = d4;
            dArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1843176501, (int)27)] = d5;
            treeMap.put(n, dArray);
        }
        return treeMap;
    }

    public TreeMap<Integer, Double> readTimelineRotationPoints(EditorSession editorSession, String string) {
        if (((-2078998592 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        TreeMap<Integer, Double> treeMap = new TreeMap<Integer, Double>();
        if (editorSession == null || string == null || string.isBlank()) {
            return treeMap;
        }
        Map<String, Object> map = this.resolveRawTargetByTargetId(editorSession, string);
        Map<String, Object> map2 = this.readAnimationTimelineRowMap(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("AlPY20ZiSsKHZHepm7m2vR9gsG45kxcO0s7ePxjMRcnXk0/S0f9XDKwAo1o="));
        if (map2 == null || map2.isEmpty()) {
            return treeMap;
        }
        double d = this.resolveTimelineStableBaseRotation(editorSession, string);
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            double d2;
            if (entry == null || !Double.isFinite(d2 = this.parseDouble(entry.getKey(), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-1430636957823997142L, 33))))) continue;
            int n = this.clampAnimationTimelineTick((int)Math.round(d2));
            Object object = entry.getValue();
            if (object == null) continue;
            double d3 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647292235L, 19));
            if (object instanceof Number) {
                Number number = (Number)object;
                d3 = number.doubleValue();
            } else if (object instanceof Map) {
                Map map3 = (Map)object;
                Map map4 = map3;
                double d4 = this.readMapPathDouble(map4, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nIAzGuqvIp7tDsJ3gVVbCD91MqCPlcadeOyTRgP5CKyi+SYV+DU="), this.readMapPathDouble(map4, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("AlPY20ZiSsKHZHepm7m2vR9gsG45kxcO0s7ePxjMRcnXk0/S0f9XDKwAo1o="), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403332656603334L, 34))));
                if (Double.isFinite(d4)) {
                    d3 = d4;
                } else {
                    double d5 = this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("XyqnOWSFtqTWS+oZcPGm6fRVmQODgT4WcV/OhlKP3fMH4w==")), this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("aGEVgW/TILP5/aCPNS1CyVd6B1XsJv2fE/Oqss8I8Hq8N0JzYZJ4jNQWvQ71rILSyjM=")), this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("frwHh0Y4SwEw9rO0mh+gYrlyq1xGq2dww4996jtJ2lZ8oWb8NiB/WivVbRq9YMlToeg=")), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(6437721029025608407L, 20)))));
                    if (Double.isFinite(d5)) {
                        double d6 = this.interpolateTimelineChannel(treeMap, n, d);
                        d3 = d6 + d5;
                    }
                }
            }
            if (!Double.isFinite(d3)) continue;
            treeMap.put(n, this.normalizeSidebarRotation(d3));
        }
        return treeMap;
    }

    public TreeMap<Integer, Double> readTimelineOpacityPoints(EditorSession editorSession, String string) {
        if (((2085437639 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        TreeMap<Integer, Double> treeMap = new TreeMap<Integer, Double>();
        if (editorSession == null || string == null || string.isBlank()) {
            return treeMap;
        }
        Map<String, Object> map = this.resolveRawTargetByTargetId(editorSession, string);
        Map<String, Object> map2 = this.readAnimationTimelineRowMap(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("I1vZiTUQBfDtQxGQtDrYmY6jBftQU/Kf94ejXFqvcZKUJZRGrtg/U181"));
        if (map2 == null || map2.isEmpty()) {
            return treeMap;
        }
        double d = this.resolveTimelineStableBaseOpacity(editorSession, string);
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            double d2;
            if (entry == null || !Double.isFinite(d2 = this.parseDouble(entry.getKey(), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-8640945434544078882L, 0))))) continue;
            int n = this.clampAnimationTimelineTick((int)Math.round(d2));
            Object object = entry.getValue();
            if (object == null) continue;
            double d3 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-8898855820074416907L, 11));
            if (object instanceof Number) {
                Number number = (Number)object;
                d3 = number.doubleValue();
            } else if (object instanceof Map) {
                Map map3 = (Map)object;
                Map map4 = map3;
                double d4 = this.readMapPathDouble(map4, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nIAzGuqvIp7tDsJ3gVVbCD91MqCPlcadeOyTRgP5CKyi+SYV+DU="), this.readMapPathDouble(map4, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("I1vZiTUQBfDtQxGQtDrYmY6jBftQU/Kf94ejXFqvcZKUJZRGrtg/U181"), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-6771922377063407625L, 62))));
                if (Double.isFinite(d4)) {
                    d3 = d4;
                } else {
                    double d5 = this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("XyqnOWSFtqTWS+oZcPGm6fRVmQODgT4WcV/OhlKP3fMH4w==")), this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("TLZp5VmEh5XTtM+gFqj1AJiy0XnyjBr2+PdaNeMCl15Qtf1Zv1y2cxjKCWmcvy9x")), this.parseDouble(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("smfXdsykD9ponXMzt6lpMUksfGvY/dL5Z0zn2EKoFORl3DEb7SSmUQ7aQgNxZL9W")), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4269155403137548047L, 3)))));
                    if (Double.isFinite(d5)) {
                        double d6 = this.interpolateTimelineChannel(treeMap, n, d);
                        d3 = d6 + d5;
                    }
                }
            }
            if (!Double.isFinite(d3)) continue;
            treeMap.put(n, Double.valueOf(this.clampAnimationTimelineOpacityRaw(d3)));
        }
        return treeMap;
    }

    public Object buildAnimationTimelineValueForRow(EditorSession editorSession, String string, String string2) {
        if ((-733146736 * -733146736 + -733146736 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("AlPY20ZiSsKHZHepm7m2vR9gsG45kxcO0s7ePxjMRcnXk0/S0f9XDKwAo1o=").equals(string2)) {
            return this.snap1(this.readTargetRotation(editorSession, string));
        }
        if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("I1vZiTUQBfDtQxGQtDrYmY6jBftQU/Kf94ejXFqvcZKUJZRGrtg/U181").equals(string2)) {
            return this.clampAnimationTimelineOpacityRaw(this.readTargetOpacity(editorSession, string));
        }
        EditorRect editorRect = null;
        if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lVyLqZ0/l42NHS2Z4u8jaugWB4pabPNyLAKoAr7n6uc/FLCXzHscKW2vd90=").equals(string2) && this.isAnimationTimelineImageGroupRoot(editorSession, string)) {
            editorRect = this.resolveTimelineGroupLogicalBounds(editorSession, string);
        }
        if (editorRect == null) {
            editorRect = this.getTargetBounds(editorSession, string);
        }
        if (editorRect == null) {
            return null;
        }
        if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lVyLqZ0/l42NHS2Z4u8jaugWB4pabPNyLAKoAr7n6uc/FLCXzHscKW2vd90=").equals(string2)) {
            int n = editorSession == null ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1489577527, 10) : this.clampAnimationTimelineTick(editorSession.animationTimelineTick);
            double[] dArray = this.resolveTimelineScaleOffsetAtTick(editorSession, string, n);
            double d = editorRect.x;
            double d2 = editorRect.y;
            if (dArray != null && dArray.length >= Xqedii_32drtqx.Xqedii_ffzx1ycco61l(774409583, 21)) {
                if (Double.isFinite(dArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1147894127, 0)])) {
                    d -= dArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1227993799, 21)];
                }
                if (Double.isFinite(dArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp(887544761, 7)])) {
                    d2 -= dArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1489576503, 10)];
                }
            }
            LinkedHashMap<String, Double> linkedHashMap = new LinkedHashMap<String, Double>();
            linkedHashMap.put(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("6PRyAXp6WF8hg9Z5Khip7jKIxT7T9BoFXKS9hUVs"), this.snap1(d));
            linkedHashMap.put(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Kug6JC6vMArxS1TYzCDHTExm1/nFgRotaWTJIqx6"), this.snap1(d2));
            return linkedHashMap;
        }
        if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("R1YSngvbwI50UhU8FNC0NrXgVRxJfbUMfTvw+2OgFwesfDq3Xg8=").equals(string2)) {
            int n = editorSession == null ? Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1803120452, 8) : this.clampAnimationTimelineTick(editorSession.animationTimelineTick);
            return this.buildAnimationTimelineScaleValue(editorSession, string, n);
        }
        return null;
    }

    public Map<String, Object> buildAnimationTimelineScaleValue(EditorSession editorSession, String string, int n) {
        EditorRect editorRect;
        if ((687351285 * (687351285 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        boolean bl = this.isAnimationTimelineImageGroupRoot(editorSession, string);
        EditorRect editorRect2 = editorRect = bl ? this.resolveTimelineGroupLogicalBounds(editorSession, string) : null;
        if (editorRect == null) {
            editorRect = this.getTargetBounds(editorSession, string);
        }
        if (editorRect == null) {
            return null;
        }
        double d = editorRect.width;
        double d2 = editorRect.height;
        Map<String, Object> map = this.resolveRawTargetByTargetId(editorSession, string);
        if (map != null && !bl) {
            double d3;
            double d4 = this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Qb5MteiUuvrEHMverU90UxdD1mcgvM90UoUTlKslCHOq7HP2fC9Zim0BQsQiKY8F"), this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("6XnTc6zAYC7sWEhK2OTJ5ySYCW3+CdfncZRiSA/6i2xaTAgcVUg="), this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("CiguSPExhr/ESjYUtGGpOGpHhtcVyrIlf2drPm+aoZdDqfbXKjm3hrIo5uAKFi4BnqA="), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(1607485981840287293L, 29)))));
            if (Double.isFinite(d4)) {
                d = Math.abs(d4);
            }
            if (Double.isFinite(d3 = this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("wOPIg84dIMens/xukGFwlt6Dc6Az7mGMiBu0+z4Kl/xTXtUHro1VThZQgpeOUBJ17s0="), this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nVThWvX+m3EA+JZCwgyIrYDk3e5kq9ItA46/BMlumuS//1qlhw6cKw=="), this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("qTgLhs6XzmR1bf3PRFr5iRfO3DZoivv4qDAASKL3rU04aU2+mFW5GaLESxXryJhZ2gyUWw=="), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-5343989520373741428L, 10))))))) {
                d2 = Math.abs(d3);
            }
        }
        int n2 = this.clampAnimationTimelineTick(n);
        EditorRect editorRect3 = this.resolveTimelineStableBaseBounds(editorSession, string);
        if (editorRect3 == null) {
            editorRect3 = new EditorRect(editorRect.x, editorRect.y, editorRect.width, editorRect.height);
        }
        TreeMap<Integer, double[]> treeMap = this.readTimelinePositionPoints(editorSession, string);
        Map<Integer, String> map2 = this.readTimelineInterpModes(editorSession, string, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lVyLqZ0/l42NHS2Z4u8jaugWB4pabPNyLAKoAr7n6uc/FLCXzHscKW2vd90="));
        double[] dArray = this.interpolateTimelineVector2(treeMap, n2, editorRect3.x, editorRect3.y, map2);
        double d5 = editorRect.x - dArray[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 0)];
        double d6 = editorRect.y - dArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245126, 2)];
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        linkedHashMap.put(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("twHXpWh5FDNaIvo7PJ14MAWJYn7aQF0zZxAYf0Bkl1kUdfMQdgGfHPK+"), d5);
        linkedHashMap.put(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("gOLdB5VgswB8pc6Fh+jyTf2qvM1XvML8gDRcGUaeveqBEDWOTkEYj0u9"), d6);
        linkedHashMap.put(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("6PRyAXp6WF8hg9Z5Khip7jKIxT7T9BoFXKS9hUVs"), d5);
        linkedHashMap.put(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Kug6JC6vMArxS1TYzCDHTExm1/nFgRotaWTJIqx6"), d6);
        linkedHashMap.put(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("6XnTc6zAYC7sWEhK2OTJ5ySYCW3+CdfncZRiSA/6i2xaTAgcVUg="), Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 35)), d));
        linkedHashMap.put(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nVThWvX+m3EA+JZCwgyIrYDk3e5kq9ItA46/BMlumuS//1qlhw6cKw=="), Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-5854022332777320782L, 29)), d2));
        return linkedHashMap;
    }

    public double[] resolveTimelineScaleOffsetAtTick(EditorSession editorSession, String string, double d) {
        if (((0x1868EC74 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            return null;
        }
        TreeMap<Integer, double[]> treeMap = this.readAnimationTimelineScalePoints(editorSession, string);
        if (treeMap.isEmpty()) {
            return null;
        }
        TreeMap<Integer, double[]> treeMap2 = this.extractTimelineScalePositionPoints(treeMap);
        if (treeMap2.isEmpty()) {
            return null;
        }
        Map<Integer, String> map = this.readTimelineInterpModes(editorSession, string, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("R1YSngvbwI50UhU8FNC0NrXgVRxJfbUMfTvw+2OgFwesfDq3Xg8="));
        double d2 = Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 47)), Math.min(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-5571302015658388082L, 21)), d));
        return this.interpolateTimelineVector2(treeMap2, d2, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-2269300609080920067L, 60)), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 43)), map);
    }

    public boolean isTimelineKeyframeRefSelected(EditorSession editorSession, String string, String string2, int n) {
        if ((1375533346 * 1375533346 - 1375533346 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank() || string2 == null || string2.isBlank()) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 3) != 0;
        }
        if (!this.isTimelineKeyframeSelected(editorSession)) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1489577527, 10) != 0;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 31)];
        stringArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)959768283, (int)31)] = editorSession.animationTimelineSelectedTargetId;
        String string3 = this.firstNonBlank(stringArray);
        if (!this.equalsNullable(string3, string)) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 25) != 0;
        }
        String string4 = string2.toLowerCase(Locale.ROOT);
        int n2 = this.clampAnimationTimelineTick(n);
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 24)];
        stringArray2[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)2)] = editorSession.animationTimelineSelectedRow;
        String string5 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
        if (this.equalsNullable(string5, string4) && (editorSession.animationTimelineSelectedTick == n2 || editorSession.timelineExtraSelectedTicks.contains(n2))) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1147974035, 27) != 0;
        }
        return this.containsTimelineExtraSelectionRef(editorSession, string4, n2);
    }

    public List<Integer> resolveTimelineSelectedTicks(EditorSession editorSession, String string, String string2) {
        String string3;
        block9: {
            block8: {
                if (((-1619903896 << 1 | 1) & 1) == 0) {
                    throw new IllegalStateException();
                }
                if (editorSession == null || string == null || string.isBlank() || string2 == null || string2.isBlank()) {
                    return Collections.emptyList();
                }
                if (!this.isTimelineKeyframeSelected(editorSession)) {
                    return Collections.emptyList();
                }
                string3 = string2.toLowerCase(Locale.ROOT);
                String[] stringArray = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1522799554, 25)];
                stringArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)920242599, (int)18)] = editorSession.animationTimelineSelectedTargetId;
                if (!this.equalsNullable(this.firstNonBlank(stringArray), string)) break block8;
                String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1225896647, 21)];
                stringArray2[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)-617007898, (int)23)] = editorSession.animationTimelineSelectedRow;
                if (this.equalsNullable(this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT), string3)) break block9;
            }
            return Collections.emptyList();
        }
        this.sanitizeTimelineExtraSelection(editorSession);
        TreeMap<Integer, Boolean> treeMap = new TreeMap<Integer, Boolean>();
        treeMap.put(this.clampAnimationTimelineTick(editorSession.animationTimelineSelectedTick), Boolean.TRUE);
        for (Integer object : editorSession.timelineExtraSelectedTicks) {
            if (object == null) continue;
            treeMap.put(this.clampAnimationTimelineTick(object), Boolean.TRUE);
        }
        for (String string4 : editorSession.timelineExtraSelectedKeyframeRefs) {
            EditorNavbarHistoryPart.AnimationTimelineKeyframeRef animationTimelineKeyframeRef = this.parseTimelineSelectionRef(string4);
            if (animationTimelineKeyframeRef == null || !this.equalsNullable(animationTimelineKeyframeRef.rowKey(), string3)) continue;
            treeMap.put(this.clampAnimationTimelineTick(animationTimelineKeyframeRef.tick()), Boolean.TRUE);
        }
        return new ArrayList<Integer>(treeMap.keySet());
    }

    public LinkedHashMap<String, List<Integer>> resolveTimelineSelectedTicksByRow(EditorSession editorSession, String string2) {
        if ((-452840999 * -452840999 + -452840999 & 1) != 0) {
            throw new IllegalStateException();
        }
        LinkedHashMap<String, List<Integer>> linkedHashMap = new LinkedHashMap<String, List<Integer>>();
        if (editorSession == null || string2 == null || string2.isBlank()) {
            return linkedHashMap;
        }
        if (!this.isTimelineKeyframeSelected(editorSession)) {
            return linkedHashMap;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(143486766, 29)];
        stringArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)29)] = editorSession.animationTimelineSelectedTargetId;
        if (!this.equalsNullable(this.firstNonBlank(stringArray), string2)) {
            return linkedHashMap;
        }
        this.sanitizeTimelineExtraSelection(editorSession);
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1186436868, 4)];
        stringArray2[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1((int)-300459016, (int)18)] = editorSession.animationTimelineSelectedRow;
        String string3 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
        if (string3.isBlank() || !Xqedii_bwmwn2k.Xqedii_1mo40pi.containsKey(string3)) {
            return linkedHashMap;
        }
        LinkedHashMap<String, TreeMap> linkedHashMap2 = new LinkedHashMap<String, TreeMap>();
        TreeMap treeMap = linkedHashMap2.computeIfAbsent(string3, string -> {
            if ((2063503979 * (2063503979 + 1) & 1) != 0) {
                throw new IllegalStateException();
            }
            return new TreeMap();
        });
        treeMap.put(this.clampAnimationTimelineTick(editorSession.animationTimelineSelectedTick), Boolean.TRUE);
        for (Integer object : editorSession.timelineExtraSelectedTicks) {
            if (object == null) continue;
            treeMap.put(this.clampAnimationTimelineTick(object), Boolean.TRUE);
        }
        for (String string4 : editorSession.timelineExtraSelectedKeyframeRefs) {
            EditorNavbarHistoryPart.AnimationTimelineKeyframeRef animationTimelineKeyframeRef = this.parseTimelineSelectionRef(string4);
            if (animationTimelineKeyframeRef == null) continue;
            TreeMap treeMap2 = linkedHashMap2.computeIfAbsent(animationTimelineKeyframeRef.rowKey(), string -> {
                if (((542039990 << 1 | 1) & 1) == 0) {
                    throw new IllegalStateException();
                }
                return new TreeMap();
            });
            treeMap2.put(this.clampAnimationTimelineTick(animationTimelineKeyframeRef.tick()), Boolean.TRUE);
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (entry == null || entry.getKey() == null || entry.getValue() == null || ((TreeMap)entry.getValue()).isEmpty()) continue;
            linkedHashMap.put((String)entry.getKey(), new ArrayList(((TreeMap)entry.getValue()).keySet()));
        }
        return linkedHashMap;
    }

    public void sanitizeTimelineExtraSelection(EditorSession editorSession) {
        if ((-1695234119 * (-1695234119 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return;
        }
        if (!this.isTimelineKeyframeSelected(editorSession)) {
            this.clearTimelineExtraSelection(editorSession);
            return;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 25)];
        stringArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)19)] = editorSession.animationTimelineSelectedRow;
        String string = this.firstNonBlank(stringArray).toLowerCase(Locale.ROOT);
        int n = this.clampAnimationTimelineTick(editorSession.animationTimelineSelectedTick);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        for (Integer object : editorSession.timelineExtraSelectedTicks) {
            int string2;
            if (object == null || (string2 = this.clampAnimationTimelineTick(object)) == n) continue;
            linkedHashSet.add(string2);
        }
        editorSession.timelineExtraSelectedTicks.clear();
        editorSession.timelineExtraSelectedTicks.addAll(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (String string2 : editorSession.timelineExtraSelectedKeyframeRefs) {
            String string3;
            EditorNavbarHistoryPart.AnimationTimelineKeyframeRef animationTimelineKeyframeRef = this.parseTimelineSelectionRef(string2);
            if (animationTimelineKeyframeRef == null) continue;
            int n2 = this.clampAnimationTimelineTick(animationTimelineKeyframeRef.tick());
            if (this.equalsNullable(string, animationTimelineKeyframeRef.rowKey()) && n2 == n || (string3 = this.buildAnimationTimelineKeyframeRef(animationTimelineKeyframeRef.rowKey(), n2)).isBlank()) continue;
            linkedHashSet2.add(string3);
        }
        editorSession.timelineExtraSelectedKeyframeRefs.clear();
        editorSession.timelineExtraSelectedKeyframeRefs.addAll(linkedHashSet2);
    }

    public void renderAnimationTimelineKeyframes(Player player, EditorSession editorSession, String string) {
        if ((0x240B788A ^ 0x240B788A) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || string == null || string.isBlank()) {
            this.clearTimelineRuntimeKeyframes(player, editorSession);
            return;
        }
        String string2 = this.buildTimelineRenderedSignature(editorSession, string);
        if (this.equalsNullable(editorSession.timelineRenderedSignature, string2)) {
            if (editorSession.runtimeTimelineKeyframeIds.isEmpty()) {
                return;
            }
            int n = Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 25);
            for (String object : editorSession.runtimeTimelineKeyframeIds) {
                if (object == null || object.isBlank() || this.hudService.getHud(player, EditorTimelineKeyframePart.Xqedii_34f74655w8rk8(object)) != null) continue;
                n = Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489310658, 16);
                break;
            }
            if (n == 0) {
                return;
            }
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        this.renderTimelineKeyframesRow(player, editorSession, string, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("AlPY20ZiSsKHZHepm7m2vR9gsG45kxcO0s7ePxjMRcnXk0/S0f9XDKwAo1o="), linkedHashSet);
        this.renderTimelineKeyframesRow(player, editorSession, string, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lVyLqZ0/l42NHS2Z4u8jaugWB4pabPNyLAKoAr7n6uc/FLCXzHscKW2vd90="), linkedHashSet);
        this.renderTimelineKeyframesRow(player, editorSession, string, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("R1YSngvbwI50UhU8FNC0NrXgVRxJfbUMfTvw+2OgFwesfDq3Xg8="), linkedHashSet);
        this.renderTimelineKeyframesRow(player, editorSession, string, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("I1vZiTUQBfDtQxGQtDrYmY6jBftQU/Kf94ejXFqvcZKUJZRGrtg/U181"), linkedHashSet);
        if (!editorSession.runtimeTimelineKeyframeIds.isEmpty()) {
            java.util.ArrayList arrayList = new ArrayList();
            for (String string3 : editorSession.runtimeTimelineKeyframeIds) {
                if (string3 == null || string3.isBlank() || linkedHashSet.contains(string3)) continue;
                arrayList.add(string3);
            }
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                String string3;
                string3 = (String)iterator.next();
                this.removeTimelineRuntimeKeyframe(player, editorSession, string3);
            }
        }
        editorSession.runtimeTimelineKeyframeIds.clear();
        editorSession.runtimeTimelineKeyframeIds.addAll(linkedHashSet);
        editorSession.timelineRenderedSignature = string2;
    }

    public void renderTimelineKeyframesRow(Player player, EditorSession editorSession, String string, String string2, Set<String> set) {
        if ((1267598407 * 1267598407 + 1267598407 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || string == null || string.isBlank() || string2 == null || string2.isBlank()) {
            return;
        }
        String string3 = Xqedii_bwmwn2k.Xqedii_1mo40pi.get(string2);
        if (string3 == null || string3.isBlank()) {
            return;
        }
        EditorRect editorRect = this.findShellBlockRect(editorSession, string3);
        if (editorRect == null) {
            return;
        }
        for (int n : this.readAnimationTimelineTicks(editorSession, string, string2)) {
            String string4 = EditorTimelineKeyframePart.Xqedii_2r5xdxn3wqrg(string2, n);
            String string5 = EditorTimelineKeyframePart.Xqedii_3v1tfzilk5knb(string4);
            double d = this.resolveAnimationTimelineKeyframeX(editorSession, editorRect, n);
            if (!Double.isFinite(d)) continue;
            double d2 = editorRect.y + Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-7247723606689709835L, 63));
            double d3 = this.toInternalTextTopY(d2, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(4110356179512023876L, 1)));
            double d4 = this.applyTextAlignmentOffset(d, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(2200896239214823123L, 20)), TextDisplay.TextAlignment.LEFT);
            boolean bl = this.isTimelineKeyframeRefSelected(editorSession, string, string2, n);
            String string6 = bl ? Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("c7CJkHdfS4tlaxZgHc/zQKSC9cp2W7voOi7hL/4yDJIBIgH+1mTxFQ==") : Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ZrQkeKATnsXplEEXef0acAxH/k8JDyTMTBGKDroPWbDLEtWd2eWluQ==");
            String string7 = this.resolveTimelineKeyframeGlyph(editorSession, string, string2, n);
            HudPositionCalculator.Placement placement = this.positionCalculator.calculateBoxPlacement(d4, d3, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(4020652530636683154L, 6)), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(6437721029025581143L, 20)), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-1679148319981933263L, 24)));
            this.upsertHud(player, string5, placement.location(), placement.scale(), this.ensureRoundedCornerEditorFont(EditorTimelineKeyframePart.Xqedii_bp5vho47txv3(string6, string7)), Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1120460235, 15), TextDisplay.TextAlignment.LEFT, Xqedii_32drtqx.Xqedii_3h0mif43akudp(-104224971, 26));
            this.clearOutlineHud(player, string5);
            if (set != null) {
                set.add(string4);
            }
            editorSession.shellRuntimeRects.put(string4, new EditorRect(d, d2, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4260631988999028491L, 55)), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(3147079014534680804L, 11))));
            String string8 = EditorTimelineKeyframePart.Xqedii_de8930k4v1ip(string4);
            String string9 = EditorTimelineKeyframePart.Xqedii_3nrcakef4b92n(string8);
            double d5 = d + Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 2));
            double d6 = d2 + Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(7214371828330643439L, 63));
            HudPositionCalculator.Placement placement2 = this.positionCalculator.calculateBoxPlacement(d5, d6, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287178131199753995L, 44)), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403353936404678L, 36)), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4179540807427292939L, 57)));
            this.upsertHud(player, string9, placement2.location(), placement2.scale(), Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA=="), Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1186436852, 4), TextDisplay.TextAlignment.LEFT, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(1866198078, 24));
            this.clearOutlineHud(player, string9);
            if (set != null) {
                set.add(string8);
            }
            editorSession.shellRuntimeRects.put(string8, new EditorRect(d5, d6, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-6765280247035850067L, 56)), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4285993873961123595L, 51))));
        }
    }

    public double resolveAnimationTimelineKeyframeX(EditorSession editorSession, EditorRect editorRect, int n) {
        EditorRect editorRect2;
        if (((0xC0CE4700 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        double d = this.sliderTickToX(editorSession, n);
        if (Double.isFinite(d)) {
            return d;
        }
        if (editorSession != null && (editorRect2 = this.findShellBlockRect(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("yvvrqMxtkx+d/fXAKOmZyb+aIeQJw2I+WjhPuYquidxUyp5okXw4cfPIh+76JGn4TIC6MjvNio0s1XULKJZD4J62PehkKKgXxYs="))) != null) {
            int n2 = this.clampAnimationTimelineTick(n);
            return editorRect2.x + Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-8419629045867490530L, 28)) + Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(2514855366931164936L, 14)) * (double)n2;
        }
        return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(1267405725035484881L, 63));
    }

    public String buildTimelineRenderedSignature(EditorSession editorSession, String string) {
        if ((0xE3058E3C ^ 0xE3058E3C) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
        }
        StringBuilder stringBuilder = new StringBuilder(string);
        this.appendTimelineSignatureRow(stringBuilder, editorSession, string, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("AlPY20ZiSsKHZHepm7m2vR9gsG45kxcO0s7ePxjMRcnXk0/S0f9XDKwAo1o="));
        this.appendTimelineSignatureRow(stringBuilder, editorSession, string, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lVyLqZ0/l42NHS2Z4u8jaugWB4pabPNyLAKoAr7n6uc/FLCXzHscKW2vd90="));
        this.appendTimelineSignatureRow(stringBuilder, editorSession, string, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("R1YSngvbwI50UhU8FNC0NrXgVRxJfbUMfTvw+2OgFwesfDq3Xg8="));
        this.appendTimelineSignatureRow(stringBuilder, editorSession, string, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("I1vZiTUQBfDtQxGQtDrYmY6jBftQU/Kf94ejXFqvcZKUJZRGrtg/U181"));
        TreeSet<String> treeSet = new TreeSet<String>();
        if (this.isTimelineKeyframeSelected(editorSession)) {
            String[] stringArray = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 31)];
            stringArray[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1((int)-300459016, (int)25)] = editorSession.animationTimelineSelectedTargetId;
            if (this.equalsNullable(this.firstNonBlank(stringArray), string)) {
                Object object;
                String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 21)];
                stringArray2[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1((int)-300459016, (int)2)] = editorSession.animationTimelineSelectedRow;
                String string2 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
                String string3 = this.buildAnimationTimelineKeyframeRef(string2, editorSession.animationTimelineSelectedTick);
                if (!string3.isBlank()) {
                    treeSet.add(string3);
                }
                for (Integer n : editorSession.timelineExtraSelectedTicks) {
                    if (n == null || ((String)(object = this.buildAnimationTimelineKeyframeRef(string2, n))).isBlank()) continue;
                    treeSet.add((String)object);
                }
                for (String string4 : editorSession.timelineExtraSelectedKeyframeRefs) {
                    String string5;
                    object = this.parseTimelineSelectionRef(string4);
                    if (object == null || (string5 = this.buildAnimationTimelineKeyframeRef(((EditorNavbarHistoryPart.AnimationTimelineKeyframeRef)object).rowKey(), ((EditorNavbarHistoryPart.AnimationTimelineKeyframeRef)object).tick())).isBlank()) continue;
                    treeSet.add(string5);
                }
            }
        }
        if (!treeSet.isEmpty()) {
            stringBuilder.append(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("H7QiObZzcqpwfPvuo+LsQ05Et+PAIfBykX6RuCxfshywrJFBkNuANqLaZf/PwP5v"));
            for (String string6 : treeSet) {
                stringBuilder.append(string6).append((char)Xqedii_32drtqx.Xqedii_3h0mif43akudp(1295627086, 5));
            }
        } else {
            stringBuilder.append(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("KovfikiI3gd4Werum1OlCg6CXDY4Bs8yRsKRtHMOU2TUiU1bfdIxmpGUhYCGdn874AR6p3V9TXU="));
        }
        return stringBuilder.toString();
    }

    public void appendTimelineSignatureRow(StringBuilder stringBuilder, EditorSession editorSession, String string, String string2) {
        if (((1592462592 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (stringBuilder == null || editorSession == null || string == null || string.isBlank() || string2 == null || string2.isBlank()) {
            return;
        }
        stringBuilder.append((char)Xqedii_32drtqx.Xqedii_3h0mif43akudp(-593025380, 20)).append(string2).append((char)Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1493046210, 16));
        Map<Integer, String> map = this.readTimelineInterpModes(editorSession, string, string2);
        for (int n : this.readAnimationTimelineTicks(editorSession, string, string2)) {
            stringBuilder.append(n);
            String string3 = this.normalizeTimelineInterpMode(map.get(n));
            if (!Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nXYvfZSGxemQEmO/e5+4WvwHS22qtnyaT0ly/6z5FOutiq21ovr3Aw==").equals(string3)) {
                stringBuilder.append((char)Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(303604743, 20)).append(string3);
            }
            stringBuilder.append((char)Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300553223, 12));
        }
    }

    public void clearTimelineRuntimeKeyframes(Player player, EditorSession editorSession) {
        if (((0x743A18A | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return;
        }
        if (!editorSession.runtimeTimelineKeyframeIds.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<String>(editorSession.runtimeTimelineKeyframeIds);
            for (String string : arrayList) {
                this.removeTimelineRuntimeKeyframe(player, editorSession, string);
            }
            editorSession.runtimeTimelineKeyframeIds.clear();
        }
        editorSession.timelineRenderedSignature = null;
    }

    public void removeTimelineRuntimeKeyframe(Player player, EditorSession editorSession, String string) {
        if (((0x95ABD31B | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || string == null || string.isBlank()) {
            return;
        }
        String string2 = EditorTimelineKeyframePart.Xqedii_u8a53no73ydo(string);
        this.clearOutlineHud(player, string2);
        this.removeBaseHud(player, string2);
        this.removeRoundedParts(player, string2);
        if (editorSession != null && editorSession.shellRuntimeRects != null) {
            editorSession.shellRuntimeRects.remove(string);
        }
    }

    public void syncTimelineSelectedKeyframeValueFromTarget(EditorSession editorSession) {
        if ((0x42FC65D0 ^ 0x42FC65D0) != 0) {
            throw new IllegalStateException();
        }
        this.syncTimelineSelectedKeyframeValueFromTarget(editorSession, null, null);
    }

    public void syncTimelineSelectedKeyframeValueFromTarget(EditorSession editorSession, Double d) {
        if ((-1674881062 * -1674881062 + -1674881062 & 1) != 0) {
            throw new IllegalStateException();
        }
        this.syncTimelineSelectedKeyframeValueFromTarget(editorSession, EditorPropertyField.ROTATION, d);
    }

    public void syncTimelineSelectedKeyframeValueFromTarget(EditorSession editorSession, EditorPropertyField editorPropertyField, Double d) {
        int n;
        Object object;
        int n2;
        int n3;
        String string;
        int n4;
        int n5;
        if ((-874309671 * -874309671 + -874309671 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (!this.isTimelineKeyframeSelected(editorSession)) {
            return;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1214839738, 12)];
        stringArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)-843681175, (int)16)] = editorSession.animationTimelineSelectedTargetId;
        String string2 = this.firstNonBlank(stringArray);
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 9)];
        stringArray2[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)14)] = editorSession.animationTimelineSelectedRow;
        String string3 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
        if (string2.isBlank() || string3.isBlank()) {
            return;
        }
        String string4 = this.resolveTimelineEditableTargetId(editorSession);
        if (!this.equalsNullable(string2, string4)) {
            return;
        }
        Map<String, Object> map = this.resolveRawTargetByTargetId(editorSession, string2);
        if (map == null) {
            return;
        }
        Map<String, Object> map2 = this.ensureAnimationTimelineRowMap(map, string3);
        int n6 = n5 = this.clampAnimationTimelineTick(editorSession.animationTimelineSelectedTick);
        int n7 = this.clampAnimationTimelineTick(editorSession.animationTimelineTick);
        int n8 = n5;
        int n9 = Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1999179042, 1);
        int n10 = n4 = editorPropertyField != null && d != null && Double.isFinite(d) && this.isTimelineForceableSidebarField(editorPropertyField) ? Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1055805979, 26) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 9);
        if (n4 != 0) {
            String[] stringArray3 = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 12)];
            stringArray3[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)23)] = this.resolveTimelineRowForSidebarField(editorPropertyField);
            string = this.firstNonBlank(stringArray3).toLowerCase(Locale.ROOT);
        } else {
            string = Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
        }
        String string5 = string;
        int n11 = n3 = n4 != 0 && this.equalsNullable(string5, string3) ? Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-440331859, 18) : Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1999179042, 1);
        if (n4 != 0 && n3 == 0) {
            return;
        }
        int n12 = n2 = !editorSession.moveDragActive && !editorSession.sidebarFieldDragActive && editorSession.activeHandle == null && n3 == 0 && !Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("R1YSngvbwI50UhU8FNC0NrXgVRxJfbUMfTvw+2OgFwesfDq3Xg8=").equals(string3) ? Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 15) : Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-881188005, 19);
        if (n7 != n5 && n2 != 0) {
            editorSession.animationTimelineSelectedTick = n8 = n7;
            editorSession.animationTimelineTick = n8;
            this.clearTimelineExtraSelection(editorSession);
            n9 = Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245058, 6);
        }
        Object object2 = this.readAnimationTimelineTickValue(map2, n8);
        Map<String, Object> map3 = null;
        if (n3 != 0) {
            map3 = (Map<String, Object>) this.resolveTimelineForcedSidebarValue(editorSession, string2, string3, n8, editorPropertyField, d, object2);
        }
        if (map3 == null) {
            Map<String, Object> map4 = map3 = (Map<String, Object>) (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("R1YSngvbwI50UhU8FNC0NrXgVRxJfbUMfTvw+2OgFwesfDq3Xg8=").equals(string3) ? this.buildAnimationTimelineScaleValue(editorSession, string2, n8) : this.buildAnimationTimelineValueForRow(editorSession, string2, string3));
        }
        if (map3 == null) {
            return;
        }
        String string6 = this.resolveTimelinePreservedInterpMode(map2, object2, n6, n8);
        if (!Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nXYvfZSGxemQEmO/e5+4WvwHS22qtnyaT0ly/6z5FOutiq21ovr3Aw==").equals(string6)) {
            Map map5;
            Map<String, Object> map6;
            if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("AlPY20ZiSsKHZHepm7m2vR9gsG45kxcO0s7ePxjMRcnXk0/S0f9XDKwAo1o=").equals(string3) && map3 instanceof Number) {
                object = (Number)((Object)map3);
                LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
                linkedHashMap.put(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nIAzGuqvIp7tDsJ3gVVbCD91MqCPlcadeOyTRgP5CKyi+SYV+DU="), this.normalizeSidebarRotation(((Number)object).doubleValue()));
                linkedHashMap.put(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("bwFAGpWXwi6lwkcpJitQZKkLcJ5ndfG1lwgQXbg5cD4H3dZMj/X+P/91/3II+0O8uNV0l+RY"), string6);
                map3 = linkedHashMap;
            } else if (map3 instanceof Map && (map6 = this.toStringObjectMap(map5 = (Map)map3)) != null && !map6.isEmpty()) {
                map6.put(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("bwFAGpWXwi6lwkcpJitQZKkLcJ5ndfG1lwgQXbg5cD4H3dZMj/X+P/91/3II+0O8uNV0l+RY"), string6);
                map3 = map6;
            }
        }
        if (this.animationTimelineValuesEqual(object2, map3)) {
            if (n9 != 0) {
                editorSession.timelineRenderedSignature = null;
            }
            return;
        }
        this.removeAnimationTimelineTickValue(map2, n8);
        map2.put(Integer.toString(n8), map3);
        object = this.sortAnimationTimelineTickMap(map2);
        map2.clear();
        map2.putAll((Map<String, Object>)object);
        editorSession.timelineRenderedSignature = null;
        int n13 = n = n8 > 0 && (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lVyLqZ0/l42NHS2Z4u8jaugWB4pabPNyLAKoAr7n6uc/FLCXzHscKW2vd90=").equals(string3) || Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("R1YSngvbwI50UhU8FNC0NrXgVRxJfbUMfTvw+2OgFwesfDq3Xg8=").equals(string3)) && !editorSession.moveDragActive && !editorSession.sidebarFieldDragActive && !this.isLayersLeftHeld(editorSession) ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(1295628014, 5) : Xqedii_32drtqx.Xqedii_3h0mif43akudp(1919536566, 0);
        if (n != 0) {
            if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lVyLqZ0/l42NHS2Z4u8jaugWB4pabPNyLAKoAr7n6uc/FLCXzHscKW2vd90=").equals(string3)) {
                this.restoreTimelineRawTargetPositionToImplicitBase(editorSession, string2);
            } else {
                this.restoreTimelineRawTargetToImplicitBase(editorSession, string2);
            }
            this.syncTimelinePreviewAppliedBoundsToCurrent(editorSession, string2);
        }
    }

    public boolean deleteTimelineSelectedKeyframes(Player player, EditorSession editorSession) {
        if ((-1373435776 * (-1373435776 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || !this.isTimelineKeyframeSelected(editorSession)) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(647813991, 4) != 0;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1522799554, 25)];
        stringArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)450780113, (int)6)] = editorSession.animationTimelineSelectedTargetId;
        String string = this.firstNonBlank(stringArray);
        if (string.isBlank()) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 17) != 0;
        }
        Map<String, Object> map = this.resolveRawTargetByTargetId(editorSession, string);
        if (map == null) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1999179042, 1) != 0;
        }
        LinkedHashMap<String, List<Integer>> linkedHashMap = this.resolveTimelineSelectedTicksByRow(editorSession, string);
        if (linkedHashMap.isEmpty()) {
            String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(887544761, 7)];
            stringArray2[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)31)] = editorSession.animationTimelineSelectedRow;
            String string2 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
            if (!Xqedii_bwmwn2k.Xqedii_1mo40pi.containsKey(string2)) {
                return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1214843834, 12) != 0;
            }
            linkedHashMap.put(string2, List.of(Integer.valueOf(this.clampAnimationTimelineTick(editorSession.animationTimelineSelectedTick))));
        }
        int n = Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 13);
        for (Map.Entry<String, List<Integer>> entry : linkedHashMap.entrySet()) {
            Map<String, Object> map2;
            if (entry == null || entry.getKey() == null || entry.getValue() == null || entry.getValue().isEmpty()) continue;
            String[] stringArray3 = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-564391654, 14)];
            stringArray3[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)20)] = entry.getKey();
            String string3 = this.firstNonBlank(stringArray3).toLowerCase(Locale.ROOT);
            if (!Xqedii_bwmwn2k.Xqedii_1mo40pi.containsKey(string3) || (map2 = this.readAnimationTimelineRowMap(map, string3)) == null || map2.isEmpty()) continue;
            int n2 = Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 2);
            java.util.Iterator object = ((Iterable) entry.getValue()).iterator();
            while (object.hasNext()) {
                int n3 = (Integer) object.next();
                Object object2 = this.removeAnimationTimelineTickValue(map2, n3);
                if (object2 == null) continue;
                n = Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1490293698, 20);
                n2 = Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 24);
            }
            if (n2 == 0) continue;
            Map<String, Object> sorted_map2 = this.sortAnimationTimelineTickMap(map2);
            map2.clear();
            map2.putAll(sorted_map2);
        }
        if (n == 0) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 18) != 0;
        }
        this.recordEditorMutation(editorSession);
        this.clearTimelineSelectedKeyframe(editorSession);
        editorSession.timelineRenderedSignature = null;
        this.stopAnimationTimelineKeyframeDrag(editorSession, Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1055805979, 26) != 0);
        this.renderAnimationTimelineKeyframes(player, editorSession, string);
        this.applyTimelinePositionPreview(player, editorSession);
        if (editorSession.selectionOutlineVisible && editorSession.selectedElementId != null) {
            this.renderSelectionOverlay(player, editorSession);
        }
        this.refreshAfterTimelineSelectionChange(player, editorSession);
        return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1490293698, 20) != 0;
    }

    public void clearTimelineSelectedKeyframeOnPanelClick(Player player, EditorSession editorSession, String string) {
        if (((-321127981 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return;
        }
        if (!this.isTimelineKeyframeSelected(editorSession)) {
            return;
        }
        this.clearTimelineSelectedKeyframe(editorSession);
        editorSession.timelineRenderedSignature = null;
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-415503298, 29)];
        stringArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)2)] = string;
        stringArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)143486766, (int)29)] = editorSession.animationTimelineTargetId;
        String string2 = this.firstNonBlank(stringArray);
        if (!string2.isBlank()) {
            this.renderAnimationTimelineKeyframes(player, editorSession, string2);
        }
        this.applyTimelinePositionPreview(player, editorSession);
        if (editorSession.selectionOutlineVisible && editorSession.selectedElementId != null) {
            this.renderSelectionOverlay(player, editorSession);
        }
        this.refreshAfterTimelineSelectionChange(player, editorSession);
    }

    public void syncAnimationTimelineUi(Player player, EditorSession editorSession) {
        int n;
        int n2;
        if ((-767036137 * -767036137 - -767036137 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || !editorSession.editMode || !editorSession.previewMode) {
            return;
        }
        int n3 = n2 = editorSession.activeTool == EditorTool.ANIMATION ? Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-415503298, 30) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 6);
        if (editorSession.animationTimelinePanelVisible != (n2 != 0)) {
            this.setSidebarPanelVisible(player, editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("iEEdLIC7rqnbpEenqJDMXNx23HahvYnt0d95iA+6zQFFNFAXhzoZWdWLgaw4hG9/6zh76BltE7BY8yisUM11bQ=="), n2 != 0);
            editorSession.animationTimelinePanelVisible = (n2) != 0;
        }
        if (n2 == 0) {
            this.closeTimelineContextDropdowns(player, editorSession);
            this.stopAnimationTimelineSliderDrag(editorSession);
            this.stopAnimationTimelineKeyframeDrag(editorSession, Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-527902990, 25) != 0);
            this.clearTimelineSelectedKeyframe(editorSession);
            editorSession.animationTimelineTick = Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1573536585, 31);
            editorSession.animationTimelineSliderDragTick = null;
            this.clearTimelinePreviewOffset(player, editorSession);
            if (editorSession.selectionOutlineVisible) {
                this.renderSelectionOverlay(player, editorSession);
            }
            this.clearTimelineRuntimeKeyframes(player, editorSession);
            editorSession.animationTimelineTargetId = null;
            editorSession.animationTimelineComponentVisible = (Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-688726392, 9)) != 0;
            editorSession.timelineRenderedSignature = null;
            editorSession.timelineImplicitBaseTargetId = null;
            editorSession.timelineImplicitBaseBounds = null;
            editorSession.animationTimelineImplicitBaseBoundsByTarget.clear();
            return;
        }
        String string = this.resolveTimelineEditableTargetId(editorSession);
        if (!this.equalsNullable(editorSession.animationTimelineTargetId, string)) {
            this.closeTimelineContextDropdowns(player, editorSession);
            this.stopAnimationTimelineKeyframeDrag(editorSession, Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1922093560, 5) != 0);
            this.clearTimelineSelectedKeyframe(editorSession);
            int n4 = n = string == null || string.isBlank() ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(-911788323, 2) : Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-393384147, 29);
            if (n == 0) {
                this.clearTimelinePreviewOffset(player, editorSession);
            }
            if (editorSession.selectionOutlineVisible) {
                this.renderSelectionOverlay(player, editorSession);
            }
            editorSession.animationTimelineTargetId = string;
            if (string != null && !string.isBlank()) {
                this.resolveTimelineImplicitBaseBounds(editorSession, string);
            }
        }
        int n5 = n = string != null ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(1860490139, 25) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 20);
        if (editorSession.animationTimelineComponentVisible != (n != 0)) {
            ConfigurationSection configurationSection;
            this.setPanelVisibleByComponentName(player, editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ZDpfpC6MojMDD1GJwQCvXCUWDSvE4BSzcrpS7VyLifWZ0FIVRrE7mjPtnFqJ3B7dBJR5Yrgkmu/Grm6Pq6EvTRaUrKGwDNrX03aKSA=="), n != 0, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245130, 3) != 0);
            if (n != 0 && (configurationSection = this.findShellBlockSection(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("iEEdLIC7rqnbpEenqJDMXNx23HahvYnt0d95iA+6zQFFNFAXhzoZWdWLgaw4hG9/6zh76BltE7BY8yisUM11bQ=="))) != null) {
                this.spawnShellPanelHud(player, editorSession, configurationSection, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("iEEdLIC7rqnbpEenqJDMXNx23HahvYnt0d95iA+6zQFFNFAXhzoZWdWLgaw4hG9/6zh76BltE7BY8yisUM11bQ=="));
            }
            editorSession.animationTimelineComponentVisible = (n) != 0;
        }
        if (editorSession.animationTimelineSliderDragActive && editorSession.animationTimelineSliderDragTick != null && Double.isFinite(editorSession.animationTimelineSliderDragTick)) {
            double d = this.sliderTickToX(editorSession, editorSession.animationTimelineSliderDragTick);
            if (Double.isFinite(d)) {
                this.updateTimelineSliderVisualByX(player, editorSession, d);
            } else {
                this.updateTimelineSliderVisual(player, editorSession, editorSession.animationTimelineTick);
            }
        } else {
            this.updateTimelineSliderVisual(player, editorSession, editorSession.animationTimelineTick);
        }
        if (n == 0) {
            this.closeTimelineContextDropdowns(player, editorSession);
            this.stopAnimationTimelineKeyframeDrag(editorSession, Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 20) != 0);
            this.clearTimelineSelectedKeyframe(editorSession);
            if (editorSession.selectionOutlineVisible) {
                this.renderSelectionOverlay(player, editorSession);
            }
            this.clearTimelineRuntimeKeyframes(player, editorSession);
            editorSession.timelineRenderedSignature = null;
            return;
        }
        this.setShellText(player, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("uaSu5CHmlxUIZCKmpYsTXxUOvoh5tB0jdxWCKhSig9DqVXGwkyvb8Vej+rxvnbay2qKOcFqmZ+TuuLS1UwUMVXfqa9zJtk1l"), EditorTimelineKeyframePart.Xqedii_1wuc4q25etoaa(this.resolveTimelineTargetLabel(editorSession, string)));
        this.setShellText(player, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("WBUnNodm5IWTU4DAGzT0ZnyzQd2acoAwYEzpq7LV088riPSsdleAmmFAs7QK/01m0Y6Mq4kdoQzMJYDFJCv4z/idvq+bVdK9hYnlrzNZoizFmOuR"), Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("w/lF2oc00/49aq78ran4Rd43rehbkkRnMHLg7M1WmkpYfaobtimk4JRHmufUWWmsDlJT5pCAVq0FtdrCBf8="));
        this.setShellText(player, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("0G3d0m8ifz/m2e3qsIFs3/j/TJ1mb2ZqdoEWdDuRPnpsa9qJeCZwCk9mU+HxOwMIcL3QNlEoRSqpyVVLldZFx5MH3SVAyTCj76ATYxyDb9qPgF0k"), Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Aeg2ARwNjwORa7Od1ci97oXuiOT7oxsPUAJMefBQtanSxn2V8XWuLKDxKP8E3hp8Bsom+iYeDiEsNpCmZw4="));
        this.setShellText(player, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("orf7Z9LO8vZ7ydTn+MIRP2eDNoHAaNGKvzyBDuJez70wB46KPlWT4YhZk+5XSr4DL/uiLRVtzNvaUOnKTqPvEl8JaIG1OyLig2yc+76g"), Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("FzcKCVcIjcuwj9nXb1ekbXMeF6FrRO7UHmhylRBREfnD5+AhXaGegFWfeqAaP4JXRgW2oADt8F0="));
        this.renderAnimationTimelineKeyframes(player, editorSession, string);
        this.applyTimelinePositionPreview(player, editorSession);
    }

    public void addAnimationTimelineKeyframe(Player player, EditorSession editorSession, String string, String string2) {
        if ((-1273483925 * -1273483925 + -1273483925 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank() || string2 == null || string2.isBlank()) {
            return;
        }
        Map<String, Object> map = this.resolveRawTargetByTargetId(editorSession, string);
        if (map == null) {
            return;
        }
        int n = this.clampAnimationTimelineTick(editorSession.animationTimelineTick);
        Map<String, Object> map2 = this.ensureAnimationTimelineRowMap(map, string2);
        if (this.containsAnimationTimelineTick(map2, n)) {
            this.selectAnimationTimelineKeyframe(player, editorSession, string, string2, n, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 15) != 0);
            return;
        }
        Object object = this.resolveTimelineSeedValueForNewKeyframe(editorSession, string, string2, map2, n);
        if (object == null) {
            return;
        }
        map2.put(Integer.toString(n), object);
        Map<String, Object> map3 = this.sortAnimationTimelineTickMap(map2);
        map2.clear();
        map2.putAll(map3);
        editorSession.animationTimelineSelectedTargetId = string;
        editorSession.animationTimelineSelectedRow = string2;
        editorSession.animationTimelineSelectedTick = n;
        this.clearTimelineExtraSelection(editorSession);
        editorSession.timelineRenderedSignature = null;
        editorSession.activeHandle = null;
        editorSession.resizeAnchorValid = (Xqedii_32drtqx.Xqedii_3h0mif43akudp(1730583771, 28)) != 0;
        editorSession.handlesCollapsed = (Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 10)) != 0;
        editorSession.hoveredHandle = null;
        editorSession.moveDragActive = (Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 11)) != 0;
        editorSession.previewPanActive = (Xqedii_32drtqx.Xqedii_3h0mif43akudp(-421840588, 15)) != 0;
        editorSession.moveStartBounds.clear();
        this.recordEditorMutation(editorSession);
        this.renderAnimationTimelineKeyframes(player, editorSession, string);
        this.applyTimelinePositionPreview(player, editorSession);
        if (editorSession.selectionOutlineVisible && this.isSelectedTarget(editorSession, string)) {
            this.renderSelectionOverlay(player, editorSession);
        }
        this.playEditorSfx(player, editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("7nS1hS7NMevAe76XUek1rYTl+efwBXwGFkCy0VftMH+6MWT9RkWJav+W1qG02rHxYpRKaB6x6JntgVx57e4="));
        this.refreshAfterTimelineSelectionChange(player, editorSession);
    }

    public Object resolveTimelineSeedValueForNewKeyframe(EditorSession editorSession, String string, String string2, Map<String, Object> map, int n) {
        if ((0x1C4E7E03 ^ 0x1C4E7E03) != 0) {
            throw new IllegalStateException();
        }
        Object object = this.readTimelinePreviousTickValue(map, n);
        Object object2 = this.cloneTimelineKeyframeValue(object);
        if (object2 != null) {
            return object2;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245124, 1)];
        stringArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1999179042, (int)1)] = string2;
        if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("I1vZiTUQBfDtQxGQtDrYmY6jBftQU/Kf94ejXFqvcZKUJZRGrtg/U181").equals(this.firstNonBlank(stringArray).toLowerCase(Locale.ROOT))) {
            Double d = this.resolveTimelineExplicitTickZeroOpacity(editorSession, string);
            if (d != null) {
                return this.clampAnimationTimelineOpacityRaw(d);
            }
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1456583367, 21);
        }
        return this.buildAnimationTimelineValueForRow(editorSession, string, string2);
    }

    public Object readTimelinePreviousTickValue(Map<String, Object> map, int n) {
        if ((-447499337 * -447499337 - -447499337 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (map == null || map.isEmpty()) {
            return null;
        }
        int n2 = this.clampAnimationTimelineTick(n);
        int n3 = Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300426248, 15);
        Object object = null;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            int n4;
            double d;
            if (entry == null || entry.getKey() == null || !Double.isFinite(d = this.parseDouble(entry.getKey(), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-8419629045934632162L, 28)))) || (n4 = this.clampAnimationTimelineTick((int)Math.round(d))) >= n2 || n4 <= n3) continue;
            n3 = n4;
            object = entry.getValue();
        }
        return object;
    }

    public Object cloneTimelineKeyframeValue(Object object) {
        if ((1357815772 * 1357815772 - 1357815772 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (object == null) {
            return null;
        }
        if (object instanceof Map) {
            Map map = (Map)object;
            Map<String, Object> map2 = this.toStringObjectMap(map);
            return map2 == null ? null : this.deepCopyMap(map2);
        }
        if (object instanceof Number) {
            Number number = (Number)object;
            return number.doubleValue();
        }
        if (object instanceof String) {
            String string = (String)object;
            return string;
        }
        return null;
    }

    public void selectAnimationTimelineKeyframe(Player player, EditorSession editorSession, String string, String string2, int n, boolean bl) {
        if ((0xF1CFDDF3 ^ 0xF1CFDDF3) != 0) {
            throw new IllegalStateException();
        }
        this.selectAnimationTimelineKeyframe(player, editorSession, string, string2, n, bl, Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 16) != 0);
    }

    public void selectAnimationTimelineKeyframe(Player player, EditorSession editorSession, String string, String string2, int n, boolean bl, boolean bl2) {
        int n2;
        if ((-1509383151 * (-1509383151 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank() || string2 == null || string2.isBlank()) {
            return;
        }
        String string3 = string2.toLowerCase(Locale.ROOT);
        if (!Xqedii_bwmwn2k.Xqedii_1mo40pi.containsKey(string3)) {
            return;
        }
        int n3 = this.clampAnimationTimelineTick(n);
        boolean bl3 = this.isTimelineKeyframeSelected(editorSession);
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1225896647, 21)];
        stringArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-564408038, (int)14)] = editorSession.animationTimelineSelectedTargetId;
        String string4 = this.firstNonBlank(stringArray);
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 24)];
        stringArray2[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1((int)-300459016, (int)27)] = editorSession.animationTimelineSelectedRow;
        String string5 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
        int n4 = this.clampAnimationTimelineTick(editorSession.animationTimelineSelectedTick);
        int n5 = bl3 && this.equalsNullable(string4, string) ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1217238579, 24) : Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 24);
        int n6 = n2 = n5 != 0 && this.equalsNullable(string5, string3) ? Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 31) : Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1703711332, 6);
        if (!bl2 || !bl3 || n5 == 0) {
            this.clearTimelineExtraSelection(editorSession);
        } else if (n2 != 0) {
            editorSession.timelineExtraSelectedTicks.remove(n3);
            this.removeTimelineExtraSelectionRef(editorSession, string3, n3);
            if (n4 != n3) {
                editorSession.timelineExtraSelectedTicks.add(n4);
            }
        } else {
            this.movePrimaryTimelineSelectionIntoExtraRefs(editorSession);
        }
        editorSession.animationTimelineSelectedTargetId = string;
        editorSession.animationTimelineSelectedRow = string3;
        editorSession.animationTimelineSelectedTick = n3;
        editorSession.animationTimelineTick = n3;
        this.removeTimelineExtraSelectionRef(editorSession, string3, n3);
        this.sanitizeTimelineExtraSelection(editorSession);
        editorSession.timelineRenderedSignature = null;
        editorSession.activeHandle = null;
        editorSession.resizeAnchorValid = (Xqedii_32drtqx.Xqedii_3h0mif43akudp(1936563354, 14)) != 0;
        editorSession.handlesCollapsed = (Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 13)) != 0;
        editorSession.hoveredHandle = null;
        editorSession.moveDragActive = (Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1762376009, 20)) != 0;
        editorSession.previewPanActive = (Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 12)) != 0;
        editorSession.moveStartBounds.clear();
        if (bl) {
            double d;
            LinkedHashMap<String, List<Integer>> linkedHashMap;
            List<Integer> list;
            if (!editorSession.timelineKeyframeDragActive) {
                editorSession.timelineKeyframeDragStartSnapshot = this.captureEditorMutationSnapshot(editorSession);
                editorSession.timelineKeyframeDragMutated = (Xqedii_32drtqx.Xqedii_3h0mif43akudp(-421840588, 15)) != 0;
            }
            if ((list = this.resolveTimelineSelectedTicks(editorSession, string, string3)).isEmpty()) {
                list = List.of(Integer.valueOf(n3));
            }
            if ((linkedHashMap = this.resolveTimelineSelectedTicksByRow(editorSession, string)).isEmpty()) {
                linkedHashMap.put(string3, new ArrayList<Integer>(list));
            }
            editorSession.timelineKeyframeDragTickByLogicalTick.clear();
            for (int n7 : list) {
                editorSession.timelineKeyframeDragTickByLogicalTick.put(n7, n7);
            }
            editorSession.timelineKeyframeDragTickByRef.clear();
            for (Map.Entry<String, List<Integer>> entry : linkedHashMap.entrySet()) {
                if (entry == null || entry.getKey() == null || entry.getValue() == null || entry.getValue().isEmpty()) continue;
                String[] stringArray3 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489241026, 12)];
                stringArray3[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)24)] = entry.getKey();
                String string6 = this.firstNonBlank(stringArray3).toLowerCase(Locale.ROOT);
                if (string6.isBlank()) continue;
                for (Integer n8 : entry.getValue()) {
                    int n9;
                    String string7;
                    if (n8 == null || (string7 = this.buildAnimationTimelineKeyframeRef(string6, n9 = this.clampAnimationTimelineTick(n8))).isBlank()) continue;
                    editorSession.timelineKeyframeDragTickByRef.put(string7, n9);
                }
            }
            double d2 = editorSession.timelineKeyframeDragHitOffsetX;
            if (!Double.isFinite(d2)) {
                d2 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336739758278L, 21));
            }
            if (!Double.isFinite(editorSession.timelineKeyframeDragStartHitX) && Double.isFinite(d = this.sliderTickToX(editorSession, n3))) {
                editorSession.timelineKeyframeDragStartHitX = d + d2;
            }
            editorSession.timelineKeyframeDragHitOffsetX = d2;
            editorSession.timelineKeyframeDragActive = (Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1480856514, 23)) != 0;
            editorSession.timelineKeyframeDragRuntimeTick = editorSession.timelineKeyframeDragTickByLogicalTick.size() == Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 15) ? editorSession.timelineKeyframeDragTickByLogicalTick.values().iterator().next() : Xqedii_32drtqx.Xqedii_3h0mif43akudp(641095881, 26);
        } else {
            this.stopAnimationTimelineKeyframeDrag(editorSession, Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 9) != 0);
        }
        this.rerenderTimelineSelectionTarget(player, editorSession, string);
        this.updateTimelineSliderVisual(player, editorSession, n3);
        this.renderAnimationTimelineKeyframes(player, editorSession, string);
        this.applyTimelinePositionPreview(player, editorSession);
        if (editorSession.selectionOutlineVisible && this.isSelectedTarget(editorSession, string)) {
            this.renderSelectionOverlay(player, editorSession);
        }
        this.playEditorSfx(player, editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("7nS1hS7NMevAe76XUek1rYTl+efwBXwGFkCy0VftMH+6MWT9RkWJav+W1qG02rHxYpRKaB6x6JntgVx57e4="));
        this.refreshAfterTimelineSelectionChange(player, editorSession);
    }

    public void toggleTimelineKeyframeSelection(Player player, EditorSession editorSession, String string, String string2, int n) {
        int n2;
        if ((-1198303254 * -1198303254 - -1198303254 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank() || string2 == null || string2.isBlank()) {
            return;
        }
        String string3 = string2.toLowerCase(Locale.ROOT);
        if (!Xqedii_bwmwn2k.Xqedii_1mo40pi.containsKey(string3)) {
            return;
        }
        int n3 = this.clampAnimationTimelineTick(n);
        boolean bl = this.isTimelineKeyframeSelected(editorSession);
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1540063779, 11)];
        stringArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)1838979699, (int)22)] = editorSession.animationTimelineSelectedTargetId;
        String string4 = this.firstNonBlank(stringArray);
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489241026, 12)];
        stringArray2[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)920242599, (int)18)] = editorSession.animationTimelineSelectedRow;
        String string5 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
        int n4 = bl && this.equalsNullable(string4, string) ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1663338714, 12) : Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1703711332, 6);
        int n5 = n2 = n4 != 0 && this.equalsNullable(string5, string3) ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1217238579, 24) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 6);
        if (n4 == 0) {
            this.clearTimelineExtraSelection(editorSession);
            editorSession.animationTimelineSelectedTargetId = string;
            editorSession.animationTimelineSelectedRow = string3;
            editorSession.animationTimelineSelectedTick = n3;
            editorSession.animationTimelineTick = n3;
        } else if (n2 == 0) {
            this.movePrimaryTimelineSelectionIntoExtraRefs(editorSession);
            editorSession.animationTimelineSelectedTargetId = string;
            editorSession.animationTimelineSelectedRow = string3;
            editorSession.animationTimelineSelectedTick = n3;
            editorSession.animationTimelineTick = n3;
        } else if (editorSession.animationTimelineSelectedTick != n3 && !editorSession.timelineExtraSelectedTicks.remove(n3)) {
            editorSession.timelineExtraSelectedTicks.add(n3);
        }
        this.removeTimelineExtraSelectionRef(editorSession, string3, n3);
        this.sanitizeTimelineExtraSelection(editorSession);
        editorSession.timelineRenderedSignature = null;
        this.stopAnimationTimelineKeyframeDrag(editorSession, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1355027394, 27) != 0);
        this.rerenderTimelineSelectionTarget(player, editorSession, string);
        this.updateTimelineSliderVisual(player, editorSession, editorSession.animationTimelineSelectedTick);
        this.renderAnimationTimelineKeyframes(player, editorSession, string);
        this.applyTimelinePositionPreview(player, editorSession);
        if (editorSession.selectionOutlineVisible && this.isSelectedTarget(editorSession, string)) {
            this.renderSelectionOverlay(player, editorSession);
        }
        this.refreshAfterTimelineSelectionChange(player, editorSession);
    }

    public void retimeTimelineRuntimeKeyframe(Player player, EditorSession editorSession, String string, String string2, int n, int n2) {
        if (((1536434945 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        this.retimeTimelineRuntimeKeyframe(player, editorSession, string, string2, n, n2, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245124, 1) != 0);
    }

    public boolean retimeTimelineRuntimeKeyframe(Player player, EditorSession editorSession, String string, String string2, int n, int n2, boolean bl) {
        EditorRect editorRect;
        if ((0xFC91BC9D ^ 0xFC91BC9D) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || string == null || string.isBlank() || string2 == null || string2.isBlank()) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 30) != 0;
        }
        if (n == n2) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1488982978, 18) != 0;
        }
        String string3 = Xqedii_bwmwn2k.Xqedii_1mo40pi.get(string2);
        EditorRect editorRect2 = editorRect = string3 == null ? null : this.findShellBlockRect(editorSession, string3);
        if (editorRect == null) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1663342810, 12) != 0;
        }
        int n3 = this.clampAnimationTimelineTick(n);
        if (bl && editorSession.timelineKeyframeDragRuntimeTick >= 0) {
            n3 = editorSession.timelineKeyframeDragRuntimeTick;
        }
        String string4 = EditorTimelineKeyframePart.Xqedii_ty1usk1nwkho(string2, n3);
        String string5 = EditorTimelineKeyframePart.Xqedii_13tqrvx1w5jlj(string4);
        String string6 = EditorTimelineKeyframePart.Xqedii_3gbx0bv1sdwg4(string4);
        String string7 = EditorTimelineKeyframePart.Xqedii_lbef1ou4kfrm(string6);
        if (this.hudService.getHud(player, string5) == null || this.hudService.getHud(player, string7) == null) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-613996900, 20) != 0;
        }
        double d = this.resolveAnimationTimelineKeyframeX(editorSession, editorRect, n2);
        if (!Double.isFinite(d)) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 18) != 0;
        }
        double d2 = editorRect.y + Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(2650265893627459873L, 10));
        double d3 = this.toInternalTextTopY(d2, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403338876756166L, 33)));
        double d4 = this.applyTextAlignmentOffset(d, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-6467988961544648435L, 13)), TextDisplay.TextAlignment.LEFT);
        HudPositionCalculator.Placement placement = this.positionCalculator.calculateBoxPlacement(d4, d3, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708394642864021702L, 45)), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-1501127880585496310L, 17)), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(3092888118013528811L, 25)));
        boolean bl2 = this.isTimelineKeyframeRefSelected(editorSession, string, string2, n2);
        String string8 = bl2 ? Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("c7CJkHdfS4tlaxZgHc/zQKSC9cp2W7voOi7hL/4yDJIBIgH+1mTxFQ==") : Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ZrQkeKATnsXplEEXef0acAxH/k8JDyTMTBGKDroPWbDLEtWd2eWluQ==");
        String string9 = this.resolveTimelineKeyframeGlyph(editorSession, string, string2, n2);
        this.upsertHud(player, string5, placement.location(), placement.scale(), this.ensureRoundedCornerEditorFont(EditorTimelineKeyframePart.Xqedii_2v1xqlwwdtnp1(string8, string9)), Xqedii_32drtqx.Xqedii_3h0mif43akudp(633972533, 26), TextDisplay.TextAlignment.LEFT, Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300460151, 4));
        this.clearOutlineHud(player, string5);
        double d5 = d + Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 5));
        double d6 = d2 + Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(5688041763947035926L, 37));
        HudPositionCalculator.Placement placement2 = this.positionCalculator.calculateBoxPlacement(d5, d6, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(370004756102080647L, 6)), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-3495380692159954699L, 60)), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(6437721029025582679L, 20)));
        this.upsertHud(player, string7, placement2.location(), placement2.scale(), Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA=="), Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 7), TextDisplay.TextAlignment.LEFT, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245172, 30));
        this.clearOutlineHud(player, string7);
        editorSession.runtimeTimelineKeyframeIds.add(string4);
        editorSession.runtimeTimelineKeyframeIds.add(string6);
        editorSession.shellRuntimeRects.put(string4, new EditorRect(d, d2, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-6593012810860723830L, 9)), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-7918651432182620169L, 62))));
        editorSession.shellRuntimeRects.put(string6, new EditorRect(d5, d6, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336605671622L, 29)), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287170141754752779L, 40))));
        if (bl) {
            editorSession.timelineKeyframeDragRuntimeTick = n3;
        }
        return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(2037400683, 16) != 0;
    }

    public boolean hasTimelineKeyframeClipboard(EditorSession editorSession) {
        if (((0x4979BB02 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 6) != 0;
        }
        if (!this.resolveTimelineClipboardValuesByRef(editorSession).isEmpty()) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245130, 3) != 0;
        }
        return (this.cloneTimelineKeyframeValue(editorSession.timelineKeyframeClipboardValue) != null ? Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489376194, 17) : Xqedii_32drtqx.Xqedii_3h0mif43akudp(1936563354, 14)) != 0;
    }

    public LinkedHashMap<Integer, Object> resolveTimelineClipboardValuesByTick(EditorSession editorSession) {
        Object object;
        if (((0xBE547C47 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        LinkedHashMap<Integer, Object> linkedHashMap = new LinkedHashMap<Integer, Object>();
        if (editorSession == null) {
            return linkedHashMap;
        }
        if (!editorSession.timelineKeyframeClipboardValuesByTick.isEmpty()) {
            object = new TreeMap();
            for (Map.Entry<Integer, Object> entry : editorSession.timelineKeyframeClipboardValuesByTick.entrySet()) {
                Object object2;
                if (entry == null || entry.getKey() == null || (object2 = this.cloneTimelineKeyframeValue(entry.getValue())) == null) continue;
                ((TreeMap)object).put(this.clampAnimationTimelineTick(entry.getKey()), object2);
            }
            linkedHashMap.putAll((Map<Integer, Object>)object);
            if (!linkedHashMap.isEmpty()) {
                return linkedHashMap;
            }
        }
        if ((object = this.cloneTimelineKeyframeValue(editorSession.timelineKeyframeClipboardValue)) != null) {
            linkedHashMap.put(this.clampAnimationTimelineTick(editorSession.timelineKeyframeClipboardAnchorTick), object);
        }
        return linkedHashMap;
    }

    public LinkedHashMap<String, Object> resolveTimelineClipboardValuesByRef(EditorSession editorSession) {
        Object object;
        Object object2;
        if ((-19216148 * -19216148 + -19216148 & 1) != 0) {
            throw new IllegalStateException();
        }
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        if (editorSession == null) {
            return linkedHashMap;
        }
        if (!editorSession.timelineKeyframeClipboardValuesByRef.isEmpty()) {
            Object object3;
            Object object4;
            TreeMap<String, TreeMap<Integer, Object>> treeMapRef = new TreeMap<String, TreeMap<Integer, Object>>();
            for (Map.Entry<String, Object> entry : editorSession.timelineKeyframeClipboardValuesByRef.entrySet()) {
                if (entry == null || (object = this.parseTimelineSelectionRef(entry.getKey())) == null || (object4 = this.cloneTimelineKeyframeValue(entry.getValue())) == null) continue;
                TreeMap<Integer, Object> subMap = treeMapRef.computeIfAbsent(((EditorNavbarHistoryPart.AnimationTimelineKeyframeRef)object).rowKey(), string -> {
                    if (((0x973738D7 | 1) & 1) == 0) {
                        throw new IllegalStateException();
                    }
                    return new TreeMap<Integer, Object>();
                });
                subMap.put(this.clampAnimationTimelineTick(((EditorNavbarHistoryPart.AnimationTimelineKeyframeRef)object).tick()), object4);
            }
            for (Map.Entry<String, TreeMap<Integer, Object>> entry : treeMapRef.entrySet()) {
                if (entry == null || entry.getKey() == null || entry.getValue() == null || entry.getValue().isEmpty()) continue;
                for (Map.Entry<Integer, Object> subEntry : entry.getValue().entrySet()) {
                    if (subEntry == null || subEntry.getKey() == null) continue;
                    String refStr = this.buildAnimationTimelineKeyframeRef(entry.getKey(), subEntry.getKey());
                    if (!refStr.isBlank()) {
                        linkedHashMap.put(refStr, subEntry.getValue());
                    }
                }
            }
            if (!linkedHashMap.isEmpty()) {
                return linkedHashMap;
            }
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 6)];
        stringArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)1803120452, (int)8)] = editorSession.timelineKeyframeClipboardRow;
        object2 = this.firstNonBlank(stringArray).toLowerCase(Locale.ROOT);
        if (!Xqedii_bwmwn2k.Xqedii_1mo40pi.containsKey(object2)) {
            return linkedHashMap;
        }
        for (Map.Entry<Integer, Object> entry : this.resolveTimelineClipboardValuesByTick(editorSession).entrySet()) {
            if (entry == null || entry.getKey() == null) continue;
            String refStr = this.buildAnimationTimelineKeyframeRef((String)object2, entry.getKey());
            if (!refStr.isBlank()) {
                linkedHashMap.put(refStr, entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /*
     * WARNING - void declaration
     */
    public boolean copyTimelineSelectedKeyframe(EditorSession editorSession) {
        EditorNavbarHistoryPart.AnimationTimelineKeyframeRef animationTimelineKeyframeRef;
        Object object;
        Object object2;
        Map.Entry entry4;
        Object object3;
        if (((0xC68F314 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || !this.isTimelineKeyframeSelected(editorSession)) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 23) != 0;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 6)];
        stringArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)5)] = editorSession.animationTimelineSelectedTargetId;
        String string2 = this.firstNonBlank(stringArray);
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489244610, 9)];
        stringArray2[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)23)] = editorSession.animationTimelineSelectedRow;
        String string3 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
        int n = this.clampAnimationTimelineTick(editorSession.animationTimelineSelectedTick);
        if (string2.isBlank() || !Xqedii_bwmwn2k.Xqedii_1mo40pi.containsKey(string3)) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1687362349, 17) != 0;
        }
        Map<String, Object> map = this.resolveRawTargetByTargetId(editorSession, string2);
        if (map == null) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 18) != 0;
        }
        LinkedHashMap<String, List<Integer>> linkedHashMap = this.resolveTimelineSelectedTicksByRow(editorSession, string2);
        if (linkedHashMap.isEmpty()) {
            linkedHashMap.put(string3, List.of(Integer.valueOf(n)));
        }
        TreeMap<String, TreeMap<Integer, Object>> treeMap = new TreeMap<String, TreeMap<Integer, Object>>();
        for (Map.Entry<String, List<Integer>> object52 : linkedHashMap.entrySet()) {
            if (object52 == null || object52.getKey() == null || object52.getValue() == null || object52.getValue().isEmpty()) continue;
            String[] stringArray3 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(658238526, 31)];
            stringArray3[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1377452783, (int)10)] = object52.getKey();
            String string4 = this.firstNonBlank(stringArray3).toLowerCase(Locale.ROOT);
            Map<String, Object> rowMap = this.readAnimationTimelineRowMap(map, string4);
            if (!Xqedii_bwmwn2k.Xqedii_1mo40pi.containsKey(string4) || rowMap == null || rowMap.isEmpty()) continue;
            TreeMap<Integer, Object> subMap = treeMap.computeIfAbsent(string4, string -> {
                if (((0x376FE8C3 | 1) & 1) == 0) {
                    throw new IllegalStateException();
                }
                return new TreeMap<Integer, Object>();
            });
            for (int n2 : object52.getValue()) {
                Object tickVal = this.readAnimationTimelineTickValue(rowMap, n2);
                Object clonedVal = this.cloneTimelineKeyframeValue(tickVal);
                if (clonedVal != null) {
                    subMap.put(this.clampAnimationTimelineTick(n2), clonedVal);
                }
            }
            if (subMap.isEmpty()) {
                treeMap.remove(string4);
            }
        }
        LinkedHashMap<String, Object> linkedHashMap2 = new LinkedHashMap<String, Object>();
        for (Map.Entry<String, TreeMap<Integer, Object>> entry3 : treeMap.entrySet()) {
            if (entry3 == null || entry3.getKey() == null || entry3.getValue() == null || entry3.getValue().isEmpty()) continue;
            for (Map.Entry<Integer, Object> entry4_sub : entry3.getValue().entrySet()) {
                if (entry4_sub == null || entry4_sub.getKey() == null) continue;
                String refStr = this.buildAnimationTimelineKeyframeRef(entry3.getKey(), entry4_sub.getKey());
                if (!refStr.isBlank()) {
                    linkedHashMap2.put(refStr, entry4_sub.getValue());
                }
            }
        }
        if (linkedHashMap2.isEmpty()) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 20) != 0;
        }
        String var9_13 = this.buildAnimationTimelineKeyframeRef(string3, n);
        if (var9_13.isBlank() || !linkedHashMap2.containsKey(var9_13)) {
            var9_13 = (String)linkedHashMap2.keySet().iterator().next();
        }
        if ((animationTimelineKeyframeRef = this.parseTimelineSelectionRef(var9_13)) == null) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(1775089266, 8) != 0;
        }
        object3 = this.cloneTimelineKeyframeValue(linkedHashMap2.get(var9_13));
        if (object3 == null) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1823576653, 3) != 0;
        }
        String[] stringArray4 = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1999179040, 1)];
        stringArray4[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)1803120452, (int)8)] = animationTimelineKeyframeRef.rowKey();
        String clipRow = this.firstNonBlank(stringArray4).toLowerCase(Locale.ROOT);
        int n3 = this.clampAnimationTimelineTick(animationTimelineKeyframeRef.tick());
        editorSession.timelineKeyframeClipboardRow = clipRow;
        editorSession.timelineKeyframeClipboardValue = object3;
        editorSession.timelineKeyframeClipboardValuesByTick.clear();
        editorSession.timelineKeyframeClipboardValuesByRef.clear();
        editorSession.timelineKeyframeClipboardAnchorTick = n3;
        editorSession.timelineKeyframeClipboardAnchorRef = var9_13;
        for (Map.Entry<String, Object> entry2 : linkedHashMap2.entrySet()) {
            if (entry2 == null || entry2.getKey() == null || (object = this.cloneTimelineKeyframeValue(entry2.getValue())) == null) continue;
            editorSession.timelineKeyframeClipboardValuesByRef.put(entry2.getKey(), object);
            EditorNavbarHistoryPart.AnimationTimelineKeyframeRef animationTimelineKeyframeRef2 = this.parseTimelineSelectionRef(entry2.getKey());
            if (animationTimelineKeyframeRef2 == null || !this.equalsNullable(animationTimelineKeyframeRef2.rowKey(), clipRow)) continue;
            editorSession.timelineKeyframeClipboardValuesByTick.put(this.clampAnimationTimelineTick(animationTimelineKeyframeRef2.tick()), this.cloneTimelineKeyframeValue(object));
        }
        return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-421807820, 15) != 0;
    }

    public boolean pasteTimelineClipboardToSelectedKeyframe(Player player, EditorSession editorSession) {
        if (((-466780365 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || !this.isTimelineKeyframeSelected(editorSession)) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 0) != 0;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 11)];
        stringArray[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1((int)-300459016, (int)12)] = editorSession.animationTimelineSelectedTargetId;
        String string = this.firstNonBlank(stringArray);
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(1841009486, 19)];
        stringArray2[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)770215279, (int)21)] = editorSession.timelineKeyframeClipboardRow;
        String string2 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
        int n = this.clampAnimationTimelineTick(editorSession.animationTimelineSelectedTick);
        return this.applyTimelineClipboardToKeyframe(player, editorSession, string, string2, n);
    }

    public boolean pasteTimelineClipboardToContext(Player player, EditorSession editorSession) {
        if (((150575917 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 3) != 0;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1922093560, 5)];
        stringArray[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1((int)-300459016, (int)5)] = editorSession.animationTimelineContextTargetId;
        String string = this.firstNonBlank(stringArray);
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245138, 4)];
        stringArray2[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)959768283, (int)31)] = editorSession.timelineKeyframeClipboardRow;
        String string2 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
        if (this.isTimelineKeyframeSelected(editorSession)) {
            String[] stringArray3 = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 0)];
            stringArray3[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)1730583771, (int)28)] = editorSession.animationTimelineSelectedTargetId;
            String string3 = this.firstNonBlank(stringArray3);
            if (string.isBlank() && !string3.isBlank()) {
                string = string3;
            }
        }
        int n = this.clampAnimationTimelineTick(editorSession.animationTimelineContextTick);
        return this.applyTimelineClipboardToKeyframe(player, editorSession, string, string2, n);
    }

    public boolean applyTimelineClipboardToKeyframe(Player player, EditorSession editorSession, String string2, String string3, int n) {
        Map<String, Object> map;
        Map<String, Object> map2;
        String string4;
        String string5;
        LinkedHashMap<String, Object> linkedHashMap;
        if (((-1458725955 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || !this.hasTimelineKeyframeClipboard(editorSession)) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 12) != 0;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1490293698, 20)];
        stringArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)-613996900, (int)20)] = string2;
        String string6 = this.firstNonBlank(stringArray);
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(658238526, 31)];
        stringArray2[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-564408038, (int)14)] = string3;
        String string7 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
        if (string6.isBlank()) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1186436852, 4) != 0;
        }
        if (!Xqedii_bwmwn2k.Xqedii_1mo40pi.containsKey(string7)) {
            string7 = Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
        }
        if ((linkedHashMap = this.resolveTimelineClipboardValuesByRef(editorSession)).isEmpty()) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(1936563354, 14) != 0;
        }
        int n2 = this.clampAnimationTimelineTick(n);
        EditorNavbarHistoryPart.AnimationTimelineKeyframeRef animationTimelineKeyframeRef = this.parseTimelineSelectionRef(editorSession.timelineKeyframeClipboardAnchorRef);
        String string8 = string5 = animationTimelineKeyframeRef == null ? Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==") : this.buildAnimationTimelineKeyframeRef(animationTimelineKeyframeRef.rowKey(), animationTimelineKeyframeRef.tick());
        if (string5.isBlank() || !linkedHashMap.containsKey(string5)) {
            String[] stringArray3 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489376194, 17)];
            stringArray3[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)-1667599507, (int)30)] = editorSession.timelineKeyframeClipboardRow;
            String string9 = this.firstNonBlank(stringArray3).toLowerCase(Locale.ROOT);
            String string10 = this.buildAnimationTimelineKeyframeRef(string9, editorSession.timelineKeyframeClipboardAnchorTick);
            animationTimelineKeyframeRef = !string10.isBlank() && linkedHashMap.containsKey(string10) ? this.parseTimelineSelectionRef(string10) : this.parseTimelineSelectionRef(linkedHashMap.keySet().iterator().next());
        }
        if (animationTimelineKeyframeRef == null) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 30) != 0;
        }
        int n3 = this.clampAnimationTimelineTick(animationTimelineKeyframeRef.tick());
        int n4 = n2 - n3;
        Map<String, Object> map3 = this.resolveRawTargetByTargetId(editorSession, string6);
        if (map3 == null) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 20) != 0;
        }
        LinkedHashMap<String, LinkedHashMap<Integer, Object>> linkedHashMap2 = new LinkedHashMap<String, LinkedHashMap<Integer, Object>>();
        for (Map.Entry<String, Object> entry : linkedHashMap.entrySet()) {
            if (entry == null || entry.getKey() == null) continue;
            EditorNavbarHistoryPart.AnimationTimelineKeyframeRef object3 = this.parseTimelineSelectionRef(entry.getKey());
            if (object3 == null) continue;
            String[] stringArray4 = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-527902990, 25)];
            stringArray4[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-786768293, (int)30)] = object3.rowKey();
            string4 = this.firstNonBlank(stringArray4).toLowerCase(Locale.ROOT);
            int n5 = this.clampAnimationTimelineTick(object3.tick() + n4);
            Map<String, Object> targetRowMap = this.ensureAnimationTimelineRowMap(map3, string4);
            Object existingTickVal = this.readAnimationTimelineTickValue(targetRowMap, n5);
            Object clonedEntryVal = this.cloneTimelineKeyframeValue(entry.getValue());
            if (!Xqedii_bwmwn2k.Xqedii_1mo40pi.containsKey(string4) || clonedEntryVal == null || this.animationTimelineValuesEqual(existingTickVal, clonedEntryVal)) continue;
            LinkedHashMap<Integer, Object> subMap = linkedHashMap2.computeIfAbsent(string4, string -> {
                if (((1170080201 << 1 | 1) & 1) == 0) {
                    throw new IllegalStateException();
                }
                return new LinkedHashMap<Integer, Object>();
            });
            subMap.put(n5, clonedEntryVal);
        }
        String rowToSelect = string7;
        if (rowToSelect.isBlank()) {
            String[] stringArray5 = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 17)];
            stringArray5[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1377452783, (int)10)] = animationTimelineKeyframeRef.rowKey();
            rowToSelect = this.firstNonBlank(stringArray5).toLowerCase(Locale.ROOT);
        }
        if (!Xqedii_bwmwn2k.Xqedii_1mo40pi.containsKey(rowToSelect)) {
            rowToSelect = Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lVyLqZ0/l42NHS2Z4u8jaugWB4pabPNyLAKoAr7n6uc/FLCXzHscKW2vd90=");
        }
        if (linkedHashMap2.isEmpty()) {
            this.selectAnimationTimelineKeyframe(player, editorSession, string6, rowToSelect, n2, Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 9) != 0);
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-440331859, 18) != 0;
        }
        this.recordEditorMutation(editorSession);
        for (Map.Entry<String, LinkedHashMap<Integer, Object>> entry : linkedHashMap2.entrySet()) {
            if (entry == null || entry.getKey() == null || entry.getValue() == null || entry.getValue().isEmpty()) continue;
            String[] stringArray6 = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1803120708, 8)];
            stringArray6[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1573536585, (int)31)] = entry.getKey();
            string4 = this.firstNonBlank(stringArray6).toLowerCase(Locale.ROOT);
            Map<String, Object> targetRowMap = this.ensureAnimationTimelineRowMap(map3, string4);
            for (Map.Entry<Integer, Object> entry2 : entry.getValue().entrySet()) {
                if (entry2 == null || entry2.getKey() == null) continue;
                int n6 = this.clampAnimationTimelineTick(entry2.getKey());
                this.removeAnimationTimelineTickValue(targetRowMap, n6);
                targetRowMap.put(Integer.toString(n6), entry2.getValue());
            }
            Map<String, Object> sortedMap = this.sortAnimationTimelineTickMap(targetRowMap);
            targetRowMap.clear();
            targetRowMap.putAll(sortedMap);
        }
        this.selectTimelinePastedKeyframes(player, editorSession, string6, rowToSelect, n2, linkedHashMap2);
        editorSession.timelineRenderedSignature = null;
        return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 7) != 0;
    }

    public void selectTimelinePastedKeyframes(Player player, EditorSession editorSession, String string, String string2, int n, LinkedHashMap<String, LinkedHashMap<Integer, Object>> linkedHashMap) {
        Iterator iterator;
        Object object;
        if ((1069454688 * 1069454688 - 1069454688 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || string == null || string.isBlank() || linkedHashMap == null || linkedHashMap.isEmpty()) {
            return;
        }
        LinkedHashMap<String, List<Integer>> linkedHashMap2 = new LinkedHashMap<String, List<Integer>>();
        for (Map.Entry<String, LinkedHashMap<Integer, Object>> entry : linkedHashMap.entrySet()) {
            if (entry == null || entry.getKey() == null || entry.getValue() == null || entry.getValue().isEmpty()) continue;
            String[] stringArray = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1187715365, 31)];
            stringArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)7)] = entry.getKey();
            String rowKey = this.firstNonBlank(stringArray).toLowerCase(Locale.ROOT);
            if (!Xqedii_bwmwn2k.Xqedii_1mo40pi.containsKey(rowKey)) continue;
            TreeSet<Integer> tickSet = new TreeSet<Integer>();
            for (Integer tickVal : entry.getValue().keySet()) {
                if (tickVal == null) continue;
                tickSet.add(this.clampAnimationTimelineTick(tickVal));
            }
            if (tickSet.isEmpty()) continue;
            linkedHashMap2.put(rowKey, new ArrayList<Integer>(tickSet));
        }
        if (linkedHashMap2.isEmpty()) {
            return;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-440331859, 18)];
        stringArray[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1((int)-300459016, (int)23)] = string2;
        String selectedRowKey = this.firstNonBlank(stringArray).toLowerCase(Locale.ROOT);
        int n2 = this.clampAnimationTimelineTick(n);
        List<Integer> ticksList = linkedHashMap2.get(selectedRowKey);
        if (ticksList == null || ticksList.isEmpty()) {
            Map.Entry<String, List<Integer>> firstEntry = linkedHashMap2.entrySet().iterator().next();
            selectedRowKey = firstEntry.getKey();
            n2 = firstEntry.getValue().get(Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1703711332, 6));
        } else if (!ticksList.contains(n2)) {
            n2 = ticksList.get(Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 22));
        }
        this.selectAnimationTimelineKeyframe(player, editorSession, string, selectedRowKey, n2, Xqedii_32drtqx.Xqedii_3h0mif43akudp(-833799754, 29) != 0);
        editorSession.timelineExtraSelectedTicks.clear();
        editorSession.timelineExtraSelectedKeyframeRefs.clear();
        for (Map.Entry<String, List<Integer>> entry : linkedHashMap2.entrySet()) {
            if (entry == null || entry.getKey() == null || entry.getValue() == null || ((List)entry.getValue()).isEmpty()) continue;
            String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 18)];
            stringArray2[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)968281677, (int)13)] = (String)entry.getKey();
            String string3 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
            Iterator iterator2 = ((List)entry.getValue()).iterator();
            while (iterator2.hasNext()) {
                int n3 = (Integer)iterator2.next();
                int n4 = this.clampAnimationTimelineTick(n3);
                if (this.equalsNullable(selectedRowKey, string3) && n2 == n4) continue;
                if (this.equalsNullable(selectedRowKey, string3)) {
                    editorSession.timelineExtraSelectedTicks.add(n4);
                    continue;
                }
                this.addTimelineExtraSelectionRef(editorSession, string3, n4);
            }
        }
        this.sanitizeTimelineExtraSelection(editorSession);
        editorSession.timelineRenderedSignature = null;
        this.renderAnimationTimelineKeyframes(player, editorSession, string);
        this.applyTimelinePositionPreview(player, editorSession);
        if (editorSession.selectionOutlineVisible && this.isSelectedTarget(editorSession, string)) {
            this.renderSelectionOverlay(player, editorSession);
        }
        this.refreshAfterTimelineSelectionChange(player, editorSession);
    }

    public void updateTimelineKeyframeDrag(Player player, EditorSession editorSession, double d) {
        boolean bl;
        int n;
        int n2;
        Object object;
        Object object4;
        if ((2031106715 * 2031106715 + 2031106715 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || !editorSession.timelineKeyframeDragActive || !this.isTimelineKeyframeSelected(editorSession)) {
            return;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245138, 4)];
        stringArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)26)] = editorSession.animationTimelineSelectedTargetId;
        String string = this.firstNonBlank(stringArray);
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 23)];
        stringArray2[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-561457422, (int)25)] = editorSession.animationTimelineSelectedRow;
        String string3 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
        if (string.isBlank() || string3.isBlank()) {
            return;
        }
        String string4 = this.resolveTimelineEditableTargetId(editorSession);
        if (!this.equalsNullable(string, string4)) {
            return;
        }
        Map<String, Object> map = this.resolveRawTargetByTargetId(editorSession, string);
        if (map == null) {
            return;
        }
        if (Double.isFinite(editorSession.timelineKeyframeDragStartHitX) && Math.abs(d - editorSession.timelineKeyframeDragStartHitX) < Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-1501127880585496150L, 17))) {
            return;
        }
        double d2 = editorSession.timelineKeyframeDragHitOffsetX;
        if (!Double.isFinite(d2)) {
            d2 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 53));
        }
        Map<String, Object> map2 = this.ensureAnimationTimelineRowMap(map, string3);
        LinkedHashMap<String, List<Integer>> linkedHashMap = this.resolveTimelineSelectedTicksByRow(editorSession, string);
        List<Integer> list = linkedHashMap.get(string3);
        if (list == null || list.isEmpty()) {
            return;
        }
        int n5 = linkedHashMap.size() > Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1703711268, 6) ? Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 12) : Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-564408038, 14);
        LinkedHashMap<Integer, Integer> linkedHashMap2 = new LinkedHashMap<Integer, Integer>();
        if (editorSession.timelineKeyframeDragTickByLogicalTick.isEmpty()) {
            for (int n6 : list) {
                linkedHashMap2.put(n6, n6);
            }
        } else {
            linkedHashMap2.putAll(editorSession.timelineKeyframeDragTickByLogicalTick);
        }
        LinkedHashMap<String, Integer> dragTickByRef = new LinkedHashMap<String, Integer>();
        if (editorSession.timelineKeyframeDragTickByRef.isEmpty()) {
            for (Map.Entry<String, List<Integer>> entry : linkedHashMap.entrySet()) {
                if (entry == null || entry.getKey() == null || entry.getValue() == null || entry.getValue().isEmpty()) continue;
                String[] stringArray3 = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 1)];
                stringArray3[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1214106180, (int)23)] = entry.getKey();
                String string5 = this.firstNonBlank(stringArray3).toLowerCase(Locale.ROOT);
                if (string5.isBlank()) continue;
                for (Integer object32 : entry.getValue()) {
                    if (object32 == null) continue;
                    int tickVal = this.clampAnimationTimelineTick(object32);
                    String refStr = this.buildAnimationTimelineKeyframeRef(string5, tickVal);
                    if (!refStr.isBlank()) {
                        dragTickByRef.put(refStr, tickVal);
                    }
                }
            }
        } else {
            dragTickByRef.putAll(editorSession.timelineKeyframeDragTickByRef);
        }
        int n7 = this.clampAnimationTimelineTick(editorSession.animationTimelineSelectedTick);
        int n8 = this.sliderXToTick(editorSession, d - d2);
        int n9 = n8 - n7;
        if (n9 == 0) {
            return;
        }
        if (!this.canShiftTimelineKeyframes(map2, list, n9)) {
            return;
        }
        if (n5 != 0) {
            int n3 = Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 7);
            String string5;
            int n4;
            int n6;
            int n10;
            int n11;
            LinkedHashMap<String, Map<String, Object>> rowsMap = new LinkedHashMap<String, Map<String, Object>>();
            LinkedHashMap<String, LinkedHashMap<Integer, Object>> linkedHashMap3 = new LinkedHashMap<String, LinkedHashMap<Integer, Object>>();
            for (Map.Entry<String, List<Integer>> entry2 : linkedHashMap.entrySet()) {
                if (entry2 == null || entry2.getKey() == null || entry2.getValue() == null || entry2.getValue().isEmpty()) continue;
                String[] stringArray4 = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-527902990, 25)];
                stringArray4[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)1540430558, (int)22)] = entry2.getKey();
                String rowName = this.firstNonBlank(stringArray4).toLowerCase(Locale.ROOT);
                List<Integer> tickList = entry2.getValue();
                if (rowName.isBlank()) continue;
                Map<String, Object> map3 = this.ensureAnimationTimelineRowMap(map, rowName);
                if (!this.canShiftTimelineKeyframes(map3, tickList, n9)) {
                    return;
                }
                LinkedHashMap<Integer, Object> subMap = new LinkedHashMap<Integer, Object>();
                for (Integer tickVal : tickList) {
                    if (tickVal == null) continue;
                    Object tickObj = this.readAnimationTimelineTickValue(map3, tickVal);
                    if (tickObj == null) {
                        return;
                    }
                    subMap.put(tickVal, tickObj);
                }
                if (subMap.isEmpty()) continue;
                rowsMap.put(rowName, map3);
                linkedHashMap3.put(rowName, subMap);
            }
            if (linkedHashMap3.isEmpty()) {
                return;
            }
            int n12 = Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 27);
            for (Map.Entry<String, LinkedHashMap<Integer, Object>> entrySub : linkedHashMap3.entrySet()) {
                if (entrySub != null && entrySub.getValue() != null) {
                    n12 += entrySub.getValue().size();
                }
            }
            for (Map.Entry<String, LinkedHashMap<Integer, Object>> entrySub : linkedHashMap3.entrySet()) {
                if (entrySub == null || entrySub.getValue() == null || entrySub.getValue().isEmpty()) continue;
                Map<String, Object> targetRowMap = rowsMap.get(entrySub.getKey());
                if (targetRowMap == null) continue;
                for (int n13 : entrySub.getValue().keySet()) {
                    this.removeAnimationTimelineTickValue(targetRowMap, n13);
                }
                for (Map.Entry<Integer, Object> entry4 : entrySub.getValue().entrySet()) {
                    int n14 = this.clampAnimationTimelineTick(entry4.getKey() + n9);
                    targetRowMap.put(Integer.toString(n14), entry4.getValue());
                }
                Map<String, Object> map4 = this.sortAnimationTimelineTickMap(targetRowMap);
                targetRowMap.clear();
                targetRowMap.putAll(map4);
            }
            editorSession.animationTimelineSelectedTick = n10 = this.clampAnimationTimelineTick(n7 + n9);
            editorSession.animationTimelineTick = n10;
            editorSession.timelineExtraSelectedTicks.clear();
            editorSession.timelineExtraSelectedKeyframeRefs.clear();
            LinkedHashMap<Integer, Object> targetSubMap = linkedHashMap3.get(string3);
            if (targetSubMap != null) {
                for (int n15 : targetSubMap.keySet()) {
                    int n16 = this.clampAnimationTimelineTick(n15 + n9);
                    if (n16 != n10) {
                        editorSession.timelineExtraSelectedTicks.add(n16);
                    }
                }
            }
            for (Map.Entry<String, LinkedHashMap<Integer, Object>> entry5 : linkedHashMap3.entrySet()) {
                if (entry5 == null || entry5.getValue() == null || entry5.getValue().isEmpty()) continue;
                String[] stringArray5 = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(1295628014, 5)];
                stringArray5[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)-833799754, (int)29)] = entry5.getKey();
                String string6 = this.firstNonBlank(stringArray5).toLowerCase(Locale.ROOT);
                if (string6.isBlank() || this.equalsNullable(string6, string3)) continue;
                for (int n11_val : entry5.getValue().keySet()) {
                    int n17 = this.clampAnimationTimelineTick(n11_val + n9);
                    this.addTimelineExtraSelectionRef(editorSession, string6, n17);
                }
            }
            this.sanitizeTimelineExtraSelection(editorSession);
            LinkedHashMap<String, Integer> newDragTickByRef = new LinkedHashMap<String, Integer>();
            int n18 = Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 7);
            for (Map.Entry<String, LinkedHashMap<Integer, Object>> entry6 : linkedHashMap3.entrySet()) {
                if (entry6 == null || entry6.getKey() == null || entry6.getValue() == null || entry6.getValue().isEmpty()) continue;
                String[] stringArray6 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489277890, 15)];
                stringArray6[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)22)] = entry6.getKey();
                String string7 = this.firstNonBlank(stringArray6).toLowerCase(Locale.ROOT);
                if (string7.isBlank()) continue;
                for (int n6_val : entry6.getValue().keySet()) {
                    int n4_val = this.clampAnimationTimelineTick(n6_val + n9);
                    String string5_val = this.buildAnimationTimelineKeyframeRef(string7, n6_val);
                    int n19 = string5_val.isBlank() ? n6_val : dragTickByRef.getOrDefault(string5_val, n6_val);
                    if (!this.retimeTimelineRuntimeKeyframe(player, editorSession, string, string7, n19, n4_val, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 19) != 0)) {
                        n3 = Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 14);
                        break;
                    }
                    String string8 = this.buildAnimationTimelineKeyframeRef(string7, n4_val);
                    if (!string8.isBlank()) {
                        newDragTickByRef.put(string8, n19);
                    }
                }
                if (n3 == 0) break;
            }
            if (n3 == 0) {
                this.renderAnimationTimelineKeyframes(player, editorSession, string);
                newDragTickByRef.clear();
                for (Map.Entry<String, LinkedHashMap<Integer, Object>> entry7 : linkedHashMap3.entrySet()) {
                    if (entry7 == null || entry7.getKey() == null || entry7.getValue() == null || entry7.getValue().isEmpty()) continue;
                    String[] stringArray7 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1485050818, 22)];
                    stringArray7[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)1147894127, (int)0)] = entry7.getKey();
                    String string9 = this.firstNonBlank(stringArray7).toLowerCase(Locale.ROOT);
                    if (string9.isBlank()) continue;
                    for (int n6_val : entry7.getValue().keySet()) {
                        int n4_val = this.clampAnimationTimelineTick(n6_val + n9);
                        String string5_val = this.buildAnimationTimelineKeyframeRef(string9, n4_val);
                        if (!string5_val.isBlank()) {
                            newDragTickByRef.put(string5_val, n4_val);
                        }
                    }
                }
            }
            editorSession.timelineKeyframeDragTickByRef.clear();
            editorSession.timelineKeyframeDragTickByRef.putAll(newDragTickByRef);
            editorSession.timelineKeyframeDragTickByLogicalTick.clear();
            for (int n21 : this.resolveTimelineSelectedTicks(editorSession, string, string3)) {
                String string10 = this.buildAnimationTimelineKeyframeRef(string3, n21);
                int n22 = string10.isBlank() ? n21 : newDragTickByRef.getOrDefault(string10, n21);
                editorSession.timelineKeyframeDragTickByLogicalTick.put(n21, n22);
            }
            editorSession.timelineKeyframeDragRuntimeTick = editorSession.timelineKeyframeDragTickByLogicalTick.size() == Xqedii_32drtqx.Xqedii_3h0mif43akudp(-608619290, 23) ? editorSession.timelineKeyframeDragTickByLogicalTick.values().iterator().next() : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459024, 3);
            editorSession.timelineKeyframeDragMutated = (Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245124, 1)) != 0;
            this.updateTimelineSliderVisual(player, editorSession, n10);
            editorSession.timelineRenderedSignature = this.buildTimelineRenderedSignature(editorSession, string);
            if (n12 <= Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1377451759, 10)) {
                this.applyTimelinePositionPreview(player, editorSession);
                this.updateEditorPropertiesSidebar(player, editorSession);
            }
            return;
        }
        object = new LinkedHashMap();
        LinkedHashMap<Integer, Object> shiftedMap = new LinkedHashMap<Integer, Object>();
        for (int linkedHashMap4 : list) {
            Object object5 = this.removeAnimationTimelineTickValue(map2, linkedHashMap4);
            if (object5 == null) continue;
            shiftedMap.put(linkedHashMap4, object5);
        }
        if (shiftedMap.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, Object> entry : shiftedMap.entrySet()) {
            int n23 = this.clampAnimationTimelineTick((Integer)entry.getKey() + n9);
            map2.put(Integer.toString(n23), entry.getValue());
        }
        Map<String, Object> map5 = this.sortAnimationTimelineTickMap(map2);
        map2.clear();
        map2.putAll(map5);
        LinkedHashMap<Integer, Integer> linkedHashMap5 = new LinkedHashMap<Integer, Integer>();
        for (int n24 : list) {
            int n25 = this.clampAnimationTimelineTick(n24 + n9);
            int n26 = linkedHashMap2.getOrDefault(n24, n24);
            linkedHashMap5.put(n25, n26);
        }
        editorSession.animationTimelineSelectedTick = n2 = this.clampAnimationTimelineTick(n7 + n9);
        editorSession.animationTimelineTick = n2;
        editorSession.timelineExtraSelectedKeyframeRefs.removeIf(string2 -> {
            if ((-874624390 * -874624390 - -874624390 & 1) != 0) {
                throw new IllegalStateException();
            }
            EditorNavbarHistoryPart.AnimationTimelineKeyframeRef animationTimelineKeyframeRef = this.parseTimelineSelectionRef((String)string2);
            return (animationTimelineKeyframeRef != null && this.equalsNullable(animationTimelineKeyframeRef.rowKey(), string3) ? Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489376194, 17) : Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1227993799, 21)) != 0;
        });
        editorSession.timelineExtraSelectedTicks.clear();
        for (Map.Entry<Integer, Object> entry : shiftedMap.entrySet()) {
            int n27 = this.clampAnimationTimelineTick((Integer)entry.getKey() + n9);
            if (n27 == n2) continue;
            editorSession.timelineExtraSelectedTicks.add(n27);
        }
        this.sanitizeTimelineExtraSelection(editorSession);
        if (linkedHashMap5.size() == Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1663338714, 12)) {
            Map.Entry entry = linkedHashMap5.entrySet().iterator().next();
            int n28 = (Integer)entry.getKey();
            n = (Integer)entry.getValue();
            bl = this.retimeTimelineRuntimeKeyframe(player, editorSession, string, string3, n, n28, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245121, 0) != 0);
        } else {
            bl = this.retimeTimelineRuntimeKeyframes(player, editorSession, string, string3, linkedHashMap5);
        }
        if (!bl) {
            this.renderAnimationTimelineKeyframes(player, editorSession, string);
            linkedHashMap5.clear();
            for (int n29 : list) {
                n = this.clampAnimationTimelineTick(n29 + n9);
                linkedHashMap5.put(n, n);
            }
        }
        editorSession.timelineKeyframeDragTickByLogicalTick.clear();
        editorSession.timelineKeyframeDragTickByLogicalTick.putAll(linkedHashMap5);
        editorSession.timelineKeyframeDragTickByRef.clear();
        for (Map.Entry<Integer, Integer> entry : linkedHashMap5.entrySet()) {
            String string11;
            if (entry == null || (string11 = this.buildAnimationTimelineKeyframeRef(string3, entry.getKey())).isBlank()) continue;
            editorSession.timelineKeyframeDragTickByRef.put(string11, entry.getValue());
        }
        editorSession.timelineKeyframeDragRuntimeTick = editorSession.timelineKeyframeDragTickByLogicalTick.size() == Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1922093560, 5) ? editorSession.timelineKeyframeDragTickByLogicalTick.values().iterator().next() : Xqedii_32drtqx.Xqedii_3h0mif43akudp(-647813992, 4);
        editorSession.timelineKeyframeDragMutated = (Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1922093560, 5)) != 0;
        this.updateTimelineSliderVisual(player, editorSession, n2);
        editorSession.timelineRenderedSignature = this.buildTimelineRenderedSignature(editorSession, string);
        if (shiftedMap.size() <= Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489261506, 14)) {
            this.applyTimelinePositionPreview(player, editorSession);
            this.updateEditorPropertiesSidebar(player, editorSession);
        }
    }

    public boolean canShiftTimelineKeyframes(Map<String, Object> map, List<Integer> list, int n) {
        if (((-1984596074 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (map == null || list == null || list.isEmpty() || n == 0) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-744788764, 9) != 0;
        }
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        for (Integer object2 : list) {
            if (object2 == null) continue;
            linkedHashSet.add(this.clampAnimationTimelineTick(object2));
        }
        if (linkedHashSet.isEmpty()) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 21) != 0;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            int n2 = (Integer)iterator.next();
            int n3 = n2 + n;
            if (n3 < 0 || n3 > Xqedii_32drtqx.Xqedii_ffzx1ycco61l(901611426, 7)) {
                return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(770215279, 21) != 0;
            }
            if (!linkedHashSet2.add(n3)) {
                return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1762376009, 20) != 0;
            }
            if (linkedHashSet.contains(n3) || !this.containsAnimationTimelineTick(map, n3)) continue;
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 9) != 0;
        }
        return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-911788323, 2) != 0;
    }

    public boolean retimeTimelineRuntimeKeyframes(Player player, EditorSession editorSession, String string, String string2, Map<Integer, Integer> map) {
        if ((929897633 * 929897633 + 929897633 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (map == null || map.isEmpty()) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-613996900, 20) != 0;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry == null) continue;
            int n = this.clampAnimationTimelineTick(entry.getKey());
            int n2 = this.clampAnimationTimelineTick(entry.getValue());
            if (this.retimeTimelineRuntimeKeyframe(player, editorSession, string, string2, n2, n, Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 10) != 0)) continue;
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 2) != 0;
        }
        return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 25) != 0;
    }

    public boolean handleAnimationTimelineClick(Player player, EditorSession editorSession, double d, double d2) {
        int n;
        if ((161994843 * 161994843 - 161994843 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || editorSession.activeTool != EditorTool.ANIMATION) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1922093592, 5) != 0;
        }
        if (this.handleTimelineContextDropdownClick(player, editorSession, d, d2)) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1377451759, 10) != 0;
        }
        boolean bl = this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("iEEdLIC7rqnbpEenqJDMXNx23HahvYnt0d95iA+6zQFFNFAXhzoZWdWLgaw4hG9/6zh76BltE7BY8yisUM11bQ=="), d, d2);
        int n2 = this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("yvvrqMxtkx+d/fXAKOmZyb+aIeQJw2I+WjhPuYquidxUyp5okXw4cfPIh+76JGn4TIC6MjvNio0s1XULKJZD4J62PehkKKgXxYs="), d, d2) || this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("KxDWL0p0rUjFxjpskk6NVmWVjwivMmJ2ZpfUdkeknkPs5R7LkiFUfEN2ypjpRftePj5lWBDGuRg31PrpEyPd/GpybKxQzxxtYly13WMZdFktjHn7KEn7qBGG5Kc="), d, d2) || this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Bgd+P04NcpQVC/8dzw2vtYEc8dGaQHOGAPBKcSg9ny+TVArrrpLJ/6Nf0aZh8OJu4MWTGL/9+sQKiP9gxwrLpavye2YCU1n+hp2Z3gF6n1CvFQrgt5OWCAJhXOHExQ=="), d, d2) ? Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 15) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 9);
        boolean bl2 = this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("GXnSESzWVhPtKtfOoJ9DcGAoe3Im/NuRd6+yw+ETRm8GdfOgCUCG0pt81d/4JsS4SNxcOn108/3moJ+cMumZ2SGcvoIrcKZ0T5PW3ogweziO6t60V1YFeA=="), d, d2);
        boolean bl3 = this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("PhqtbEUA+MUYOWOoYPZMG9MmIoGPYVYf6jzVbh1wiVo9PsQD6T9gzLcjuavnJ7hXjt71CXeE1igPx2/ixzEphWIxn0PgKg8pXUFM8EvSCWiZJJeovlVOJg=="), d, d2);
        boolean bl4 = this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Ev5kjQPHdXVEo1bZe0qfFRLC5YszLZyd5DQANima1OVbn99bvD/sFphKLskjFdAWgbT2f5ZEW7P9OpkI+qGC3L9EpD7j9aryHhVoTCzG322O9Q=="), d, d2);
        boolean bl5 = this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Y5O3VP1Sym7Ys4RF8QeirQ/aGtRZkJaOCL+Wg5mnnDIeeKOMQHJ8f0Ne8t96AjE3IgpjOij6a8AztyX6E3PZMxu9mPro6TMvQ3N93/7T2ZM="), d, d2);
        int n3 = n = this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("KFOxYUqZPrRgCEAyGxV4j0CgsC8KJaeGuUwTqANRCiBsOge5QW80j3f23HJtm1oae3FHkkpWZ+iYWcJqrawY+VH/MaXG8B8TfuvTkB0EgLY="), d, d2) || this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("9qBoAgSRZoY8oal1W3novWOFx1vpRS2oKHKh/Cca1KtuiXFW4jjXe2hpLpUhLM7aDCmb9n0ZG6fogy0XV6XDqWuhUgAcobV4uvOxLKGOPRs="), d, d2) ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1489576503, 10) : Xqedii_32drtqx.Xqedii_3h0mif43akudp(1775089266, 8);
        if (!(bl || n2 != 0 || bl2 || bl3 || bl4 || bl5 || n != 0)) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 30) != 0;
        }
        this.syncAnimationTimelineUi(player, editorSession);
        String string = this.resolveTimelineEditableTargetId(editorSession);
        EditorNavbarHistoryPart.AnimationTimelineKeyframeRef animationTimelineKeyframeRef = this.resolveTimelineHoveredKeyframe(editorSession, d, d2);
        boolean bl6 = player.isSneaking();
        if (animationTimelineKeyframeRef != null && string != null && editorSession.animationTimelineComponentVisible) {
            this.stopAnimationTimelineSliderDrag(editorSession);
            this.stopAnimationTimelineKeyframeDrag(editorSession, Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1055805979, 26) != 0);
            if (bl6) {
                this.toggleTimelineKeyframeSelection(player, editorSession, string, animationTimelineKeyframeRef.rowKey(), animationTimelineKeyframeRef.tick());
                return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(286973532, 30) != 0;
            }
            double d3 = this.sliderTickToX(editorSession, animationTimelineKeyframeRef.tick());
            editorSession.timelineKeyframeDragStartHitX = d;
            editorSession.timelineKeyframeDragHitOffsetX = Double.isFinite(d3) ? d - d3 : Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-6004511522341853525L, 19));
            boolean bl7 = this.isTimelineKeyframeRefSelected(editorSession, string, animationTimelineKeyframeRef.rowKey(), animationTimelineKeyframeRef.tick());
            this.selectAnimationTimelineKeyframe(player, editorSession, string, animationTimelineKeyframeRef.rowKey(), animationTimelineKeyframeRef.tick(), Xqedii_32drtqx.Xqedii_3h0mif43akudp(-421807820, 15) != 0, bl7);
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1556353986, 26) != 0;
        }
        if (n2 != 0) {
            this.clearTimelineSelectedKeyframeOnPanelClick(player, editorSession, string);
            editorSession.pendingPropertyField = null;
            this.stopOpacitySliderDrag(editorSession, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1355027394, 27) != 0);
            this.resetSidebarFieldDrag(player, editorSession);
            this.stopAnimationTimelineKeyframeDrag(editorSession, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489376194, 17) != 0);
            editorSession.moveDragActive = (Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 6)) != 0;
            editorSession.previewPanActive = (Xqedii_32drtqx.Xqedii_ffzx1ycco61l(901560226, 7)) != 0;
            editorSession.marqueeSelectActive = (Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1214843834, 12)) != 0;
            editorSession.activeHandle = null;
            editorSession.resizeAnchorValid = (Xqedii_32drtqx.Xqedii_ffzx1ycco61l(2049137611, 27)) != 0;
            editorSession.handlesCollapsed = (Xqedii_32drtqx.Xqedii_3h0mif43akudp(-613996900, 20)) != 0;
            if (string != null && !string.isBlank() && this.isAnimationTimelineImageGroupRoot(editorSession, string)) {
                this.rerenderTimelineSelectionTarget(player, editorSession, string);
            }
            editorSession.animationTimelineSliderDragActive = (Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1540063779, 11)) != 0;
            this.updateAnimationTimelineSliderDrag(player, editorSession, d);
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1687231277, 17) != 0;
        }
        if (string == null || !editorSession.animationTimelineComponentVisible) {
            return bl;
        }
        if (bl2) {
            this.stopAnimationTimelineKeyframeDrag(editorSession, Xqedii_32drtqx.Xqedii_3h0mif43akudp(-911788323, 2) != 0);
            this.addAnimationTimelineKeyframe(player, editorSession, string, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("AlPY20ZiSsKHZHepm7m2vR9gsG45kxcO0s7ePxjMRcnXk0/S0f9XDKwAo1o="));
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-2111611957, 27) != 0;
        }
        if (bl3) {
            this.stopAnimationTimelineKeyframeDrag(editorSession, Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 12) != 0);
            this.addAnimationTimelineKeyframe(player, editorSession, string, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lVyLqZ0/l42NHS2Z4u8jaugWB4pabPNyLAKoAr7n6uc/FLCXzHscKW2vd90="));
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 17) != 0;
        }
        if (bl4) {
            this.stopAnimationTimelineKeyframeDrag(editorSession, Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 8) != 0);
            this.addAnimationTimelineKeyframe(player, editorSession, string, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("R1YSngvbwI50UhU8FNC0NrXgVRxJfbUMfTvw+2OgFwesfDq3Xg8="));
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1761327433, 20) != 0;
        }
        if (bl5) {
            this.stopAnimationTimelineKeyframeDrag(editorSession, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489244610, 9) != 0);
            this.addAnimationTimelineKeyframe(player, editorSession, string, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("I1vZiTUQBfDtQxGQtDrYmY6jBftQU/Kf94ejXFqvcZKUJZRGrtg/U181"));
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-296928842, 29) != 0;
        }
        if (n != 0) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1865287821, 13) != 0;
        }
        this.stopAnimationTimelineKeyframeDrag(editorSession, Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1147894128, 0) != 0);
        this.clearTimelineSelectedKeyframeOnPanelClick(player, editorSession, string);
        return bl;
    }

    public boolean handleTimelineContextClick(Player player, EditorSession editorSession, double d, double d2) {
        EditorNavbarHistoryPart.AnimationTimelineKeyframeRef animationTimelineKeyframeRef;
        int n;
        if ((0xC034A7E ^ 0xC034A7E) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || editorSession.activeTool != EditorTool.ANIMATION) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 26) != 0;
        }
        double d3 = editorSession.shellHitX(d);
        double d4 = editorSession.shellHitY(d2);
        int n2 = n = this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("iEEdLIC7rqnbpEenqJDMXNx23HahvYnt0d95iA+6zQFFNFAXhzoZWdWLgaw4hG9/6zh76BltE7BY8yisUM11bQ=="), d, d2) || this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("iEEdLIC7rqnbpEenqJDMXNx23HahvYnt0d95iA+6zQFFNFAXhzoZWdWLgaw4hG9/6zh76BltE7BY8yisUM11bQ=="), d3, d4) ? Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-880663717, 19) : Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 23);
        if (n == 0) {
            this.closeTimelineContextDropdowns(player, editorSession);
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 4) != 0;
        }
        this.syncAnimationTimelineUi(player, editorSession);
        String string = this.resolveTimelineEditableTargetId(editorSession);
        if (string == null || !editorSession.animationTimelineComponentVisible) {
            this.closeTimelineContextDropdowns(player, editorSession);
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489247170, 11) != 0;
        }
        String string2 = this.resolveHoveredTimelineKeyframeDropdownTargetId(editorSession, d, d2);
        if (!string2.isBlank()) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(143486766, 29) != 0;
        }
        String string3 = this.resolveHoveredTimelineTimelineDropdownTargetId(editorSession, d, d2);
        if (!string3.isBlank()) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-880663717, 19) != 0;
        }
        if (editorSession.keyframeDropdownVisible && (this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("s/+mNge5dGyTx+3JdV6Knn/sMQfdyaCDp6PkylZTbaf6YHm20fcVHRC3RW4nU9iBbOYr3A9yORFFzgD13Kw="), d3, d4) || this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("s/+mNge5dGyTx+3JdV6Knn/sMQfdyaCDp6PkylZTbaf6YHm20fcVHRC3RW4nU9iBbOYr3A9yORFFzgD13Kw="), d, d2)) || editorSession.keyframeTimelineDropdownVisible && (this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("VQItJ7psH0dyMYkDRrhr/LO28H4CH1rKr77FVmr5i3oN1jG6WhE/8+2IgTFS6VErPzIQds/X3gTfj0yon8y+wnn4WbX82VsGQk+4P0F0iIY="), d3, d4) || this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("VQItJ7psH0dyMYkDRrhr/LO28H4CH1rKr77FVmr5i3oN1jG6WhE/8+2IgTFS6VErPzIQds/X3gTfj0yon8y+wnn4WbX82VsGQk+4P0F0iIY="), d, d2))) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1055805979, 26) != 0;
        }
        this.setFileDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_3h0mif43akudp(1919536566, 0) != 0);
        this.setEditDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1122914843, 26) != 0);
        this.setSelectionDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_3h0mif43akudp(-641095882, 26) != 0);
        this.setLayerDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 29) != 0);
        this.setWindowDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 26) != 0);
        if (editorSession.cursorActionsDropdownVisible) {
            this.setCursorActionsDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 14) != 0);
        }
        if (editorSession.cursorActionsEditDropdownVisible) {
            this.setCursorActionsEditDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_3h0mif43akudp(1840485198, 19) != 0);
        }
        if ((animationTimelineKeyframeRef = this.resolveTimelineHoveredKeyframe(editorSession, d, d2)) != null) {
            this.stopAnimationTimelineSliderDrag(editorSession);
            this.stopAnimationTimelineKeyframeDrag(editorSession, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(658238526, 31) != 0);
            boolean bl = this.isTimelineKeyframeRefSelected(editorSession, string, animationTimelineKeyframeRef.rowKey(), animationTimelineKeyframeRef.tick());
            this.selectAnimationTimelineKeyframe(player, editorSession, string, animationTimelineKeyframeRef.rowKey(), animationTimelineKeyframeRef.tick(), Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1687362349, 17) != 0, bl);
            editorSession.animationTimelineContextTargetId = string;
            editorSession.animationTimelineContextRow = animationTimelineKeyframeRef.rowKey();
            editorSession.animationTimelineContextTick = this.clampAnimationTimelineTick(animationTimelineKeyframeRef.tick());
            if (editorSession.keyframeTimelineDropdownVisible) {
                this.setTimelineTimelineDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_ffzx1ycco61l(296609213, 2) != 0);
            }
            this.setTimelineKeyframeDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489376194, 17) != 0);
            this.moveTimelineContextDropdownTo(player, editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("s/+mNge5dGyTx+3JdV6Knn/sMQfdyaCDp6PkylZTbaf6YHm20fcVHRC3RW4nU9iBbOYr3A9yORFFzgD13Kw="), d, d2);
            this.updateTimelineKeyframeDropdownHover(player, editorSession, d, d2);
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1522799554, 25) != 0;
        }
        String string4 = this.resolveTimelineContextRowByHit(editorSession, d, d2);
        if (string4.isBlank()) {
            this.closeTimelineContextDropdowns(player, editorSession);
            this.clearTimelineSelectedKeyframeOnPanelClick(player, editorSession, string);
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-220165930, 17) != 0;
        }
        this.closeTimelineContextDropdowns(player, editorSession);
        this.clearTimelineSelectedKeyframeOnPanelClick(player, editorSession, string);
        if (!this.hasTimelineKeyframeClipboard(editorSession)) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 7) != 0;
        }
        editorSession.animationTimelineContextTargetId = string;
        editorSession.animationTimelineContextRow = string4;
        editorSession.animationTimelineContextTick = this.sliderXToTick(editorSession, d);
        this.setTimelineTimelineDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_3h0mif43akudp(-455894162, 1) != 0);
        this.moveTimelineContextDropdownTo(player, editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("VQItJ7psH0dyMYkDRrhr/LO28H4CH1rKr77FVmr5i3oN1jG6WhE/8+2IgTFS6VErPzIQds/X3gTfj0yon8y+wnn4WbX82VsGQk+4P0F0iIY="), d, d2);
        this.updateTimelineTimelineDropdownHover(player, editorSession, d, d2);
        return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-843615639, 16) != 0;
    }

    public boolean handleTimelineContextDropdownClick(Player player, EditorSession editorSession, double d, double d2) {
        String string;
        if ((1139699668 * 1139699668 - 1139699668 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(920242599, 18) != 0;
        }
        double d3 = editorSession.shellHitX(d);
        double d4 = editorSession.shellHitY(d2);
        if (editorSession.keyframeDropdownVisible) {
            string = this.resolveHoveredTimelineKeyframeDropdownTargetId(editorSession, d, d2);
            if (!string.isBlank()) {
                this.setTimelineKeyframeDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_3h0mif43akudp(-421840588, 15) != 0);
                this.playEditorSfx(player, editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("7yJZyQMYzAhGlTicByEr2dY6Xb5YU37CdHbIbye8cfrxsNvNNNljF1g3ly+kCYWJ+LWTRJXJEIF7OSRLn5rQ657cLVN/3A=="));
                this.handleTimelineContextDropdownAction(player, editorSession, string, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 9) != 0);
                return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 5) != 0;
            }
            if (this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("s/+mNge5dGyTx+3JdV6Knn/sMQfdyaCDp6PkylZTbaf6YHm20fcVHRC3RW4nU9iBbOYr3A9yORFFzgD13Kw="), d3, d4) || this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("s/+mNge5dGyTx+3JdV6Knn/sMQfdyaCDp6PkylZTbaf6YHm20fcVHRC3RW4nU9iBbOYr3A9yORFFzgD13Kw="), d, d2)) {
                return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1214839738, 12) != 0;
            }
            this.setTimelineKeyframeDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1540061731, 11) != 0);
        }
        if (editorSession.keyframeTimelineDropdownVisible) {
            string = this.resolveHoveredTimelineTimelineDropdownTargetId(editorSession, d, d2);
            if (!string.isBlank()) {
                this.setTimelineTimelineDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 16) != 0);
                this.playEditorSfx(player, editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("7yJZyQMYzAhGlTicByEr2dY6Xb5YU37CdHbIbye8cfrxsNvNNNljF1g3ly+kCYWJ+LWTRJXJEIF7OSRLn5rQ657cLVN/3A=="));
                this.handleTimelineContextDropdownAction(player, editorSession, string, Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245130, 3) != 0);
                return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245154, 5) != 0;
            }
            if (this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("VQItJ7psH0dyMYkDRrhr/LO28H4CH1rKr77FVmr5i3oN1jG6WhE/8+2IgTFS6VErPzIQds/X3gTfj0yon8y+wnn4WbX82VsGQk+4P0F0iIY="), d3, d4) || this.isInsideShellBlock(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("VQItJ7psH0dyMYkDRrhr/LO28H4CH1rKr77FVmr5i3oN1jG6WhE/8+2IgTFS6VErPzIQds/X3gTfj0yon8y+wnn4WbX82VsGQk+4P0F0iIY="), d, d2)) {
                return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1187715365, 31) != 0;
            }
            this.setTimelineTimelineDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_3h0mif43akudp(1936563354, 14) != 0);
        }
        return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1214843834, 12) != 0;
    }

    /*
     * Exception decompiling
     */
    public boolean handleTimelineContextDropdownAction(Player player, EditorSession editorSession, String action, boolean timelineDropdown) {
        if (player == null || editorSession == null || action == null) {
            return false;
        }
        switch (action) {
            case "dropdown_keyframe_edit_copy":
                return this.copyTimelineSelectedKeyframe(editorSession);
            case "dropdown_keyframe_edit_paste":
                return this.pasteTimelineClipboardToSelectedKeyframe(player, editorSession);
            case "dropdown_keyframe_delete":
                return this.deleteTimelineSelectedKeyframes(player, editorSession);
            case "dropdown_keyframe_properties":
                this.setRightSidebarTab(player, editorSession, EditorSidebarTab.PROPERTIES, true);
                this.updateEditorPropertiesSidebar(player, editorSession);
                return true;
            case "dropdown_keyframe_timeline_paste":
                return this.pasteTimelineClipboardToContext(player, editorSession);
            default:
                return false;
        }
    }

    public boolean isTimelineHierarchyChildTarget(EditorSession editorSession, String string, String string2) {
        if ((0x138C91C0 ^ 0x138C91C0) != 0) {
            throw new IllegalStateException();
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1490293698, 20)];
        stringArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)1840485198, (int)19)] = string;
        String string3 = this.firstNonBlank(stringArray);
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489769410, 19)];
        stringArray2[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)-641095882, (int)26)] = string2;
        String string4 = this.firstNonBlank(stringArray2);
        if (string3.isBlank() || string4.isBlank() || this.equalsNullable(string3, string4)) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 22) != 0;
        }
        if (string3.startsWith(EditorTimelineKeyframePart.Xqedii_1cy0nfhookeiv(string4))) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 15) != 0;
        }
        String string5 = this.resolveTimelineHierarchyTargetPath(editorSession, string3);
        String string6 = this.resolveTimelineHierarchyTargetPath(editorSession, string4);
        if (string5.isBlank() || string6.isBlank() || this.equalsNullable(string5, string6)) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1122914843, 26) != 0;
        }
        return string5.startsWith(EditorTimelineKeyframePart.Xqedii_3uf1nf6igc6v3(string6));
    }

    @Override
    public String resolveTimelineHierarchyTargetPath(EditorSession editorSession, String string) {
        if (((0x190541DD | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 13)];
        stringArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)2)] = string;
        String string2 = this.firstNonBlank(stringArray);
        if (string2.isBlank() || editorSession == null) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
        }
        String string3 = this.resolveRawTargetPathByTargetId(editorSession, string2);
        if (!string3.isBlank()) {
            return string3;
        }
        HoverElement hoverElement = this.findFirstByTargetId(editorSession, string2);
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1128783307, 15)];
        stringArray2[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)11)] = hoverElement == null ? null : hoverElement.targetPath;
        String string4 = this.firstNonBlank(stringArray2);
        if (!string4.isBlank()) {
            return string4;
        }
        if (editorSession.renderBlocks != null) {
            for (Map<String, Object> map : editorSession.renderBlocks) {
                if (map == null || map.isEmpty()) continue;
                String[] stringArray3 = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(887544761, 7)];
                stringArray3[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)23)] = this.stringValue(this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("LBGlkNk/+xioDE1MLuO5/wu4E9I3tByTa+Tv5CcRi+xMeSct1WA8SFASiuJmVUmg6wAfsBWMMc0cj7enpRGEJQ==")));
                String string5 = this.firstNonBlank(stringArray3);
                if (!this.equalsNullable(string5, string2)) continue;
                String[] stringArray4 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-2026116034, 29)];
                stringArray4[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)12)] = this.stringValue(this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("5K+y8/Jh0TBChR3rzns9bYFO8zCSePk5nCzw3xNmqfRtgRL1YCNpqfsbaIdbnKnnvJqgUcmbx4o0b+X7ssrRCIml/m8=")));
                String string6 = this.firstNonBlank(stringArray4);
                if (string6.isBlank()) continue;
                return string6;
            }
        }
        return this.resolveRawMapAtPath(editorSession.rawBlocks, string2) != null ? string2 : Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
    }

    public String resolveSidebarGroupRootTarget(EditorSession editorSession, String string) {
        if ((2065953701 * 2065953701 - 2065953701 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1360715356, 30)];
        stringArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)1295627982, (int)5)] = this.resolveTimelineHierarchyTargetPath(editorSession, string);
        stringArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)450780177, (int)6)] = string;
        String string2 = this.resolveTimelineImageGroupRootPath(editorSession, this.firstNonBlank(stringArray));
        if (!string2.isBlank() && this.isAnimationTimelineImageGroupRoot(editorSession, string2)) {
            return string2;
        }
        if (this.isAnimationTimelineImageGroupRoot(editorSession, string)) {
            return string;
        }
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
    }

    /*
     * Exception decompiling
     */
    public String nextTimelineInterpMode(String var1_1) {
        String string = this.normalizeTimelineInterpMode(var1_1);
        String[] stringArray = new String[]{"linear", "smooth", "ease-in", "ease-out", "bezier", "bounce", "bounce-in", "bounce-out", "back", "back-in", "back-out"};
        for (int n = 0; n < stringArray.length; ++n) {
            if (stringArray[n].equals(string)) {
                return stringArray[(n + 1) % stringArray.length];
            }
        }
        return "linear";
    }

    /*
     * Exception decompiling
     */
    public String normalizeTimelineInterpMode(String var1_1) {
        if (var1_1 == null || var1_1.isBlank()) {
            return "linear";
        }
        String string = var1_1.trim().toLowerCase(Locale.ROOT).replace("-", "").replace("_", "").replace(" ", "");
        return switch (string) {
            case "linear", "none", "default" -> "linear";
            case "smooth", "ease", "easeinout", "smoothinout" -> "smooth";
            case "easein", "in" -> "ease-in";
            case "easeout", "out" -> "ease-out";
            case "bezier", "cubicbezier" -> "bezier";
            case "bounce" -> "bounce";
            case "bouncein" -> "bounce-in";
            case "bounceout" -> "bounce-out";
            case "back" -> "back";
            case "backin" -> "back-in";
            case "backout" -> "back-out";
            default -> "linear";
        };
    }

    /*
     * Exception decompiling
     */
    public String formatTimelineInterpMode(String var1_1) {
        return switch (this.normalizeTimelineInterpMode(var1_1)) {
            case "smooth" -> "Smooth";
            case "ease-in" -> "Ease In";
            case "ease-out" -> "Ease Out";
            case "bezier" -> "Bezier";
            case "bounce" -> "Bounce";
            case "bounce-in" -> "Bounce In";
            case "bounce-out" -> "Bounce Out";
            case "back" -> "Back";
            case "back-in" -> "Back In";
            case "back-out" -> "Back Out";
            default -> "Linear";
        };
    }

    public String resolveTimelineKeyframeInterpMode(Map<String, Object> map, int n) {
        if ((0xDB96A718 ^ 0xDB96A718) != 0) {
            throw new IllegalStateException();
        }
        Object object = this.readAnimationTimelineTickValue(map, n);
        if (!(object instanceof Map)) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nXYvfZSGxemQEmO/e5+4WvwHS22qtnyaT0ly/6z5FOutiq21ovr3Aw==");
        }
        Map map2 = (Map)object;
        Map map3 = map2;
        return this.normalizeTimelineInterpMode(this.stringValue(map3.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("bwFAGpWXwi6lwkcpJitQZKkLcJ5ndfG1lwgQXbg5cD4H3dZMj/X+P/91/3II+0O8uNV0l+RY"))));
    }

    public String resolveTimelineKeyframeInterpMode(EditorSession editorSession, String string, String string2, int n) {
        if ((1761463491 * 1761463491 + 1761463491 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank() || string2 == null || string2.isBlank()) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nXYvfZSGxemQEmO/e5+4WvwHS22qtnyaT0ly/6z5FOutiq21ovr3Aw==");
        }
        Map<String, Object> map = this.resolveRawTargetByTargetId(editorSession, string);
        Map<String, Object> map2 = this.readAnimationTimelineRowMap(map, string2);
        return this.resolveTimelineKeyframeInterpMode(map2, n);
    }

    /*
     * Exception decompiling
     */
    public String resolveTimelineKeyframeGlyph(EditorSession var1_1, String var2_2, String var3_3, int var4_4) {
        String string = this.resolveTimelineKeyframeInterpMode(var1_1, var2_2, var3_3, var4_4);
        return switch (string) {
            case "smooth" -> "◆";
            case "ease-in" -> "◀";
            case "ease-out" -> "▶";
            case "bezier" -> "◇";
            case "bounce" -> "■";
            case "bounce-in" -> "▲";
            case "bounce-out" -> "▼";
            case "back" -> "○";
            case "back-in" -> "△";
            case "back-out" -> "▽";
            default -> "●";
        };
    }

    public Map<Integer, String> readTimelineInterpModes(EditorSession editorSession, String string, String string2) {
        if ((-2051959319 * -2051959319 + -2051959319 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank() || string2 == null || string2.isBlank()) {
            return Collections.emptyMap();
        }
        Map<String, Object> map = this.resolveRawTargetByTargetId(editorSession, string);
        Map<String, Object> map2 = this.readAnimationTimelineRowMap(map, string2);
        if (map2 == null || map2.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            Map map3;
            double d;
            if (entry == null || entry.getKey() == null || !Double.isFinite(d = this.parseDouble(entry.getKey(), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(763628800931000132L, 7))))) continue;
            int n = this.clampAnimationTimelineTick((int)Math.round(d));
            Map<String, Object> map4 = (Map<String, Object>) entry.getValue();
            if (!(map4 instanceof Map) || (map4 = this.toStringObjectMap(map3 = (Map)map4)) == null || map4.isEmpty()) continue;
            String string3 = this.normalizeTimelineInterpMode(this.stringValue(map4.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("bwFAGpWXwi6lwkcpJitQZKkLcJ5ndfG1lwgQXbg5cD4H3dZMj/X+P/91/3II+0O8uNV0l+RY"))));
            if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nXYvfZSGxemQEmO/e5+4WvwHS22qtnyaT0ly/6z5FOutiq21ovr3Aw==").equals(string3)) continue;
            treeMap.put(n, string3);
        }
        return treeMap;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setTimelineKeyframeDropdownVisible(Player player, EditorSession editorSession, boolean bl) {
        if ((1933130525 * 1933130525 + 1933130525 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return;
        }
        if (bl && editorSession.keyframeTimelineDropdownVisible) {
            this.setTimelineTimelineDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_ffzx1ycco61l(593218426, 3) != 0);
        }
        if (editorSession.keyframeDropdownVisible == bl) {
            if (bl) {
                this.updateTimelineKeyframeDropdownHover(player, editorSession, editorSession.cursorX + editorSession.hitboxOffsetX, editorSession.cursorY + editorSession.hitboxOffsetY);
            }
            return;
        }
        double d = editorSession.cursorX + editorSession.hitboxOffsetX;
        double d2 = editorSession.cursorY + editorSession.hitboxOffsetY;
        if (bl) {
            this.moveTimelineContextDropdownTo(player, editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("s/+mNge5dGyTx+3JdV6Knn/sMQfdyaCDp6PkylZTbaf6YHm20fcVHRC3RW4nU9iBbOYr3A9yORFFzgD13Kw="), d, d2);
        }
        editorSession.keyframeDropdownVisible = bl;
        if (!bl) {
            editorSession.keyframeDropdownHoverTargetId = null;
        } else {
            this.playEditorSfx(player, editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("NSyZiaiQ7z6UbDjVQTBt/9NIBY8bteY3EwiE2BMMg9A58D0LRnI9Njux9qlra8tmw/W/LTgIMhkZkA=="));
        }
        this.beginShellOpacityBatch(editorSession);
        try {
            this.setSidebarPanelVisible(player, editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("s/+mNge5dGyTx+3JdV6Knn/sMQfdyaCDp6PkylZTbaf6YHm20fcVHRC3RW4nU9iBbOYr3A9yORFFzgD13Kw="), bl);
        }
        finally {
            this.endShellOpacityBatch(player, editorSession);
        }
        if (!bl) {
            for (String string : Xqedii_bwmwn2k.Xqedii_3idczgq) {
                this.setTimelineKeyframeDropdownItemVisual(player, editorSession, string, Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1922093592, 5) != 0);
            }
            return;
        }
        this.updateTimelineKeyframeDropdownHover(player, editorSession, d, d2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setTimelineTimelineDropdownVisible(Player player, EditorSession editorSession, boolean bl) {
        if (((0xB430DBB6 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return;
        }
        if (bl && editorSession.keyframeDropdownVisible) {
            this.setTimelineKeyframeDropdownVisible(player, editorSession, Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 28) != 0);
        }
        if (editorSession.keyframeTimelineDropdownVisible == bl) {
            if (bl) {
                this.updateTimelineTimelineDropdownHover(player, editorSession, editorSession.cursorX + editorSession.hitboxOffsetX, editorSession.cursorY + editorSession.hitboxOffsetY);
            }
            return;
        }
        double d = editorSession.cursorX + editorSession.hitboxOffsetX;
        double d2 = editorSession.cursorY + editorSession.hitboxOffsetY;
        if (bl) {
            this.moveTimelineContextDropdownTo(player, editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("VQItJ7psH0dyMYkDRrhr/LO28H4CH1rKr77FVmr5i3oN1jG6WhE/8+2IgTFS6VErPzIQds/X3gTfj0yon8y+wnn4WbX82VsGQk+4P0F0iIY="), d, d2);
        }
        editorSession.keyframeTimelineDropdownVisible = bl;
        if (!bl) {
            editorSession.keyframeTimelineDropdownHoverTargetId = null;
        } else {
            this.playEditorSfx(player, editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("NSyZiaiQ7z6UbDjVQTBt/9NIBY8bteY3EwiE2BMMg9A58D0LRnI9Njux9qlra8tmw/W/LTgIMhkZkA=="));
        }
        this.beginShellOpacityBatch(editorSession);
        try {
            this.setSidebarPanelVisible(player, editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("VQItJ7psH0dyMYkDRrhr/LO28H4CH1rKr77FVmr5i3oN1jG6WhE/8+2IgTFS6VErPzIQds/X3gTfj0yon8y+wnn4WbX82VsGQk+4P0F0iIY="), bl);
        }
        finally {
            this.endShellOpacityBatch(player, editorSession);
        }
        if (!bl) {
            for (String string : Xqedii_bwmwn2k.Xqedii_345dvmi) {
                this.setTimelineTimelineDropdownItemVisual(player, editorSession, string, Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1282191763, 27) != 0);
            }
            return;
        }
        this.updateTimelineTimelineDropdownHover(player, editorSession, d, d2);
    }

    public void updateTimelineKeyframeDropdownHover(Player player, EditorSession editorSession, double d, double d2) {
        String string;
        if (((1632505466 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return;
        }
        String string2 = string = editorSession.keyframeDropdownVisible ? this.resolveHoveredTimelineKeyframeDropdownTargetId(editorSession, d, d2) : Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
        if (this.equalsNullable(editorSession.keyframeDropdownHoverTargetId, string)) {
            return;
        }
        editorSession.keyframeDropdownHoverTargetId = string;
        for (String string3 : Xqedii_bwmwn2k.Xqedii_3idczgq) {
            this.setTimelineKeyframeDropdownItemVisual(player, editorSession, string3, this.equalsNullable(string3, string));
        }
    }

    public void updateTimelineTimelineDropdownHover(Player player, EditorSession editorSession, double d, double d2) {
        String string;
        if ((1980931926 * (1980931926 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return;
        }
        String string2 = string = editorSession.keyframeTimelineDropdownVisible ? this.resolveHoveredTimelineTimelineDropdownTargetId(editorSession, d, d2) : Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
        if (this.equalsNullable(editorSession.keyframeTimelineDropdownHoverTargetId, string)) {
            return;
        }
        editorSession.keyframeTimelineDropdownHoverTargetId = string;
        for (String string3 : Xqedii_bwmwn2k.Xqedii_345dvmi) {
            this.setTimelineTimelineDropdownItemVisual(player, editorSession, string3, this.equalsNullable(string3, string));
        }
    }

    public void updateTimelineTimelineDropdownHover(EditorSession editorSession, double d, double d2) {
        if ((0x830F33DF ^ 0x830F33DF) != 0) {
            throw new IllegalStateException();
        }
        this.updateTimelineTimelineDropdownHover(null, editorSession, d, d2);
    }

    public boolean isInsideTimelineDropdownRect(EditorRect editorRect, double d, double d2) {
        if ((-317822992 * -317822992 - -317822992 & 1) != 0) {
            throw new IllegalStateException();
        }
        return (editorRect != null && editorRect.contains(d, d2) ? Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1220809666, 28) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 21)) != 0;
    }

    public String resolveHoveredTimelineKeyframeDropdownTargetId(EditorSession editorSession, double d, double d2) {
        if ((2018252142 * 2018252142 - 2018252142 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || !editorSession.keyframeDropdownVisible) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
        }
        double d3 = editorSession.shellHitX(d);
        double d4 = editorSession.shellHitY(d2);
        int n = Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 30);
        for (String string : Xqedii_bwmwn2k.Xqedii_3idczgq) {
            String string2 = EditorTimelineKeyframePart.Xqedii_123ntdchfhbez(string);
            EditorRect editorRect = this.findShellBlockRect(editorSession, string2);
            if (editorRect == null) continue;
            ++n;
            if (!this.isInsideTimelineDropdownRect(editorRect, d3, d4)) continue;
            return string;
        }
        if (n == Xqedii_bwmwn2k.Xqedii_3idczgq.size()) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
        }
        EditorRect editorRect = this.findShellBlockRect(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("s/+mNge5dGyTx+3JdV6Knn/sMQfdyaCDp6PkylZTbaf6YHm20fcVHRC3RW4nU9iBbOYr3A9yORFFzgD13Kw="));
        if (editorRect != null) {
            int n2;
            double d5 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-2450106487666138423L, 42));
            if (this.isInsideTimelineDropdownRect(editorRect, d3, d4) && (n2 = (int)Math.floor((d4 - editorRect.y) / Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(8238726757533529736L, 2)))) >= 0 && n2 < Xqedii_bwmwn2k.Xqedii_3idczgq.size()) {
                return Xqedii_bwmwn2k.Xqedii_3idczgq.get(n2);
            }
        }
        for (String string2 : Xqedii_bwmwn2k.Xqedii_3idczgq) {
            if (!this.isInsideShellBlock(editorSession, string2, d3, d4)) continue;
            return string2;
        }
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
    }

    public String resolveHoveredTimelineTimelineDropdownTargetId(EditorSession editorSession, double d, double d2) {
        if (((500940880 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || !editorSession.keyframeTimelineDropdownVisible) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
        }
        double d3 = editorSession.shellHitX(d);
        double d4 = editorSession.shellHitY(d2);
        int n = Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 17);
        for (String string : Xqedii_bwmwn2k.Xqedii_345dvmi) {
            String string2 = EditorTimelineKeyframePart.Xqedii_3vh42dbyskd6j(string);
            EditorRect editorRect = this.findShellBlockRect(editorSession, string2);
            if (editorRect == null) continue;
            ++n;
            if (!this.isInsideTimelineDropdownRect(editorRect, d3, d4)) continue;
            return string;
        }
        if (n == Xqedii_bwmwn2k.Xqedii_345dvmi.size()) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
        }
        EditorRect editorRect = this.findShellBlockRect(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("VQItJ7psH0dyMYkDRrhr/LO28H4CH1rKr77FVmr5i3oN1jG6WhE/8+2IgTFS6VErPzIQds/X3gTfj0yon8y+wnn4WbX82VsGQk+4P0F0iIY="));
        if (editorRect != null) {
            int n2;
            double d5 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(5861324841346605270L, 6));
            if (this.isInsideTimelineDropdownRect(editorRect, d3, d4) && (n2 = (int)Math.floor((d4 - editorRect.y) / Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4285993324205309707L, 51)))) >= 0 && n2 < Xqedii_bwmwn2k.Xqedii_345dvmi.size()) {
                return Xqedii_bwmwn2k.Xqedii_345dvmi.get(n2);
            }
        }
        for (String string2 : Xqedii_bwmwn2k.Xqedii_345dvmi) {
            if (!this.isInsideShellBlock(editorSession, string2, d3, d4)) continue;
            return string2;
        }
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
    }

    public void setTimelineKeyframeDropdownItemVisual(Player player, EditorSession editorSession, String string, boolean bl) {
        if ((269169541 * (269169541 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || string == null || string.isBlank()) {
            return;
        }
        String[] stringArray = Xqedii_bwmwn2k.Xqedii_3rmydoi.get(string);
        if (stringArray != null && stringArray.length >= Xqedii_32drtqx.Xqedii_3h0mif43akudp(959768282, 31)) {
            this.setShellText(player, EditorTimelineKeyframePart.Xqedii_2d7essugxby65(string), bl ? stringArray[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 7)] : stringArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1214106180, 23)]);
        }
        this.setShellColor(player, editorSession, string, bl ? Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("h4jhVkUKeXJ9O43R8VaVT2tpf2vPORvMdKAMnKFSiPyWFix8J9uX7g==") : Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ooCfe+ycHtfE7SBMbkqZYAV56RWCoPvjMbJBWdmyYxk4Fl6+ni9Fug=="));
    }

    public void setTimelineTimelineDropdownItemVisual(Player player, EditorSession editorSession, String string, boolean bl) {
        if ((-2072471259 * (-2072471259 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || string == null || string.isBlank()) {
            return;
        }
        String[] stringArray = Xqedii_bwmwn2k.Xqedii_2c9mwoi.get(string);
        if (stringArray != null && stringArray.length >= Xqedii_32drtqx.Xqedii_ffzx1ycco61l(340178839, 28)) {
            this.setShellText(player, EditorTimelineKeyframePart.Xqedii_8hbsfw5icm2y(string), bl ? stringArray[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 15)] : stringArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-613996900, 20)]);
        }
        this.setShellColor(player, editorSession, string, bl ? Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("h4jhVkUKeXJ9O43R8VaVT2tpf2vPORvMdKAMnKFSiPyWFix8J9uX7g==") : Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ooCfe+ycHtfE7SBMbkqZYAV56RWCoPvjMbJBWdmyYxk4Fl6+ni9Fug=="));
    }

    public void moveTimelineContextDropdownTo(Player player, EditorSession editorSession, String string, double d, double d2) {
        double d3;
        double d4;
        if ((515962091 * 515962091 - 515962091 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || string == null || string.isBlank() || editorSession.shellBlocks == null || editorSession.shellBlocks.isEmpty()) {
            return;
        }
        ConfigurationSection configurationSection = this.findShellBlockSection(editorSession, string);
        EditorRect editorRect = this.findShellBlockRect(editorSession, string);
        if (configurationSection == null || editorRect == null) {
            return;
        }
        double d5 = editorSession.shellHitX(d);
        double d6 = editorSession.shellHitY(d2);
        double d7 = d5;
        double d8 = d6;
        EditorRect editorRect2 = this.findShellBlockRect(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("iEEdLIC7rqnbpEenqJDMXNx23HahvYnt0d95iA+6zQFFNFAXhzoZWdWLgaw4hG9/6zh76BltE7BY8yisUM11bQ=="));
        if (editorRect2 != null) {
            d4 = editorRect2.maxX() - editorRect.width;
            d3 = editorRect2.maxY() - editorRect.height;
            int n = d7 > d4 ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1687231277, 17) : Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-564408038, 14);
            d7 = Math.max(editorRect2.x, Math.min(d4, d7));
            d8 = Math.max(editorRect2.y, Math.min(d3, d8));
            if (n != 0) {
                d7 = Math.max(editorRect2.x, d7 - Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(2436226780288330458L, 60)));
            }
        } else {
            d4 = editorSession.yaml == null ? Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336773619910L, 27)) : editorSession.yaml.getDouble(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("0Ty006nP6Jr1shobqcdZZW80ftINmKtK2fvDmEEeqoMiEzlc6GKNtyJ9nKXu06aQHl+r4A=="), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(2620418733436026863L, 63)));
            d3 = editorSession.yaml == null ? Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-2149153068760601328L, 3)) : editorSession.yaml.getDouble(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("+WIi2knmSb5pYWuYn0Fhz3uw6mjVBBxD14CGXc8d8A9rdQXhI2wjVD4DFnQEdxgjBSeFm50O"), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(128207331331875014L, 0)));
            double d9 = Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336739758278L, 41)), d4 - editorRect.width);
            double d10 = Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-7801361621654597819L, 35)), d3 - editorRect.height);
            int n = d7 > d9 ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(1843174003, 22) : Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 23);
            d7 = Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-4986967988573753750L, 15)), Math.min(d9, d7));
            d8 = Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 40)), Math.min(d10, d8));
            if (n != 0) {
                d7 = Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336739758278L, 52)), d7 - Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169803831607051L, 32)));
            }
        }
        d4 = d7 - editorRect.x;
        d3 = d8 - editorRect.y;
        if (Math.abs(d4) < Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-3344139157359915410L, 17)) && Math.abs(d3) < Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-2866037151672591731L, 5))) {
            return;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1217238579, 24)];
        stringArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)450780113, (int)6)] = configurationSection.getString(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("5K+y8/Jh0TBChR3rzns9bYFO8zCSePk5nCzw3xNmqfRtgRL1YCNpqfsbaIdbnKnnvJqgUcmbx4o0b+X7ssrRCIml/m8="));
        String string2 = this.firstNonBlank(stringArray);
        if (string2.isBlank()) {
            this.moveShellElement(player, editorSession, string, d7, d8, editorRect.width, editorRect.height);
            return;
        }
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        int n = Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 25);
        for (Map<String, Object> map : editorSession.shellBlocks) {
            EditorRect editorRect3;
            String string3;
            ConfigurationSection configurationSection2 = this.mapToSection(map);
            if (configurationSection2 == null || (string3 = this.resolveElementId(configurationSection2, ++n, hashMap)).isBlank()) continue;
            String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(296609217, 2)];
            stringArray2[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)920242599, (int)18)] = configurationSection2.getString(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("5K+y8/Jh0TBChR3rzns9bYFO8zCSePk5nCzw3xNmqfRtgRL1YCNpqfsbaIdbnKnnvJqgUcmbx4o0b+X7ssrRCIml/m8="));
            String string4 = this.firstNonBlank(stringArray2);
            if (!this.belongsToSidebarPanel(string2, string4) || (editorRect3 = this.findShellBlockRect(editorSession, string3)) == null) continue;
            this.moveShellElement(player, editorSession, string3, editorRect3.x + d4, editorRect3.y + d3, editorRect3.width, editorRect3.height);
        }
    }

    public double interpolateTimelineChannel(TreeMap<Integer, Double> treeMap, double d, double d2) {
        if ((996758553 * (996758553 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        return this.interpolateTimelineChannel(treeMap, d, d2, null);
    }

    public double interpolateTimelineChannel(TreeMap<Integer, Double> treeMap, double d, double d2, Map<Integer, String> map) {
        if ((525049390 * (525049390 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        return this.animationTimelineManager.interpolateChannel(treeMap, d, d2, map, this::normalizeTimelineInterpMode, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nXYvfZSGxemQEmO/e5+4WvwHS22qtnyaT0ly/6z5FOutiq21ovr3Aw=="), Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489339330, 8));
    }

    public double[] interpolateTimelineVector2(TreeMap<Integer, double[]> treeMap, double d, double d2, double d3) {
        if ((0xE6ACD943 ^ 0xE6ACD943) != 0) {
            throw new IllegalStateException();
        }
        return this.interpolateTimelineVector2(treeMap, d, d2, d3, null);
    }

    public double[] interpolateTimelineVector2(TreeMap<Integer, double[]> treeMap, double d, double d2, double d3, Map<Integer, String> map) {
        if ((0x9A037ADF ^ 0x9A037ADF) != 0) {
            throw new IllegalStateException();
        }
        return this.animationTimelineManager.interpolateVector2(treeMap, d, d2, d3, map, this::normalizeTimelineInterpMode, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nXYvfZSGxemQEmO/e5+4WvwHS22qtnyaT0ly/6z5FOutiq21ovr3Aw=="), Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300455399, 5));
    }

    public String resolveTimelineSegmentInterpMode(Map<Integer, String> map, Integer n, Integer n2) {
        if ((688048789 * 688048789 - 688048789 & 1) != 0) {
            throw new IllegalStateException();
        }
        return this.animationTimelineManager.resolveSegmentInterpolationMode(map, n, n2, this::normalizeTimelineInterpMode, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nXYvfZSGxemQEmO/e5+4WvwHS22qtnyaT0ly/6z5FOutiq21ovr3Aw=="));
    }

    public double applyTimelineInterp(String string, double d) {
        if ((1841472360 * (1841472360 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        String string2 = this.normalizeTimelineInterpMode(string);
        return Xqedii_2ntqrxd.Xqedii_388ntc2(string2, d);
    }

    public double applyAnimationTimelineBounceOut(double d) {
        if (((0x19DCF6F7 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        return Xqedii_2ntqrxd.Xqedii_za8bpjg(d);
    }

    public double applyAnimationTimelineBounceIn(double d) {
        if ((-2103248254 * -2103248254 - -2103248254 & 1) != 0) {
            throw new IllegalStateException();
        }
        return Xqedii_2ntqrxd.Xqedii_1r6jxs8(d);
    }

    public double applyAnimationTimelineBounceInOut(double d) {
        if ((0x22568486 ^ 0x22568486) != 0) {
            throw new IllegalStateException();
        }
        return Xqedii_2ntqrxd.Xqedii_39nja1n(d);
    }

    public double applyAnimationTimelineBackIn(double d) {
        if ((0x22F54753 ^ 0x22F54753) != 0) {
            throw new IllegalStateException();
        }
        return Xqedii_2ntqrxd.Xqedii_32ods7p(d);
    }

    public double applyAnimationTimelineBackOut(double d) {
        if (((-1076228508 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        return Xqedii_2ntqrxd.Xqedii_16xwht7(d);
    }

    public double applyAnimationTimelineBackInOut(double d) {
        if (((-1751121853 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        return Xqedii_2ntqrxd.Xqedii_15825lu(d);
    }

    public double evaluateTimelineCubicBezier(double d, double d2, double d3, double d4, double d5) {
        if ((0x6AA7BD32 ^ 0x6AA7BD32) != 0) {
            throw new IllegalStateException();
        }
        return Xqedii_2ntqrxd.Xqedii_28k1pw0(d, d2, d3, d4, d5);
    }

    public double cubicBezierValue(double d, double d2, double d3) {
        if (((0x36FF9302 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        return Xqedii_2ntqrxd.Xqedii_34dex8y(d, d2, d3);
    }

    public double cubicBezierDerivative(double d, double d2, double d3) {
        if ((1143142578 * 1143142578 - 1143142578 & 1) != 0) {
            throw new IllegalStateException();
        }
        return Xqedii_2ntqrxd.Xqedii_4jpfc2a(d, d2, d3);
    }

    public TreeMap<Integer, double[]> extractTimelineScalePositionPoints(TreeMap<Integer, double[]> treeMap) {
        if (((-1295575373 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        TreeMap<Integer, double[]> treeMap2 = new TreeMap<Integer, double[]>();
        if (treeMap == null || treeMap.isEmpty()) {
            return treeMap2;
        }
        for (Map.Entry<Integer, double[]> entry : treeMap.entrySet()) {
            if (entry == null || entry.getValue() == null || entry.getValue().length < Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(287876103, 22)) continue;
            double d = entry.getValue()[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1489577527, 10)];
            double d2 = entry.getValue()[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 27)];
            if (!Double.isFinite(d) || !Double.isFinite(d2)) continue;
            double[] dArray = new double[Xqedii_32drtqx.Xqedii_3h0mif43akudp(1830591091, 22)];
            dArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)-744788764, (int)9)] = d;
            dArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1491342274, (int)21)] = d2;
            treeMap2.put(entry.getKey(), dArray);
        }
        return treeMap2;
    }

    public boolean shouldLogTimelineImageDebug(EditorSession editorSession, String string) {
        if ((-2036327101 * -2036327101 + -2036327101 & 1) != 0) {
            throw new IllegalStateException();
        }
        return (this.plugin != null && this.plugin.getConfig().getBoolean(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("o4EdahBC/sd/+uwqhvX5e4SKCBO37b3RMvse8xeZOvc0uiARxoaq8epgNkU2RuvdgEumNzM55g0dmd1BnCImmeoDzbZa0qN9sw4mzHc5x77jpPlxQ7c="), Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 6) != 0) && this.isAnimationTimelineImageGroupRoot(editorSession, string) ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(-593857683, 30) : Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 0)) != 0;
    }

    public String formatTimelineDebugNumber(double d) {
        if ((-1052682338 * -1052682338 + -1052682338 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (!Double.isFinite(d)) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ORemavWyddRvN2QFaUJpejQZEBCNLzkuzMAu+CpDmMSU8Q==");
        }
        Object[] objectArray = new Object[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1489576503, 10)];
        objectArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-440594003, (int)18)] = d;
        return String.format(Locale.ROOT, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("J9kkappkqvNue2dw9t7fUxpzVxVJDTTCLqJWLhlgoPyE3L8S"), objectArray);
    }

    public String formatTimelineDebugNumber(Double d) {
        if (((0xC4B731B4 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (d == null || !Double.isFinite(d)) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ORemavWyddRvN2QFaUJpejQZEBCNLzkuzMAu+CpDmMSU8Q==");
        }
        return this.formatTimelineDebugNumber((double)d);
    }

    public String formatTimelineDebugBounds(EditorRect editorRect) {
        if ((190729197 * (190729197 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorRect == null) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("yM7swOp+cVIs9KT7QL1u9yOpYO3YajGxkS1keawzoEGwL1jI");
        }
        return EditorTimelineKeyframePart.Xqedii_1t3m8xb4ha892(this.formatTimelineDebugNumber(editorRect.x), this.formatTimelineDebugNumber(editorRect.y), this.formatTimelineDebugNumber(editorRect.width), this.formatTimelineDebugNumber(editorRect.height));
    }

    public String formatAnimationTimelineDebugState(double[] dArray) {
        if ((1895447260 * 1895447260 - 1895447260 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (dArray == null || dArray.length < Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1377448687, 10)) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("yM7swOp+cVIs9KT7QL1u9yOpYO3YajGxkS1keawzoEGwL1jI");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("yVnFcpZWtOu+P85yzuJA11rKLoqz1Bj7JqgZ7p7QTgbWMA==")).append(this.formatTimelineDebugNumber(dArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 0)]));
        stringBuilder.append(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Mc0Dx2OgWhqMjYNpzs/ihWolZA7iQ6msZwJCzKhQSf9aXA==")).append(this.formatTimelineDebugNumber(dArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-296928842, 29)]));
        stringBuilder.append(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("cpLrXZ+WNubAhg1ytqBPSQiumh0mZf6hmxyJuEMIE0LEpA==")).append(this.formatTimelineDebugNumber(dArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1900309369, 24)]));
        stringBuilder.append(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("hVtrs2L+tIpA62QBn2sK8flhwUuYJ46H6+sfqUtcgFqzoQ==")).append(this.formatTimelineDebugNumber(dArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1865304205, 13)]));
        stringBuilder.append(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("pz/ECvLfC/sZZQJfK+hQRoybvIZlPK0zNcPdqPfDru5whEacUWI=")).append(dArray.length >= Xqedii_32drtqx.Xqedii_3h0mif43akudp(647813943, 4) ? this.formatTimelineDebugNumber(dArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1491342274, 19)]) : Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ORemavWyddRvN2QFaUJpejQZEBCNLzkuzMAu+CpDmMSU8Q=="));
        stringBuilder.append(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("FUqzbB605Y7Pd+MmzrnqnSKsUVW/uXFMJmfY2jTaPhDW1Hqo+PZqNM/manoATQ==")).append(dArray.length >= Xqedii_32drtqx.Xqedii_ffzx1ycco61l(2037728363, 16) ? this.formatTimelineDebugNumber(dArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-147067842, 28)]) : Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ORemavWyddRvN2QFaUJpejQZEBCNLzkuzMAu+CpDmMSU8Q=="));
        stringBuilder.append((char)Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489246306, 5));
        return stringBuilder.toString();
    }

    public boolean isAnimationTimelineDebugTick(EditorSession editorSession, double d) {
        if ((-1187406148 * -1187406148 + -1187406148 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || !Double.isFinite(d)) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(1826935707, 25) != 0;
        }
        double d2 = this.clampAnimationTimelineTick(editorSession.animationTimelineTick);
        if (editorSession.animationTimelineSliderDragActive && editorSession.animationTimelineSliderDragTick != null && Double.isFinite(editorSession.animationTimelineSliderDragTick)) {
            d2 = Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 41)), Math.min(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(6175635298655055554L, 45)), editorSession.animationTimelineSliderDragTick));
        }
        if (Math.abs(d2 - d) <= Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(6613632906445716969L, 44))) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489261506, 14) != 0;
        }
        if (this.isTimelineKeyframeSelected(editorSession)) {
            int n = this.clampAnimationTimelineTick(editorSession.animationTimelineSelectedTick);
            return (Math.abs((double)n - d) <= Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-8208831343802707591L, 2)) ? Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 11) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 10)) != 0;
        }
        return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 18) != 0;
    }

    public void logAnimationTimelineImageDebug(EditorSession editorSession, String string, String string2, double d, Double d2, EditorRect editorRect, EditorRect editorRect2, double[] dArray, int n, int n2) {
        if ((-1558228227 * -1558228227 - -1558228227 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (this.plugin == null || !this.shouldLogTimelineImageDebug(editorSession, string2)) {
            return;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1907541578, 29)];
        stringArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)959768283, (int)31)] = string;
        stringArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1488982978, (int)18)] = Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ZSbrjL0EAySYafsCus43C6ch1NhWr9JFgzcR48G/6Ncf/6Iouvx0JcMy");
        String string3 = this.firstNonBlank(stringArray);
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1186436884, 4)];
        stringArray2[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)-1234015795, (int)24)] = string2;
        stringArray2[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1205717572, (int)23)] = Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ZSbrjL0EAySYafsCus43C6ch1NhWr9JFgzcR48G/6Ncf/6Iouvx0JcMy");
        String string4 = this.firstNonBlank(stringArray2);
        String[] stringArray3 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1220809666, 28)];
        stringArray3[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1122914843, (int)26)] = this.resolveTimelineHierarchyTargetPath(editorSession, string4);
        String string5 = this.firstNonBlank(stringArray3);
        String string6 = editorSession == null ? Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ORemavWyddRvN2QFaUJpejQZEBCNLzkuzMAu+CpDmMSU8Q==") : this.formatTimelineDebugNumber(this.clampAnimationTimelineTick(editorSession.animationTimelineTick));
        String string7 = editorSession == null ? Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ORemavWyddRvN2QFaUJpejQZEBCNLzkuzMAu+CpDmMSU8Q==") : this.formatTimelineDebugNumber(editorSession.animationTimelineSliderDragTick);
        String string8 = editorSession == null ? Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ORemavWyddRvN2QFaUJpejQZEBCNLzkuzMAu+CpDmMSU8Q==") : Integer.toString(this.clampAnimationTimelineTick(editorSession.animationTimelineSelectedTick));
        String string9 = n < 0 ? Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ORemavWyddRvN2QFaUJpejQZEBCNLzkuzMAu+CpDmMSU8Q==") : Integer.toString(n);
        String string10 = n2 < 0 ? Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ORemavWyddRvN2QFaUJpejQZEBCNLzkuzMAu+CpDmMSU8Q==") : Integer.toString(n2);
        this.plugin.getLogger().info(EditorTimelineKeyframePart.Xqedii_2twpyptdp85ux(string3, string4, string5.isBlank() ? Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==") : EditorTimelineKeyframePart.Xqedii_17zesmveyg01p(string5), this.formatTimelineDebugNumber(d), this.formatTimelineDebugNumber(d2), string6, string7, string8, this.formatTimelineDebugBounds(editorRect), this.formatTimelineDebugBounds(editorRect2), this.formatAnimationTimelineDebugState(dArray), string9, string10));
    }

    public EditorRect resolveTimelineCurrentBoundsForPreview(EditorSession editorSession, String string) {
        if ((1473319947 * 1473319947 - 1473319947 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            return null;
        }
        int n = editorSession.activeTool == EditorTool.ANIMATION && editorSession.animationTimelinePanelVisible ? Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 12) : Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1377452783, 10);
        String string2 = this.resolveSidebarGroupRootTarget(editorSession, string);
        if (!string2.isBlank() && (this.equalsNullable(string2, string) || this.equalsNullable(string2, this.resolveAnimationBaseTargetId(string)))) {
            EditorRect editorRect;
            String[] stringArray = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(2037466219, 16)];
            stringArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)4)] = this.resolveTimelineHierarchyTargetPath(editorSession, string2);
            stringArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245058, (int)6)] = string2;
            String string3 = this.resolveTimelineImageGroupRootPath(editorSession, this.firstNonBlank(stringArray));
            EditorRect editorRect2 = this.resolveTimelineGroupLiveRootBoundsFromElements(editorSession, string2, string3);
            if (editorRect2 != null) {
                return editorRect2;
            }
            if (n == 0 && (editorRect = this.resolveTimelineGroupLiveOutlineBoundsFromElements(editorSession, string3)) != null) {
                double d;
                Map<String, Object> map = this.resolveRawMapAtPath(editorSession.rawBlocks, string3);
                double d2 = d = map == null ? Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-5722547823557497685L, 35)) : this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("WEGVRlOd4qcyp7wO6gDgsdfprq1YSda4b6ojBm/oyWlPpE2UX8nXx3vpikM="), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336739758278L, 46)));
                if (!Double.isFinite(d)) {
                    d = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-19122455447509778L, 49));
                }
                double d3 = this.resolveTimelineGroupOutlineToRootYOffset(map, editorRect.height);
                return new EditorRect(editorRect.x + d, editorRect.y + d3, editorRect.width, editorRect.height);
            }
            editorRect = this.resolveTimelineGroupPreviewLogicalBounds(editorSession, string2);
            if (editorRect != null) {
                return editorRect;
            }
            return null;
        }
        EditorRect editorRect = this.getTargetBounds(editorSession, string);
        if (editorRect == null) {
            return null;
        }
        return new EditorRect(editorRect.x, editorRect.y, editorRect.width, editorRect.height);
    }

    public EditorRect resolveTimelineGroupLiveRootBoundsFromElements(EditorSession editorSession, String string, String string2) {
        if (((0x6DAAB9F7 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank() || string2 == null || string2.isBlank() || editorSession.elements == null || editorSession.elements.isEmpty()) {
            return null;
        }
        String string3 = EditorTimelineKeyframePart.Xqedii_fgqcdyrd4xjp(string2);
        HoverElement hoverElement = null;
        for (HoverElement hoverElement2 : editorSession.elements) {
            int n;
            if (hoverElement2 == null || hoverElement2.baseScale == null) continue;
            String[] stringArray = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1823576645, 3)];
            stringArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)593218426, (int)3)] = hoverElement2.targetPath;
            String string4 = this.firstNonBlank(stringArray);
            String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-688725880, 9)];
            stringArray2[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)8)] = this.targetIdOf(hoverElement2);
            String string5 = this.firstNonBlank(stringArray2);
            int n2 = !string4.isBlank() && this.equalsNullable(string4, string2) ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(-612948324, 20) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 0);
            int n3 = n = this.equalsNullable(string5, string) && (string4.isBlank() || !string4.startsWith(string3)) ? Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 20) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 17);
            if (n2 == 0 && n == 0 || !this.isBetterImageGroupRootCandidate(hoverElement2, hoverElement)) continue;
            hoverElement = hoverElement2;
        }
        return hoverElement == null ? null : this.resolveTimelineElementBounds(hoverElement);
    }

    public EditorRect resolveTimelineGroupLiveOutlineBoundsFromElements(EditorSession editorSession, String string) {
        if (((1004169977 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank() || editorSession.elements == null || editorSession.elements.isEmpty()) {
            return null;
        }
        EditorRect editorRect = null;
        String string2 = EditorTimelineKeyframePart.Xqedii_iwuf05wd4mwt(string);
        for (HoverElement hoverElement : editorSession.elements) {
            String[] stringArray = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(296609217, 2)];
            String string3 = stringArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-440594003, (int)18)] = hoverElement == null ? null : hoverElement.targetPath;
            String string4 = this.firstNonBlank(stringArray);
            if (string4.isBlank() || !string4.startsWith(string2) || !this.isImageGroupMemberPath(editorSession, string, string4)) continue;
            editorRect = this.mergeAnimationTimelineBounds(editorRect, this.resolveTimelineElementBounds(hoverElement));
        }
        return editorRect;
    }

    public EditorRect resolveTimelineElementBounds(HoverElement hoverElement) {
        double d;
        if ((-181696079 * (-181696079 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (hoverElement == null || hoverElement.baseLocation == null || hoverElement.baseScale == null) {
            return null;
        }
        double d2 = hoverElement.baseLocation.getX();
        double d3 = hoverElement.baseLocation.getY();
        double d4 = Double.isFinite(hoverElement.width) && hoverElement.width > Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 9)) ? hoverElement.width : Math.abs(hoverElement.baseScale.getX());
        double d5 = d = Double.isFinite(hoverElement.height) && hoverElement.height > Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(3092888118021958379L, 25)) ? hoverElement.height : Math.abs(hoverElement.baseScale.getY());
        if (!Double.isFinite(d4) || !Double.isFinite(d)) {
            return null;
        }
        return new EditorRect(d2, d3, Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(-7130613921072495744L, 21)), d4), Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(3997455868797271284L, 20)), d));
    }

    public EditorRect mergeAnimationTimelineBounds(EditorRect editorRect, EditorRect editorRect2) {
        if ((0x740F4376 ^ 0x740F4376) != 0) {
            throw new IllegalStateException();
        }
        if (editorRect == null) {
            return editorRect2;
        }
        if (editorRect2 == null) {
            return editorRect;
        }
        double d = Math.min(editorRect.x, editorRect2.x);
        double d2 = Math.min(editorRect.y, editorRect2.y);
        double d3 = Math.max(editorRect.maxX(), editorRect2.maxX());
        double d4 = Math.max(editorRect.maxY(), editorRect2.maxY());
        return new EditorRect(d, d2, d3 - d, d4 - d2);
    }

    public LinkedHashSet<String> resolveTimelinePreviewTargetIds(EditorSession editorSession, String string) {
        List<Map<String, Object>> list;
        if (((-1068219805 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        if (editorSession == null) {
            return linkedHashSet;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(71743383, 28)];
        stringArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)-1687362349, (int)17)] = string;
        String string2 = this.firstNonBlank(stringArray);
        if (!string2.isBlank()) {
            linkedHashSet.add(string2);
        }
        if (((list = editorSession.renderBlocks) == null || list.isEmpty()) && editorSession.rawBlocks != null && !editorSession.rawBlocks.isEmpty()) {
            list = this.resolveRenderableBlocks(editorSession.rawBlocks, editorSession.components, editorSession);
        }
        if (list == null || list.isEmpty()) {
            return linkedHashSet;
        }
        for (Map<String, Object> map : list) {
            Map map2;
            int n;
            Map map3;
            Map map4;
            Map map5;
            if (map == null || map.isEmpty()) continue;
            String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 3)];
            stringArray2[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)1730583771, (int)28)] = this.stringValue(this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("LBGlkNk/+xioDE1MLuO5/wu4E9I3tByTa+Tv5CcRi+xMeSct1WA8SFASiuJmVUmg6wAfsBWMMc0cj7enpRGEJQ==")));
            String string3 = this.firstNonBlank(stringArray2);
            if (string3.isBlank() || linkedHashSet.contains(string3)) continue;
            Object object2 = this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("ISL03nklgyyaKBzNnQWk3rhkH2W9Xx75fbpCWlKB7lg9/FEazjSbAGQAzOsO079i+OY0jXVeSpma5jInFY3ttPSVEXmM9BGrVeb8rhtiB4ecxyXrFtpdVZzdFETdm4Fl64c="));
            Object object3 = this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("1smfFRkCjBACEJ33FuIMuEZprxZ1vjW7V+C8l8occ7uWg5PVaebqr4FlzL3f9oAM49y2AqEgAeFnU1r4Sf0WgtAN5cZTGXgerbU2lYqBn+gQi1yYKHWBstlMEVg="));
            Object object4 = this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("w9Dhp0GyBc+FW4HF5dGJJd/d6Eel7P8RWEG+ulvyHc3GRa1qnVsUAOY88B0zII9n5PMA/sGCP3gC5mogSbAaVqn20WGNpOk3KRmHQQRhPmtzt6D+4YY1q1A5ePmXANppjjU="));
            Object object5 = this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("2p69MaBNr9j2P1AEWlFKqgNvlxM+ckpf3OT/xg5ijoYtMWmT3Awxb7RmArAmJZaWZJ5dKIkIDH+Zsb561ROpkS6dsifvEdDSQBGlaseB2XtPhGT8/V0R7HNpXfck+7PR"));
            int n2 = object2 instanceof Map && !(map5 = (Map)object2).isEmpty() ? Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245124, 1) : Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 13);
            int n3 = object3 instanceof Map && !(map4 = (Map)object3).isEmpty() ? Xqedii_32drtqx.Xqedii_ffzx1ycco61l(143486766, 29) : Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1214106180, 23);
            int n4 = object4 instanceof Map && !(map3 = (Map)object4).isEmpty() ? Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 28) : Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 31);
            int n5 = n = object5 instanceof Map && !(map2 = (Map)object5).isEmpty() ? Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 5) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 19);
            if (n2 == 0 && n3 == 0 && n4 == 0 && n == 0 || !string2.isBlank() && this.isTimelineHierarchyChildTarget(editorSession, string2, string3)) continue;
            int n6 = Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 31);
            for (String string4 : linkedHashSet) {
                if (!this.isTimelineHierarchyChildTarget(editorSession, string3, string4)) continue;
                n6 = Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489376194, 17);
                break;
            }
            if (n6 != 0) continue;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (String string5 : linkedHashSet) {
                if (this.equalsNullable(string5, string2) || !this.isTimelineHierarchyChildTarget(editorSession, string5, string3)) continue;
                linkedHashSet2.add(string5);
            }
            if (!linkedHashSet2.isEmpty()) {
                linkedHashSet.removeAll(linkedHashSet2);
            }
            linkedHashSet.add(string3);
        }
        return linkedHashSet;
    }

    public EditorRect resolveTimelineGroupLogicalBounds(EditorSession editorSession, String string) {
        if (((0xD03CCEB7 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            return null;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(1315814291, 11)];
        stringArray[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1((int)-300459016, (int)0)] = this.resolveSidebarGroupRootTarget(editorSession, string);
        String string2 = this.firstNonBlank(stringArray);
        if (string2.isBlank() && this.isAnimationTimelineImageGroupRoot(editorSession, string)) {
            String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245154, 5)];
            stringArray2[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)28)] = string;
            string2 = this.firstNonBlank(stringArray2);
        }
        if (string2.isBlank()) {
            return null;
        }
        EditorRect editorRect = this.resolveTimelineCurrentBoundsForPreview(editorSession, string2);
        if (editorRect != null) {
            return new EditorRect(editorRect.x, editorRect.y, editorRect.width, editorRect.height);
        }
        EditorRect editorRect2 = this.resolveTimelineGroupPreviewLogicalBounds(editorSession, string2);
        if (editorRect2 != null) {
            return new EditorRect(editorRect2.x, editorRect2.y, editorRect2.width, editorRect2.height);
        }
        return null;
    }

    public EditorRect resolveTimelineGroupPreviewLogicalBounds(EditorSession editorSession, String string) {
        if ((-627905809 * (-627905809 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            return null;
        }
        EditorRect editorRect = null;
        if (this.equalsNullable(string, editorSession.animationPreviewTargetId)) {
            editorRect = editorSession.animationPreviewAppliedBounds;
        }
        if (editorRect == null) {
            editorRect = editorSession.previewExtraAppliedBoundsByTarget.get(string);
        }
        if (editorRect == null) {
            return null;
        }
        return new EditorRect(editorRect.x, editorRect.y, editorRect.width, editorRect.height);
    }

    public double resolveTimelineGroupOutlineToRootYOffset(Map<String, Object> map, double d) {
        if ((1340771796 * (1340771796 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (!Double.isFinite(d) || d <= Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(1051859177082711812L, 7))) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-8886894509874649763L, 38));
        }
        if (this.isTimelineCompactGlyphMatrixGroup(map)) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-5586856221134212632L, 32));
        }
        int n = Math.max(Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 28), this.countTimelineGroupFrameRows(map));
        double d2 = d / (double)n;
        if (!Double.isFinite(d2) || d2 <= Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(5510766150620250631L, 14))) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-1430636958040429782L, 33));
        }
        return d2;
    }

    public boolean isTimelineCompactGlyphMatrixGroup(Map<String, Object> map) {
        if (((0x46A3DB66 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (map == null || map.isEmpty()) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 13) != 0;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-415503298, 29)];
        stringArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)1936563354, (int)14)] = this.stringValue(this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("fYQDP299Ail8UO7TZS9ghInU2AJ4ly51rim9ZjQ59WoK64AJY4sOTspKNy7/ux6XMra6sg==")));
        stringArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1506022338, (int)24)] = this.stringValue(this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("312Vol0RX7yHpJgIbpYqlYl1o/6dCLF/DCWDfjyP82HselxGXYWCgdNnfrAVc+E2uuY=")));
        String string = this.firstNonBlank(stringArray).trim();
        if (!string.isBlank()) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489376194, 17) != 0;
        }
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 31)];
        stringArray2[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1573536585, (int)31)] = this.stringValue(this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("5ADSzjnBkVO4tK01f4v4Hohw5AVQSc7sGYFnqCzYMx6WM/8Y")));
        String string2 = this.firstNonBlank(stringArray2).trim().toLowerCase(Locale.ROOT);
        if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("eCwBS1BjMGKhPF4vGcc0HrKSpxzX65wCjY84NyUcJgXB6wy99AQ=").equals(string2)) {
            String[] stringArray3 = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 10)];
            stringArray3[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)1866754937, (int)24)] = this.stringValue(this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("eCwBS1BjMGKhPF4vGcc0HrKSpxzX65wCjY84NyUcJgXB6wy99AQ=")));
            String string3 = this.firstNonBlank(stringArray3).trim();
            return (!string3.isBlank() ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(-843615639, 16) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 16)) != 0;
        }
        return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 2) != 0;
    }

    public int countTimelineGroupFrameRows(Map<String, Object> map) {
        List list;
        if ((-481212362 * -481212362 + -481212362 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (map == null || map.isEmpty()) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 14);
        }
        Object object = map.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("gnQH3ScQv8oiEM2k4g8WPTZ9xzNJqkura8DqouCONxDVUlJugFpt/CnUBic="));
        if (!(object instanceof List) || (list = (List)object).isEmpty()) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-608619290, 23);
        }
        HashSet<Double> hashSet = new HashSet<Double>();
        for (Object e : list) {
            double d;
            double d2;
            Map map2;
            Map map3;
            if (!(e instanceof Map) || (map3 = (map2 = (Map)e)).isEmpty() || !Double.isFinite(d2 = this.readMapPathDouble(map3, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("MPCJb7PgwNinwTT9Bb71iDxQmi7owzq690wM1PNLNNWn+32ewn6W8NreRznvQ3z0"), this.readMapPathDouble(map3, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Kug6JC6vMArxS1TYzCDHTExm1/nFgRotaWTJIqx6"), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169803795037963L, 32)))))) continue;
            double d3 = this.readMapPathDouble(map3, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("C5Lau6nHfKXKIZkkb5HlFX0BtP5l/AvTlv7aPkQBm/ocah47uKLTFXwMIt87verNHTxXetO4GIZdwxcuGik+O5G+YTpMyQ7l"), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-1223837148640625729L, 55)));
            if (!Double.isFinite(d3)) {
                d3 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-1134650304540460034L, 59));
            }
            if (!Double.isFinite(d = d2 - d3)) continue;
            hashSet.add(Math.rint(d * Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(4864696506042701236L, 61))) / Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(-4552985414157000506L, 1)));
        }
        return Math.max(Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489241026, 12), hashSet.size());
    }

    public List<HoverElement> resolveTimelinePreviewTransformElements(EditorSession editorSession, String string) {
        if ((1789038368 * (1789038368 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank() || editorSession.elements == null || editorSession.elements.isEmpty()) {
            return Collections.emptyList();
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 15)];
        stringArray[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)14)] = string;
        String string2 = this.firstNonBlank(stringArray);
        LinkedHashSet<HoverElement> linkedHashSet = new LinkedHashSet<HoverElement>();
        if (this.isAnimationTimelineImageGroupRoot(editorSession, string2)) {
            String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-2026116034, 28)];
            stringArray2[Xqedii_32drtqx.Xqedii_c2fgut1zn61r((int)-1489245122, (int)9)] = this.resolveTimelineHierarchyTargetPath(editorSession, string2);
            stringArray2[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1((int)300459015, (int)12)] = string2;
            String string3 = this.resolveTimelineImageGroupRootPath(editorSession, this.firstNonBlank(stringArray2));
            for (HoverElement hoverElement : editorSession.elements) {
                if (hoverElement == null) continue;
                String[] stringArray3 = new String[Xqedii_32drtqx.Xqedii_3h0mif43akudp(-573987018, 26)];
                stringArray3[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1214843834, (int)12)] = hoverElement.targetPath;
                String string4 = this.firstNonBlank(stringArray3);
                String[] stringArray4 = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-220165930, 17)];
                stringArray4[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)-1687362349, (int)17)] = this.targetIdOf(hoverElement);
                String string5 = this.firstNonBlank(stringArray4);
                int n = !string4.isBlank() && this.isImageGroupMemberPath(editorSession, string3, string4) ? Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1488982978, 18) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 10);
                boolean bl = this.equalsNullable(string5, string2);
                if (n == 0 && !bl) continue;
                linkedHashSet.add(hoverElement);
            }
        }
        if (linkedHashSet.isEmpty()) {
            for (String string6 : this.resolvePreviewHierarchyTargetIds(editorSession, string2)) {
                linkedHashSet.addAll(this.findTargetElements(editorSession, string6));
            }
        }
        if (linkedHashSet.isEmpty()) {
            return Collections.emptyList();
        }
        return new ArrayList<HoverElement>(linkedHashSet);
    }

    public boolean isSidebarPositionField(EditorPropertyField editorPropertyField) {
        if ((0x24C912CF ^ 0x24C912CF) != 0) {
            throw new IllegalStateException();
        }
        return (editorPropertyField == EditorPropertyField.POSITION_X || editorPropertyField == EditorPropertyField.POSITION_Y ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(-573987018, 26) : Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-881188005, 19)) != 0;
    }

    public String getSidebarEditableTargetId(EditorSession editorSession) {
        if (((0x1D81ADF6 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return null;
        }
        if (editorSession.selectedElementId != null && !editorSession.selectedElementId.isBlank()) {
            return editorSession.selectedElementId;
        }
        for (String string : editorSession.additionalSelectedElementIds) {
            if (string == null || string.isBlank()) continue;
            return string;
        }
        return null;
    }

    public List<String> getSidebarEditableTargetIds(EditorSession editorSession) {
        if ((0x93EBD30F ^ 0x93EBD30F) != 0) {
            throw new IllegalStateException();
        }
        List<String> list = this.getSelectedTargetIds(editorSession);
        if (!list.isEmpty()) {
            return list;
        }
        String string = this.getSidebarEditableTargetId(editorSession);
        if (string == null || string.isBlank()) {
            return Collections.emptyList();
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(string);
        return arrayList;
    }

    public boolean isImagePositionOffsetTarget(EditorSession editorSession, String string) {
        if (((-183637209 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        return (!this.resolveSidebarGroupRootTarget(editorSession, string).isBlank() ? Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1220809666, 28) : Xqedii_32drtqx.Xqedii_ffzx1ycco61l(450780113, 6)) != 0;
    }

    public double resolveSidebarImagePositionOffset(EditorPropertyField editorPropertyField) {
        if ((209142686 * 209142686 - 209142686 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorPropertyField == EditorPropertyField.POSITION_X) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4717385796982874310L, 55));
        }
        if (editorPropertyField == EditorPropertyField.POSITION_Y) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4504618017249033995L, 59));
        }
        return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 9));
    }

    public double toSidebarDisplayPositionValue(EditorSession editorSession, String string, EditorPropertyField editorPropertyField, double d) {
        if ((-1495209589 * -1495209589 + -1495209589 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (!(Double.isFinite(d) && this.isSidebarPositionField(editorPropertyField) && this.isImagePositionOffsetTarget(editorSession, string))) {
            return d;
        }
        return d - this.resolveSidebarImagePositionOffset(editorPropertyField);
    }

    public double toSidebarRawPositionValue(EditorSession editorSession, String string, EditorPropertyField editorPropertyField, double d) {
        if ((-22634360 * (-22634360 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (!(Double.isFinite(d) && this.isSidebarPositionField(editorPropertyField) && this.isImagePositionOffsetTarget(editorSession, string))) {
            return d;
        }
        return d + this.resolveSidebarImagePositionOffset(editorPropertyField);
    }

    public EditorRect resolveSidebarEditableBounds(EditorSession editorSession, String string) {
        Object object;
        if ((542376662 * (542376662 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        EditorRect editorRect = this.getTargetBounds(editorSession, string);
        if (editorSession == null || string == null || string.isBlank()) {
            return editorRect;
        }
        boolean bl = this.isAnimationTimelineImageGroupRoot(editorSession, string);
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(299934727, 19)];
        stringArray[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1377452783, (int)10)] = this.resolveTimelineHierarchyTargetPath(editorSession, string);
        stringArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)-608619290, (int)23)] = string;
        String string2 = this.resolveTimelineImageGroupRootPath(editorSession, this.firstNonBlank(stringArray));
        if (!bl && !string2.isBlank()) {
            bl = this.isAnimationTimelineImageGroupRoot(editorSession, string2);
        }
        if (bl) {
            object = this.resolveTimelineGroupLiveOutlineBoundsFromElements(editorSession, string2);
            if (object != null) {
                return (EditorRect) object;
            }
            if (editorRect != null) {
                return editorRect;
            }
        }
        if ((object = this.findFirstByTargetId(editorSession, string)) == null || !((HoverElement)object).itemDisplayBlock || ((HoverElement)object).targetPath == null || ((HoverElement)object).targetPath.isBlank()) {
            return editorRect;
        }
        Map<String, Object> map = this.resolveRawMapAtPath(editorSession.rawBlocks, ((HoverElement)object).targetPath);
        if (map == null || map.isEmpty()) {
            return editorRect;
        }
        double d = editorRect == null ? Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 18)) : editorRect.x;
        double d2 = editorRect == null ? Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 0)) : editorRect.y;
        double d3 = editorRect == null ? Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(118849606194822089L, 5)) : editorRect.width;
        double d4 = editorRect == null ? Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287161014143942411L, 45)) : editorRect.height;
        double d5 = this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("pZuvPtoM8a1y3OAra7WZaU8Z3XhmpTxT4grTu2WfuK12JPzuvEd4qSsPeK/pEbki"), this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("6PRyAXp6WF8hg9Z5Khip7jKIxT7T9BoFXKS9hUVs"), d));
        double d6 = this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("MPCJb7PgwNinwTT9Bb71iDxQmi7owzq690wM1PNLNNWn+32ewn6W8NreRznvQ3z0"), this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Kug6JC6vMArxS1TYzCDHTExm1/nFgRotaWTJIqx6"), d2));
        double d7 = this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Qb5MteiUuvrEHMverU90UxdD1mcgvM90UoUTlKslCHOq7HP2fC9Zim0BQsQiKY8F"), this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("6XnTc6zAYC7sWEhK2OTJ5ySYCW3+CdfncZRiSA/6i2xaTAgcVUg="), this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("CiguSPExhr/ESjYUtGGpOGpHhtcVyrIlf2drPm+aoZdDqfbXKjm3hrIo5uAKFi4BnqA="), d3)));
        double d8 = this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("wOPIg84dIMens/xukGFwlt6Dc6Az7mGMiBu0+z4Kl/xTXtUHro1VThZQgpeOUBJ17s0="), this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nVThWvX+m3EA+JZCwgyIrYDk3e5kq9ItA46/BMlumuS//1qlhw6cKw=="), this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("qTgLhs6XzmR1bf3PRFr5iRfO3DZoivv4qDAASKL3rU04aU2+mFW5GaLESxXryJhZ2gyUWw=="), d4)));
        Object object2 = this.readMapPathValue(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lruJ2tMbcpU5yi5TTE7y10C+2DtMjqSHix/ycDkkn1dYZPIwYJwKICj1Wi8kx63jib4nzeT97TwMo8pPjOGi4rPjsvKYQXV3sU9ROs1n5Ii1CGxpkWPP8BJ+E4d9R1ni6C8="));
        int n = this.parseBooleanFlag(object2, Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 3) != 0) || this.isAnimationTimelineImageGroupRoot(editorSession, string) ? Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1540063779, 11) : Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 22);
        double d9 = n != 0 ? Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-2513352058343572963L, 49)) : Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(5383641641470285272L, 42));
        double d10 = Math.max(d9, Math.abs(d7));
        double d11 = Math.max(d9, Math.abs(d8));
        return new EditorRect(d5, d6, d10, d11);
    }

    public void rerenderEditableTarget(Player player, EditorSession editorSession, String string) {
        if ((-239366941 * -239366941 - -239366941 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            this.rerenderEditableSelection(player, editorSession);
            return;
        }
        String string2 = editorSession.selectedElementId;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>(editorSession.additionalSelectedElementIds);
        editorSession.selectedElementId = string;
        editorSession.additionalSelectedElementIds.clear();
        this.rerenderEditableSelection(player, editorSession);
        editorSession.selectedElementId = string2;
        editorSession.additionalSelectedElementIds.clear();
        editorSession.additionalSelectedElementIds.addAll(linkedHashSet);
        this.normalizeSelectionState(editorSession);
        this.clearEditorOverlaysOnly(player, editorSession);
        if (editorSession.selectedElementId != null && editorSession.selectionOutlineVisible) {
            this.renderSelectionOverlay(player, editorSession);
        }
        this.updateEditorPropertiesSidebar(player, editorSession);
    }

    public void applyTargetOpacityToRenderedElements(Player player, EditorSession editorSession, String string, int n) {
        if (((333644479 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || string == null || string.isBlank()) {
            return;
        }
        int n2 = Math.max(Xqedii_32drtqx.Xqedii_3h0mif43akudp(-421840588, 15), Math.min(Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1213799354, 12), n));
        for (HoverElement hoverElement : this.findTargetElements(editorSession, string)) {
            hoverElement.opacity = n2;
            if (!this.isRoundedElement(hoverElement)) {
                this.setHudOpacityIfExists(player, hoverElement.id, n2);
                this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_2zh5xom6kp6q(hoverElement.id), n2);
                continue;
            }
            this.setHudOpacityIfExists(player, hoverElement.id, n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_1evc23159xfu1(hoverElement.id), n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_1314a7xils0kk(hoverElement.id), n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_2mxx98kbs0ene(hoverElement.id), n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_2x3epwi5i6asz(hoverElement.id), n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_23exxjwb45txr(hoverElement.id), n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_oizgz1kmogln(hoverElement.id), n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_26cfhev0qryzc(hoverElement.id), n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_2jyth7r6owztg(hoverElement.id), n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_kdmtf93nqioy(hoverElement.id), n2);
            String string2 = EditorTimelineKeyframePart.Xqedii_153h8c2l0ngz8(hoverElement.id);
            this.setHudOpacityIfExists(player, string2, n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_1eaked599q73t(string2), n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_1ilwcl65db96t(string2), n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_xxmth8mlxhm9(string2), n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_38j3mnt99ejk7(string2), n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_blzssh7qlto5(string2), n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_2bsu2ca1a921k(string2), n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_23f2301pdpjc0(string2), n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_2noc3xggv2raa(string2), n2);
            this.setHudOpacityIfExists(player, EditorTimelineKeyframePart.Xqedii_1q9nsh2lnm4zv(string2), n2);
        }
    }

    public void applySelectedOpacityToRenderedElements(Player player, EditorSession editorSession, List<String> list, int n) {
        if (((-247184802 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>(list);
        for (String string : linkedHashSet) {
            this.applyTargetOpacityToRenderedElements(player, editorSession, string, n);
        }
    }

    public boolean applyFlipSelection(EditorSession editorSession, boolean bl) {
        if (((-1248683777 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-833799754, 29) != 0;
        }
        String string = this.getSidebarEditableTargetId(editorSession);
        if (string == null || string.isBlank()) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-688726392, 9) != 0;
        }
        this.recordEditorMutation(editorSession);
        return this.toggleTargetMirror(editorSession, string, bl);
    }

    public EditorRect resolveFlippedBounds(EditorSession editorSession, EditorRect editorRect, boolean bl) {
        if (((0x65D55B09 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || editorRect == null) {
            return null;
        }
        double d = editorSession.previewViewport == null ? Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169800075149067L, 31)) : editorSession.previewViewport.pageWidth;
        double d2 = editorSession.previewViewport == null ? Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-1487558110631689995L, 62)) : editorSession.previewViewport.pageHeight;
        double d3 = bl ? this.snapToGrid(editorSession, d - (editorRect.x + editorRect.width)) : editorRect.x;
        double d4 = bl ? editorRect.y : this.snapToGrid(editorSession, d2 - (editorRect.y + editorRect.height));
        return new EditorRect(d3, d4, editorRect.width, editorRect.height);
    }

    public void applySidebarFlipVisualMove(Player player, EditorSession editorSession, String string, EditorRect editorRect, EditorRect editorRect2) {
        if (((0xF55AC922 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null || string == null || string.isBlank() || editorRect == null || editorRect2 == null) {
            return;
        }
        double d = editorRect2.x - editorRect.x;
        double d2 = editorRect2.y - editorRect.y;
        if (Math.abs(d) < Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-3320144786078064163L, 53)) && Math.abs(d2) < Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-1406837845345051183L, 61))) {
            return;
        }
        this.translateTargetElements(player, editorSession, string, d, d2);
        if (editorSession.selectedElementId == null || !editorSession.selectionOutlineVisible) {
            return;
        }
        if (editorSession.additionalSelectedElementIds.isEmpty() && string.equals(editorSession.selectedElementId)) {
            this.translateSelectionOutline(player, editorSession, d, d2);
            return;
        }
        this.renderSelectionOverlay(player, editorSession);
    }

    public boolean toggleTargetMirror(EditorSession editorSession, String string, boolean bl) {
        if ((-394657196 * -394657196 - -394657196 & 1) != 0) {
            throw new IllegalStateException();
        }
        HoverElement hoverElement = this.findFirstByTargetId(editorSession, string);
        if (hoverElement == null || hoverElement.targetPath == null || hoverElement.targetPath.isBlank()) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1489577527, 10) != 0;
        }
        Map<String, Object> map = this.resolveRawMapAtPath(editorSession.rawBlocks, hoverElement.targetPath);
        if (map == null) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 6) != 0;
        }
        EditorRect editorRect = this.getTargetBounds(editorSession, string);
        if (editorRect == null) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 0) != 0;
        }
        EditorRect editorRect2 = this.resolveFlippedBounds(editorSession, editorRect, bl);
        if (editorRect2 == null) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-641095882, 26) != 0;
        }
        boolean bl2 = this.normalizeTargetMirrorSigns(map, hoverElement);
        if (!bl2 && this.sameRect(editorRect, editorRect2)) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(968281677, 13) != 0;
        }
        this.applyBoundsToTarget(editorSession, string, editorRect2);
        return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1761327433, 20) != 0;
    }

    public boolean normalizeTargetMirrorSigns(Map<String, Object> map, HoverElement hoverElement) {
        if ((-2108403797 * (-2108403797 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (map == null || hoverElement == null) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1214106180, 23) != 0;
        }
        boolean changed_norm = false;
        if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("u/ZQAthRJjrWMH5dXpyCQs0usFj5/hgraxKMHo71aoM0PPqldZvqA4wXORD7WQ==").equalsIgnoreCase(hoverElement.targetKind)) {
            changed_norm |= this.normalizeMapPathAbsolute(map, hoverElement.bindingWidth);
            changed_norm |= this.normalizeMapPathAbsolute(map, hoverElement.bindingHeight);
            return changed_norm;
        }
        changed_norm |= this.normalizeMapPathAbsolute(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Qb5MteiUuvrEHMverU90UxdD1mcgvM90UoUTlKslCHOq7HP2fC9Zim0BQsQiKY8F"));
        changed_norm |= this.normalizeMapPathAbsolute(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("wOPIg84dIMens/xukGFwlt6Dc6Az7mGMiBu0+z4Kl/xTXtUHro1VThZQgpeOUBJ17s0="));
        changed_norm |= this.normalizeMapPathAbsolute(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("6XnTc6zAYC7sWEhK2OTJ5ySYCW3+CdfncZRiSA/6i2xaTAgcVUg="));
        changed_norm |= this.normalizeMapPathAbsolute(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nVThWvX+m3EA+JZCwgyIrYDk3e5kq9ItA46/BMlumuS//1qlhw6cKw=="));
        return changed_norm;
    }

    public boolean normalizeMapPathAbsolute(Map<String, Object> map, String string) {
        if ((939886740 * 939886740 - 939886740 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (map == null || string == null || string.isBlank() || !this.hasMapPath(map, string)) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 23) != 0;
        }
        double d = this.readMapPathDouble(map, string, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(3054515203724000528L, 9)));
        if (!Double.isFinite(d)) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 23) != 0;
        }
        double d2 = Math.abs(d);
        if (Math.abs(d - d2) < Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(4392196532928964854L, 4))) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1540061731, 11) != 0;
        }
        this.setMapPathValue(map, string, d2);
        return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245130, 3) != 0;
    }

    public String resolveTimelineRowForSidebarField(EditorPropertyField editorPropertyField) {
        if ((0x251E2BA5 ^ 0x251E2BA5) != 0) {
            throw new IllegalStateException();
        }
        if (editorPropertyField == null) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
        }
        return switch (Xqedii_3b4mho8.Xqedii_10tk43h[editorPropertyField.ordinal()]) {
            case 1, 2 -> Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lVyLqZ0/l42NHS2Z4u8jaugWB4pabPNyLAKoAr7n6uc/FLCXzHscKW2vd90=");
            case 3, 4 -> Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("R1YSngvbwI50UhU8FNC0NrXgVRxJfbUMfTvw+2OgFwesfDq3Xg8=");
            case 5 -> Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("AlPY20ZiSsKHZHepm7m2vR9gsG45kxcO0s7ePxjMRcnXk0/S0f9XDKwAo1o=");
            case 6 -> Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("I1vZiTUQBfDtQxGQtDrYmY6jBftQU/Kf94ejXFqvcZKUJZRGrtg/U181");
            default -> Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("tsJsdseESBXGwuhjd0zAGHg7HPYcJKysU9hiNA==");
        };
    }

    public boolean isTimelineSelectedRowMatchingField(EditorSession editorSession, EditorPropertyField editorPropertyField) {
        if ((0xA089317A ^ 0xA089317A) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || editorPropertyField == null || !this.isTimelineKeyframeSelected(editorSession)) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1540430558, 22) != 0;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-2111611957, 27)];
        stringArray[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1((int)-300459016, (int)24)] = this.resolveTimelineRowForSidebarField(editorPropertyField);
        String string = this.firstNonBlank(stringArray).toLowerCase(Locale.ROOT);
        if (string.isBlank()) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 30) != 0;
        }
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1490293698, 20)];
        stringArray2[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1922093592, (int)5)] = editorSession.animationTimelineSelectedRow;
        String string2 = this.firstNonBlank(stringArray2).toLowerCase(Locale.ROOT);
        if (!this.equalsNullable(string2, string)) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 20) != 0;
        }
        String[] stringArray3 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1506022338, 24)];
        stringArray3[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)-1122914843, (int)26)] = editorSession.animationTimelineSelectedTargetId;
        String string3 = this.firstNonBlank(stringArray3);
        String[] stringArray4 = new String[Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1128783307, 15)];
        stringArray4[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)1866754937, (int)24)] = this.resolveTimelineEditableTargetId(editorSession);
        String string4 = this.firstNonBlank(stringArray4);
        return (!string3.isBlank() && !string4.isBlank() && this.equalsNullable(string3, string4) ? Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 20) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 2)) != 0;
    }

    public boolean trySelectTimelineKeyframeForField(EditorSession editorSession, EditorPropertyField editorPropertyField) {
        if (((0x2193CC1C | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        String string = this.resolveTimelineRowForSidebarField(editorPropertyField);
        if (string.isBlank()) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-786768293, 30) != 0;
        }
        return this.trySelectTimelineKeyframeAtCurrentTick(editorSession, string);
    }

    public boolean trySelectTimelineKeyframeAtCurrentTick(EditorSession editorSession, String string) {
        Map<String, Object> map;
        Map<String, Object> map2;
        if (((997839482 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || editorSession.activeTool != EditorTool.ANIMATION || string == null || string.isBlank()) {
            return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1214843834, 12) != 0;
        }
        String string2 = string.toLowerCase(Locale.ROOT);
        if (!(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lVyLqZ0/l42NHS2Z4u8jaugWB4pabPNyLAKoAr7n6uc/FLCXzHscKW2vd90=").equals(string2) || Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("R1YSngvbwI50UhU8FNC0NrXgVRxJfbUMfTvw+2OgFwesfDq3Xg8=").equals(string2) || Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("AlPY20ZiSsKHZHepm7m2vR9gsG45kxcO0s7ePxjMRcnXk0/S0f9XDKwAo1o=").equals(string2) || Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("I1vZiTUQBfDtQxGQtDrYmY6jBftQU/Kf94ejXFqvcZKUJZRGrtg/U181").equals(string2))) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(647813991, 4) != 0;
        }
        String[] stringArray = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 27)];
        stringArray[Xqedii_32drtqx.Xqedii_3h0mif43akudp((int)-911788327, (int)2)] = this.resolveTimelineEditableTargetId(editorSession);
        String string3 = this.firstNonBlank(stringArray);
        if (string3.isBlank()) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-843681175, 16) != 0;
        }
        int n = this.clampAnimationTimelineTick(editorSession.animationTimelineTick);
        String[] stringArray2 = new String[Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489253314, 13)];
        stringArray2[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1((int)-300459016, (int)7)] = editorSession.animationTimelineSelectedTargetId;
        if (this.equalsNullable(this.firstNonBlank(stringArray2), string3)) {
            String[] stringArray3 = new String[Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 29)];
            stringArray3[Xqedii_32drtqx.Xqedii_ffzx1ycco61l((int)593218426, (int)3)] = editorSession.animationTimelineSelectedRow;
            if (this.equalsNullable(this.firstNonBlank(stringArray3).toLowerCase(Locale.ROOT), string2) && editorSession.animationTimelineSelectedTick == n) {
                return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 2) != 0;
            }
        }
        if (!this.containsAnimationTimelineTick(map2 = this.readAnimationTimelineRowMap(map = this.resolveRawTargetByTargetId(editorSession, string3), string2), n)) {
            return Xqedii_32drtqx.Xqedii_3h0mif43akudp(959768283, 31) != 0;
        }
        editorSession.animationTimelineSelectedTargetId = string3;
        editorSession.animationTimelineSelectedRow = string2;
        editorSession.animationTimelineSelectedTick = n;
        this.clearTimelineExtraSelection(editorSession);
        editorSession.animationTimelineTick = n;
        editorSession.timelineRenderedSignature = null;
        editorSession.timelineKeyframeDragRuntimeTick = Xqedii_32drtqx.Xqedii_3h0mif43akudp(-1295627983, 5);
        return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489246146, 10) != 0;
    }

    public boolean isSidebarColorField(EditorPropertyField editorPropertyField) {
        if ((-90933906 * -90933906 + -90933906 & 1) != 0) {
            throw new IllegalStateException();
        }
        return (editorPropertyField == EditorPropertyField.DESIGN_COLOR || editorPropertyField == EditorPropertyField.DESIGN_BORDER_COLOR ? Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1055805979, 26) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 25)) != 0;
    }

    public boolean isDimensionSidebarField(EditorPropertyField editorPropertyField) {
        if (((0xCB71A0B | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        return (editorPropertyField == EditorPropertyField.WIDTH || editorPropertyField == EditorPropertyField.HEIGHT || editorPropertyField == EditorPropertyField.POSITION_X || editorPropertyField == EditorPropertyField.POSITION_Y || editorPropertyField == EditorPropertyField.ROTATION || editorPropertyField == EditorPropertyField.LAYER || editorPropertyField == EditorPropertyField.OPACITY || editorPropertyField == EditorPropertyField.DESIGN_COLOR || editorPropertyField == EditorPropertyField.DESIGN_BORDER_COLOR || editorPropertyField == EditorPropertyField.DESIGN_TEXT_WRAP ? Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 14) : Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245122, 0)) != 0;
    }

    public double sidebarFieldDragSensitivity(EditorPropertyField editorPropertyField) {
        if ((-222094642 * (-222094642 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorPropertyField == null) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(1375897706776532333L, 59));
        }
        return switch (Xqedii_3b4mho8.Xqedii_10tk43h[editorPropertyField.ordinal()]) {
            case 5 -> Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(-2824317186745910945L, 34));
            case 7 -> Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-8666587189600276040L, 15));
            case 6 -> Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-2264461487364769358L, 22));
            case 8, 9 -> Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(-4623055091171909433L, 3));
            default -> Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647815691L, 20));
        };
    }

    public double normalizeSidebarFieldDragValue(EditorPropertyField editorPropertyField, double d) {
        if ((-2137903640 * (-2137903640 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (!Double.isFinite(d) || editorPropertyField == null) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-1679148319986148047L, 24));
        }
        return switch (Xqedii_3b4mho8.Xqedii_10tk43h[editorPropertyField.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 10, 11, 12, 13, 14, 15, 16, 17 -> Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336739758278L, 31));
            case 18 -> Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-2727437173583814358L, 52)), this.snap1(d));
            case 3, 4 -> Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(4952177192284726619L, 57)), this.snap1(d));
            case 1, 2 -> this.snap1(d);
            case 5 -> this.normalizeSidebarRotation(d);
            case 7 -> this.snap1(d);
            case 6 -> Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-5935079287050373614L, 48)), Math.min(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(5365928882335850702L, 5)), this.snap1(d)));
            case 8, 9 -> this.normalizeHueDegrees(d);
        };
    }

    public double normalizeSidebarRotation(double d) {
        if ((-275242903 * -275242903 + -275242903 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (!Double.isFinite(d)) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336739758278L, 21));
        }
        double d2 = Math.round(d);
        double d3 = d2 % Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-2918075514926399094L, 9));
        if (Math.abs(d3) < Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-256743422885476432L, 38))) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336739758278L, 58));
        }
        return d3;
    }

    public double normalizeHueDegrees(double d) {
        if ((1609590015 * 1609590015 - 1609590015 & 1) != 0) {
            throw new IllegalStateException();
        }
        return Xqedii_170zfgx.Xqedii_5d87122(d);
    }

    public double hueFromHexColor(String string) {
        if ((0x664A9781 ^ 0x664A9781) != 0) {
            throw new IllegalStateException();
        }
        return Xqedii_170zfgx.Xqedii_12k2o8j(this.normalizeHexColor(string));
    }

    public String rainbowHexFromHue(double d) {
        if ((-381563009 * -381563009 - -381563009 & 1) != 0) {
            throw new IllegalStateException();
        }
        return Xqedii_170zfgx.Xqedii_2p150sg(d);
    }

    public void reanchorOpacityDragAtBounds(EditorSession editorSession, double d, double d2) {
        if ((-1398124663 * -1398124663 - -1398124663 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null) {
            return;
        }
        if (d2 >= Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336472518854L, 30)) && d > editorSession.sidebarFieldDragStartCursorX) {
            editorSession.sidebarFieldDragStartCursorX = d;
            editorSession.sidebarFieldDragStartValue = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(6185776236027064790L, 26));
            return;
        }
        if (d2 <= Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 26)) && d < editorSession.sidebarFieldDragStartCursorX) {
            editorSession.sidebarFieldDragStartCursorX = d;
            editorSession.sidebarFieldDragStartValue = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(6185225525694728563L, 10));
        }
    }

    public int clampSidebarOpacityRaw(double d) {
        if (((-975675984 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (!Double.isFinite(d)) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(503882759, 20);
        }
        return Math.max(Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1103369154, 24), Math.min(Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-269966329, 24), (int)Math.round(d)));
    }

    public int clampAnimationTimelineOpacityRaw(double d) {
        if ((-1729026082 * -1729026082 + -1729026082 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (!Double.isFinite(d)) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489244736, 1);
        }
        return Math.max(Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245074, 4), Math.min(Xqedii_32drtqx.Xqedii_3h0mif43akudp(1553625938, 30), (int)Math.round(d)));
    }

    public int opacityPercentToRaw(double d) {
        if (((0x6FFCE42A | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (!Double.isFinite(d)) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489300674, 8);
        }
        double d2 = Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336739758278L, 43)), Math.min(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(6175635281475186370L, 45)), d));
        double d3 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-2161470777528155766L, 9));
        double d4 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(6255797258349624073L, 47)) + d2 / Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(7192641057542934764L, 17)) * d3;
        return this.clampSidebarOpacityRaw(d4);
    }

    public int opacityPercentToAnimationRaw(double d) {
        if (((0xC3F266F | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (!Double.isFinite(d)) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1193546690, 21);
        }
        double d2 = Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-2861273911778748843L, 34)), Math.min(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(5688041695347096854L, 37)), d));
        double d3 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336743964550L, 24));
        double d4 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-2728675498554597078L, 52)) + d2 / Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(8472808096562027660L, 16)) * d3;
        return this.clampAnimationTimelineOpacityRaw(d4);
    }

    public double opacityRawToPercent(double d) {
        if (((0xA9F2D33B | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (!Double.isFinite(d)) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169661393698571L, 38));
        }
        double d2 = Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(3699597020208767046L, 9)), Math.min(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-3382663694298445482L, 55)), d));
        double d3 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-8538567849884777973L, 10));
        if (d3 <= Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-7799377729175368803L, 40))) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801951526667L, 30));
        }
        return (d2 - Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801636034571L, 24))) / d3 * Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(6437721029025581255L, 20));
    }

    public double opacityRawToAnimationPercent(double d) {
        if ((-1171960120 * (-1171960120 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        if (!Double.isFinite(d)) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(2530290017984276615L, 6));
        }
        double d2 = Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(-4503709701046591290L, 1)), Math.min(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-4859073781816824065L, 57)), d));
        double d3 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(5530310268734873806L, 5));
        if (d3 <= Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(8778010030081238288L, 41))) {
            return Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-4969345257938994486L, 31));
        }
        return (d2 - Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(7192641057542934626L, 17))) / d3 * Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(2530290017984276615L, 6));
    }

    public boolean isTimelineOpacitySidebarMode(EditorSession editorSession) {
        if (((-1249151233 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        return (editorSession != null && editorSession.activeTool == EditorTool.ANIMATION && this.isTimelineSelectedRowMatchingField(editorSession, EditorPropertyField.OPACITY) ? Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 29) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 26)) != 0;
    }

    public void updateOpacitySliderDrag(Player player, EditorSession editorSession, double d) {
        int n;
        if (((0x2F10FDE7 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (player == null || editorSession == null) {
            return;
        }
        EditorRect editorRect = this.findShellBlockRect(editorSession, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("o/Wg1Nee5hFSmKWbVb5NMJcctF3yAeYAKPjNUxDg6kt4XGDTZ9ZCXH/DhqAioYioDsmUVFUenpAt6oNdgyvTnYKqsPU="));
        if (editorRect == null) {
            this.stopOpacitySliderDrag(editorSession, Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1147894128, 0) != 0);
            return;
        }
        double d2 = Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-75927421592431685L, 51)), Math.min(editorRect.width, Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-1679148319981928943L, 24))));
        double d3 = editorRect.x + d2;
        double d4 = Math.max(editorRect.x, Math.min(d3, d));
        double d5 = d2 <= Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-2866037151672591731L, 5)) ? Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 14)) : (d4 - editorRect.x) / d2;
        boolean bl = this.isTimelineOpacitySidebarMode(editorSession);
        int n2 = n = bl ? this.opacityPercentToAnimationRaw(d5 * Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708385820789383366L, 46))) : this.opacityPercentToRaw(d5 * Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-1430636958046426326L, 33)));
        if (editorSession.opacitySliderLastValue != null && editorSession.opacitySliderLastValue == n) {
            return;
        }
        editorSession.opacitySliderLastValue = n;
        List<String> list = this.getSidebarEditableTargetIds(editorSession);
        int n3 = Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 7);
        for (String string : list) {
            n3 |= this.setTargetOpacity(editorSession, string, n) ? 1 : 0;
        }
        if (n3 != 0) {
            this.recordMutationForInteraction(editorSession);
            if (!editorSession.sidebarOpacityRefreshTriggered) {
                editorSession.sidebarOpacityRefreshTriggered = (Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(300459015, 9)) != 0;
                this.rerenderEditableSelection(player, editorSession);
            } else {
                this.applySelectedOpacityToRenderedElements(player, editorSession, list, n);
            }
            this.updateEditorPropertiesSidebar(player, editorSession);
        } else {
            this.updateEditorPropertiesSidebar(player, editorSession);
        }
    }

    public boolean isTimelineForceableSidebarField(EditorPropertyField editorPropertyField) {
        if ((622111565 * 622111565 + 622111565 & 1) != 0) {
            throw new IllegalStateException();
        }
        return (editorPropertyField == EditorPropertyField.POSITION_X || editorPropertyField == EditorPropertyField.POSITION_Y || editorPropertyField == EditorPropertyField.WIDTH || editorPropertyField == EditorPropertyField.HEIGHT || editorPropertyField == EditorPropertyField.ROTATION || editorPropertyField == EditorPropertyField.OPACITY ? Xqedii_32drtqx.Xqedii_3h0mif43akudp(1295628014, 5) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 22)) != 0;
    }

    public String resolveTimelinePreservedInterpMode(Map<String, Object> map, Object object, int n, int n2) {
        if ((-1054835291 * (-1054835291 + 1) & 1) != 0) {
            throw new IllegalStateException();
        }
        Object object2 = object;
        if (!(object2 instanceof Map) && n != n2) {
            object2 = this.readAnimationTimelineTickValue(map, n);
        }
        if (!(object2 instanceof Map)) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nXYvfZSGxemQEmO/e5+4WvwHS22qtnyaT0ly/6z5FOutiq21ovr3Aw==");
        }
        Map map2 = (Map)object2;
        Map<String, Object> map3 = this.toStringObjectMap(map2);
        if (map3 == null || map3.isEmpty()) {
            return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nXYvfZSGxemQEmO/e5+4WvwHS22qtnyaT0ly/6z5FOutiq21ovr3Aw==");
        }
        return this.normalizeTimelineInterpMode(this.stringValue(map3.get(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("bwFAGpWXwi6lwkcpJitQZKkLcJ5ndfG1lwgQXbg5cD4H3dZMj/X+P/91/3II+0O8uNV0l+RY"))));
    }

    public Object resolveTimelineForcedSidebarValue(EditorSession editorSession, String string, String string2, int n, EditorPropertyField editorPropertyField, double d, Object object) {
        if ((798834001 * 798834001 + 798834001 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank() || string2 == null || string2.isBlank() || editorPropertyField == null || !Double.isFinite(d)) {
            return null;
        }
        if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("AlPY20ZiSsKHZHepm7m2vR9gsG45kxcO0s7ePxjMRcnXk0/S0f9XDKwAo1o=").equals(string2) && editorPropertyField == EditorPropertyField.ROTATION) {
            return this.snap1(this.normalizeSidebarRotation(d));
        }
        if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("I1vZiTUQBfDtQxGQtDrYmY6jBftQU/Kf94ejXFqvcZKUJZRGrtg/U181").equals(string2) && editorPropertyField == EditorPropertyField.OPACITY) {
            return this.clampAnimationTimelineOpacityRaw(d);
        }
        if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lVyLqZ0/l42NHS2Z4u8jaugWB4pabPNyLAKoAr7n6uc/FLCXzHscKW2vd90=").equals(string2) && (editorPropertyField == EditorPropertyField.POSITION_X || editorPropertyField == EditorPropertyField.POSITION_Y)) {
            Map<String, Object> map;
            Object object2;
            Map map2;
            double d2 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-7801361604478922939L, 35));
            double d3 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336739766072L, 14));
            if (object instanceof Map && (map2 = this.toStringObjectMap(object2 = (Map)object)) != null && !map2.isEmpty()) {
                d2 = this.readMapPathDouble(map2, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("6PRyAXp6WF8hg9Z5Khip7jKIxT7T9BoFXKS9hUVs"), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336416403654L, 30)));
                d3 = this.readMapPathDouble(map2, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Kug6JC6vMArxS1TYzCDHTExm1/nFgRotaWTJIqx6"), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336739766072L, 14)));
            }
            if (!(Double.isFinite(d2) && Double.isFinite(d3) || !((object2 = this.buildAnimationTimelineValueForRow(editorSession, string, string2)) instanceof Map) || (map = this.toStringObjectMap(map2 = (Map)object2)) == null || map.isEmpty())) {
                if (!Double.isFinite(d2)) {
                    d2 = this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("6PRyAXp6WF8hg9Z5Khip7jKIxT7T9BoFXKS9hUVs"), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4575400177798741835L, 7)));
                }
                if (!Double.isFinite(d3)) {
                    d3 = this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Kug6JC6vMArxS1TYzCDHTExm1/nFgRotaWTJIqx6"), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-1154099070181239218L, 45)));
                }
            }
            double d4 = this.snap1(d);
            if (editorPropertyField == EditorPropertyField.POSITION_X) {
                d2 = d4;
            } else {
                d3 = d4;
            }
            if (!Double.isFinite(d2)) {
                d2 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-8419629046068817122L, 28));
            }
            if (!Double.isFinite(d3)) {
                d3 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336739758278L, 43));
            }
            map = new LinkedHashMap<String, Object>();
            map.put(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("6PRyAXp6WF8hg9Z5Khip7jKIxT7T9BoFXKS9hUVs"), this.snap1(d2));
            map.put(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Kug6JC6vMArxS1TYzCDHTExm1/nFgRotaWTJIqx6"), this.snap1(d3));
            return map;
        }
        if (Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("R1YSngvbwI50UhU8FNC0NrXgVRxJfbUMfTvw+2OgFwesfDq3Xg8=").equals(string2) && (editorPropertyField == EditorPropertyField.WIDTH || editorPropertyField == EditorPropertyField.HEIGHT)) {
            Map<String, Object> map;
            Map<String, Object> map3;
            Map<String, Object> map4;
            double d5 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-7070660614702728660L, 38));
            double d6 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(3596320528771483669L, 16));
            if (object instanceof Map && (map4 = this.toStringObjectMap(map3 = (Map<String, Object>)object)) != null && !map4.isEmpty()) {
                d5 = this.readMapPathDouble(map4, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("6XnTc6zAYC7sWEhK2OTJ5ySYCW3+CdfncZRiSA/6i2xaTAgcVUg="), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(1607485981840287293L, 29)));
                d6 = this.readMapPathDouble(map4, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nVThWvX+m3EA+JZCwgyIrYDk3e5kq9ItA46/BMlumuS//1qlhw6cKw=="), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(6109030407448001056L, 10)));
            }
            if (!(Double.isFinite(d5) && Double.isFinite(d6) || !((map3 = this.buildAnimationTimelineScaleValue(editorSession, string, n)) instanceof Map) || (map = this.toStringObjectMap(map4 = map3)) == null || map.isEmpty())) {
                if (!Double.isFinite(d5)) {
                    d5 = this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("6XnTc6zAYC7sWEhK2OTJ5ySYCW3+CdfncZRiSA/6i2xaTAgcVUg="), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3mgxqiqcmcm83(-8589669174337033368L, 62)));
                }
                if (!Double.isFinite(d6)) {
                    d6 = this.readMapPathDouble(map, Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nVThWvX+m3EA+JZCwgyIrYDk3e5kq9ItA46/BMlumuS//1qlhw6cKw=="), Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(7273031635735045073L, 33)));
                }
            }
            double d7 = Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_21g2noaw1sppa(4708403336739758278L, 57)), Math.abs(d));
            if (editorPropertyField == EditorPropertyField.WIDTH) {
                d5 = d7;
            } else {
                d6 = d7;
            }
            if (!Double.isFinite(d5)) {
                d5 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-990675853952959490L, 59));
            }
            if (!Double.isFinite(d6)) {
                d6 = Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4071067388277423883L, 58));
            }
            map = new LinkedHashMap<String, Object>();
            map.put(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("6XnTc6zAYC7sWEhK2OTJ5ySYCW3+CdfncZRiSA/6i2xaTAgcVUg="), Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-4287169801647030027L, 9)), this.snap1(d5)));
            map.put(Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nVThWvX+m3EA+JZCwgyIrYDk3e5kq9ItA46/BMlumuS//1qlhw6cKw=="), Math.max(Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-7070660752108127700L, 38)), this.snap1(d6)));
            return map;
        }
        return null;
    }

    public void restoreTimelineRawTargetPositionToImplicitBase(EditorSession editorSession, String string) {
        int n;
        EditorRect editorRect;
        if ((1370930560 * 1370930560 - 1370930560 & 1) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank() || editorSession.activeTool != EditorTool.ANIMATION) {
            return;
        }
        EditorRect editorRect2 = editorSession.animationTimelineImplicitBaseBoundsByTarget.get(string);
        if (editorRect2 == null) {
            return;
        }
        EditorRect editorRect3 = editorRect = this.isAnimationTimelineImageGroupRoot(editorSession, string) ? this.resolveTimelineGroupLogicalBounds(editorSession, string) : null;
        if (editorRect == null) {
            editorRect = this.getTargetBounds(editorSession, string);
        }
        if (editorRect == null) {
            return;
        }
        int n2 = n = Math.abs(editorRect.x - editorRect2.x) <= Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(3799238738550517697L, 62)) && Math.abs(editorRect.y - editorRect2.y) <= Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_3lmn1g5e4vgc(-4952168568912848327L, 11)) ? Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489245126, 2) : Xqedii_32drtqx.Xqedii_ffzx1ycco61l(1186436852, 4);
        if (n != 0) {
            return;
        }
        this.applyBoundsToTarget(editorSession, string, new EditorRect(editorRect2.x, editorRect2.y, editorRect.width, editorRect.height));
    }

    public void restoreTimelineRawTargetToImplicitBase(EditorSession editorSession, String string) {
        EditorRect editorRect;
        if (((0xAAB9B7F3 | 1) & 1) == 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank() || editorSession.activeTool != EditorTool.ANIMATION) {
            return;
        }
        EditorRect editorRect2 = editorSession.animationTimelineImplicitBaseBoundsByTarget.get(string);
        if (editorRect2 == null) {
            return;
        }
        EditorRect editorRect3 = editorRect = this.isAnimationTimelineImageGroupRoot(editorSession, string) ? this.resolveTimelineGroupLogicalBounds(editorSession, string) : null;
        if (editorRect == null) {
            editorRect = this.getTargetBounds(editorSession, string);
        }
        if (editorRect == null || this.sameRect(editorRect, editorRect2)) {
            return;
        }
        this.applyBoundsToTarget(editorSession, string, new EditorRect(editorRect2.x, editorRect2.y, editorRect2.width, editorRect2.height));
    }

    public boolean animationTimelineValuesEqual(Object object, Object object2) {
        Object object3;
        if ((0x5727D4AF ^ 0x5727D4AF) != 0) {
            throw new IllegalStateException();
        }
        if (object == object2) {
            return Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1522799554, 25) != 0;
        }
        if (object == null || object2 == null) {
            return Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 13) != 0;
        }
        if (object instanceof Number) {
            object3 = (Number)object;
            if (object2 instanceof Number) {
                Number number = (Number)object2;
                return (Math.abs(((Number)object3).doubleValue() - number.doubleValue()) <= Double.longBitsToDouble(Xqedii_32drtqx.Xqedii_yv80h3m059sy(-8450119612433919708L, 36)) ? Xqedii_32drtqx.Xqedii_c2fgut1zn61r(-1489244994, 7) : Xqedii_32drtqx.Xqedii_7vm0r9mn9af1(-300459016, 9)) != 0;
            }
        }
        if (object instanceof Map) {
            object3 = (Map)object;
            if (object2 instanceof Map) {
                Map map = (Map)object2;
                Map map1_val = (Map) object3;
                Map map2 = map;
                if (map1_val.size() != map2.size()) {
                    return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1128816075, 15) != 0;
                }
                for (Object entryObj : map1_val.entrySet()) {
                    Map.Entry entry = (Map.Entry) entryObj;
                    if (entry == null) continue;
                    String string = (String)entry.getKey();
                    if (!map2.containsKey(string)) {
                        return Xqedii_32drtqx.Xqedii_ffzx1ycco61l(-1214106180, 23) != 0;
                    }
                    if (this.animationTimelineValuesEqual(entry.getValue(), map2.get(string))) continue;
                    return Xqedii_32drtqx.Xqedii_3h0mif43akudp(-843681175, 16) != 0;
                }
                return Xqedii_32drtqx.Xqedii_3h0mif43akudp(1841009486, 19) != 0;
            }
        }
        return Objects.equals(object, object2);
    }

    public EditorRect resolveTimelineImplicitBaseBounds(EditorSession editorSession, String string) {
        if ((0x74D91194 ^ 0x74D91194) != 0) {
            throw new IllegalStateException();
        }
        if (editorSession == null || string == null || string.isBlank()) {
            return null;
        }
        EditorRect editorRect = editorSession.animationTimelineImplicitBaseBoundsByTarget.get(string);
        if (editorRect == null) {
            EditorRect editorRect2;
            List<HoverElement> list = this.resolveTimelinePreviewTransformElements(editorSession, string);
            if (list == null || list.isEmpty()) {
                return null;
            }
            EditorRect editorRect3 = editorRect2 = this.isAnimationTimelineImageGroupRoot(editorSession, string) ? this.resolveTimelineGroupLogicalBounds(editorSession, string) : null;
            if (editorRect2 == null) {
                editorRect2 = this.getTargetBounds(editorSession, string);
            }
            if (editorRect2 == null) {
                return null;
            }
            editorRect = new EditorRect(editorRect2.x, editorRect2.y, editorRect2.width, editorRect2.height);
            editorSession.animationTimelineImplicitBaseBoundsByTarget.put(string, editorRect);
        }
        editorSession.timelineImplicitBaseTargetId = string;
        editorSession.timelineImplicitBaseBounds = new EditorRect(editorRect.x, editorRect.y, editorRect.width, editorRect.height);
        return new EditorRect(editorRect.x, editorRect.y, editorRect.width, editorRect.height);
    }

    private static /* synthetic */ String Xqedii_2xec58yinasb9(String string, int n) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("CnFyF7TVwFj4AnNUf1pTsL4muyQ0gv4BCTQ3SI+O") + n;
    }

    private static /* synthetic */ String Xqedii_2qg9ncoy1f13x(String string, int n) {
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("edrcJisfXKJFPmvxeP9A9Qt28ykk2uJVEpU+jwOhdwRxUMT8p+fepyqFOZjce7B5HUK9nm2K92zV/lFfuFcvfWtY8daawVEGjW36ZgMRB7BSdvdj") + string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("QlSk2LoJIsV5RNHIwefThiDjqWUGdgIdaxaDBy5R") + n;
    }

    private static /* synthetic */ String Xqedii_39qn57lrc8zug(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("083CkO3UysE6SL2dhftQxzywriRk9pfhZ+sMzzAQzo51TSegg4sFcpLp");
    }

    private static /* synthetic */ String Xqedii_34f74655w8rk8(String string) {
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("SIqFaYBYiL7lt7XI+FpyOEH/Q0Znv1pj9wRZSmUN+m6FdByga1Ss/rdbxlrLhmRwQcXhLhKj") + string;
    }

    private static /* synthetic */ String Xqedii_2r5xdxn3wqrg(String string, int n) {
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("edrcJisfXKJFPmvxeP9A9Qt28ykk2uJVEpU+jwOhdwRxUMT8p+fepyqFOZjce7B5HUK9nm2K92zV/lFfuFcvfWtY8daawVEGjW36ZgMRB7BSdvdj") + string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("QlSk2LoJIsV5RNHIwefThiDjqWUGdgIdaxaDBy5R") + n;
    }

    private static /* synthetic */ String Xqedii_3v1tfzilk5knb(String string) {
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("SIqFaYBYiL7lt7XI+FpyOEH/Q0Znv1pj9wRZSmUN+m6FdByga1Ss/rdbxlrLhmRwQcXhLhKj") + string;
    }

    private static /* synthetic */ String Xqedii_bp5vho47txv3(String string, String string2) {
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("T5N2D08nalfSnFE7QyoZqKIluMHb6s4k/yzEun7J5C4=") + string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("YYqCEDb4MX7UErt7RAlkPXrahMC68LFvtklKUe9H") + string2;
    }

    private static /* synthetic */ String Xqedii_de8930k4v1ip(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("083CkO3UysE6SL2dhftQxzywriRk9pfhZ+sMzzAQzo51TSegg4sFcpLp");
    }

    private static /* synthetic */ String Xqedii_3nrcakef4b92n(String string) {
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("SIqFaYBYiL7lt7XI+FpyOEH/Q0Znv1pj9wRZSmUN+m6FdByga1Ss/rdbxlrLhmRwQcXhLhKj") + string;
    }

    private static /* synthetic */ String Xqedii_u8a53no73ydo(String string) {
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("SIqFaYBYiL7lt7XI+FpyOEH/Q0Znv1pj9wRZSmUN+m6FdByga1Ss/rdbxlrLhmRwQcXhLhKj") + string;
    }

    private static /* synthetic */ String Xqedii_1wuc4q25etoaa(String string) {
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("UsEByfr8WNeVsrBhfHBj239KYOtW341j4WhOZXoahvUoig3S3krRx3KP72JJBw==") + string;
    }

    private static /* synthetic */ String Xqedii_ty1usk1nwkho(String string, int n) {
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("edrcJisfXKJFPmvxeP9A9Qt28ykk2uJVEpU+jwOhdwRxUMT8p+fepyqFOZjce7B5HUK9nm2K92zV/lFfuFcvfWtY8daawVEGjW36ZgMRB7BSdvdj") + string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("QlSk2LoJIsV5RNHIwefThiDjqWUGdgIdaxaDBy5R") + n;
    }

    private static /* synthetic */ String Xqedii_13tqrvx1w5jlj(String string) {
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("SIqFaYBYiL7lt7XI+FpyOEH/Q0Znv1pj9wRZSmUN+m6FdByga1Ss/rdbxlrLhmRwQcXhLhKj") + string;
    }

    private static /* synthetic */ String Xqedii_3gbx0bv1sdwg4(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("083CkO3UysE6SL2dhftQxzywriRk9pfhZ+sMzzAQzo51TSegg4sFcpLp");
    }

    private static /* synthetic */ String Xqedii_lbef1ou4kfrm(String string) {
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("SIqFaYBYiL7lt7XI+FpyOEH/Q0Znv1pj9wRZSmUN+m6FdByga1Ss/rdbxlrLhmRwQcXhLhKj") + string;
    }

    private static /* synthetic */ String Xqedii_2v1xqlwwdtnp1(String string, String string2) {
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("T5N2D08nalfSnFE7QyoZqKIluMHb6s4k/yzEun7J5C4=") + string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("YYqCEDb4MX7UErt7RAlkPXrahMC68LFvtklKUe9H") + string2;
    }

    private static /* synthetic */ String Xqedii_1cy0nfhookeiv(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("5b5ccabXXzZQ+A9W1Za+dQ7xCfBnHManqHyVmM7oNMgvi4V874cIUSIHVuEgpi85");
    }

    private static /* synthetic */ String Xqedii_3uf1nf6igc6v3(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("5b5ccabXXzZQ+A9W1Za+dQ7xCfBnHManqHyVmM7oNMgvi4V874cIUSIHVuEgpi85");
    }

    private static /* synthetic */ String Xqedii_123ntdchfhbez(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("083CkO3UysE6SL2dhftQxzywriRk9pfhZ+sMzzAQzo51TSegg4sFcpLp");
    }

    private static /* synthetic */ String Xqedii_3vh42dbyskd6j(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("083CkO3UysE6SL2dhftQxzywriRk9pfhZ+sMzzAQzo51TSegg4sFcpLp");
    }

    private static /* synthetic */ String Xqedii_2d7essugxby65(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nWRy6Ysofgl4iBrE21RkqRcQi1kviu+HidTlKt+HNVHwa6mvT0Q=");
    }

    private static /* synthetic */ String Xqedii_8hbsfw5icm2y(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("nWRy6Ysofgl4iBrE21RkqRcQi1kviu+HidTlKt+HNVHwa6mvT0Q=");
    }

    private static /* synthetic */ String Xqedii_1t3m8xb4ha892(String string, String string2, String string3, String string4) {
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("yVnFcpZWtOu+P85yzuJA11rKLoqz1Bj7JqgZ7p7QTgbWMA==") + string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Mc0Dx2OgWhqMjYNpzs/ihWolZA7iQ6msZwJCzKhQSf9aXA==") + string2 + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("cpLrXZ+WNubAhg1ytqBPSQiumh0mZf6hmxyJuEMIE0LEpA==") + string3 + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("hVtrs2L+tIpA62QBn2sK8flhwUuYJ46H6+sfqUtcgFqzoQ==") + string4 + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("r1QQ+Fc8dz3qRcFrV5Khki9a7FQQ64Pk3TcuiIH4");
    }

    private static /* synthetic */ String Xqedii_17zesmveyg01p(String string) {
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("i8D9U6CjVWNTexWRFkaeFKcn4L/tdqI+8Y7N/swG5XtnoTq46EgZUFuTKILGtwxMA+yrXA==") + string;
    }

    private static /* synthetic */ String Xqedii_2twpyptdp85ux(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13) {
        return Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("SexnaR3GKM285DUGy+6YHAxIyRsHFRTcnF1bifQnEoeXEzW+TNsJ6dD0m8h1Qy4RQj9Rd7FnqtpULgDckIkkvxxX5tDSYjUmoICn2rBjXZijIt5ajanV/3lSIYWtYyNxFDA=") + string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("L9FhTVlDwjkqRXNAf8WgCDa3cRarr/q9g3yIROYB92R2aVILoS+fJVt/DkTE0X/B") + string2 + string3 + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("3rlFuxCksAYD9XRzrJanplFqNT8ByuB1FxtcqRcYUfwzTgBoMURg5QdQ8qY0rSrR9TjOXYW+auc=") + string4 + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("syZ+gNA+a75yoz6TMTTdJeq6szpfmSJ4QR2RZpv2CoG2UAz82CzDlBSijGCw4L1p55iCWSLx") + string5 + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("OOvxiswFX1Z2PjXSYube6m42PpEBorW7ZoqSNKN3vxEgCis/L6r3y/uZHWG19jrUqaRIZZjY") + string6 + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("CVIJDkXonUV5iBsqdJnjJ5uR3pjGhZ71nEDK2nQ1uB+nhwvm6dOX4gGyS8YfZ2vzghVI8A==") + string7 + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("9ldz+939h0WNETq1VXMfWWP4G1OcWZUxYWUwAnKTlNg86kE9RVn5D+hq3lrphe60a8YXNQ0fSAg=") + string8 + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Ti/x/0mNfcsScBn1W7rCdAR6v/7w8eyLIGExO9IN6q7c6SbsWbsphw==") + string9 + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("PAXttsk/hohA8ZlC0F/BApa9uT+hxPdlObz0VEoPwFrMA1eeb6t5WZl8hJDfrA==") + string10 + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("0tdzyktjyFuiD8hCDyn5yR94YR5cDJqUH4RD/8VRZYTnGRBYOP+su8Xo3eGaUg==") + string11 + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("mxx2IyeVVeFpVY1p+hkomyuY0m9LlV7o71gH8jOzrwMOezEV/p9Ddx0NgQKjhLQanU0=") + string12 + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("V2cYBTwBPaVVTrTln2Ep+F9zBRFiXa6JJyCAZ+kTTO1tb/cL7ChsWMl+myOhHu9WIH9FYVux") + string13;
    }

    private static /* synthetic */ String Xqedii_fgqcdyrd4xjp(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("5b5ccabXXzZQ+A9W1Za+dQ7xCfBnHManqHyVmM7oNMgvi4V874cIUSIHVuEgpi85");
    }

    private static /* synthetic */ String Xqedii_iwuf05wd4mwt(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("5b5ccabXXzZQ+A9W1Za+dQ7xCfBnHManqHyVmM7oNMgvi4V874cIUSIHVuEgpi85");
    }

    private static /* synthetic */ String Xqedii_2zh5xom6kp6q(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Tia/nRvsWGY6zYfkdr6KEkdRdxOvXxL9ivOyK3frhu7gAPdlkEghU0e77L0=");
    }

    private static /* synthetic */ String Xqedii_1evc23159xfu1(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("KhDWZ/LXISGTd3jX2vXcTS/Fdut4KXyHQIjY2isRoue326m+bkDyMZfK");
    }

    private static /* synthetic */ String Xqedii_1314a7xils0kk(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("OcmCFNV2QpanysXE1p58Tf2rF21u/gT5m/uohss+iOAopY28xXAkIA==");
    }

    private static /* synthetic */ String Xqedii_2mxx98kbs0ene(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("SKki+9MBz3mo4a/ttzDCyBMzW+Ba6K3Jlio+auWLXWLjECimGEkgDtPFb5d/Eg==");
    }

    private static /* synthetic */ String Xqedii_2x3epwi5i6asz(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("c9WquhYVi963lhmKNj02ZzOsmCHx9mGMaQf4/qtM2dU7SoyRVZf0P/1c");
    }

    private static /* synthetic */ String Xqedii_23exxjwb45txr(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lxBk+JuToYzQ129losFWNVW3RrVg554dXIVtEsqqa7demhsay5kUvWGyXUg=");
    }

    private static /* synthetic */ String Xqedii_oizgz1kmogln(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("8YkfJdab2Y/Wtx0Bnsab2TGUr58kd/35b0Ducyy9Z87WnrogsPs=");
    }

    private static /* synthetic */ String Xqedii_26cfhev0qryzc(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("hEw10O1lzPqVec4mgkxOfPC2c2fPVPTOnAP9e7kXwvDXDL0x154=");
    }

    private static /* synthetic */ String Xqedii_2jyth7r6owztg(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("eglnC4dYXcZcc6vuJXRHmq1yqf15XHsJTiMvJZyO4Z5c7VWb2Kk=");
    }

    private static /* synthetic */ String Xqedii_kdmtf93nqioy(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("LDHg1OowUCpr8/730lXcbB0Id+BvYJkk4c1IhArG/pqCYaN71Nc=");
    }

    private static /* synthetic */ String Xqedii_153h8c2l0ngz8(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("Tia/nRvsWGY6zYfkdr6KEkdRdxOvXxL9ivOyK3frhu7gAPdlkEghU0e77L0=");
    }

    private static /* synthetic */ String Xqedii_1eaked599q73t(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("KhDWZ/LXISGTd3jX2vXcTS/Fdut4KXyHQIjY2isRoue326m+bkDyMZfK");
    }

    private static /* synthetic */ String Xqedii_1ilwcl65db96t(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("OcmCFNV2QpanysXE1p58Tf2rF21u/gT5m/uohss+iOAopY28xXAkIA==");
    }

    private static /* synthetic */ String Xqedii_xxmth8mlxhm9(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("SKki+9MBz3mo4a/ttzDCyBMzW+Ba6K3Jlio+auWLXWLjECimGEkgDtPFb5d/Eg==");
    }

    private static /* synthetic */ String Xqedii_38j3mnt99ejk7(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("c9WquhYVi963lhmKNj02ZzOsmCHx9mGMaQf4/qtM2dU7SoyRVZf0P/1c");
    }

    private static /* synthetic */ String Xqedii_blzssh7qlto5(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("lxBk+JuToYzQ129losFWNVW3RrVg554dXIVtEsqqa7demhsay5kUvWGyXUg=");
    }

    private static /* synthetic */ String Xqedii_2bsu2ca1a921k(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("8YkfJdab2Y/Wtx0Bnsab2TGUr58kd/35b0Ducyy9Z87WnrogsPs=");
    }

    private static /* synthetic */ String Xqedii_23f2301pdpjc0(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("hEw10O1lzPqVec4mgkxOfPC2c2fPVPTOnAP9e7kXwvDXDL0x154=");
    }

    private static /* synthetic */ String Xqedii_2noc3xggv2raa(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("eglnC4dYXcZcc6vuJXRHmq1yqf15XHsJTiMvJZyO4Z5c7VWb2Kk=");
    }

    private static /* synthetic */ String Xqedii_1q9nsh2lnm4zv(String string) {
        return string + Xqedii_32drtqx.Xqedii_fhnlr7gyhp63("LDHg1OowUCpr8/730lXcbB0Id+BvYJkk4c1IhArG/pqCYaN71Nc=");
    }

    public record HoverEffectRuntimeConfig(double scaleXMultiplier, double scaleYMultiplier, double offsetX, double offsetY, boolean opacityAbsolute, int opacityAbsoluteValue, int opacityDelta, double opacityPercentDelta, double rotationDeltaDeg, int durationTicks, String interpolationMode, double startOffsetX, double startOffsetY, double startScaleXMultiplier, double startScaleYMultiplier, boolean closeReversed) {
        public static final String Xqedii_dmmwdoylqcew = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
        private static transient /* synthetic */ String PaqtkawYGw = "00000000000000000000000000000000000000000000";



        

        

        

        public double scaleXMultiplier() {
            if ((1934253823 * 1934253823 + 1934253823 & 1) != 0) {
                throw new IllegalStateException();
            }
            return this.scaleXMultiplier;
        }

        public double scaleYMultiplier() {
            if ((1767747948 * 1767747948 - 1767747948 & 1) != 0) {
                throw new IllegalStateException();
            }
            return this.scaleYMultiplier;
        }

        public double offsetX() {
            if ((0xF839E1BD ^ 0xF839E1BD) != 0) {
                throw new IllegalStateException();
            }
            return this.offsetX;
        }

        public double offsetY() {
            if (((0x3C04D6DC | 1) & 1) == 0) {
                throw new IllegalStateException();
            }
            return this.offsetY;
        }

        public boolean opacityAbsolute() {
            if ((-2029887468 * -2029887468 - -2029887468 & 1) != 0) {
                throw new IllegalStateException();
            }
            return this.opacityAbsolute;
        }

        public int opacityAbsoluteValue() {
            if ((1189070690 * 1189070690 + 1189070690 & 1) != 0) {
                throw new IllegalStateException();
            }
            return this.opacityAbsoluteValue;
        }

        public int opacityDelta() {
            if ((0xEA865883 ^ 0xEA865883) != 0) {
                throw new IllegalStateException();
            }
            return this.opacityDelta;
        }

        public double opacityPercentDelta() {
            if ((0xD836DB3E ^ 0xD836DB3E) != 0) {
                throw new IllegalStateException();
            }
            return this.opacityPercentDelta;
        }

        public double rotationDeltaDeg() {
            if ((494011383 * 494011383 - 494011383 & 1) != 0) {
                throw new IllegalStateException();
            }
            return this.rotationDeltaDeg;
        }

        public int durationTicks() {
            if (((-1091560552 << 1 | 1) & 1) == 0) {
                throw new IllegalStateException();
            }
            return this.durationTicks;
        }

        public String interpolationMode() {
            if ((1063266378 * (1063266378 + 1) & 1) != 0) {
                throw new IllegalStateException();
            }
            return this.interpolationMode;
        }

        public double startOffsetX() {
            if ((140690079 * (140690079 + 1) & 1) != 0) {
                throw new IllegalStateException();
            }
            return this.startOffsetX;
        }

        public double startOffsetY() {
            if ((286985996 * (286985996 + 1) & 1) != 0) {
                throw new IllegalStateException();
            }
            return this.startOffsetY;
        }

        public double startScaleXMultiplier() {
            if ((0xDA2019F3 ^ 0xDA2019F3) != 0) {
                throw new IllegalStateException();
            }
            return this.startScaleXMultiplier;
        }

        public double startScaleYMultiplier() {
            if ((0xD62FA486 ^ 0xD62FA486) != 0) {
                throw new IllegalStateException();
            }
            return this.startScaleYMultiplier;
        }

        public boolean closeReversed() {
            if ((0x28015B47 ^ 0x28015B47) != 0) {
                throw new IllegalStateException();
            }
            return this.closeReversed;
        }
    }
}

