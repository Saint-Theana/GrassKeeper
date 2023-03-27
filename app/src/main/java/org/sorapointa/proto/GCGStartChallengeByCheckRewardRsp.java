package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGStartChallengeByCheckRewardRsp {
    public enum JFHPNEMLEIG {
        @Tag(tag=0) None ,
        @Tag(tag=7127) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer levelType = null;
    @Tag(tag=10) public Integer levelId = null;
    @Tag(tag=15) public List<Integer> exceededItemTypeList = new ArrayList<>();
    @Tag(tag=13) public List<Integer> exceededItemList = new ArrayList<>();
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer configId = null;
}
