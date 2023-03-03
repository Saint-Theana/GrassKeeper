package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetQuestTalkHistoryRsp {
    @Tag(tag=13) public List<Integer> talkIdList = new ArrayList<>();
    @Tag(tag=7) public Integer parentQuestId = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
