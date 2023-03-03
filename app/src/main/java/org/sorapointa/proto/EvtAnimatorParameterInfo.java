package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AnimatorParameterValueInfo.*;
import org.sorapointa.proto.AnimatorParameterValueInfo;

public class EvtAnimatorParameterInfo {
    @Tag(tag=4) public Integer entityId = null;
    @Tag(tag=5) public Boolean isServerCache = null;
    @Tag(tag=7) public AnimatorParameterValueInfo value = null;
    @Tag(tag=15,isSigned=true) public Integer nameId = null;
}
