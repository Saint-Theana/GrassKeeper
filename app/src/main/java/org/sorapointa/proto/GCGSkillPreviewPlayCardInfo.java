package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGSkillPreviewPlayCardInfo {
    @Tag(tag=15) public GCGSkillPreviewInfo playCardInfo = null;
    @Tag(tag=9) public Integer targetCardGuid = null;
    @Tag(tag=2) public Integer handCardGuid = null;
}
