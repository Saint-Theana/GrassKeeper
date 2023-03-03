package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGSkillPreviewTokenInfo {
    @Tag(tag=3) public Integer tokenType = null;
    @Tag(tag=12) public Integer afterValue = null;
    @Tag(tag=15) public Integer beforeValue = null;
}
