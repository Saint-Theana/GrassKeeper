package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGChangeOnstageInfo {
    @Tag(tag=4) public Integer cardGuid = null;
    @Tag(tag=8) public GCGSkillPreviewInfo changeOnstagePreviewInfo = null;
    @Tag(tag=5) public Boolean isQuick = null;
}
