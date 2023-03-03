package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGSkillPreviewOnstageChangeInfo {
    @Tag(tag=6) public Integer targetOnstageCardGuid = null;
    @Tag(tag=15) public Integer sourceOnstageCardGuid = null;
}
