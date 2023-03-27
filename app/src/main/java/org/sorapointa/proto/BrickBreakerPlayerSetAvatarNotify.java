package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BrickBreakerPlayerSetAvatarNotify {
    public enum KLPPMKBNEHC {
        @Tag(tag=0) None ,
        @Tag(tag=5368) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public List<Integer> costumeIdList = new ArrayList<>();
    @Tag(tag=3) public Integer uid = null;
    @Tag(tag=13) public List<Integer> avatarIdList = new ArrayList<>();
}
