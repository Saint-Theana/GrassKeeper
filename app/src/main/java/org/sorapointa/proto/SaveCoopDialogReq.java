package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SaveCoopDialogReq {
    @Tag(tag=11) public Integer mainCoopId = null;
    @Tag(tag=6) public Integer dialogId = null;
}
