package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AnimatorParameterValueInfo.*;
import org.sorapointa.proto.AnimatorParameterValueInfo;

public class EvtAnimatorParameterInfo {
    @Tag(tag=14) public Integer entityId = null;
    @Tag(tag=2,isSigned=true) public Integer nameId = null;
    @Tag(tag=12) public AnimatorParameterValueInfo value = null;
    @Tag(tag=9) public Boolean isServerCache = null;
}
