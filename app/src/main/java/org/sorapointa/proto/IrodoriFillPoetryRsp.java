package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriPoetryThemeData.*;
import org.sorapointa.proto.IrodoriPoetryThemeData;

public class IrodoriFillPoetryRsp {
    public enum IrodoriFillPoetryRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8762) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public IrodoriPoetryThemeData themeData = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
