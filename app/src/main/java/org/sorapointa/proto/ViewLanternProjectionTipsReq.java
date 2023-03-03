package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ClientInputType.*;
import org.sorapointa.proto.ClientInputType;

public class ViewLanternProjectionTipsReq {
    @Tag(tag=9) public Boolean isInputTips = null;
    @Tag(tag=10) public Integer inputType = null;
}
