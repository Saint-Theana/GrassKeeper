package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PropValue.*;
import org.sorapointa.proto.PropValue;

public class PlayerDataNotify {
    public static class MapPropMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public PropValue value = null;
    }

    public enum PlayerDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=170) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public String nickName = null;
    @Tag(tag=9) public Integer regionId = null;
    @Tag(tag=3) public Long serverTime = null;
    @Tag(tag=7) public Boolean isFirstLoginToday = null;
    @Tag(tag=5) public List<MapPropMap> propMap = new ArrayList<>();
}
