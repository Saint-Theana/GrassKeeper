package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ParentQuest.*;
import org.sorapointa.proto.ParentQuest;

public class FinishedParentQuestNotify {
    @Tag(tag=2) public List<ParentQuest> parentQuestList = new ArrayList<>();
}
