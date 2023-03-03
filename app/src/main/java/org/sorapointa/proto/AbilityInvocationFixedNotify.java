package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityInvokeEntry.*;
import org.sorapointa.proto.AbilityInvokeEntry;

public class AbilityInvocationFixedNotify {
    @Tag(tag=14) public AbilityInvokeEntry invoke6th = null;
    @Tag(tag=8) public AbilityInvokeEntry invoke5th = null;
    @Tag(tag=1) public AbilityInvokeEntry invoke4th = null;
    @Tag(tag=5) public AbilityInvokeEntry invoke2nd = null;
    @Tag(tag=10) public AbilityInvokeEntry invoke1st = null;
    @Tag(tag=12) public AbilityInvokeEntry invoke3rd = null;
}
