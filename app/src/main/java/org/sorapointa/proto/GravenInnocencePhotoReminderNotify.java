package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GravenInnocencePhotoReminderNotify {
    public enum PBOIDLBBNDM {
        @Tag(tag=0) None ,
        @Tag(tag=20385) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer reminderId = null;
    @Tag(tag=11) public Integer groupBundleId = null;
}
