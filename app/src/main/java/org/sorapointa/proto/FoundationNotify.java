package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FoundationInfo.*;
import org.sorapointa.proto.FoundationInfo;

public class FoundationNotify {
    @Tag(tag=7) public FoundationInfo info = null;
    @Tag(tag=9) public Integer gadgetEntityId = null;
}
