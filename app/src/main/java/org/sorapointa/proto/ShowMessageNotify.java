package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MsgParam.*;
import org.sorapointa.proto.MsgParam;
import org.sorapointa.proto.SvrMsgId.*;
import org.sorapointa.proto.SvrMsgId;

public class ShowMessageNotify {
    @Tag(tag=14) public Integer msgId = null;
    @Tag(tag=13) public List<MsgParam> params = new ArrayList<>();
}
