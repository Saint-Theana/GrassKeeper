package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestProgressUpdateNotify {
    @Tag(tag=12) public Integer questId = null;
    @Tag(tag=6) public List<Integer> failProgressList = new ArrayList<>();
    @Tag(tag=13) public List<Integer> finishProgressList = new ArrayList<>();
}
