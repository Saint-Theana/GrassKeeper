package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGSkillPreviewNotify {
    public enum EBIPPGMBKOL {
        @Tag(tag=0) None ,
        @Tag(tag=7368) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public List<GCGChangeOnstageInfo> changeOnstagePreviewList = new ArrayList<>();
    @Tag(tag=3) public Integer controllerId = null;
    @Tag(tag=6) public List<GCGSkillPreviewInfo> skillPreviewList = new ArrayList<>();
    @Tag(tag=9) public List<GCGSkillPreviewPlayCardInfo> playCardList = new ArrayList<>();
    @Tag(tag=10) public Integer onstageCardGuid = null;
}
