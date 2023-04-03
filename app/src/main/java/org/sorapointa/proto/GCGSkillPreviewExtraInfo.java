package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGSkillPreviewCardInfo.*;
import org.sorapointa.proto.GCGSkillPreviewCardInfo;

public class GCGSkillPreviewExtraInfo {
    @Tag(tag=6) public List<GCGSkillPreviewCardInfo> refreshCardWhenExistList = new ArrayList<>();
    @Tag(tag=11) public List<GCGSkillPreviewCardInfo> failAddedWhenFullList = new ArrayList<>();
}
