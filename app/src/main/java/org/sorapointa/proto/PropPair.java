package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PropValue.*;
import org.sorapointa.proto.PropValue;

public class PropPair {
    @Tag(tag=1) public Integer type = null;
    @Tag(tag=2) public PropValue propValue = null;
}
