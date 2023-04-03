package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CoopChapter.*;
import org.sorapointa.proto.CoopChapter;

public class CoopDataNotify {
    public enum CoopDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1981) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public List<Integer> viewedChapterList = new ArrayList<>();
    @Tag(tag=14) public Boolean isHaveProgress = null;
    @Tag(tag=12) public List<CoopChapter> chapterList = new ArrayList<>();
    @Tag(tag=1) public Integer curCoopPoint = null;
}
