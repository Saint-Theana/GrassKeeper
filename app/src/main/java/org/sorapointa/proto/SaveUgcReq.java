package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.UgcType.*;
import org.sorapointa.proto.UgcType;
import org.sorapointa.proto.MusicRecord.*;
import org.sorapointa.proto.MusicRecord;
import org.sorapointa.proto.UgcMusicBriefInfo.*;
import org.sorapointa.proto.UgcMusicBriefInfo;

public class SaveUgcReq {
    public enum SaveUgcReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6331) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Integer ugcType = null;
    @Tag(tag=15) public MusicRecord musicRecord = null;
    @Tag(tag=160) public UgcMusicBriefInfo musicBriefInfo = null;
}
