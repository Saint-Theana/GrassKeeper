package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriPoetryThemeData.*;
import org.sorapointa.proto.IrodoriPoetryThemeData;

public class IrodoriScanEntityRsp {
    @Tag(tag=10) public IrodoriPoetryThemeData themeData = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Boolean isGetInspiration = null;
}
