package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ParentQuest.*;
import org.sorapointa.proto.ParentQuest;

public class FinishedParentQuestUpdateNotify {
    @Tag(tag=9) public List<ParentQuest> parentQuestList = new ArrayList<>();
}
