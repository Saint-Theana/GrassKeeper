package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AnimatorParameterValueInfo.*;
import org.sorapointa.proto.AnimatorParameterValueInfo;

public class AnimatorParameterValueInfoPair {
    @Tag(tag=1,isSigned=true) public Integer nameId = null;
    @Tag(tag=2) public AnimatorParameterValueInfo animatorPara = null;
}
