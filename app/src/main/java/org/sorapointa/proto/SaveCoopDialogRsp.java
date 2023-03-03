package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SaveCoopDialogRsp {
    @Tag(tag=8) public Integer dialogId = null;
    @Tag(tag=10) public Integer mainCoopId = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
