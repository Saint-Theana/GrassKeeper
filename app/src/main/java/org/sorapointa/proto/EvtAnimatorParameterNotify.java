package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EvtAnimatorParameterInfo.*;
import org.sorapointa.proto.EvtAnimatorParameterInfo;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;

public class EvtAnimatorParameterNotify {
    @Tag(tag=12) public EvtAnimatorParameterInfo animatorParamInfo = null;
    @Tag(tag=14) public Integer forwardType = null;
}
