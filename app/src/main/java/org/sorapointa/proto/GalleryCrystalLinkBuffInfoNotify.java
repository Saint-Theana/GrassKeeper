package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GalleryCrystalLinkBuffInfoNotify {
    @Tag(tag=13) public Integer galleryId = null;
    @Tag(tag=11) public Boolean isBuffValid = null;
    @Tag(tag=14) public Integer buffId = null;
}
