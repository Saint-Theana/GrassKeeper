package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityScalarType.*;
import org.sorapointa.proto.AbilityScalarType;
import org.sorapointa.proto.AbilityString.*;
import org.sorapointa.proto.AbilityString;

public class AbilityScalarValueEntry {
    @Tag(tag=1) public AbilityString key = null;
    @Tag(tag=2) public Integer valueType = null;
    @Tag(tag=3,isFloat=true) public Float floatValue = null;
    @Tag(tag=4) public String stringValue = null;
    @Tag(tag=5,isSigned=true) public Integer intValue = null;
    @Tag(tag=6) public Integer uintValue = null;
}
