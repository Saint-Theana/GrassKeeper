package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MainCoop.*;
import org.sorapointa.proto.MainCoop;

public class StartCoopPointRsp {
    @Tag(tag=9) public Boolean isStart = null;
    @Tag(tag=15) public MainCoop startMainCoop = null;
    @Tag(tag=13) public Integer coopPoint = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
