package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriPoetryThemeData.*;
import org.sorapointa.proto.IrodoriPoetryThemeData;

public class IrodoriFillPoetryRsp {
    @Tag(tag=13) public IrodoriPoetryThemeData themeData = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
