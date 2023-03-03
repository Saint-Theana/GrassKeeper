package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.UgcMusicBriefInfo.*;
import org.sorapointa.proto.UgcMusicBriefInfo;
import org.sorapointa.proto.UgcMusicRecord.*;
import org.sorapointa.proto.UgcMusicRecord;
import org.sorapointa.proto.UgcType.*;
import org.sorapointa.proto.UgcType;

public class SaveUgcReq {
    @Tag(tag=11) public Integer ugcType = null;
    @Tag(tag=2) public UgcMusicRecord musicRecord = null;
    @Tag(tag=1488) public UgcMusicBriefInfo musicBriefInfo = null;
}
