package net.hasor.dataql.runtime.process;
import net.hasor.dataql.runtime.InsetProcess;
import net.hasor.dataql.runtime.InstSequence;
import net.hasor.dataql.runtime.ProcessContet;
import net.hasor.dataql.runtime.ProcessException;
import net.hasor.dataql.runtime.struts.LocalData;
import net.hasor.dataql.runtime.struts.MemStack;
import net.hasor.dataql.runtime.struts.OriResultStruts;
/**
 * Created by yongchun.zyc on 2017/7/13.
 */
class ASO implements InsetProcess {
    @Override
    public int getOpcode() {
        return ASO;
    }
    @Override
    public void doWork(InstSequence sequence, MemStack memStack, LocalData local, ProcessContet context) throws ProcessException {
        Object result = memStack.pop();
        memStack.push(new OriResultStruts(result));
    }
}