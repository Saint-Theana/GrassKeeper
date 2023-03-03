package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartBuoyantCombatGalleryRsp {
    @Tag(tag=12) public Integer galleryLevel = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer galleryId = null;
}
