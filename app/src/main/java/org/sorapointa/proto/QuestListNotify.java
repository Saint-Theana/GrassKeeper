package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Quest.*;
import org.sorapointa.proto.Quest;

public class QuestListNotify {
    @Tag(tag=1) public List<Quest> questList = new ArrayList<>();
}
