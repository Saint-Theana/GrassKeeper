package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TrialAvatarGrantRecord {
    @Tag(tag=1) public Integer grantReason = null;
    @Tag(tag=2) public Integer fromParentQuestId = null;
}
