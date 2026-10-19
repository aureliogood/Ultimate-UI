package dev.xqedii.ultimateUI.service.gui.model;

import dev.xqedii.ultimateUI.Xqedii_1jrxgxk;

public final class PreviewViewport {
   public static final String Xqedii_3ajsz2arvwk6f = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public final double previewX;
   public final double previewY;
   public final double previewWidth;
   public final double previewHeight;
   public final double pageWidth;
   public final double pageHeight;
   public final double baseScale;
   public final double layerBase;
   public double zoom = Double.longBitsToDouble(Xqedii_1jrxgxk.Xqedii_x8jwnwurqmkv(-5750928548047054403L, 53));
   public double panX;
   public double panY;

   public PreviewViewport(double var1, double var3, double var5, double var7, double var9, double var11, double var13, double var15, double var17) {
      this.previewX = var1;
      this.previewY = var3;
      this.previewWidth = var5;
      this.previewHeight = var7;
      this.pageWidth = var9;
      this.pageHeight = var11;
      this.baseScale = var13;
      this.layerBase = var15;
      if (Double.isFinite(var17)) {
         this.zoom = var17;
      }
   }
}
