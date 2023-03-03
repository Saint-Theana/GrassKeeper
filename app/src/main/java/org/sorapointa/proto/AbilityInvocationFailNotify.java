package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityInvokeEntry.*;
import org.sorapointa.proto.AbilityInvokeEntry;

public class AbilityInvocationFailNotify {
    @Tag(tag=7) public String reason = null;
    @Tag(tag=13) public Integer entityId = null;
    @Tag(tag=3) public AbilityInvokeEntry invoke = null;
}
