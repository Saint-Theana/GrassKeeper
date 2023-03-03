package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGSkillPreviewReactionInfo.*;
import org.sorapointa.proto.GCGSkillPreviewReactionInfo;

public class GCGSkillPreviewElementReactionInfo {
    @Tag(tag=8) public List<Integer> freshList = new ArrayList<>();
    @Tag(tag=2) public List<Integer> sourceList = new ArrayList<>();
    @Tag(tag=14) public List<GCGSkillPreviewReactionInfo> reactionList = new ArrayList<>();
}
