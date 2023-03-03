package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ServerCondMeetQuestListUpdateNotify {
    @Tag(tag=1) public List<Integer> delQuestIdList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> addQuestIdList = new ArrayList<>();
}
