package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeWidgetBackgroundActiveStateRsp {
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer materialId = null;
}
