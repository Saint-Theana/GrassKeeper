package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LuaEnvironmentEffectNotify {
    public enum LuaEnvironmentEffectNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3240) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer type = null;
    @Tag(tag=12,isFloat=true) public List<Float> floatParamList = new ArrayList<>();
    @Tag(tag=13) public String effectAlias = null;
    @Tag(tag=1,isSigned=true) public List<Integer> intParamList = new ArrayList<>();
}
