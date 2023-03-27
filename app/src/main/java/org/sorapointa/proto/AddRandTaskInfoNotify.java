package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AddRandTaskInfoNotify {
    public enum AddRandTaskInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=123) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Vector pos = null;
    @Tag(tag=2) public Integer randTaskId = null;
}
